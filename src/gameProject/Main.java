package gameProject;

public class Main {

	public static void main(String[] args) {
		Game game = new Game();
		game.setId(1);
		game.setGameName("Euro Truck Simulator 2");
		game.setGameDescription("Simulation Game");
		game.setGamePrice(100);

		Game game2 = new Game();
		game2.setId(2);
		game2.setGameName("FIFA 2021");
		game2.setGameDescription("Electronic Arts Game - Sports");
		game2.setGamePrice(221.50);

		Gamer gamer = new Gamer();
		gamer.setId(1);
		gamer.setFirstName("Yusuf Can");
		gamer.setLastName("Akýer");
		gamer.setNationalIdentity("12345678910");
		gamer.setBirthDay("18.11.2000");

		GameCampaign gameCampaign = new GameCampaign();
		gameCampaign.setId(1);
		gameCampaign.setCampaignName("2021 Yaz Kampanyasý");
		gameCampaign.setCampaignRate(15);

		GamerManager gamerManager = new GamerManager(new ValidationManager());
		gamerManager.register(gamer);
		System.out.println();
		gamerManager.update(gamer);
		System.out.println();
		gamerManager.delete(gamer);
		System.out.println();

		GameCampaignManager gameCampaignManager = new GameCampaignManager();
		gameCampaignManager.add(gameCampaign);
		System.out.println();
		gameCampaignManager.update(gameCampaign);
		System.out.println();
		gameCampaignManager.delete(gameCampaign);
		System.out.println();

		GameSaleManager gameSaleManager = new GameSaleManager();
		gameSaleManager.buy(gamer, gameCampaign, game);

	}

}
