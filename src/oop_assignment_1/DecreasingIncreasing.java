/*
Write a Java program that accepts three numbers from the user and prints
"increasing" if the numbers are in increasing order, "decreasing" if
the numbers are in decreasing order, and "Neither increasing nor decreasing order"
otherwise.
 */

package oop_assignment_1;

import java.util.Scanner;

public class DecreasingIncreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNum, secondNum, thirdNum;

        System.out.print("Enter the first number : ");
        firstNum = sc.nextInt();

        System.out.print("Enter the second number : ");
        secondNum = sc.nextInt();

        System.out.print("Enter the third number : ");
        thirdNum = sc.nextInt();

        arrange(firstNum, secondNum, thirdNum);

    }
    public static void arrange(int first, int second, int third){
        if (first < second  && second < third){
            System.out.print("increasing ");
        }
        else if (first > second && second > third){
            System.out.print("decreasing");
        }
        else {
            System.out.print("Neither increasing nor decreasing order");
        }
    }
}
