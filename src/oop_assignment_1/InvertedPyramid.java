package oop_assignment_1;

public class InvertedPyramid {
    public static void main(String[] args) {
        for (int rows = 1; rows <= 5; rows++){
            for (int columns = 1; columns <= 9; columns++){
                if (rows == 1){
                    System.out.print("*");
                }
                else if (rows == 2){
                    secondLine(columns);
                }
                else if (rows == 3){
                    thirdLine(columns);
                }
                else if (rows == 4){
                    fourthLine(columns);
                }
                else {
                    if (columns == 5){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
    public static void secondLine(int column){

        if (column == 1 || column == 9){
            System.out.print(" ");
        }
        else {
            System.out.print("*");
        }
    }
    public static void thirdLine(int column){
        if (column == 1 || column == 2 || column == 8 || column == 9){
            System.out.print(" ");
        }
        else {
            System.out.print("*");
        }
    }
    public static void fourthLine(int column){
        if (column == 4 || column == 5 || column == 6){
            System.out.print("*");
        }
        else {
            System.out.print(" ");
        }
    }
}
