package com.yxtk.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected Set<String> otherColumns;

    protected Set<String> otherBlobColumns;

    protected Set<String> unionTables;

    public static final String[] baseColumnArr = {"us307.id as us307_id","us307.passwd as us307_passwd","us307.nickname as us307_nickname","us307.mobile_phone as us307_mobile_phone","us307.email as us307_email","us307.header_img_url as us307_header_img_url","us307.real_name as us307_real_name","us307.sex as us307_sex","us307.education as us307_education","us307.born_date as us307_born_date","us307.ID_code as us307_ID_code","us307.ID_front_img_url as us307_ID_front_img_url","us307.ID_opposite_img_url as us307_ID_opposite_img_url","us307.ID_person_img_url as us307_ID_person_img_url","us307.is_bind_mobile as us307_is_bind_mobile","us307.is_bind_email as us307_is_bind_email","us307.is_real_check as us307_is_real_check","us307.real_check_time as us307_real_check_time","us307.wallet as us307_wallet","us307.client_id as us307_client_id","us307.rongyuntoken as us307_rongyuntoken","us307.create_time as us307_create_time"};;

    public static final String[] blobColumnArr = {};;

    public static final String tableName = "user";

    public static final String tableAlias = "us307";

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public UserExample() {
        oredCriteria = new ArrayList<Criteria>();
        otherColumns = new HashSet<String>();
        otherBlobColumns = new HashSet<String>();
        unionTables = new HashSet<String>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public void setOtherColumns(Set<String> otherColumns) {
        this.otherColumns = otherColumns;
    }

    public Set<String> getOtherColumns() {
        return otherColumns;
    }

    public void setOtherBlobColumns(Set<String> otherBlobColumns) {
        this.otherBlobColumns = otherBlobColumns;
    }

    public Set<String> getOtherBlobColumns() {
        return otherBlobColumns;
    }

    public void setUnionTables(Set<String> unionTables) {
        this.unionTables = unionTables;
    }

    public Set<String> getUnionTables() {
        return unionTables;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria(this);
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
        otherColumns.clear();
        otherBlobColumns.clear();
        unionTables.clear();
    }

    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    public Integer getLimitEnd() {
        return limitEnd;
    }

    protected abstract static class GeneratedCriteria {
        protected UserExample example;

        protected List<Criterion> criteria;

        protected GeneratedCriteria(UserExample example) {
            super();
            criteria = new ArrayList<Criterion>();
            this.example = example;
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("us307.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("us307.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("us307.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("us307.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("us307.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("us307.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("us307.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("us307.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("us307.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("us307.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("us307.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("us307.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPasswdIsNull() {
            addCriterion("us307.passwd is null");
            return (Criteria) this;
        }

        public Criteria andPasswdIsNotNull() {
            addCriterion("us307.passwd is not null");
            return (Criteria) this;
        }

        public Criteria andPasswdEqualTo(String value) {
            addCriterion("us307.passwd =", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdNotEqualTo(String value) {
            addCriterion("us307.passwd <>", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdGreaterThan(String value) {
            addCriterion("us307.passwd >", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdGreaterThanOrEqualTo(String value) {
            addCriterion("us307.passwd >=", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdLessThan(String value) {
            addCriterion("us307.passwd <", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdLessThanOrEqualTo(String value) {
            addCriterion("us307.passwd <=", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdLike(String value) {
            addCriterion("us307.passwd like", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdNotLike(String value) {
            addCriterion("us307.passwd not like", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdIn(List<String> values) {
            addCriterion("us307.passwd in", values, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdNotIn(List<String> values) {
            addCriterion("us307.passwd not in", values, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdBetween(String value1, String value2) {
            addCriterion("us307.passwd between", value1, value2, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdNotBetween(String value1, String value2) {
            addCriterion("us307.passwd not between", value1, value2, "passwd");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("us307.nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("us307.nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("us307.nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("us307.nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("us307.nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("us307.nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("us307.nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("us307.nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("us307.nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("us307.nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("us307.nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("us307.nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("us307.nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("us307.nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIsNull() {
            addCriterion("us307.mobile_phone is null");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIsNotNull() {
            addCriterion("us307.mobile_phone is not null");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneEqualTo(String value) {
            addCriterion("us307.mobile_phone =", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotEqualTo(String value) {
            addCriterion("us307.mobile_phone <>", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneGreaterThan(String value) {
            addCriterion("us307.mobile_phone >", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("us307.mobile_phone >=", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLessThan(String value) {
            addCriterion("us307.mobile_phone <", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLessThanOrEqualTo(String value) {
            addCriterion("us307.mobile_phone <=", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLike(String value) {
            addCriterion("us307.mobile_phone like", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotLike(String value) {
            addCriterion("us307.mobile_phone not like", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIn(List<String> values) {
            addCriterion("us307.mobile_phone in", values, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotIn(List<String> values) {
            addCriterion("us307.mobile_phone not in", values, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneBetween(String value1, String value2) {
            addCriterion("us307.mobile_phone between", value1, value2, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotBetween(String value1, String value2) {
            addCriterion("us307.mobile_phone not between", value1, value2, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("us307.email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("us307.email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("us307.email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("us307.email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("us307.email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("us307.email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("us307.email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("us307.email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("us307.email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("us307.email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("us307.email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("us307.email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("us307.email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("us307.email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andHeaderImgUrlIsNull() {
            addCriterion("us307.header_img_url is null");
            return (Criteria) this;
        }

        public Criteria andHeaderImgUrlIsNotNull() {
            addCriterion("us307.header_img_url is not null");
            return (Criteria) this;
        }

        public Criteria andHeaderImgUrlEqualTo(String value) {
            addCriterion("us307.header_img_url =", value, "headerImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeaderImgUrlNotEqualTo(String value) {
            addCriterion("us307.header_img_url <>", value, "headerImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeaderImgUrlGreaterThan(String value) {
            addCriterion("us307.header_img_url >", value, "headerImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeaderImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("us307.header_img_url >=", value, "headerImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeaderImgUrlLessThan(String value) {
            addCriterion("us307.header_img_url <", value, "headerImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeaderImgUrlLessThanOrEqualTo(String value) {
            addCriterion("us307.header_img_url <=", value, "headerImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeaderImgUrlLike(String value) {
            addCriterion("us307.header_img_url like", value, "headerImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeaderImgUrlNotLike(String value) {
            addCriterion("us307.header_img_url not like", value, "headerImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeaderImgUrlIn(List<String> values) {
            addCriterion("us307.header_img_url in", values, "headerImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeaderImgUrlNotIn(List<String> values) {
            addCriterion("us307.header_img_url not in", values, "headerImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeaderImgUrlBetween(String value1, String value2) {
            addCriterion("us307.header_img_url between", value1, value2, "headerImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeaderImgUrlNotBetween(String value1, String value2) {
            addCriterion("us307.header_img_url not between", value1, value2, "headerImgUrl");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNull() {
            addCriterion("us307.real_name is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("us307.real_name is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("us307.real_name =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("us307.real_name <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("us307.real_name >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("us307.real_name >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("us307.real_name <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("us307.real_name <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("us307.real_name like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("us307.real_name not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("us307.real_name in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("us307.real_name not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("us307.real_name between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("us307.real_name not between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("us307.sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("us307.sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("us307.sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("us307.sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("us307.sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("us307.sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("us307.sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("us307.sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("us307.sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("us307.sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("us307.sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("us307.sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("us307.sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("us307.sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("us307.education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("us307.education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("us307.education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("us307.education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("us307.education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("us307.education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("us307.education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("us307.education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("us307.education like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("us307.education not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("us307.education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("us307.education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("us307.education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("us307.education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andBornDateIsNull() {
            addCriterion("us307.born_date is null");
            return (Criteria) this;
        }

        public Criteria andBornDateIsNotNull() {
            addCriterion("us307.born_date is not null");
            return (Criteria) this;
        }

        public Criteria andBornDateEqualTo(Date value) {
            addCriterion("us307.born_date =", value, "bornDate");
            return (Criteria) this;
        }

        public Criteria andBornDateNotEqualTo(Date value) {
            addCriterion("us307.born_date <>", value, "bornDate");
            return (Criteria) this;
        }

        public Criteria andBornDateGreaterThan(Date value) {
            addCriterion("us307.born_date >", value, "bornDate");
            return (Criteria) this;
        }

        public Criteria andBornDateGreaterThanOrEqualTo(Date value) {
            addCriterion("us307.born_date >=", value, "bornDate");
            return (Criteria) this;
        }

        public Criteria andBornDateLessThan(Date value) {
            addCriterion("us307.born_date <", value, "bornDate");
            return (Criteria) this;
        }

        public Criteria andBornDateLessThanOrEqualTo(Date value) {
            addCriterion("us307.born_date <=", value, "bornDate");
            return (Criteria) this;
        }

        public Criteria andBornDateIn(List<Date> values) {
            addCriterion("us307.born_date in", values, "bornDate");
            return (Criteria) this;
        }

        public Criteria andBornDateNotIn(List<Date> values) {
            addCriterion("us307.born_date not in", values, "bornDate");
            return (Criteria) this;
        }

        public Criteria andBornDateBetween(Date value1, Date value2) {
            addCriterion("us307.born_date between", value1, value2, "bornDate");
            return (Criteria) this;
        }

        public Criteria andBornDateNotBetween(Date value1, Date value2) {
            addCriterion("us307.born_date not between", value1, value2, "bornDate");
            return (Criteria) this;
        }

        public Criteria andIdCodeIsNull() {
            addCriterion("us307.ID_code is null");
            return (Criteria) this;
        }

        public Criteria andIdCodeIsNotNull() {
            addCriterion("us307.ID_code is not null");
            return (Criteria) this;
        }

        public Criteria andIdCodeEqualTo(String value) {
            addCriterion("us307.ID_code =", value, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdCodeNotEqualTo(String value) {
            addCriterion("us307.ID_code <>", value, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdCodeGreaterThan(String value) {
            addCriterion("us307.ID_code >", value, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdCodeGreaterThanOrEqualTo(String value) {
            addCriterion("us307.ID_code >=", value, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdCodeLessThan(String value) {
            addCriterion("us307.ID_code <", value, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdCodeLessThanOrEqualTo(String value) {
            addCriterion("us307.ID_code <=", value, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdCodeLike(String value) {
            addCriterion("us307.ID_code like", value, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdCodeNotLike(String value) {
            addCriterion("us307.ID_code not like", value, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdCodeIn(List<String> values) {
            addCriterion("us307.ID_code in", values, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdCodeNotIn(List<String> values) {
            addCriterion("us307.ID_code not in", values, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdCodeBetween(String value1, String value2) {
            addCriterion("us307.ID_code between", value1, value2, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdCodeNotBetween(String value1, String value2) {
            addCriterion("us307.ID_code not between", value1, value2, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdFrontImgUrlIsNull() {
            addCriterion("us307.ID_front_img_url is null");
            return (Criteria) this;
        }

        public Criteria andIdFrontImgUrlIsNotNull() {
            addCriterion("us307.ID_front_img_url is not null");
            return (Criteria) this;
        }

        public Criteria andIdFrontImgUrlEqualTo(String value) {
            addCriterion("us307.ID_front_img_url =", value, "idFrontImgUrl");
            return (Criteria) this;
        }

        public Criteria andIdFrontImgUrlNotEqualTo(String value) {
            addCriterion("us307.ID_front_img_url <>", value, "idFrontImgUrl");
            return (Criteria) this;
        }

        public Criteria andIdFrontImgUrlGreaterThan(String value) {
            addCriterion("us307.ID_front_img_url >", value, "idFrontImgUrl");
            return (Criteria) this;
        }

        public Criteria andIdFrontImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("us307.ID_front_img_url >=", value, "idFrontImgUrl");
            return (Criteria) this;
        }

        public Criteria andIdFrontImgUrlLessThan(String value) {
            addCriterion("us307.ID_front_img_url <", value, "idFrontImgUrl");
            return (Criteria) this;
        }

        public Criteria andIdFrontImgUrlLessThanOrEqualTo(String value) {
            addCriterion("us307.ID_front_img_url <=", value, "idFrontImgUrl");
            return (Criteria) this;
        }

        public Criteria andIdFrontImgUrlLike(String value) {
            addCriterion("us307.ID_front_img_url like", value, "idFrontImgUrl");
            return (Criteria) this;
        }

        public Criteria andIdFrontImgUrlNotLike(String value) {
            addCriterion("us307.ID_front_img_url not like", value, "idFrontImgUrl");
            return (Criteria) this;
        }

        public Criteria andIdFrontImgUrlIn(List<String> values) {
            addCriterion("us307.ID_front_img_url in", values, "idFrontImgUrl");
            return (Criteria) this;
        }

        public Criteria andIdFrontImgUrlNotIn(List<String> values) {
            addCriterion("us307.ID_front_img_url not in", values, "idFrontImgUrl");
            return (Criteria) this;
        }

        public Criteria andIdFrontImgUrlBetween(String value1, String value2) {
            addCriterion("us307.ID_front_img_url between", value1, value2, "idFrontImgUrl");
            return (Criteria) this;
        }

        public Criteria andIdFrontImgUrlNotBetween(String value1, String value2) {
            addCriterion("us307.ID_front_img_url not between", value1, value2, "idFrontImgUrl");
            return (Criteria) this;
        }

        public Criteria andIdOppositeImgUrlIsNull() {
            addCriterion("us307.ID_opposite_img_url is null");
            return (Criteria) this;
        }

        public Criteria andIdOppositeImgUrlIsNotNull() {
            addCriterion("us307.ID_opposite_img_url is not null");
            return (Criteria) this;
        }

        public Criteria andIdOppositeImgUrlEqualTo(String value) {
            addCriterion("us307.ID_opposite_img_url =", value, "idOppositeImgUrl");
            return (Criteria) this;
        }

        public Criteria andIdOppositeImgUrlNotEqualTo(String value) {
            addCriterion("us307.ID_opposite_img_url <>", value, "idOppositeImgUrl");
            return (Criteria) this;
        }

        public Criteria andIdOppositeImgUrlGreaterThan(String value) {
            addCriterion("us307.ID_opposite_img_url >", value, "idOppositeImgUrl");
            return (Criteria) this;
        }

        public Criteria andIdOppositeImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("us307.ID_opposite_img_url >=", value, "idOppositeImgUrl");
            return (Criteria) this;
        }

        public Criteria andIdOppositeImgUrlLessThan(String value) {
            addCriterion("us307.ID_opposite_img_url <", value, "idOppositeImgUrl");
            return (Criteria) this;
        }

        public Criteria andIdOppositeImgUrlLessThanOrEqualTo(String value) {
            addCriterion("us307.ID_opposite_img_url <=", value, "idOppositeImgUrl");
            return (Criteria) this;
        }

        public Criteria andIdOppositeImgUrlLike(String value) {
            addCriterion("us307.ID_opposite_img_url like", value, "idOppositeImgUrl");
            return (Criteria) this;
        }

        public Criteria andIdOppositeImgUrlNotLike(String value) {
            addCriterion("us307.ID_opposite_img_url not like", value, "idOppositeImgUrl");
            return (Criteria) this;
        }

        public Criteria andIdOppositeImgUrlIn(List<String> values) {
            addCriterion("us307.ID_opposite_img_url in", values, "idOppositeImgUrl");
            return (Criteria) this;
        }

        public Criteria andIdOppositeImgUrlNotIn(List<String> values) {
            addCriterion("us307.ID_opposite_img_url not in", values, "idOppositeImgUrl");
            return (Criteria) this;
        }

        public Criteria andIdOppositeImgUrlBetween(String value1, String value2) {
            addCriterion("us307.ID_opposite_img_url between", value1, value2, "idOppositeImgUrl");
            return (Criteria) this;
        }

        public Criteria andIdOppositeImgUrlNotBetween(String value1, String value2) {
            addCriterion("us307.ID_opposite_img_url not between", value1, value2, "idOppositeImgUrl");
            return (Criteria) this;
        }

        public Criteria andIdPersonImgUrlIsNull() {
            addCriterion("us307.ID_person_img_url is null");
            return (Criteria) this;
        }

        public Criteria andIdPersonImgUrlIsNotNull() {
            addCriterion("us307.ID_person_img_url is not null");
            return (Criteria) this;
        }

        public Criteria andIdPersonImgUrlEqualTo(String value) {
            addCriterion("us307.ID_person_img_url =", value, "idPersonImgUrl");
            return (Criteria) this;
        }

        public Criteria andIdPersonImgUrlNotEqualTo(String value) {
            addCriterion("us307.ID_person_img_url <>", value, "idPersonImgUrl");
            return (Criteria) this;
        }

        public Criteria andIdPersonImgUrlGreaterThan(String value) {
            addCriterion("us307.ID_person_img_url >", value, "idPersonImgUrl");
            return (Criteria) this;
        }

        public Criteria andIdPersonImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("us307.ID_person_img_url >=", value, "idPersonImgUrl");
            return (Criteria) this;
        }

        public Criteria andIdPersonImgUrlLessThan(String value) {
            addCriterion("us307.ID_person_img_url <", value, "idPersonImgUrl");
            return (Criteria) this;
        }

        public Criteria andIdPersonImgUrlLessThanOrEqualTo(String value) {
            addCriterion("us307.ID_person_img_url <=", value, "idPersonImgUrl");
            return (Criteria) this;
        }

        public Criteria andIdPersonImgUrlLike(String value) {
            addCriterion("us307.ID_person_img_url like", value, "idPersonImgUrl");
            return (Criteria) this;
        }

        public Criteria andIdPersonImgUrlNotLike(String value) {
            addCriterion("us307.ID_person_img_url not like", value, "idPersonImgUrl");
            return (Criteria) this;
        }

        public Criteria andIdPersonImgUrlIn(List<String> values) {
            addCriterion("us307.ID_person_img_url in", values, "idPersonImgUrl");
            return (Criteria) this;
        }

        public Criteria andIdPersonImgUrlNotIn(List<String> values) {
            addCriterion("us307.ID_person_img_url not in", values, "idPersonImgUrl");
            return (Criteria) this;
        }

        public Criteria andIdPersonImgUrlBetween(String value1, String value2) {
            addCriterion("us307.ID_person_img_url between", value1, value2, "idPersonImgUrl");
            return (Criteria) this;
        }

        public Criteria andIdPersonImgUrlNotBetween(String value1, String value2) {
            addCriterion("us307.ID_person_img_url not between", value1, value2, "idPersonImgUrl");
            return (Criteria) this;
        }

        public Criteria andIsBindMobileIsNull() {
            addCriterion("us307.is_bind_mobile is null");
            return (Criteria) this;
        }

        public Criteria andIsBindMobileIsNotNull() {
            addCriterion("us307.is_bind_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andIsBindMobileEqualTo(Integer value) {
            addCriterion("us307.is_bind_mobile =", value, "isBindMobile");
            return (Criteria) this;
        }

        public Criteria andIsBindMobileNotEqualTo(Integer value) {
            addCriterion("us307.is_bind_mobile <>", value, "isBindMobile");
            return (Criteria) this;
        }

        public Criteria andIsBindMobileGreaterThan(Integer value) {
            addCriterion("us307.is_bind_mobile >", value, "isBindMobile");
            return (Criteria) this;
        }

        public Criteria andIsBindMobileGreaterThanOrEqualTo(Integer value) {
            addCriterion("us307.is_bind_mobile >=", value, "isBindMobile");
            return (Criteria) this;
        }

        public Criteria andIsBindMobileLessThan(Integer value) {
            addCriterion("us307.is_bind_mobile <", value, "isBindMobile");
            return (Criteria) this;
        }

        public Criteria andIsBindMobileLessThanOrEqualTo(Integer value) {
            addCriterion("us307.is_bind_mobile <=", value, "isBindMobile");
            return (Criteria) this;
        }

        public Criteria andIsBindMobileIn(List<Integer> values) {
            addCriterion("us307.is_bind_mobile in", values, "isBindMobile");
            return (Criteria) this;
        }

        public Criteria andIsBindMobileNotIn(List<Integer> values) {
            addCriterion("us307.is_bind_mobile not in", values, "isBindMobile");
            return (Criteria) this;
        }

        public Criteria andIsBindMobileBetween(Integer value1, Integer value2) {
            addCriterion("us307.is_bind_mobile between", value1, value2, "isBindMobile");
            return (Criteria) this;
        }

        public Criteria andIsBindMobileNotBetween(Integer value1, Integer value2) {
            addCriterion("us307.is_bind_mobile not between", value1, value2, "isBindMobile");
            return (Criteria) this;
        }

        public Criteria andIsBindEmailIsNull() {
            addCriterion("us307.is_bind_email is null");
            return (Criteria) this;
        }

        public Criteria andIsBindEmailIsNotNull() {
            addCriterion("us307.is_bind_email is not null");
            return (Criteria) this;
        }

        public Criteria andIsBindEmailEqualTo(Integer value) {
            addCriterion("us307.is_bind_email =", value, "isBindEmail");
            return (Criteria) this;
        }

        public Criteria andIsBindEmailNotEqualTo(Integer value) {
            addCriterion("us307.is_bind_email <>", value, "isBindEmail");
            return (Criteria) this;
        }

        public Criteria andIsBindEmailGreaterThan(Integer value) {
            addCriterion("us307.is_bind_email >", value, "isBindEmail");
            return (Criteria) this;
        }

        public Criteria andIsBindEmailGreaterThanOrEqualTo(Integer value) {
            addCriterion("us307.is_bind_email >=", value, "isBindEmail");
            return (Criteria) this;
        }

        public Criteria andIsBindEmailLessThan(Integer value) {
            addCriterion("us307.is_bind_email <", value, "isBindEmail");
            return (Criteria) this;
        }

        public Criteria andIsBindEmailLessThanOrEqualTo(Integer value) {
            addCriterion("us307.is_bind_email <=", value, "isBindEmail");
            return (Criteria) this;
        }

        public Criteria andIsBindEmailIn(List<Integer> values) {
            addCriterion("us307.is_bind_email in", values, "isBindEmail");
            return (Criteria) this;
        }

        public Criteria andIsBindEmailNotIn(List<Integer> values) {
            addCriterion("us307.is_bind_email not in", values, "isBindEmail");
            return (Criteria) this;
        }

        public Criteria andIsBindEmailBetween(Integer value1, Integer value2) {
            addCriterion("us307.is_bind_email between", value1, value2, "isBindEmail");
            return (Criteria) this;
        }

        public Criteria andIsBindEmailNotBetween(Integer value1, Integer value2) {
            addCriterion("us307.is_bind_email not between", value1, value2, "isBindEmail");
            return (Criteria) this;
        }

        public Criteria andIsRealCheckIsNull() {
            addCriterion("us307.is_real_check is null");
            return (Criteria) this;
        }

        public Criteria andIsRealCheckIsNotNull() {
            addCriterion("us307.is_real_check is not null");
            return (Criteria) this;
        }

        public Criteria andIsRealCheckEqualTo(Integer value) {
            addCriterion("us307.is_real_check =", value, "isRealCheck");
            return (Criteria) this;
        }

        public Criteria andIsRealCheckNotEqualTo(Integer value) {
            addCriterion("us307.is_real_check <>", value, "isRealCheck");
            return (Criteria) this;
        }

        public Criteria andIsRealCheckGreaterThan(Integer value) {
            addCriterion("us307.is_real_check >", value, "isRealCheck");
            return (Criteria) this;
        }

        public Criteria andIsRealCheckGreaterThanOrEqualTo(Integer value) {
            addCriterion("us307.is_real_check >=", value, "isRealCheck");
            return (Criteria) this;
        }

        public Criteria andIsRealCheckLessThan(Integer value) {
            addCriterion("us307.is_real_check <", value, "isRealCheck");
            return (Criteria) this;
        }

        public Criteria andIsRealCheckLessThanOrEqualTo(Integer value) {
            addCriterion("us307.is_real_check <=", value, "isRealCheck");
            return (Criteria) this;
        }

        public Criteria andIsRealCheckIn(List<Integer> values) {
            addCriterion("us307.is_real_check in", values, "isRealCheck");
            return (Criteria) this;
        }

        public Criteria andIsRealCheckNotIn(List<Integer> values) {
            addCriterion("us307.is_real_check not in", values, "isRealCheck");
            return (Criteria) this;
        }

        public Criteria andIsRealCheckBetween(Integer value1, Integer value2) {
            addCriterion("us307.is_real_check between", value1, value2, "isRealCheck");
            return (Criteria) this;
        }

        public Criteria andIsRealCheckNotBetween(Integer value1, Integer value2) {
            addCriterion("us307.is_real_check not between", value1, value2, "isRealCheck");
            return (Criteria) this;
        }

        public Criteria andRealCheckTimeIsNull() {
            addCriterion("us307.real_check_time is null");
            return (Criteria) this;
        }

        public Criteria andRealCheckTimeIsNotNull() {
            addCriterion("us307.real_check_time is not null");
            return (Criteria) this;
        }

        public Criteria andRealCheckTimeEqualTo(Date value) {
            addCriterion("us307.real_check_time =", value, "realCheckTime");
            return (Criteria) this;
        }

        public Criteria andRealCheckTimeNotEqualTo(Date value) {
            addCriterion("us307.real_check_time <>", value, "realCheckTime");
            return (Criteria) this;
        }

        public Criteria andRealCheckTimeGreaterThan(Date value) {
            addCriterion("us307.real_check_time >", value, "realCheckTime");
            return (Criteria) this;
        }

        public Criteria andRealCheckTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("us307.real_check_time >=", value, "realCheckTime");
            return (Criteria) this;
        }

        public Criteria andRealCheckTimeLessThan(Date value) {
            addCriterion("us307.real_check_time <", value, "realCheckTime");
            return (Criteria) this;
        }

        public Criteria andRealCheckTimeLessThanOrEqualTo(Date value) {
            addCriterion("us307.real_check_time <=", value, "realCheckTime");
            return (Criteria) this;
        }

        public Criteria andRealCheckTimeIn(List<Date> values) {
            addCriterion("us307.real_check_time in", values, "realCheckTime");
            return (Criteria) this;
        }

        public Criteria andRealCheckTimeNotIn(List<Date> values) {
            addCriterion("us307.real_check_time not in", values, "realCheckTime");
            return (Criteria) this;
        }

        public Criteria andRealCheckTimeBetween(Date value1, Date value2) {
            addCriterion("us307.real_check_time between", value1, value2, "realCheckTime");
            return (Criteria) this;
        }

        public Criteria andRealCheckTimeNotBetween(Date value1, Date value2) {
            addCriterion("us307.real_check_time not between", value1, value2, "realCheckTime");
            return (Criteria) this;
        }

        public Criteria andWalletIsNull() {
            addCriterion("us307.wallet is null");
            return (Criteria) this;
        }

        public Criteria andWalletIsNotNull() {
            addCriterion("us307.wallet is not null");
            return (Criteria) this;
        }

        public Criteria andWalletEqualTo(Double value) {
            addCriterion("us307.wallet =", value, "wallet");
            return (Criteria) this;
        }

        public Criteria andWalletNotEqualTo(Double value) {
            addCriterion("us307.wallet <>", value, "wallet");
            return (Criteria) this;
        }

        public Criteria andWalletGreaterThan(Double value) {
            addCriterion("us307.wallet >", value, "wallet");
            return (Criteria) this;
        }

        public Criteria andWalletGreaterThanOrEqualTo(Double value) {
            addCriterion("us307.wallet >=", value, "wallet");
            return (Criteria) this;
        }

        public Criteria andWalletLessThan(Double value) {
            addCriterion("us307.wallet <", value, "wallet");
            return (Criteria) this;
        }

        public Criteria andWalletLessThanOrEqualTo(Double value) {
            addCriterion("us307.wallet <=", value, "wallet");
            return (Criteria) this;
        }

        public Criteria andWalletIn(List<Double> values) {
            addCriterion("us307.wallet in", values, "wallet");
            return (Criteria) this;
        }

        public Criteria andWalletNotIn(List<Double> values) {
            addCriterion("us307.wallet not in", values, "wallet");
            return (Criteria) this;
        }

        public Criteria andWalletBetween(Double value1, Double value2) {
            addCriterion("us307.wallet between", value1, value2, "wallet");
            return (Criteria) this;
        }

        public Criteria andWalletNotBetween(Double value1, Double value2) {
            addCriterion("us307.wallet not between", value1, value2, "wallet");
            return (Criteria) this;
        }

        public Criteria andClientIdIsNull() {
            addCriterion("us307.client_id is null");
            return (Criteria) this;
        }

        public Criteria andClientIdIsNotNull() {
            addCriterion("us307.client_id is not null");
            return (Criteria) this;
        }

        public Criteria andClientIdEqualTo(String value) {
            addCriterion("us307.client_id =", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotEqualTo(String value) {
            addCriterion("us307.client_id <>", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdGreaterThan(String value) {
            addCriterion("us307.client_id >", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdGreaterThanOrEqualTo(String value) {
            addCriterion("us307.client_id >=", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLessThan(String value) {
            addCriterion("us307.client_id <", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLessThanOrEqualTo(String value) {
            addCriterion("us307.client_id <=", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLike(String value) {
            addCriterion("us307.client_id like", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotLike(String value) {
            addCriterion("us307.client_id not like", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdIn(List<String> values) {
            addCriterion("us307.client_id in", values, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotIn(List<String> values) {
            addCriterion("us307.client_id not in", values, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdBetween(String value1, String value2) {
            addCriterion("us307.client_id between", value1, value2, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotBetween(String value1, String value2) {
            addCriterion("us307.client_id not between", value1, value2, "clientId");
            return (Criteria) this;
        }

        public Criteria andRongyuntokenIsNull() {
            addCriterion("us307.rongyuntoken is null");
            return (Criteria) this;
        }

        public Criteria andRongyuntokenIsNotNull() {
            addCriterion("us307.rongyuntoken is not null");
            return (Criteria) this;
        }

        public Criteria andRongyuntokenEqualTo(String value) {
            addCriterion("us307.rongyuntoken =", value, "rongyuntoken");
            return (Criteria) this;
        }

        public Criteria andRongyuntokenNotEqualTo(String value) {
            addCriterion("us307.rongyuntoken <>", value, "rongyuntoken");
            return (Criteria) this;
        }

        public Criteria andRongyuntokenGreaterThan(String value) {
            addCriterion("us307.rongyuntoken >", value, "rongyuntoken");
            return (Criteria) this;
        }

        public Criteria andRongyuntokenGreaterThanOrEqualTo(String value) {
            addCriterion("us307.rongyuntoken >=", value, "rongyuntoken");
            return (Criteria) this;
        }

        public Criteria andRongyuntokenLessThan(String value) {
            addCriterion("us307.rongyuntoken <", value, "rongyuntoken");
            return (Criteria) this;
        }

        public Criteria andRongyuntokenLessThanOrEqualTo(String value) {
            addCriterion("us307.rongyuntoken <=", value, "rongyuntoken");
            return (Criteria) this;
        }

        public Criteria andRongyuntokenLike(String value) {
            addCriterion("us307.rongyuntoken like", value, "rongyuntoken");
            return (Criteria) this;
        }

        public Criteria andRongyuntokenNotLike(String value) {
            addCriterion("us307.rongyuntoken not like", value, "rongyuntoken");
            return (Criteria) this;
        }

        public Criteria andRongyuntokenIn(List<String> values) {
            addCriterion("us307.rongyuntoken in", values, "rongyuntoken");
            return (Criteria) this;
        }

        public Criteria andRongyuntokenNotIn(List<String> values) {
            addCriterion("us307.rongyuntoken not in", values, "rongyuntoken");
            return (Criteria) this;
        }

        public Criteria andRongyuntokenBetween(String value1, String value2) {
            addCriterion("us307.rongyuntoken between", value1, value2, "rongyuntoken");
            return (Criteria) this;
        }

        public Criteria andRongyuntokenNotBetween(String value1, String value2) {
            addCriterion("us307.rongyuntoken not between", value1, value2, "rongyuntoken");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("us307.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("us307.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("us307.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("us307.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("us307.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("us307.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("us307.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("us307.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("us307.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("us307.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("us307.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("us307.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andExample(Object otherExample) {
            try {
                java.lang.Class<?> clazz = otherExample.getClass();
                if(clazz.equals(example.getClass())){
                    return (Criteria) this;
                }
                java.lang.reflect.Field field = clazz.getDeclaredField("oredCriteria");
                List<?> oredCriteria = (List<?>)field.get(otherExample);
                Object criteria2 = oredCriteria.get(0);
                clazz = criteria2.getClass();
                criteria2 = clazz.getMethod("getCriteria").invoke(criteria2);
                List<?> criterions = (List<?>)criteria2;
                for (Object crit : criterions){
                    clazz = crit.getClass();
                    field = clazz.getDeclaredField("condition");
                    field.setAccessible(true);
                    String condition = (String)field.get(crit);
                    Criterion criterion = new Criterion(condition);
                    String fields[] = {"value", "secondValue", "noValue", "singleValue", "betweenValue", "listValue", "typeHandler"};
                    for (int i=0; i<fields.length; ++i){
                        field = clazz.getDeclaredField(fields[i]);
                        java.lang.reflect.Field field2 = criterion.getClass().getDeclaredField(fields[i]);
                        field.setAccessible(true);
                        field2.setAccessible(true);
                        field2.set(criterion, field.get(crit));
                    }
                    criteria.add(criterion);
                }
                clazz = otherExample.getClass();
                if(example.getClass().equals(clazz))
                return (Criteria) this;
                field = clazz.getDeclaredField("tableAlias");
                String tableAlias = (String)field.get(otherExample);
                field = clazz.getDeclaredField("tableName");
                String tableName = (String)field.get(otherExample);
                boolean bNoContain = example.getUnionTables().add(tableName+" "+tableAlias);
                if (bNoContain){
                    field = clazz.getDeclaredField("baseColumnArr");
                    String[] columnArr = (String[])field.get(otherExample);
                    example.getOtherColumns().addAll(java.util.Arrays.asList(columnArr));
                    field = clazz.getDeclaredField("blobColumnArr");
                    columnArr = (String[])field.get(otherExample);
                    example.getOtherBlobColumns().addAll(java.util.Arrays.asList(columnArr));
                }
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException("prase criterions failed");
            }
            return (Criteria) this;
        }

        public Criteria andField(Class<?> field1ExampleCls, String field1, String operator, Class<?> field2ExampleCls, String field2) {
            addCriterion(field1+" "+operator+" "+field2);
            java.lang.Class<?>[] classes = {field1ExampleCls, field2ExampleCls};
            for (java.lang.Class<?> clazz : classes){
                try {
                    if (example.getClass().equals(clazz))
                    continue;
                    java.lang.reflect.Field field = clazz.getDeclaredField("tableAlias");
                    String tableAlias = (String)field.get(null);
                    field = clazz.getDeclaredField("tableName");
                    String tableName = (String)field.get(null);
                    boolean bNoContain = example.getUnionTables().add(tableName+" "+tableAlias);
                    if (bNoContain){
                        field = clazz.getDeclaredField("baseColumnArr");
                        String[] columnArr = (String[])field.get(null);
                        example.getOtherColumns().addAll(java.util.Arrays.asList(columnArr));
                        field = clazz.getDeclaredField("blobColumnArr");
                        columnArr = (String[])field.get(null);
                        example.getOtherBlobColumns().addAll(java.util.Arrays.asList(columnArr));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    throw new RuntimeException("prase Example failed");
                }
            }
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria(UserExample example) {
            super(example);
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public String getTrimCondition() {
            int idx = condition.indexOf('.'); if (idx == -1) return condition; return condition.substring(idx+1);
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }

    public static class Field {
        public static final String id = "us307.id";

        public static final String passwd = "us307.passwd";

        public static final String nickname = "us307.nickname";

        public static final String mobilePhone = "us307.mobile_phone";

        public static final String email = "us307.email";

        public static final String headerImgUrl = "us307.header_img_url";

        public static final String realName = "us307.real_name";

        public static final String sex = "us307.sex";

        public static final String education = "us307.education";

        public static final String bornDate = "us307.born_date";

        public static final String idCode = "us307.ID_code";

        public static final String idFrontImgUrl = "us307.ID_front_img_url";

        public static final String idOppositeImgUrl = "us307.ID_opposite_img_url";

        public static final String idPersonImgUrl = "us307.ID_person_img_url";

        public static final String isBindMobile = "us307.is_bind_mobile";

        public static final String isBindEmail = "us307.is_bind_email";

        public static final String isRealCheck = "us307.is_real_check";

        public static final String realCheckTime = "us307.real_check_time";

        public static final String wallet = "us307.wallet";

        public static final String clientId = "us307.client_id";

        public static final String rongyuntoken = "us307.rongyuntoken";

        public static final String createTime = "us307.create_time";
    }
}