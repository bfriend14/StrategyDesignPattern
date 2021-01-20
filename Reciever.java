package StrategyDesignPattern;
public class Reciever extends Player{
    public Reciever(String name){
        super(name);
        setOffenseBehavior();
        setDefenseBehavior();
    }
    public String play() {
        return this.name + this.play();
    }
    public void setOffenseBehavior(){
        offenseBehavior = new RecieverBehavior();
    }
    public void setDefenseBehavior(){
        defenseBehavior=null;
    }
}
