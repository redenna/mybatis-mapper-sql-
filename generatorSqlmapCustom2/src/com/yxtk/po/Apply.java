package com.yxtk.po;

import com.yxtk.po.base.BasePo;

public class Apply extends BasePo {
    private Integer userId;

    private Integer publishTypeId;

    private Integer publishId;

    private String description;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPublishTypeId() {
        return publishTypeId;
    }

    public void setPublishTypeId(Integer publishTypeId) {
        this.publishTypeId = publishTypeId;
    }

    public Integer getPublishId() {
        return publishId;
    }

    public void setPublishId(Integer publishId) {
        this.publishId = publishId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}