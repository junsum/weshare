package com.weshare.pojo;

import java.io.Serializable;
import java.util.List;

public class Userlike implements Serializable{
	private int id;
	private String userId;
	private int categoryId;

public Userlike() {
		super();
	}
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public int getCategoryId() {
	return categoryId;
}
public void setCategoryId(int categoryId) {
	this.categoryId = categoryId;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

}
