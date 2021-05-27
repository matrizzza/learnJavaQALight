package lesson2;

public class Calc {
    public int sum(int var1, String var2){
        try {
            int result = var1 + Integer.parseInt(var2);
            System.out.println(result);
            return result;
        } catch (Exception e) {
            System.out.println("Error : " + e);
            return 88888;
        }finally {
            System.out.println("String from block \"Finally\"!!");
        }
    }
}
