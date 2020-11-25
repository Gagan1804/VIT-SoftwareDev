import java.util.*;

class Client{
  
  String id; //userID
  int target; //target to score
  
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("No. of players: ");
    
    //for eg. 2 users want to play PvP
    
    System.out.println("Select a game mode(PvP/PvE)");
    String mode1 = sc.next();
    
    System.out.println("Waiting for an opponent...");
    
    System.out.println("Select a game mode(PvP/PvE)");
    String mode2 = sc.next();
    
    // if both players selected PvP then they will be matched and hence placed as opponents against each other
    if(mode1.equals(mode2))
    {
      System.out.println("Opponent found, match starting in ");
      System.out.println("3..");
      TimeUnit.SECONDS.sleep(1);
      System.out.println("2..");
      TimeUnit.SECONDS.sleep(1);
      System.out.println("2..");
      TimeUnit.SECONDS.sleep(1);Helicopter
      
      //start the match
      
      //1st innings
      Client player1 = new Client();
      System.out.println("The target score of " + player1.target);
      
      System.out.println("Select the ball: Full toss, Yorker, Out-swinger, In-swinger, Bouncer, Slower Ball");
      String ball = sc.next();
      
       //1st innings
      Client obj1 = new Client();
      System.out.println("The target score of " + obj.target);
      
      //Now according to the ball and the scores the probability of various batting shots will be calculated and displayed to the player to let him choose from
      if(ball.equals("Full toss"))
      {
        System.out.println("Chose your batting shot: Defend, Run, Run Fast, Square Cut, Helicopter");
      }
      
      else if(ball.equals("Yorker"))
      {
        System.out.println("Chose your batting shot: Defend, Run, Straight Drive, Square Cut, Hook");
      }
      
      else if(ball.equals("Out-swinger"))
      {
        System.out.println("Chose your batting shot: Defend, Run, Cover Drive, Pull, Helicopter");
      }
      
      else if(ball.equals("In-swinger"))
      {
        System.out.println("Chose your batting shot: Defend, Run, On Drive, Pull, Hook");
      }
      
      else if(ball.equals("Bouncer"))
      {
        System.out.println("Chose your batting shot: Defend, Run, Cover Drive, Pull, Hook");
      }
      
      else if(ball.equals("Slower Ball"))
      {
        System.out.println("Chose your batting shot: Defend, Run, On Drive, Pull, Helicopter");
      }
    } 
  }
}
