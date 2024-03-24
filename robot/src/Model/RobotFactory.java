package Model;

public class RobotFactory {
  public Robot buildRobot(String robotType){
    Robot robot = null;

  switch(robotType) {
    case "f":
      return new FirefighterBot();
    case "r"
      return new RepairBot();
    case "j"
      return new JanitorBot();
    default;
      return robot;
    }
  }
}
