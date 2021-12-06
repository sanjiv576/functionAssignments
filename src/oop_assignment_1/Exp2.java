package oop_assignment_1;

public class Exp2 {
    public static void main(String[] args) {
        for (int rows = 1; rows <= 5; rows++ ){
            for (int columns = 1; columns <= 5; columns++){

                drawRow(rows);

                drawColumns(rows, columns);

            }
            System.out.println();
        }
    }

    public static void drawRow(int rows){
        if (rows == 1 || rows == 5){
            System.out.print("*");
        }
    }

    public static void drawColumns(int rows, int columns){
        if ((columns == 1 || columns == 5) && (rows == 2 || rows == 3 || rows == 4)){
            System.out.print("*");
        }
        else if ((columns == 2 || columns == 3 || columns == 4) && (rows == 2 || rows == 3 || rows == 4)){
            System.out.print(" ");
        }
    }

}
