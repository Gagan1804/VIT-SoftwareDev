import java.util.*;

class Client{
  
  String id; //userID
  int target; //target to score
  
  static final Map<String, Integer> Ball;

    static {
        Ball = new LinkedHashMap<>(); 
        Ball.put("Full toss", 4);
        Ball.put("Yorker", 3);
        Ball.put("Out-swinger", 3);
        Ball.put("In-swinger", 2);
        Ball.put("Bouncer", 4);
        Ball.put("Slower Ball", 2);
    }
  
  static final Map<String, Integer> Shot;

    static {
        Shot = new LinkedHashMap<>(); 
        Shot.put("Defend", 5);
        Shot.put("Run", 7);
        Shot.put("Run Fast", 6);
        Shot.put("Cover Drive", 7);
        Shot.put("On Drive", 5);
        Shot.put("Straight Drive", 6);
        Shot.put("Square Cut", 7);
        Shot.put("Pull", 8);
        Shot.put("Hook", 7);
        Shot.put("Helicopter", 8);
    }
  
  static final Map<String, Integer> Runs;

    static {
        Runs = new LinkedHashMap<>(); 
        Runs.put("Defend", 0);
        Runs.put("Run", 1);
        Runs.put("Run Fast", 2);
        Runs.put("Cover Drive", 2);
        Runs.put("On Drive", 2);
        Runs.put("Straight Drive", 2);
        Runs.put("Square Cut", 4);
        Runs.put("Pull", 4);
        Runs.put("Hook", 6);
        Runs.put("Helicopter", 6);
    }
  
  
   
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
      TimeUnit.SECONDS.sleep(1);
      
      //start the match
      
      //1st innings
      Client player1 = new Client();
      System.out.println("The target score of " + player1.target);
      
      System.out.println("Select the ball: Full toss, Yorker, Out-swinger, In-swinger, Bouncer, Slower Ball");
      String ball = sc.next();
      
      int runsLeft=player1.target;
      int runScored=0;
      
       //1st innings
      
      while(runsLeft>0)
      {
      //Now according to the ball and the scores the probability of various batting shots will be calculated and displayed to the player to let him choose from
      // Probability of shot = (((shot_modifier - ball_modifier) * 100) / shot_modifier)
      
        if(ball.equals("Full toss"))
        {
          String b = "Full toss";
          System.out.println("Choose your batting shot: Defend="+dProb(b)+", Run="+rProb(b)+", Run Fast="+rfProb(b)", Square Cut="+scProb(b)", Helicopter="+heProb(b);
          String s = sc.next();
          runScored = Runs.get(s);
        }

        else if(ball.equals("Yorker"))
        {
          String b="Yorker";
          System.out.println("Choose your batting shot: Defend="+dProb(b)+", Run="+rProb(b)+", Straight Drive="+sdProb(b)+", Square Cut="+scProb(b)+", Hook="+hProb(b));
        }

        else if(ball.equals("Out-swinger"))
        {
          String b="Out-swinger";
          System.out.println("Choose your batting shot: Defend="+rProb(b)+", Run="+rProb(b)+", Cover Drive="+cdProb(b)+", Pull="+pProb(b)+", Helicopter="+heProb(b));
        }

        else if(ball.equals("In-swinger"))
        {
          String b="In-swinger";
          System.out.println("Choose your batting shot: Defend="+dProb(b)+", Run="+rProb(b)+", On Drive="+odProb(b)+", Pull="+pProb(b)+", Hook="+hProb(b));
        }

        else if(ball.equals("Bouncer"))
        {
          String b="Bouncer";
          System.out.println("Choose your batting shot: Defend="+dProb(b)+", Run="+rProb(b)+", Cover Drive="+cdProb(b)+", Pull="+pProb(b)+", Hook="+hProb(b));
        }

        else if(ball.equals("Slower Ball"))
        {
          String b = "Slower Ball";
          System.out.println("Choose your batting shot: Defend="+dProb(b)+", Run="+rProb(b)+", On Drive="+odProb(b)+", Pull="+pProb(b)+", Helicopter="+heProb(b));
        }
      }
    runsLeft = player1.target - runScored;
    }
  }
  
  static float dProb(String b)
                           {
                             String s = "Defend";
                             int bMod = Ball.get(b);
                             int sMod = Shot.get(s);
                             float p = (float)(((sMod - bMod) * 100) / sMod);
                             return p;
                           }
  static float rProb(String b)
                           {
                             String s = "Run";
                             int bMod = Ball.get(b);
                             int sMod = Shot.get(s);
                             float p = (float)(((sMod - bMod) * 100) / sMod);
                             return p;
                           }
  static float rfProb(String b)
                           {
                             String s = "Run Fast";
                             int bMod = Ball.get(b);
                             int sMod = Shot.get(s);
                             float p = (float)(((sMod - bMod) * 100) / sMod);
                             return p;
                           }
  static float cdProb(String b)
                           {
                             String s = "Cover Drive";
                             int bMod = Ball.get(b);
                             int sMod = Shot.get(s);
                             float p = (float)(((sMod - bMod) * 100) / sMod);
                             return p;
                           }
  static float odProb(String b)
                           {
                             String s = "On Drive";
                             int bMod = Ball.get(b);
                             int sMod = Shot.get(s);
                             float p = (float)(((sMod - bMod) * 100) / sMod);
                             return p;
                           }                         
  static float sdProb(String b)
                           {
                             String s = "Straight Drive";
                             int bMod = Ball.get(b);
                             int sMod = Shot.get(s);
                             float p = (float)(((sMod - bMod) * 100) / sMod);
                             return p;
                           }                         
  static float scProb(String b)
                           {
                             String s = "Square Cut";
                             int bMod = Ball.get(b);
                             int sMod = Shot.get(s);
                             float p = (float)(((sMod - bMod) * 100) / sMod);
                             return p;
                           }
  static float pProb(String b)
                           {
                             String s = "Pull";
                             int bMod = Ball.get(b);
                             int sMod = Shot.get(s);
                             float p = (float)(((sMod - bMod) * 100) / sMod);
                             return p;
                           }                         
  static float hProb(String b)
                           {
                             String s = "Hook";
                             int bMod = Ball.get(b);
                             int sMod = Shot.get(s);
                              float p = (float)(((sMod - bMod) * 100) / sMod);
                             return p; 
                           }                         
  static float heProb(String b)
                           {
                             String s = "Helicopter";
                             int bMod = Ball.get(b);
                             int sMod = Shot.get(s);
                             float p = (float)(((sMod - bMod) * 100) / sMod);
                             return p;
                           }                        
}
                           
                           
                           
                           
                           
                           
                           
                           
                           
                           
