package StrategyDesignPattern;
import java.util.Random;
public class Lineman extends Player{
    public Lineman(String name){
        super(name);
        setOffenseBehavior();
        setDefenseBehavior();
    }
    public String play() {
        return this.name + this.play();
    }
    public void setOffenseBehavior(){
        offenseBehavior=new OBlockBehavior();
    }
    public void setDefenseBehavior(){
        Random num=new Random();
            int DB=num.nextInt(2);
            if(DB==0)
            {
                defenseBehavior=new BlockBehavior();
            }
            else if(DB==1)
            {
                defenseBehavior=new StripBehavior();
            }
            else if(DB==2)
            {
                defenseBehavior=new SackBehavior();
            }
    }
    
}
