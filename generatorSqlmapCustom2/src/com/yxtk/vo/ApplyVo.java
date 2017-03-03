package com.yxtk.vo;



import com.yxtk.po.Apply;
import com.yxtk.po.User;

public class ApplyVo extends Apply{
	private Double levelAverage;
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Double getLevelAverage() {
		return levelAverage;
	}

	public void setLevelAverage(Double levelAverage) {
		this.levelAverage = levelAverage;
	}
	
}