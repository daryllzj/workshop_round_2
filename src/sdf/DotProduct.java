package sdf;

import java.io.Console;
import java.util.Arrays;

public class DotProduct {

    public static void main(String[] args) {

        // take in arguments and parse to Int to determine columns and rows
        int rows = Integer.parseInt(args[0]);
        int columns = Integer.parseInt(args[1]);

        int[][] firstMatrix = new int [rows][columns];

        Console cons = System.console();

        // create first matrix
        for (int i = 0; i < rows; i++) {
            String columnRows = cons.readLine("Row:%d, key in %d numbers: ", i, columns);
            for (int j = 0; j < columns; j++) {
                String[] arrOfColumn = columnRows.split(" ");
                // System.out.printf("Row:%d, Column:%d is %s \n",i, j, arrOfColumn[j]);
                firstMatrix[i][j] = Integer.parseInt(arrOfColumn[j]);
            }
        }

        System.out.println("\nFirst Matrix\n");
        System.out.println(Arrays.deepToString(firstMatrix));

        // Create second array
        int[] secondMatrix = new int[columns];
        String secondMatrixRows = cons.readLine("\nKey in %d numbers: ", columns);
        // create second matrix
        for (int i = 0; i < columns; i++) {
            String[] arrOfSecondMatrix = secondMatrixRows.split(" ");
            secondMatrix[i] = Integer.parseInt(arrOfSecondMatrix[i]);
        }

        System.out.println("\nSecond Matrix\n");
        System.out.println(Arrays.toString(secondMatrix));

        // create final matrix
        int[] finalMatrix = new int[rows];
        for (int i = 0; i < rows; i++) {
            int total = 0;
            for (int j = 0; j < columns; j++) {
                total += firstMatrix[i][j] * secondMatrix[j];
                // System.out.printf("First Matrix:[%d,%d] is %d * Second Matrix[%d] is %d = Total: %d\n",i, j, firstMatrix[i][j],i,secondMatrix[j],total);
                finalMatrix[i] = total;
            }
        }

        System.out.println("\nFinal Matrix\n");
        System.out.println(Arrays.toString(finalMatrix));
        
    }

}