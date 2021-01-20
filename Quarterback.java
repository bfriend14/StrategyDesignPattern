package StrategyDesignPattern;
import java.util.Random;
public class Quarterback extends Player{

    public Quarterback(String name) {
        super(name);
        setOffenseBehavior();
        setDefenseBehavior();
    }

    public String play() {
        return this.name + this.play();
    }

    public void setOffenseBehavior() {
        Random num = new Random();
        int OB = num.nextInt(1);
        if (OB == 0) {
            offenseBehavior = new PassBehavior();
        } else if (OB == 1) {
            offenseBehavior = new RunBehavior();
        }
    }

    public void setDefenseBehavior() {
        defenseBehavior = null;
    }
    }   
        
