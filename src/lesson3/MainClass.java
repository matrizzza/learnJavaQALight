package lesson3;

public class MainClass {
    public static void main(String[] args) {
        int[] array = {2,3,26,7,28,10,9,20,33};
        WorkWithArray workWithArray = new WorkWithArray();
        workWithArray.printMassive(array, 10);

        int[][] ourMassiveMassive = {{1,1,1},{2,2,2},{3,3,3}};

        for (int i = 0; i < ourMassiveMassive.length; i++) {
            for (int j = 0; j < ourMassiveMassive[i].length; j++) {
                System.out.print(ourMassiveMassive[i][j] + " ");
            }
            System.out.println();
        }
    }
}
