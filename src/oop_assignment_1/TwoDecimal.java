package oop_assignment_1;
// Write a Java program that accepts two floating-point numbers and
// checks whether they are the same up to two decimal places.
import java.util.Scanner;
import java.text.DecimalFormat;
public class TwoDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float firstNum, secondNum;
        System.out.print("Enter the first floating-point number : ");
        firstNum = sc.nextFloat();

        System.out.print("Enter the second floating-point number : ");
        secondNum = sc.nextFloat();

        String pattern = "00.00";
        DecimalFormat checker = new DecimalFormat(pattern);

        if (checker.format(firstNum).equals(checker.format(secondNum))){
            System.out.println("They are the same upto two ");
        }
    }
}
