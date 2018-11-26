package com.weshare.pojo;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable{
private String  id;
private String userName;
private String userPassword;
private String userPhonenumber;
private String userEmail;

//集合
private List<Userlike> userlikes;
private List<Comment> comments;
private List<Video> videos;


public User() {
	super();
}
public List<Userlike> getUserlikes() {
	return userlikes;
}
public void setUserlikes(List<Userlike> userlikes) {
	this.userlikes = userlikes;
}
public List<Comment> getComments() {
	return comments;
}
public void setComments(List<Comment> comments) {
	this.comments = comments;
}
public List<Video> getVideos() {
	return videos;
}
public void setVideos(List<Video> videos) {
	this.videos = videos;
}


public String getUserEmail() {
	return userEmail;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public void setUserEmail(String userEmail) {
	this.userEmail = userEmail;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getUserPassword() {
	return userPassword;
}
public void setUserPassword(String userPassword) {
	this.userPassword = userPassword;
}
public String getUserPhonenumber() {
	return userPhonenumber;
}
public void setUserPhonenumber(String userPhonenumber) {
	this.userPhonenumber = userPhonenumber;
}



}
