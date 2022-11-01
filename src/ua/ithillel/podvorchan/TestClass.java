package ua.ithillel.podvorchan;

import ua.ithillel.podvorchan.api.AfterSuite;
import ua.ithillel.podvorchan.api.BeforeSuite;
import ua.ithillel.podvorchan.api.Test;
public class TestClass {

  @BeforeSuite
  public void method() {
    System.out.println("method");
  }

  @Test(priority = 9)
  public void test1() {
    System.out.println("test1");
  }

  @Test(priority = 1)
  public void test2() {
    System.out.println("test2");
  }

  @Test(priority = 6)
  public void test3() {
    System.out.println("test3");
  }

  @AfterSuite
  public void stop() {
    System.out.println("stop");
  }


}
