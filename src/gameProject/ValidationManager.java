package gameProject;

public class ValidationManager implements ValidationOperation {

	@Override
	public boolean identityValid(Gamer gamer) {
		if (gamer.getNationalIdentity().length() == 11) {
			System.out.println("Ge�erli Kimlik Numaras�");
			return true;
		} else {
			System.out.println("Hatal� Kimlik Numaras�");
			return false;
		}
	}

}
