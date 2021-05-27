package lesson3;

public class WorkWithArray {
    public void printMassive(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 10){
                System.out.println(array[i] + " Element is less than " + value);
            } else if (array[i] == 10){
                System.out.println(array[i] + " Element equals " + value);
            }else{
                System.out.println(array[i] + " Element is more than " + value);
            }
        }
    }
}
