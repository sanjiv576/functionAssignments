// Write a Java program that reads a line of integers and then displays each
//integer and the sum of all integers.

package oop_assignment_1;
import java.util.Scanner;
import java.lang.*;
public class IntegerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3, num4, num5;
        System.out.print("Enter the first number : ");
        num1 = sc.nextInt();

        System.out.print("Enter the second number : ");
        num2 = sc.nextInt();

        System.out.print("Enter the third number : ");
        num3 = sc.nextInt();

        System.out.print("Enter the fourth number : ");
        num4 = sc.nextInt();

        System.out.print("Enter the five number : ");
        num5 = sc.nextInt();

        int result = addition(num1, num2, num3, num4, num5);
        System.out.println("Sum of " + num1 + ", " + num2 + ", " +  num3 + ", " + num4 +  " and " + num5 + " is : " + result);
        }
        public static int addition(int firstNum, int secondNum, int thirdNum, int fourthNum, int fifthNum){
        return (firstNum + secondNum + thirdNum + fourthNum + fifthNum);
        }
}
