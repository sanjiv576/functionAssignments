package oop_assignment_1;

import java.util.Scanner;

/*
Write a java program to check weather a given number is Armstrong number or not.
Note:
An Armstrong number of a three-digit number is a number in which
the sum of the cube of the digits is equal to the number itself.
Hence, 153 is an Armstrong number.

 */
public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter a number : ");
        num = sc.nextInt();
        int temp = num;

        int ans = calculate(num);
        if (temp == ans){
            System.out.print(temp + " is an armstrong number.");
        }
        else {
            System.out.println(temp + " is not an armstrong number.");
        }
    }
    public static int calculate(int num){
        int result = 0;
        do{

            int rem = num % 10;
            result = (rem * rem * rem) + result;
            num = num/10;

        } while (num != 0);
        return result;
    }
}
