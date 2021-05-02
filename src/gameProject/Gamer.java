package gameProject;

public class Gamer {
	private int id;
	private String firstName;
	private String lastName;
	private String nationalIdentity;
	private String birthDay;

	public Gamer() {

	}

	public Gamer(int id, String firstName, String lastName, String nationalIdentity, String birthDay) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalIdentity = nationalIdentity;
		this.birthDay = birthDay;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

}
