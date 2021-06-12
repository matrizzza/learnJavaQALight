package HW7;

import java.util.ArrayList;
import java.util.List;

public class WorkWithList {
    /**
     * Method will add new List<String> to List
     */
    List<List<String>> addNewList(List<List<String>> ourList) {
        ourList.add(new ArrayList<>());
        printListList(ourList);
        return ourList;
    }

    /**
     * Method should add value to some List
     *
     * @param numberOfList index of list in list
     * @param value string value to add to chosen list
     */
    List<List<String>> addValueToListList(int numberOfList, String value, List<List<String>> ourList) {
        if (numberOfList >= ourList.size() || numberOfList < 0) {
            System.out.println("You chose the wrong List. No changes was made.");
            return ourList;
        }
        ourList.get(numberOfList).add(value);
        printListList(ourList);
        return ourList;
    }

    /**
     * Method should print Every List on new line
     */
    private void printListList(List<List<String>> ourList) {
        System.out.println("---------------");
        for (List<String> list : ourList) {
            System.out.println(list);
        }
    }
}
