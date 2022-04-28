/****************************************************************************
Coder: Wonho Lim
Class: Advanced Computer Science
Date: 2020.11.20
Description: Barbarian is one of the characters that extedns Character class.
It has 12 SP, 0 A, and 2d6 attack, 2d6 defense.
****************************************************************************/
class Barbarian extends Character{
   //constructor for barbarian
   public Barbarian(){
      strengthPoints = 12;
      armor = 0;
      name = "Barbarian";
      chance = 0;
   }
   //overrides attack method. It calculates damage depedns on opponent's defense, armor, and etc.
   public void attack(Character i){
      at = (int)((Math.random() * 6) + 1) + ((int)(Math.random() * 6) + 1);
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
   //override defense method. It returns the defense ability
   public int defense(){
      df = ((int)(Math.random() * 6) + 1) + ((int)(Math.random() * 6) + 1);
      System.out.println("Defender SP: " + strengthPoints);
      System.out.println("Defend Dice: " + df);
      System.out.println("Armor: " + armor);
      return df;
   }
}