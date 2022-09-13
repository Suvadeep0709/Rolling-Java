import java.util.Scanner;

public class JavaRolls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = 0;  
      
        
        System.out.println("Lets play Rolling Java. Type anything to start.");
        String user=scan.nextLine();
        if (!user.equals(null))
        {
                System.out.println("Great, here are the rules");
                System.out.println("- If you roll a 6 the game stops.");
                System.out.println("- If you roll a 4 nothing happens.");
                System.out.println("- Otherwise, you get 1 point");  
                System.out.println("You must collect at least 3 points to win. Enter anything to roll:");  
                String choice=scan.nextLine(); 
                
                while(true){
                System.out.println("Enter a random value");
                int dice=rollDice();
                System.out.println("You rolled a "+dice);
                if(dice==6){
                  System.out.println("End of game");
                  break;
                }
                else if (dice==4){
                  System.out.println("Zero Points , Keep rolling");
                }
                else {
                  score+=1;
                  System.out.println("One Point , Keep Rolling");
                }
                }     
        }
        System.out.println("\nYour score is: " + score);
        if (score>=3){
          System.out.println("wow that's lucky you win");
        }
        else {
          System.out.println("Tough luck you loose");
        }


        

       
      
       
    }
  
  
   
    public static int rollDice(){
      int randomNumber=(int)((Math.random()*6)+1);
      return randomNumber;
    }
  
  
}
