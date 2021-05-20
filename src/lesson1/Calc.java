package lesson1;

import java.sql.ResultSet;

public class Calc {
    public static int sum(int dodanok1, int dodanok2) {
        int tempRes = dodanok1 + dodanok2;
        System.out.println(tempRes);
        return tempRes;
    }

    public String sum(String line1, String line2) {
        String tempRes = line1 + line2;
        System.out.println("Result = " + tempRes);
        return tempRes;
    }

    public String sumIntString(int var1, String var2) {
        String res = var1 + var2;
        System.out.println(res);
        return res;
    }

    public void doubleSum(int var1, int var2) {
        System.out.println(sum(var1, var2) * 2);
    }
}
