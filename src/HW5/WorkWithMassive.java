package HW5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class WorkWithMassive {
    public static void printIntMatrix(int[][] matrix) {
        if (matrix.length == 0) {
            System.out.println("Your matrix is empty. There is nothing to be print.");
            System.out.println("---------------------------------------------------");
        } else {
            System.out.println("Printing Matrix:");
            System.out.println("----------------");
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public int[][] createMatrix(int width, int height, int value) {
        //check of width value. can not be 0 or negative
        if (width == 0) {
            System.out.println("Size of matrix can not be 0! Changing width to 1...");
            width = 1;
        } else if (width < 0) {
            System.out.println("Size of matrix can not be negative! Changing width to positive value...");
            width = width * -1;
        }

        //check of height value. can not be 0 or negative
        if (height == 0) {
            System.out.println("Size of matrix can not be 0! Changing height to 1...");
            height = 1;
        } else if (height < 0) {
            System.out.println("Size of matrix can not be negative! Changing height to positive value...");
            height = height * -1;
        }

        int[][] newMatrix = new int[width][height];
        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix[i].length; j++) {
                newMatrix[i][j] = value;
            }
        }
        System.out.println("Matrix " + newMatrix.length + "*" + newMatrix[0].length + " created.");
        System.out.println("--------------------");
        return newMatrix;
    }

    public int[][] fillingOfLeftDiagonal(int[][] matrix, int value) {
        //Check if matrix is square
        if (isMatrixNotSquare(matrix)) {
            return matrix;
        } else if (matrix.length == 0) {
            System.out.println("Your matrix is empty! Creating new 1*1 matrix...");
            return new int[][]{{value}};
        }
        //filing of matrix`s left diagonal
        //create new int[][] to leave unchanged origin matrix
        int[][] changedMatrix = new int[matrix.length][matrix.length];
        for (int i = 0; i < changedMatrix.length; i++) {
            changedMatrix[i] = Arrays.copyOf(matrix[i], matrix[i].length);
            changedMatrix[i][i] = value;
        }
        System.out.println("Filling of matrix`s left diagonal successful!");
        return changedMatrix;
    }

    public int[][] fillingOfRightDiagonal(int[][] matrix, int value) {
        //Check if matrix is square
        if (isMatrixNotSquare(matrix)) {
            return matrix;
        } else if (matrix.length == 0) {
            System.out.println("Your matrix is empty! Creating new 1*1 matrix...");
            return new int[][]{{value}};
        }
        //filing of matrix`s left diagonal
        //create new int[][] to leave unchanged origin matrix
        int[][] newMatrix = new int[matrix.length][matrix.length];
        for (int i = 0; i < newMatrix.length; i++) {
            newMatrix[i] = Arrays.copyOf(matrix[i], matrix[i].length);
            newMatrix[i][newMatrix[i].length - 1 - i] = value;
        }
        System.out.println("Filling of matrix`s right diagonal successful!");
        return newMatrix;
    }

    public int[][] fillingOfDiagonals(int[][] matrix, int value) {
        if (isMatrixNotSquare(matrix)) {
            return matrix;
        } else if (matrix.length == 0) {
            System.out.println("Your matrix is empty! Creating new 1*1 matrix...");
            return new int[][]{{value}};
        }
        int[][] newMatrix = fillingOfLeftDiagonal(matrix, value);
        return fillingOfRightDiagonal(newMatrix, value);
    }

    private boolean isMatrixNotSquare(int[][] matrix) {
        //compare each array length with length of matrix
        for (int i = 0; i < matrix.length; i++) {
            if (matrix.length != matrix[i].length) {
                System.out.println("Your Matrix is not square!");
                return true;
            }
        }
        return false;
    }
}
