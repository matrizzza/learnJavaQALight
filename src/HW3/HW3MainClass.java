package HW3;

public class HW3MainClass {
    public static void main(String[] args) {
        HW3Calc calc = new HW3Calc();

        int var1 = 57, var2 = 17;

        int var3 = calc.subtractionDoubled(var1, var2);
        calc.multiplicationDoubled(var2, var3);
    }
}
