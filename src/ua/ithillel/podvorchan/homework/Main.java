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
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;

    }
}