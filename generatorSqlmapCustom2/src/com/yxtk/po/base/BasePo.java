package com.yxtk.po.base;

import java.io.Serializable;
import java.util.Date;

public class BasePo implements Serializable  {
	private Integer id;
	private Date createTime;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	
}
