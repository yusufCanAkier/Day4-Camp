package gameProject;

public class GameSaleManager implements GameSaleOperations {

	@Override
	public void buy(Gamer gamer, GameCampaign gameCampaign, Game game) {
		System.out.println("Oyuncu Ad� : " + gamer.getFirstName() + " " + gamer.getLastName());
		System.out.println("Oyun Ad� : " + game.getGameName() + " " + "Oyun A��klamas� :" + game.getGameDescription());
		System.out.println("Oyun Fiyat� : " + game.getGamePrice() + " " + "Kampanya �ndirimi : %"
				+ gameCampaign.getCampaignRate() + " " + gameCampaign.getCampaignName());
		System.out.println("Son Fiyat : " + (game.getGamePrice() / 100) * gameCampaign.getCampaignRate());
	}

}
