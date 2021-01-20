package StrategyDesignPattern;
public class football {
	
	public football() {}
	
	public void play() {
		Player[] players = new Player[3];
		players[0] = new Quarterback("Russel Wilson");
		players[1] = new Reciever("Tyler Lockett");
		players[2] = new Lineman("BJ Finney");
		
		System.out.println("***** Offencive Plays *****");
		displayPlays(players);
		turnover(players);
		System.out.println("\n***** Defencive Plays *****");
		displayPlays(players);
		
	}

    public void displayPlays(Player[] players) {
		for(player player : players) {
			System.out.println(player.title + " " + player.play());
		}
	}
	
	public void turnover(player[] players) {
		for(player player : players) {
			(player).turnover();
		}
	}

	public static void main(String[] args) {
		football football = new football();
		football.play();
	}

}
