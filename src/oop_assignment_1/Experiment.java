package oop_assignment_1;
import java.util.Scanner;
public class Experiment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String names;
        System.out.print("Enter a list of names : ");
        names = sc.nextLine();
        int namLen = names.length();
        int spaceCounter = 0;


        int letterCounter = 0;
        for (int i = 0; i <= namLen-1; i++){
            letterCounter += 1;
            char letterFetch = names.charAt(i);
            if (letterFetch == ' '){
                String wordLength = String.valueOf(letterCounter);
                spaceCounter += 1;
                letterCounter = 0;
            }
        }
        System.out.println("Space number : " + spaceCounter);

        while (namLen != 0){

            namLen -= 1;
        }
    }
}
