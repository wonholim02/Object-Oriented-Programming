/**************************************************************************
Name: Wonho Lim 
TYPE: Bugil Academy
Description: This program set information about the players (name, point, 
bounds, subassists) and then put those players into specific positions, 
then it also calculates total point.
**********************************************************************************************/ 
public class Team {
      private Player pointGuard = new Player();
      private Player shootingGuard = new Player();
      private Player smallFoward = new Player();
      private Player powerFoward = new Player();
      private Player center = new Player();
   
   public Team(Player pg, Player sg, Player sf, Player pf, Player ct) { //constructor
      pointGuard = pg;
      shootingGuard = sg;
      smallFoward = sf;
      powerFoward = pf;
      center = ct;
   }   
   
   public void setPointGuard(Player pgPoint){ //get parameter and change pointguard field(Setter)
      pointGuard = pgPoint;
   }
   
   public Player getPointGuard(){//getter of points(return it)
      return pointGuard;
   }
   
   public void setShootingGuard(Player sgPoint){ //get parameter and change shootingguard field(Setter)
      shootingGuard = sgPoint;
   }
   
   public Player getShootingGuard(){//getter of points(return it)
      return shootingGuard;
   }
   
   public void setSmallForward(Player sfPoint){ //get parameter and change smallfoward field(Setter)
      smallFoward = sfPoint;
   }
   
   public Player getSmallForward(){//getter of points(return it)
      return smallFoward;
   }
   
   public void setPowerForward(Player pfPoint){ //get parameter and change powerfoward field(Setter)
      powerFoward = pfPoint;
   }
   
   public Player getPowerForward(){//getter of points(return it)
      return powerFoward;
   }
   
   public void setCenter(Player ctPoint){ //get parameter and change center field(Setter)
      center = ctPoint;
   }
   
   public Player getCenter(){//getter of points(return it)
      return center;
   }
   
   public int totalPoint(){ //calculate and return total point
      int total = pointGuard.getPoints() + shootingGuard.getPoints() + smallFoward.getPoints() 
                  + powerFoward.getPoints() + center.getPoints(); //calculate total
      return total; 
   }
}
