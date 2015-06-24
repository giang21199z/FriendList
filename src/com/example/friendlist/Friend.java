package com.example.friendlist;

public class Friend {
	private String name;
	private String phone;
	private String avatar;

	public Friend() {
	}

	public Friend(String name, String phone, String avatar) {
		this.name = name;
		this.phone = phone;
		this.avatar = avatar;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

}
