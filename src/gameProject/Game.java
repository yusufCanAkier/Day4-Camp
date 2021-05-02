package gameProject;

public class Game {
	private int id;
	private String gameName;
	private String gameDescription;
	private double gamePrice;

	public Game() {

	}

	public Game(int id, String gameName, String gameDescription, double gamePrice) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.gameDescription = gameDescription;
		this.gamePrice = gamePrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getGameDescription() {
		return gameDescription;
	}

	public void setGameDescription(String gameDescription) {
		this.gameDescription = gameDescription;
	}

	public double getGamePrice() {
		return gamePrice;
	}

	public void setGamePrice(double gamePrice) {
		this.gamePrice = gamePrice;
	}

}
