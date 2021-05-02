package gameProject;

public class GameCampaignManager implements GameCampaignOperations {

	@Override
	public void add(GameCampaign campaign) {
		System.out.println("Kampanya Baþarýyla Eklendi : " + campaign.getCampaignName());
		System.out.println("Kampanya Ýndirim Oraný : " + campaign.getCampaignRate());

	}

	@Override
	public void update(GameCampaign campaign) {
		System.out.println(campaign.getId() + "---> Bu ID sahibi kampanya güncellendi.");
		System.out.println("Kampanyanýn Yeni Adý : " + campaign.getCampaignName() + "\n" + "Kampanya Oraný : %"
				+ campaign.getCampaignRate());

	}

	@Override
	public void delete(GameCampaign campaign) {
		System.out.println("Bu kampanya silindi : " + campaign.getCampaignName());

	}

}
