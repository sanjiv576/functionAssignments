package oop_assignment_1;
/*
Write a Java program to takes the user for a distance (in meters) and the time was taken
(as three numbers: hours, minutes, seconds), and display the speed, in meters per second,
kilometers per hour and miles per hour (hint: 1 mile = 1609 meters).
Example
Input distance in meters: 2500
Input hour: 5
Input minutes: 56
Input seconds: 23
Expected Output:
Your speed in meters/second is 0.11691531
Your speed in km/h is 0.42089513
Your speed in miles/h is 0.26158804
 */

import java.util.Scanner;
public class SpeedMeasure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float distance, hour, min, sec;

        System.out.print("Enter the distance in meter : ");
        distance = sc.nextFloat();

        System.out.print("Enter the time in hour : ");
        hour = sc.nextFloat();

        System.out.print("Enter the time in minutes : ");
        min = sc.nextInt();

        System.out.print("Enter the time in seconds : ");
        sec = sc.nextFloat();

        speed(distance,hour, min, sec);

    }
    public static void speed(float distance, float hour, float min, float sec){
        float meter_per_sec, km_per_hour, mil_per_hour;

        meter_per_sec = distance/((hour*3600) + (min * 60) + sec);
        km_per_hour = (distance/1000)/(hour + (min/60) + (sec/3600));
        mil_per_hour = (distance/1609)/(hour + (min/60) + (sec/3600));

        System.out.println("Speed in meter/second is " + meter_per_sec);
        System.out.println("Speed in km/hr is " + km_per_hour);
        System.out.println("Speed in mile/hr is " + mil_per_hour);
    }
}
