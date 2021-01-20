package StrategyDesignPattern;
import java.util.Random;
public class PassBehavior extends OffenseBehavior{
    public String play() {
        String pass=new String(" ");
        Random num=new Random();
        int qb=num.nextInt(4);
        if (qb==0)
        {
            pass="slant route";
        }
        else if (qb==1)
        {
            pass="out route";
        }
        else if (qb==2)
        {
            pass="seam route";
        }
        else if (qb==3)
        {
            pass="screen pass";
        }
        else if (qb==4)
        {
            pass="hail mary";
        }
        return " threw a "+pass;
    }
}