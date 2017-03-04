package com.yxtk.po;

import com.yxtk.po.base.BasePo;
import java.util.Date;

public class User extends BasePo {
    private String passwd;

    private String nickname;

    private String mobilePhone;

    private String email;

    private String headerImgUrl;

    private String realName;

    private String sex;

    private String education;

    private Date bornDate;

    private String idCode;

    private String idFrontImgUrl;

    private String idOppositeImgUrl;

    private String idPersonImgUrl;

    private Integer isBindMobile;

    private Integer isBindEmail;

    private Integer isRealCheck;

    private Date realCheckTime;

    private Double wallet;

    private String clientId;

    private String rongyuntoken;

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd == null ? null : passwd.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone == null ? null : mobilePhone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getHeaderImgUrl() {
        return headerImgUrl;
    }

    public void setHeaderImgUrl(String headerImgUrl) {
        this.headerImgUrl = headerImgUrl == null ? null : headerImgUrl.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public Date getBornDate() {
        return bornDate;
    }

    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode == null ? null : idCode.trim();
    }

    public String getIdFrontImgUrl() {
        return idFrontImgUrl;
    }

    public void setIdFrontImgUrl(String idFrontImgUrl) {
        this.idFrontImgUrl = idFrontImgUrl == null ? null : idFrontImgUrl.trim();
    }

    public String getIdOppositeImgUrl() {
        return idOppositeImgUrl;
    }

    public void setIdOppositeImgUrl(String idOppositeImgUrl) {
        this.idOppositeImgUrl = idOppositeImgUrl == null ? null : idOppositeImgUrl.trim();
    }

    public String getIdPersonImgUrl() {
        return idPersonImgUrl;
    }

    public void setIdPersonImgUrl(String idPersonImgUrl) {
        this.idPersonImgUrl = idPersonImgUrl == null ? null : idPersonImgUrl.trim();
    }

    public Integer getIsBindMobile() {
        return isBindMobile;
    }

    public void setIsBindMobile(Integer isBindMobile) {
        this.isBindMobile = isBindMobile;
    }

    public Integer getIsBindEmail() {
        return isBindEmail;
    }

    public void setIsBindEmail(Integer isBindEmail) {
        this.isBindEmail = isBindEmail;
    }

    public Integer getIsRealCheck() {
        return isRealCheck;
    }

    public void setIsRealCheck(Integer isRealCheck) {
        this.isRealCheck = isRealCheck;
    }

    public Date getRealCheckTime() {
        return realCheckTime;
    }

    public void setRealCheckTime(Date realCheckTime) {
        this.realCheckTime = realCheckTime;
    }

    public Double getWallet() {
        return wallet;
    }

    public void setWallet(Double wallet) {
        this.wallet = wallet;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId == null ? null : clientId.trim();
    }

    public String getRongyuntoken() {
        return rongyuntoken;
    }

    public void setRongyuntoken(String rongyuntoken) {
        this.rongyuntoken = rongyuntoken == null ? null : rongyuntoken.trim();
    }
}