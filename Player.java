package StrategyDesignPattern;

public abstract class Player{
    protected String name;
    protected OffenseBehavior offenseBehavior;
    protected DefenseBehavior defenseBehavior;
    public boolean defense = false;

    public Player(String name){
        this.name=name;
    }
    
    public String play() {
        return defenseBehavior.play() + offenseBehavior.play();
    }
   public void setOffenseBehavior(DefenseBehavior defb){
       defenseBehavior = defb;
   }
   public void setDefenseBehavior(OffenseBehavior offb){
       offenseBehavior = offb;
   }
    
}
