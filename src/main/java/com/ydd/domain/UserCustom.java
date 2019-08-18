package com.ydd.domain;

public class UserCustom {
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return "custom--->" + user.toString();
	}

}
