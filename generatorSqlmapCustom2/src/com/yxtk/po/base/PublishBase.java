package com.yxtk.po.base;

public abstract class PublishBase extends BasePo{
private Integer userId;
	
	private String title;

    private String imgUrl1;

    private String imgUrl2;

    private String imgUrl3;

    private Integer publishTypeId;
    
    private Integer admCheck;
	
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }
    
	public String getImgUrl1() {
        return imgUrl1;
    }

    public void setImgUrl1(String imgUrl1) {
        this.imgUrl1 = imgUrl1 == null ? null : imgUrl1.trim();
    }

    public String getImgUrl2() {
        return imgUrl2;
    }

    public void setImgUrl2(String imgUrl2) {
        this.imgUrl2 = imgUrl2 == null ? null : imgUrl2.trim();
    }

    public String getImgUrl3() {
        return imgUrl3;
    }

    public void setImgUrl3(String imgUrl3) {
        this.imgUrl3 = imgUrl3 == null ? null : imgUrl3.trim();
    }

    public Integer getPublishTypeId() {
        return publishTypeId;
    }

    public void setPublishTypeId(Integer publishTypeId) {
        this.publishTypeId = publishTypeId;
    }

    public Integer getAdmCheck() {
        return admCheck;
    }

    public void setAdmCheck(Integer admCheck) {
        this.admCheck = admCheck;
    }
}