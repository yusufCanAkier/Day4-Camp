package gameProject;

public class GameCampaignManager implements GameCampaignOperations {

	@Override
	public void add(GameCampaign campaign) {
		System.out.println("Kampanya Ba�ar�yla Eklendi : " + campaign.getCampaignName());
		System.out.println("Kampanya �ndirim Oran� : " + campaign.getCampaignRate());

	}

	@Override
	public void update(GameCampaign campaign) {
		System.out.println(campaign.getId() + "---> Bu ID sahibi kampanya g�ncellendi.");
		System.out.println("Kampanyan�n Yeni Ad� : " + campaign.getCampaignName() + "\n" + "Kampanya Oran� : %"
				+ campaign.getCampaignRate());

	}

	@Override
	public void delete(GameCampaign campaign) {
		System.out.println("Bu kampanya silindi : " + campaign.getCampaignName());

	}

}
