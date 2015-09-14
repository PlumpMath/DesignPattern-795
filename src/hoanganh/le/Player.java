package hoanganh.le;



public class Player {
	public static Game game = new Game();
	
	public static void main(String[] args) {
		System.out.println(game.run());
	}
}

class Game {
	private String gameStatus = "";
	
	private void startGame() {
		gameStatus += "Start Game->";
	}
	
	private void playGame() {
		gameStatus += "Choose player->";
	}
	
	private void exitGame(){
		gameStatus += "Exit./.";
	}
	
	public String run() {
		startGame();
		playGame();
		exitGame();
		return gameStatus;
	}	
}
