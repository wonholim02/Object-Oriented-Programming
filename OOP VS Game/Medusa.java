/****************************************************************************
Coder: Wonho Lim
Class: Advanced Computer Science
Date: 2020.11.20
Description: Medusa is one of the characters that extedns Character class.
It has 8 SP, 3 A, and 2d6 attack, 1d6 defense as a default. However, if it 
gets both 6 for the attack dice rolling, it makes opponent's SP as 0(Glare).
****************************************************************************/
class Medusa extends Character{
   //constructor for Medusa
   public Medusa(){
      strengthPoints = 8;
      armor = 3;
      name = "Medusa";
      chance = 0;
   }
   //overrides attack method. It calculates damage depedns on opponent's defense, armor, and etc.
   public void attack(Character i){
      at = ((int) (Math.random() * 6) + 1) + ((int) (Math.random() * 6) + 1);
      System.out.println("ATTACK DICE: " + at);
      //if it gets both 6 for the attack dice rolling, it makes opponent's SP as 0(Glare).
      if( at == 12 ){
         System.out.println("\\\\\\\\\\\\\\Glare////////");
         i.strengthPoints = 0;
      }
      //calculate the damage
      else{
         damage = at - i.armor - i.defense();
         if(damage >= 0){
            System.out.println("Total Damage: " + damage);
            i.strengthPoints = i.strengthPoints - damage;
         }
         else{
            System.out.println("Total Damage: 0 ");
         }
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
      df = ((int) (Math.random() * 6) + 1);
      System.out.println("Defender SP: " + strengthPoints);
      System.out.println("Defend Dice: " + df);
      System.out.println("Armor: " + armor);
      return df;
   }
}