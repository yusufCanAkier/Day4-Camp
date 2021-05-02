package gameProject;

public class ValidationManager implements ValidationOperation {

	@Override
	public boolean identityValid(Gamer gamer) {
		if (gamer.getNationalIdentity().length() == 11) {
			System.out.println("Geçerli Kimlik Numarasý");
			return true;
		} else {
			System.out.println("Hatalý Kimlik Numarasý");
			return false;
		}
	}

}
