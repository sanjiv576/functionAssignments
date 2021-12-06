
/*
Write a Java program that prompts the user for an integer and
then prints out all the prime numbers up to that Integer?
 */

package oop_assignment_1;

import java.util.Scanner;
public class PrimeNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter the stop/end number : ");
        num = sc.nextInt();


        for (int i = 1; i <= num; i++){
            int counter = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    counter += 1;
                }
            }
            if (counter == 2) {
                System.out.println(i);
            }
        }

    }
}
