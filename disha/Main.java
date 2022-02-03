
package disha;


public class Main{

 public static void main(String[] args) {
     
    String weapon;
    String name;
    int health;
    boolean armour;
    Player1 p1=new Player1(name="Disha",weapon="sword",health=100);
   // System.out.println(p1.getName());
    //System.out.println(p1.getHealth());
    p1.damageByGun1();
    p1.damageByGun1();
    p1.damageByGun2();
   p1.heal();

   // Player2 p2=new Player2(name="manpreet",weapon="gun",health=80,armour=false);
    //p2.damageByGun1();
    //p2.damageByGun1();
   // p2.damageByGun2();
    }
}
