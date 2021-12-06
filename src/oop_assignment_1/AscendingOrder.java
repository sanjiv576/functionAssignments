package oop_assignment_1;

import java.util.Scanner;

public class AscendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String names;
        System.out.print("Enter a list of names : ");
        names = sc.nextLine();

        System.out.println(names.length());

        //System.out.println(names.split(" "));

        int spaceCounter = 0;
        int listLength = names.length();
        int wordCounter = 0;
        for (int i = 0; i <= listLength-1; i++){
            wordCounter += 1;
            char letterFetch = names.charAt(i);
            if (letterFetch == ' '){
                String wordLength = String.valueOf(wordCounter);
                spaceCounter += 1;
                wordCounter = 0;  // made zero to count next word again after encountering space
            }
        }
        System.out.println("Space number : " + spaceCounter);
        System.out.println("Number of words : " + wordCounter);

        String[] na = names.split(" ");
        //System.out.println(na[0]);

        for (int j = 0; j <= spaceCounter-1; j++){
            String eachWord = na[j];
            int eachWordLength = eachWord.length();
            System.out.println(eachWord + " : " + eachWordLength);
        }






    }
}
