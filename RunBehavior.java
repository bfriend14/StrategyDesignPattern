package StrategyDesignPattern;
import java.util.Random;
public class RunBehavior implements OffenseBehavior{
    public String play(){
        String run = new String(" ");
        Random num=new Random();
        int rb=num.nextInt(3);
        if (rb==0)
        {
            run="drive";
        }
        else if (rb==1)
        {
            run="draw";
        }
        else if (rb==2)
        {
            run="pitch";
        }
        else if (rb==3)
        {
            run="reverse";
        }
        System.out.println(" ran a "+run);
        return null;
    }

}