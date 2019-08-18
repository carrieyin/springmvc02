package com.ydd.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserCustom {
	private User user;
	private List<User> userList;
	private Map<String, Object> map = new HashMap<String, Object>();

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

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
