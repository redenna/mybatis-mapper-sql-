package com.yxtk.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ApplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected Set<String> otherColumns;

    protected Set<String> otherBlobColumns;

    protected Set<String> unionTables;

    public static final String[] baseColumnArr = {"ap230.id as ap230_id","ap230.user_id as ap230_user_id","ap230.publish_type_id as ap230_publish_type_id","ap230.publish_id as ap230_publish_id","ap230.create_time as ap230_create_time"};;

    public static final String[] blobColumnArr = {"ap230.description as ap230_description"};;

    public static final String tableName = "apply";

    public static final String tableAlias = "ap230";

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public ApplyExample() {
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
        protected ApplyExample example;

        protected List<Criterion> criteria;

        protected GeneratedCriteria(ApplyExample example) {
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
            addCriterion("ap230.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ap230.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ap230.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ap230.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ap230.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ap230.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ap230.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ap230.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ap230.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ap230.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ap230.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ap230.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("ap230.user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("ap230.user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("ap230.user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("ap230.user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("ap230.user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ap230.user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("ap230.user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("ap230.user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("ap230.user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("ap230.user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("ap230.user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ap230.user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andPublishTypeIdIsNull() {
            addCriterion("ap230.publish_type_id is null");
            return (Criteria) this;
        }

        public Criteria andPublishTypeIdIsNotNull() {
            addCriterion("ap230.publish_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andPublishTypeIdEqualTo(Integer value) {
            addCriterion("ap230.publish_type_id =", value, "publishTypeId");
            return (Criteria) this;
        }

        public Criteria andPublishTypeIdNotEqualTo(Integer value) {
            addCriterion("ap230.publish_type_id <>", value, "publishTypeId");
            return (Criteria) this;
        }

        public Criteria andPublishTypeIdGreaterThan(Integer value) {
            addCriterion("ap230.publish_type_id >", value, "publishTypeId");
            return (Criteria) this;
        }

        public Criteria andPublishTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ap230.publish_type_id >=", value, "publishTypeId");
            return (Criteria) this;
        }

        public Criteria andPublishTypeIdLessThan(Integer value) {
            addCriterion("ap230.publish_type_id <", value, "publishTypeId");
            return (Criteria) this;
        }

        public Criteria andPublishTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("ap230.publish_type_id <=", value, "publishTypeId");
            return (Criteria) this;
        }

        public Criteria andPublishTypeIdIn(List<Integer> values) {
            addCriterion("ap230.publish_type_id in", values, "publishTypeId");
            return (Criteria) this;
        }

        public Criteria andPublishTypeIdNotIn(List<Integer> values) {
            addCriterion("ap230.publish_type_id not in", values, "publishTypeId");
            return (Criteria) this;
        }

        public Criteria andPublishTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("ap230.publish_type_id between", value1, value2, "publishTypeId");
            return (Criteria) this;
        }

        public Criteria andPublishTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ap230.publish_type_id not between", value1, value2, "publishTypeId");
            return (Criteria) this;
        }

        public Criteria andPublishIdIsNull() {
            addCriterion("ap230.publish_id is null");
            return (Criteria) this;
        }

        public Criteria andPublishIdIsNotNull() {
            addCriterion("ap230.publish_id is not null");
            return (Criteria) this;
        }

        public Criteria andPublishIdEqualTo(Integer value) {
            addCriterion("ap230.publish_id =", value, "publishId");
            return (Criteria) this;
        }

        public Criteria andPublishIdNotEqualTo(Integer value) {
            addCriterion("ap230.publish_id <>", value, "publishId");
            return (Criteria) this;
        }

        public Criteria andPublishIdGreaterThan(Integer value) {
            addCriterion("ap230.publish_id >", value, "publishId");
            return (Criteria) this;
        }

        public Criteria andPublishIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ap230.publish_id >=", value, "publishId");
            return (Criteria) this;
        }

        public Criteria andPublishIdLessThan(Integer value) {
            addCriterion("ap230.publish_id <", value, "publishId");
            return (Criteria) this;
        }

        public Criteria andPublishIdLessThanOrEqualTo(Integer value) {
            addCriterion("ap230.publish_id <=", value, "publishId");
            return (Criteria) this;
        }

        public Criteria andPublishIdIn(List<Integer> values) {
            addCriterion("ap230.publish_id in", values, "publishId");
            return (Criteria) this;
        }

        public Criteria andPublishIdNotIn(List<Integer> values) {
            addCriterion("ap230.publish_id not in", values, "publishId");
            return (Criteria) this;
        }

        public Criteria andPublishIdBetween(Integer value1, Integer value2) {
            addCriterion("ap230.publish_id between", value1, value2, "publishId");
            return (Criteria) this;
        }

        public Criteria andPublishIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ap230.publish_id not between", value1, value2, "publishId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("ap230.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("ap230.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("ap230.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("ap230.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("ap230.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ap230.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("ap230.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("ap230.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("ap230.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("ap230.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("ap230.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("ap230.create_time not between", value1, value2, "createTime");
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

        protected Criteria(ApplyExample example) {
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
        public static final String id = "ap230.id";

        public static final String userId = "ap230.user_id";

        public static final String publishTypeId = "ap230.publish_type_id";

        public static final String publishId = "ap230.publish_id";

        public static final String createTime = "ap230.create_time";

        public static final String description = "ap230.description";
    }
}