package application.pojo;



public class User {

	private String firstName;
	private String lastname;
	private String email;
	
	public User(){
		
	}
	
	public User(String firstName, String lastname, String email) {
		super();
		this.firstName = firstName;
		this.lastname = lastname;
		this.email = email;
		
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastname=" + lastname
				+ ", email=" + email + "]";
	}
	
	
	
}
