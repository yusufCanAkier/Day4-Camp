package gameProject;

public class GamerManager implements GamerOperations {
	private ValidationManager validationManager;

	public GamerManager(ValidationManager validationManager) {
		super();
		this.validationManager = validationManager;
	}

	@Override
	public void register(Gamer gamer) {
		if (validationManager.identityValid(gamer) == true) {
			System.out.println("Oyuncu Kayýt Ýþlemi Baþarýlý : " + gamer.getFirstName() + " " + gamer.getLastName());
		} else {
			System.out.println("Oyuncu Kayýt Ýþlemi Baþarýsýz !");
		}

	}

	@Override
	public void delete(Gamer gamer) {
		if (validationManager.identityValid(gamer) == true) {
			System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " Oyuncusu Silindi");
		} else
			System.out.println("Oyuncu Silme Ýþlemi Baþarýsýz");

	}

	@Override
	public void update(Gamer gamer) {
		if (validationManager.identityValid(gamer) == true) {
			System.out.println(gamer.getId() + " : Bu ID sahibi oyuncu bilgileri güncellendi.");
			System.out.println("*********************");
			System.out.println(
					"Ad: " + gamer.getFirstName() + "\n" + "Soyadý: " + gamer.getLastName() + "\n" + "Doðum tarihi: "
							+ gamer.getBirthDay() + "\n" + "TC Kimlik Numarasý: " + gamer.getNationalIdentity());
		} else
			System.out.println("Kayýt güncellemesi yapýlamadý.");

	}

}
