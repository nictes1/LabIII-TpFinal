package Entities;

public class AdminEntity extends UserEntity{
	private String password;
	private String confirmPassword;
	
	public AdminEntity() {
	}
	
	public AdminEntity(String password, String confirmPassword)
	{
		this.password = password;
		this.confirmPassword = confirmPassword;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	@Override
	public String toString() {
		return "AdminEntity [password=" + password + ", confirmPassword=" + confirmPassword + "]";
	}
}
