package lesson2;

public class MainClass {
    public static void main(String[] args) {
        Calc calc = new Calc();
        calc.sum(56, "35");
        System.out.println(calc.sum(57, "3a5"));
        System.out.println("! The End !");


        int[] ageNew = new int[10];
        ageNew[0] = 10;
        ageNew[5] = 51;

        System.out.println("------------------Cycle \"For\"----------------");
        int counter = 0;
        for (int i = 0; i < ageNew.length; i++) {
            ageNew[i] = 10 * (i + 1);
            System.out.println(ageNew[i]);
            counter++;
//            System.out.println("line = " + counter);
        }
    }
}
