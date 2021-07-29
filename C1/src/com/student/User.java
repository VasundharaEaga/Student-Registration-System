package com.student;

public class User {
	int id;
    String name;
    String email;
    String password;
    String address;
    public User(String name, String email, String password, String address, String phoneno) {
		
		this.name = name;
		this.email = email;
		this.password = password;
		this.address = address;
		this.phoneno = phoneno;
	}


	String phoneno;

    public User() {
    }
    

    public User(int id, String name, String email, String password, String address, String phoneno) {
	
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.address = address;
		this.phoneno = phoneno;
	}



	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPhoneno() {
		return phoneno;
	}


	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

    
}
