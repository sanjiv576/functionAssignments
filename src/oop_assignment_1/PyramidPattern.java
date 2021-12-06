package oop_assignment_1;

public class PyramidPattern {
    public static void main(String[] args) {
        for (int rows = 1; rows <= 5; rows++){
            for (int columns = 1; columns <= 9; columns++){
                if (rows == 1){
                    if (columns == 5) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                        }
                }

                else if (rows == 2 ){
                    if (columns == 4 || columns == 5 || columns == 6){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
