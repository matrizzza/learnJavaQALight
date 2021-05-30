package HW5;

public class MainClass {
    public static void main(String[] args) {
        WorkWithMassive workWithMassive = new WorkWithMassive();

        int[][] myNewMatrix = workWithMassive.createMatrix(6, 6, 9);
        WorkWithMassive.printIntMatrix(myNewMatrix);

        int[][] myThirdMatrix = workWithMassive.fillingOfRightDiagonal(myNewMatrix, 8);
        WorkWithMassive.printIntMatrix(myThirdMatrix);

        int[][] mySecondMatrix = workWithMassive.fillingOfLeftDiagonal(myNewMatrix, 4);
        WorkWithMassive.printIntMatrix(mySecondMatrix);

        int[][] myForthMatrix = workWithMassive.fillingOfDiagonals(myNewMatrix, 2);
        WorkWithMassive.printIntMatrix(myForthMatrix);
    }
}
