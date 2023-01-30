/****************************************************************************
Coder: Wonho Lim
Class: Advanced Computer Science
Date: 2020.11.20
Description: Character is an abstract class and parent class for all 
character classes in this game
****************************************************************************/
abstract class Character{
   //fields
   int armor;
   int strengthPoints;
   int at;
   int df;
   int damage;
   int chance;
   String name;
   
   //abstract class for attack; gets oppoent as a parameter
   public abstract void attack(Character i);
   
   //abstract class for defense
   public abstract int defense();
   
   //return strength point of the class
   public int getSP(){
      return strengthPoints;
   }
}