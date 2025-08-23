package com.java.String;

import java.util.Date;

public final class CreateImmutable {
	private final int id;
	private String name;
	private final Date joiningDate;

	public CreateImmutable(int id, String name, Date joiningDate) {
		this.id = id;
		this.name = name;
		this.joiningDate = joiningDate;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	
	@Override
	public String toString() {
		return "CreateImmutable [id=" + id + ", name=" + name + ", joiningDate=" + joiningDate + "]";
	}

	public static void main(String[] args) {
		CreateImmutable imm = new CreateImmutable(1, "Ram", new Date());
		System.out.println(imm);
	}
}
