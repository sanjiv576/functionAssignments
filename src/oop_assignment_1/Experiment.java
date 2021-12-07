package oop_assignment_1;
import java.util.Scanner;
public class Experiment {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = s.nextInt();
        String[] str = new String[n];
        System.out.println("Enter strings: ");
        for(int i = 0; i < n; i++)
        {
            str[i] = new String(s.next());
        }
        System.out.println(str.getClass().getSimpleName());
        for(int i = 0; i < n; i++)
        {
            for(int j = i+1; j < n; j++)
            {
                if(str[i].compareTo(str[j])>0)
                {
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        System.out.println("Sorted list of strings is:");
        for(int i = 0; i < n ; i++)
        {
            System.out.println(str[i]);
        }
    }
}
