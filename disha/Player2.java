package disha;
public class Player2 extends Player1{
    private int health;
    private boolean armour;
    public Player2(String name,String weapon,int health,boolean armour)
    {
       super(name,weapon,health);
       this.health=health;
       this.armour=armour;
    }
    @Override
    public void damageByGun1()
    {   if(armour)
        {
            this.health-=20;
            if(this.health<=0)
            this.health=0;
            System.out.println("Armour is ON.Got hit by gun 1.Heath is reduced by 20. "+"Now health is: "+this.health);
        }
        if(!armour)
        {
            this.health-=30;
            if(this.health<=0)
            this.health=0;
            System.out.println("Armour is OFF.Got hit by gun 1.Heath is reduced by 30. "+"Now health is: "+this.health);
        }
        if(this.health==0)
        {
            System.out.println(getName()+" is dead.");
        }
    }

    @Override
    public void damageByGun2()
    {
        if(armour)
        {
            this.health-=40;
            if(this.health<=0)
            this.health=0;
            System.out.println("Armour is ON.Got hit by gun 2.Heath is reduced by 40. "+"Now health is: "+this.health);
        }
        if(!armour)
        {
            this.health-=50;
            if(this.health<=0)
            this.health=0;
            System.out.println("Armour is OFF.Got hit by gun 2.Heath is reduced by 50. "+"Now health is: "+this.health);
        }
        if(this.health==0)
        {
            System.out.println(getName()+" is dead.");
        }
    }
    @Override
    public void heal()
    {
        super.heal();
    }
    
}
