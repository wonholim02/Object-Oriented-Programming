/****************************************************************************
Coder: Wonho Lim
Class: Advanced Computer Science
Date: 2020.11.20
Description: BlueMen is one of the characters that extedns Character class.
It has 12 SP, 3 A, and 2d10 attack, 3d6 defense as a default. However, 
the defense ability depends on SP(4SP => 1 Defense Dice Rolling).
****************************************************************************/
class BlueMen extends Character{
   //constructor for bluemen
   public BlueMen(){
      strengthPoints = 12;
      armor = 3;
      name = "BlueMen";
      chance = 0;
   }
   //overrides attack method. It calculates damage depedns on opponent's defense, armor, and etc.
   public void attack(Character i){
      at = ((int) (Math.random() * 10) + 1) + ((int) (Math.random() * 10) + 1);
      System.out.println("ATTACK DICE: " + at);
      //calculate the damage
      damage = at - i.armor - i.defense();
      if(damage >= 0){
         System.out.println("Total Damage: " + damage);
         i.strengthPoints = i.strengthPoints - damage;
      }
      else{
         System.out.println("Total Damage: 0 ");
      }
      //check harry potter's chance of being alive
      if(i.strengthPoints <= 0 && i.name == "HarryPotter" && i.chance == 1){
         System.out.println("Harry Potter: I'm alive!");
         i.chance = 0;
         i.strengthPoints = 20;
      }
      System.out.println("Defender Final SP: " + i.strengthPoints);
   }
   //override defense method and eturns the defense. Defense ability depends on strengthpoints(4 SP => 1 more rolling)
   public int defense(){
     if(strengthPoints == 12){
         df = ((int) (Math.random() * 6) + 1) + ((int) (Math.random() * 6) + 1) + ((int) (Math.random() * 6) + 1);
         System.out.println("Defend Dice: " + df);
         System.out.println("Defender SP: " + strengthPoints);
         System.out.println("Armor: " + armor);
         return df;
      }
      else if(strengthPoints == 8){
         df = (int)(Math.random() * 6) + 1 + (int) (Math.random() * 6) + 1;
         System.out.println("Defend Dice: " + df);
         System.out.println("Defender SP: " + strengthPoints);
         System.out.println("Armor: " + armor);
         return df;
      }
      else{
         df = ((int) (Math.random() * 6) + 1);
         System.out.println("Defender SP: " + strengthPoints);
         System.out.println("Defend Dice: " + df);
         System.out.println("Armor: " + armor);
         return df;
      }
   }
}