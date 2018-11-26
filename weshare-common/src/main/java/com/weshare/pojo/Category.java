package com.weshare.pojo;

import java.io.Serializable;
import java.util.List;

public class Category implements Serializable{
	private int id;
	private String categoryName;
	//集合
	private List<Userlike> userlikes;
	private List<Video> videos;
	
	
	public Category() {
		super();
	}
	public List<Userlike> getUserlikes() {
		return userlikes;
	}
	public void setUserlikes(List<Userlike> userlikes) {
		this.userlikes = userlikes;
	}
	public List<Video> getVideos() {
		return videos;
	}
	public void setVideos(List<Video> videos) {
		this.videos = videos;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
}
