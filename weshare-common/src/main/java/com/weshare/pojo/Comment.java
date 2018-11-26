package com.weshare.pojo;

import java.io.Serializable;
public class Comment implements Serializable{
	private String id;
	private String commentContent;
	private int commentHot;
	private String userId;
	private int videoId;
	
	
	public Comment() {
		super();
	}
	public String getCommentContent() {
		return commentContent;
	}
	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}
	public int getCommentHot() {
		return commentHot;
	}
	public void setCommentHot(int commentHot) {
		this.commentHot = commentHot;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getVideoId() {
		return videoId;
	}
	public void setVideoId(int videoId) {
		this.videoId = videoId;
	}
	
}
