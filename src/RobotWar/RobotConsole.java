package RobotWar;

import java.util.List;
import java.util.Scanner;

public class RobotConsole {
    public static void printEnterName() {
        System.out.println("Enter name of Robot: ");
    }

    public static String readStringFromConsole() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void printHealthOfRobots(List<Robot> robotList) {
        System.out.println("-------------------------");
        for (Robot robot : robotList) {
            if (!robot.isDead()) {
                System.out.println(robot.getName() + " HP: " + robot.getHealth());
            }
        }
        System.out.println("-------------------------");
    }

    public static void printRobotMove(Robot robot) {
        System.out.println("For exit enter \"L\"");
        System.out.println("Shot on robot " + robot.getName());
        System.out.println("Select the letter from the list (QWEASDZXC)");
    }

    public static void printDamageMsg(int key) {
        System.out.println("Good shot!! Babah!! -" + key);
    }

    public static void printDeadMsg(String robotName) {
        System.out.println("Robot " + robotName + " is dead!!!");
    }

    public static void printWinnerName(List<Robot> robotList) {
        for (Robot robot : robotList) {
            if (!robot.isDead()) {
                System.out.println("Robot " + robot.getName() + " WINS");
            }
        }
    }

    public static char readDamageKeyFromConsole() {
        String alphabet = "QWEASDZXCL";
        boolean isLetterWrong;
        char enteredChar;
        do {
            enteredChar = readStringFromConsole().charAt(0);
            if (alphabet.contains(String.valueOf(enteredChar))) {
                isLetterWrong = false;
            } else {
                isLetterWrong = true;
                System.out.println("Wrong Letter, try again...");
            }
        } while (isLetterWrong);
        return enteredChar;
    }
}
