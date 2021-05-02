package gameProject;

public class GameSaleManager implements GameSaleOperations {

	@Override
	public void buy(Gamer gamer, GameCampaign gameCampaign, Game game) {
		System.out.println("Oyuncu Adý : " + gamer.getFirstName() + " " + gamer.getLastName());
		System.out.println("Oyun Adý : " + game.getGameName() + " " + "Oyun Açýklamasý :" + game.getGameDescription());
		System.out.println("Oyun Fiyatý : " + game.getGamePrice() + " " + "Kampanya Ýndirimi : %"
				+ gameCampaign.getCampaignRate() + " " + gameCampaign.getCampaignName());
		System.out.println("Son Fiyat : " + (game.getGamePrice() / 100) * gameCampaign.getCampaignRate());
	}

}
