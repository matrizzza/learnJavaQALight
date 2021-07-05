package RobotWar;

import java.util.ArrayList;
import java.util.List;

public class RobotsWar {
    public static void main(String[] args) {
        //start of RobotsWar
        List<Robot> robotList = new ArrayList<>();
        //naming of Robots
        for (int i = 0; i < 2; i++) {               //можно расширить до инициализации N роботов
            RobotConsole.printEnterName();
            robotList.add(new Robot(RobotConsole.readStringFromConsole()));
        }
        int liveRobotsLeft = robotList.size();
        boolean isGameContinue = true;
        do {
            for (Robot robot : robotList) {
                if (robot.isDead()) {               //этот if нужен если роботов будет больше 2х
                    continue;
                }
                RobotConsole.printRobotMove(robot);
                char enteredChar = RobotConsole.readDamageKeyFromConsole();
                if (enteredChar == 'L') {
                    return;
                }
                robot.makeMove(enteredChar);
                if (robot.isDead()) {
                    RobotConsole.printDeadMsg(robot.getName());
                    liveRobotsLeft--;
                }
                if (liveRobotsLeft == 1) {
                    isGameContinue = false;
                    RobotConsole.printWinnerName(robotList);
                    break;
                }
            }
            RobotConsole.printHealthOfRobots(robotList);
        } while (isGameContinue);
    }
}
