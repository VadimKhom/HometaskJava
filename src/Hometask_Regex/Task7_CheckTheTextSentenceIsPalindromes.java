package Hometask_Regex;

import java.util.Scanner;

public class Task7_CheckTheTextSentenceIsPalindromes {

    public static void main(String[] args){
        String text = "Шалаш";
        isPalindrome(text);
        System.out.println(isPalindrome(text));

    }
    public static boolean isPalindrome(String text) {
        text = text.replaceAll("\\W","");//удаляем все ненужное
        StringBuilder strBuilder = new StringBuilder(text);
        strBuilder.reverse(); //переворачиваем строку
        String invertedText = strBuilder.toString();//присваиваем перевернутую строку

        return  text.equalsIgnoreCase(invertedText) ;//возвращаем сравнение двух строк вне зависимости от регистра

    }
   /* public static String reverseString(String s){
        String r = "";
        for (int i = s.length() - 1; i >= 0; --i)
            r += s.charAt(i);
        return r;
    }
    public static Boolean isPalindrome(String s) {
        if(s.equals(reverseString(s))){
            System.out.println("Полиндром");
        }else{
            System.out.println("Не полиндром");
        }
        return s.equals(reverseString(s));*/

}

