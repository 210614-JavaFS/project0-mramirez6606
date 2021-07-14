package com.revature.models;

public class Account {
	
	private String firstName;
	private String lastName;
	private User user;
	private boolean isAdmin;
	private boolean isAccepted;
	
	public Account(String firstName, String lastName,
			User user, boolean isAdmin, boolean isAccepted) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.user = user;
		this.isAdmin = false;
		this.isAccepted = false;
	}

	public Account() {
		super();
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

	public User getHome() {
		return user;
	}

	public void setHome(User user) {
		this.user = user;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
return true;
	}

	@Override
	public String toString() {
		return "Avenger [firstName=" + firstName + ", lastName=" + lastName + ", home=" + user + "]";
	}
	
	

}
