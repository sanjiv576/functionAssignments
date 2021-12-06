/*
 Write a Java program to compute body mass index (BMI).
Note:
The formula is BMI = kg/m2 where kg is a person's weight in kilograms and
m2 is their height in metres squared.
 */
package oop_assignment_1;
import java.util.Scanner;
public class BmiCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float mass, height;

        System.out.print("Enter the weight in kg : ");
        mass = sc.nextFloat();

        System.out.print("Enter the height in meter : ");
        height = sc.nextFloat();
        bmiCal(mass, height);
    }
    public static void bmiCal(float mass, float height){
        float bmi;
        bmi = mass/(height * height);
        System.out.println("Your BMI is : " + bmi + " kg/m*m");
    }
}
