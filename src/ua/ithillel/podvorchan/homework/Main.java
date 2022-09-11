package ua.ithillel.podvorchan.homework;


public class Main {
    public static void main(String[] args) {
        System.out.println(findSymbolOccurance("Ababagalamaga", 'a'));
        System.out.println(findWordPosition("Apollo", "pollo"));
        System.out.println(findWordPosition("Aplle", "Plant"));
        System.out.println(stringReverse("Ruslan"));
        System.out.println(isPalindrome("Ruslan"));
    }

    static int findSymbolOccurance(String str, char c) {
        if (str == null || c == '\0') {
            System.out.println("There is empty parameter");
            return 0;
        }

        char[] charArray = str.toCharArray();
        int occurrences = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == c) {
                occurrences++;

            }

        }
        return occurrences;

    }

    static int findWordPosition(String source, String target) {
        return source.indexOf(target);

    }

    static String stringReverse(String str) {
        StringBuilder builder = new StringBuilder(str);
        return builder.reverse().toString();
    }

    static boolean isPalindrome(String str) {
        return str.equalsIgnoreCase(stringReverse(str));
    }

}