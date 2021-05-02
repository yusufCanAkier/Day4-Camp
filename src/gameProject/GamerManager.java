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
			System.out.println("Oyuncu Kay�t ��lemi Ba�ar�l� : " + gamer.getFirstName() + " " + gamer.getLastName());
		} else {
			System.out.println("Oyuncu Kay�t ��lemi Ba�ar�s�z !");
		}

	}

	@Override
	public void delete(Gamer gamer) {
		if (validationManager.identityValid(gamer) == true) {
			System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " Oyuncusu Silindi");
		} else
			System.out.println("Oyuncu Silme ��lemi Ba�ar�s�z");

	}

	@Override
	public void update(Gamer gamer) {
		if (validationManager.identityValid(gamer) == true) {
			System.out.println(gamer.getId() + " : Bu ID sahibi oyuncu bilgileri g�ncellendi.");
			System.out.println("*********************");
			System.out.println(
					"Ad: " + gamer.getFirstName() + "\n" + "Soyad�: " + gamer.getLastName() + "\n" + "Do�um tarihi: "
							+ gamer.getBirthDay() + "\n" + "TC Kimlik Numaras�: " + gamer.getNationalIdentity());
		} else
			System.out.println("Kay�t g�ncellemesi yap�lamad�.");

	}

}
