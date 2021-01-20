package StrategyDesignPattern;
import java.util.Random;
public class BlockBehavior implements DefenseBehavior{
    public String play(){
        String block=" ";
        Random num=new Random();
        int bl=num.nextInt(3);
        if (bl==0)
        {
            block="kick";
        }
        else if (bl==1)
        {
            block="punt";
        }
        else if (bl==2)
        {
            block="pass";
        }
        else if (bl==3)
        {
            block="catch";
        }
        return block;
    }
}
