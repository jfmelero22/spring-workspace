package com.pluralcamp.presentation.entity;

public class Student {
	
	private int id;
	private String name;
	private String surname;
	private String address;
	
	public Student() {}
	
	public Student(int id,
			String name,
			String surname,
			String address) {
		this.setId(id);
		this.setName(name);
		this.setSurname(surname);
		this.setAddress(address);
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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		String separator = " ";
		return new StringBuilder().append(Integer.toString(id))
				.append(separator)
				.append(name)
				.append(separator)
				.append(surname)
				.append(separator)
				.append(address)				
				.toString();
	}
	
}
