package StrategyDesignPattern;
import java.util.Random;
public class RecieverBehavior implements OffenseBehavior{
    public String play() {
        String route=new String(" ");
        Random num=new Random();
        int wr=num.nextInt(4);
        if (wr==0)
        {
            route="slant route";
        }
        else if (wr==1)
        {
            route="out route";
        }
        else if (wr==2)
        {
            route="seam route";
        }
        else if (wr==3)
        {
            route="screen pass";
        }
        else if (wr==4)
        {
            route="hail mary";
        }
        return route;
    }
}
