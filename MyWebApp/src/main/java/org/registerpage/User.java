package org.registerpage;

public class User {
//	private int id;
	private String name,username,password;
	
	public User() {
		
	}
	
	/*
	 * public int getId() { return id; }
	 * 
	 * public void setId(int id) { this.id = id; }
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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

	/*
	 * @Override public String toString() { return "User [ name=" + name +
	 * ", username=" + username + ", password=" + password + "]"; }
	 */
	
}
