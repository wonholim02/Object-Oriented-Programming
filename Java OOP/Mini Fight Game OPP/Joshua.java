/****************************************************************************
Coder: Wonho Lim
Class: Advanced Computer Science
Date: 2020.11.20
Description: Joshua is one of the characters that extedns Character class.
It has 10 SP, 3 A, and 2d6 attack, 1d6 defense as a default. it is the only
character that speaks for every movement.
****************************************************************************/
class Joshua extends Character{
   //constructor for Joshua
   public Joshua(){
      strengthPoints = 10;
      armor = 3;
      name = "Joshua";
      chance = 0;
   }
   //overrides attack method. It calculates damage depedns on opponent's defense, armor, and etc.
   public void attack(Character i){
      at = ((int) (Math.random() * 6) + 1) + ((int) (Math.random() * 6) + 1);
      System.out.println("ATTACK DICE: " + at);
      //calculate the damage
      damage = at - i.armor - i.defense();
      if(damage >= 0){
         System.out.println("Total Damage: " + damage);
         i.strengthPoints = i.strengthPoints - damage;
         System.out.println("Joshua: Giung Power!!");
      }
      else{
         System.out.println("Total Damage: 0 ");
      }
      //check opponent harry potter's chance of being alive
      if(i.strengthPoints <= 0 && i.name == "HarryPotter" && i.chance == 1){
         System.out.println("Harry Potter: I'm alive!");
         i.chance = 0;
         i.strengthPoints = 20;
      }
      System.out.println("Defender Final SP: " + i.strengthPoints);
      if(i.strengthPoints == 0){
         System.out.println("Joshua: You're too Weak.");
      }
   }
   //override defense method. It returns the defense ability
   public int defense(){
      df = (((int) (Math.random() * 6)) + 1);
      System.out.println("Defender SP: " + strengthPoints);
      System.out.println("Defend Dice: " + df);
      System.out.println("Armor: " + armor);
      System.out.println("Joshua: Catch me if you can!");
      return df;
   }
}