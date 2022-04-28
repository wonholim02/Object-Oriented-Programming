/****************************************************************************
Coder: Wonho Lim
Class: Advanced Computer Science
Date: 2020.11.20
Description: Vampire is one of the characters that extedns Character class.
It has 18 SP, 1 A, and 1d12 attack, 1d6 defense. For the 50% chance, Vampire
ignores opponent's attack(charm skill).
****************************************************************************/
class Vampire extends Character{
   //constructor for vampire
   public Vampire(){
      strengthPoints = 18;
      armor = 1;
      name = "Vampire";
      chance = 0;
   }
   
   //overrides attack method. It calculates damage depedns on opponent's defense, armor, and etc.
   public void attack(Character i){
      at = (int) (Math.random() * 12) + 1;
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
   
   //override defense method. For the 50 % of chance, it ignore's opponent's attack.
   public int defense(){
      df = (int) (Math.random() * 10) + 1;
      if(df < 6){
         System.out.println("\\\\\\\\\\\\\\Charmed////////");
         return 999999;
      }
      //returns the defense ability
      else{ 
         System.out.println("Defender SP: " + strengthPoints);
         System.out.println("Defend Dice: " + df);
         System.out.println("Armor: " + armor);
         return df;
      }
   }
}