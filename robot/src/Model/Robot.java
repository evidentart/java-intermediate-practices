package Model;
public class Robot {
  
  String robotType;
  String robotColor = "";

  public Robot(){
    
  }

  public Robot(String robotType){
    this.robotType = robotType;
  }

  public void activateRobot(){
    
    if(robotType.equals("construction")){
      System.out.println("I am a construction robot and I like to build things!");

    }else if(robotType.equals("household")){
      System.out.println("I am a household robot and I like to clean things!");

    }else if(robotType.equals("maintenance")){
      System.out.println("I am a maintenance robot and I like to fix things!");

    }
  }
}
