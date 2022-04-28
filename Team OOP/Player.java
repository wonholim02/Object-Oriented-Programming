/**************************************************************************
Name: Wonho Lim 
TYPE: Bugil Academy
Description: This program set information about the player (name, point, 
bounds, subassists) by getting values from parameter. Also, it compares 
point and return boolean values too.
***************************************************************************/
public class Player {
   private String name;
   private int points;
   private int rebounds;
   private int assists;
      
   public Player() { //give basic values to fields
      name="";
      points=-100;
      rebounds=-100;
      assists=-100;
   }
   
   public Player(String subname, int subpoints, int subrebounds, int subassists){ //get parameters and update fields
      name = subname;
      points = subpoints;
      rebounds = subrebounds;
      assists = subassists; 
   }   
   
   public String getName(){ //getter of name(return it)
      return name;
   }
   public void setPoints(int newPoints){ //get parameter and change points field(Setter)
      points = newPoints;
   }
   public int getPoints(){ //getter of points(return it)
      return points;
   }
   public void setRebounds(int newRebounds){//get parameter and change rebounds field(Setter)
      rebounds = newRebounds;
   }
   public int getRebounds(){ //getter of rebounds(return it)
      return rebounds;
   }
   public void setAssists(int newAssists){//get parameter and change assists field(Setter)
      assists = newAssists;
   }
   public int getAssists(){ //getter of assists(return it)
      return assists;
   }
   public boolean hasMorePointsThan(Player play){ // compare points and give boolean value
      if( play.getPoints() < points){
         return true; //return true
      }
      return false; //return false
   }
}