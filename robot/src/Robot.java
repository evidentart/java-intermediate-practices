public class Robot {
  
  String robotType;
  String robotColor = "";

  public Robot(){
    
  }

  public Robot(String robotType){
    this.robotType = robotColor;
  }

  public void activateRobot(){
    
    if(robotType.equals("construction")){
      System.out.println("I am a construction robot and I like to build things!");

    }else if(robotType.equals("household")){
      System.out.println("Robot is being constructed");
    }else if(robotType.equals("I am a basic model household robot. I vacuum the floor and carry groceries.")){
      System.out.println("Robot is being constructed");
    }else if(robotType.equals("maintenance")){
      System.out.println("I am a maintenance robot and I like to fix things!");
    }else {
      System.out.println("Not a valid type of Robot");
    }
  }
}
