package HW4;

public class CalcHW4 {

    public int division(int divisible, int divider) {
        try{
            return divisible/divider;
        } catch (ArithmeticException e){
            System.out.println("Can not be divide by zero!");
            return 777;
        }
    }

    public double division(double divisible, double divider) {
        try{
            return divisible/divider;
        } catch (ArithmeticException e){
            System.out.println("Can not be divide by zero!");
            return 777;
        }
    }
}
