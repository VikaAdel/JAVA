package Seminar_02;
// Напишите метод, который принимает на вход строку (String) и определяет является ли строка 
// палиндромом (возвращаетboolean значение).

public class Palindrom {
    public static void main(String[] args) {
        String word = "Привет привет мир";
        boolean result = isPalindrome(word);

        System.out.println(result ? "палиндром" : "не палиндром");

    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        for (left = 0; left < str.length() / 2; left++) //
        {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            right--;
        }
        return true;
    }
}
