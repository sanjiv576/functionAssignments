package oop_assignment_1;
// Write a Java program for sorting a given list of names in ascending order?
/*
Example : Jo Rita Tommy Ram Facebook Google
Expected ascending order: Jo Ram Rita Tommy Google Facebook
 */
import java.util.Scanner;

public class AscendingOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // inserting a list of names/words/multiple strings
        String names;
        System.out.print("Enter a list of names : ");
        names = scan.nextLine();

        int namesLength = names.length();
        int spaceNum = 0;
        // finding number of words and space
        for (int i = 0; i <= namesLength-1; i++){
            char eachLetter = names.charAt(i);
            if (eachLetter == ' '){
                spaceNum += 1;
            }
            // System.out.println(eachLetter);
        }
        int wordNum = spaceNum + 1;
        System.out.println("Number of words : " + wordNum);
        // made string into string array to traverse each name/word/string
        String[] arr = names.split(" ");

//        // creating an array and giving size of it
//        String[] arrayNames = new String[wordNum];
//        int ii = 0;
//        // inserting each name in the array
//        for (String element: arr){
//            boolean goIn = true;
//            while (goIn){
//                arrayNames[ii] = element;
//                // made false to run while loop only once is each iteration of for loop to insert each name one-by-one
//                goIn = false;
//            }
//            ii += 1;
//        }
        // filtering the names
        String temp;
        for (int j = 0; j < wordNum; j++){
            for (int k = j+1; k < wordNum; k++){

                // comparing length of each word in array
                if (arr[j].length() > arr[k].length()){
                    // storing greater length in temp i.e. arr[j] whereas lesser length in the array 0, 1, 2 ..
                    temp = arr[j];
                    // exchanging position
                    arr[j] = arr[k];
                    arr[k] = temp;
                    // System.out.println(arr[j] + " > " + arr[k]);
                }
            }
        }

        System.out.println("Ascending order of given name list: ");
        for (int kk = 0; kk < wordNum; kk++){
            System.out.println(arr[kk]);
        }


    }
}



