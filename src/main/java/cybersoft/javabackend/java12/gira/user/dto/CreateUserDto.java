package cybersoft.javabackend.java12.gira.user.dto;

import javax.persistence.Column;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import cybersoft.javabackend.java12.gira.user.validation.annotation.ConfirmPassword;
import cybersoft.javabackend.java12.gira.user.validation.annotation.UniqueEmail;
import cybersoft.javabackend.java12.gira.user.validation.annotation.UniqueUsername;

@ConfirmPassword
public class CreateUserDto {
	@NotBlank(message = "{user.username.not-blank}")
	@Column(unique = true)
	@Size(min = 3, max = 50)
	@UniqueUsername
	private String username;
	
	@NotBlank(message = "{user.password.not-blank}")
	private String password;
	@NotBlank(message = "{user.confirmpassword.not-blank}")
	private String confirmPassword;
	
	@NotBlank(message = "{user.username.not-blank}")
	@Email(message = "{user.username.valid}")
	@Column(unique = true)
	@UniqueEmail
	private String email;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
