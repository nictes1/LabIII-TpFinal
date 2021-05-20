package Entities;

import java.util.UUID;

public class User {

	private UUID Id;
	private String Firstname;
	private String Lastname;
	private String Document;
	
	//Constructors
	public User()
	{
		Id = UUID.randomUUID();
	}
	
	public User(String firstname, String lastname, String document)
	{
		Id = UUID.randomUUID();
		Firstname = firstname;
		Lastname = lastname;
		Document = document;
	}
	

	//Getters and Setters
	public UUID getId() {
		return Id;
	}

	public void setId(UUID id) {
		Id = id;
	}

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	public String getDocument() {
		return Document;
	}

	@Override
	public String toString() {
		return "User [Id=" + Id + ", Firstname=" + Firstname + ", Lastname=" + Lastname + ", Document=" + Document
				+ "]";
	}
}
