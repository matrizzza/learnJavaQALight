package lesson5;

import java.util.ArrayList;
import java.util.jar.JarOutputStream;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> ourListList = new ArrayList<>();
        System.out.println(ourListList);
        ourListList.add(new ArrayList<>());
        System.out.println(ourListList);
        ourListList.get(0).add("Test");
        System.out.println(ourListList);
        ourListList.get(0).add("Test1");
        ourListList.add(new ArrayList<>());
        ourListList.get(1).add("Test");
        System.out.println(ourListList);
        ourListList.add(new ArrayList<>());
        ourListList.get(2).add("Test2");
        System.out.println(ourListList);
        ourListList.get(1).remove(0);
        System.out.println(ourListList);
        ourListList.remove(1);
        System.out.println(ourListList);
//        ourListList.get(2).add("Test3");
        ourListList.get(0).set(1, "Test4");
        System.out.println(ourListList);

        ArrayList<String> line = new ArrayList<>();
        line.add("Test5");
        line.add("Test6");
        System.out.println(line);


        ourListList.add(line);
        System.out.println(ourListList);

        line.add("Test7");
        System.out.println(line);
        System.out.println(ourListList);

        ourListList.add(new ArrayList<>());
        ourListList.get(3).addAll(line);
        System.out.println(ourListList);

        line.add("Test8");
        System.out.println(ourListList);


        for (ArrayList<String> row : ourListList) {
            for (String element : row) {
                System.out.print(element + ",");
                element = element + " ggg";
            }
            System.out.println();
        }

        System.out.println(ourListList);
    }
}
