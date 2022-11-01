package ua.ithillel.podvorchan;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import ua.ithillel.podvorchan.api.AfterSuite;
import ua.ithillel.podvorchan.api.BeforeSuite;
import ua.ithillel.podvorchan.api.Test;

public class TestRunner {

  public static void start(Class<?> testClass) {
    try {
      List<Method> beforeMethods = Arrays.stream(testClass.getDeclaredMethods())
          .filter(m -> m.isAnnotationPresent(BeforeSuite.class)).toList();
      if (beforeMethods.size() > 1) {
        throw new WrongSuiteCountException(
            testClass.getName() + " has more than one @BeforeSuite method");
      }
      List<Method> afterMethods = Arrays.stream(testClass.getDeclaredMethods())
          .filter(m -> m.isAnnotationPresent(AfterSuite.class)).toList();
      if (afterMethods.size() > 1) {
        throw new WrongSuiteCountException(
            testClass.getName() + " has more than one @AfterSuite method");
      }
      List<Method> testMethods = Arrays.stream(testClass.getDeclaredMethods())
          .filter(m -> m.isAnnotationPresent(Test.class))
          .sorted(Comparator.comparingInt(m -> m.getAnnotation(Test.class).priority())).toList();
      Object instance = testClass.getConstructor().newInstance();
      if (beforeMethods.size() == 1) {
        beforeMethods.get(0).invoke(instance);
      }
      for (Method method : testMethods) {
        method.invoke(instance);
      }
      if (afterMethods.size() == 1) {
        afterMethods.get(0).invoke(instance);
      }
    } catch (InstantiationException | IllegalAccessException | InvocationTargetException |
             NoSuchMethodException e) {
      throw new RuntimeException("Something went wrong with tests");
    }
  }
}
