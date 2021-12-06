/*
Write a Java program that checks whether a given string is a palindrome or not.
 Ex: MADAM is a palindrome?
 */
package oop_assignment_1;

import java.lang.*;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name;
        System.out.print("Give a string : ");
        name = sc.nextLine();  // initializing the string input from the user
        name = name.toLowerCase();  // converts string to lower case
        System.out.println("From user input into lower case : " + name);
        int length = name.length();

        String emp = "";
        for (int i = length - 1; i >= 0; i--){  // length - 1 because indexing begins with 0 but counting length with 1

            char eachLetter = name.charAt(i);  // indexing each character from the word
            String convertedLetter = Character.toString(eachLetter);  // converts character into string
            emp =  emp + convertedLetter;  // emp += convertedLetter

            //char letter = name.charAt(i);
            //System.out.println(emp.getClass().getSimpleName());
            //emp += Arrays.toString(letter);
            //System.out.println(name.charAt(i).getClass().getSimpleName);
        }
        System.out.println("After the loop : " + emp);
        if (name.equals(emp)){  // name == emp does not work so, name.equals(emp) is used.
            System.out.println("\nPalindrome string.");
        }
        else {
            System.out.println("\nNot a palindrome string.");
        }

    }
}

