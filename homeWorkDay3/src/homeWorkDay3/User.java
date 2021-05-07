package homeWorkDay3;

public class User {

	private int id;
	private String email;
	private String otoNickName;

	public User() {

	}

	public User(int id, String email) {
		super();
		this.id = id;
		this.email = email;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getOtoNickName() {
		return Integer.toString(id).substring(0, 2) + email.substring(0, 2);
	}

}
