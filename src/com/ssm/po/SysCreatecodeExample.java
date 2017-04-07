package com.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class SysCreatecodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysCreatecodeExample() {
        oredCriteria = new ArrayList<Criteria>();
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
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
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

        public Criteria andCreatecodeIdIsNull() {
            addCriterion("CREATECODE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreatecodeIdIsNotNull() {
            addCriterion("CREATECODE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreatecodeIdEqualTo(String value) {
            addCriterion("CREATECODE_ID =", value, "createcodeId");
            return (Criteria) this;
        }

        public Criteria andCreatecodeIdNotEqualTo(String value) {
            addCriterion("CREATECODE_ID <>", value, "createcodeId");
            return (Criteria) this;
        }

        public Criteria andCreatecodeIdGreaterThan(String value) {
            addCriterion("CREATECODE_ID >", value, "createcodeId");
            return (Criteria) this;
        }

        public Criteria andCreatecodeIdGreaterThanOrEqualTo(String value) {
            addCriterion("CREATECODE_ID >=", value, "createcodeId");
            return (Criteria) this;
        }

        public Criteria andCreatecodeIdLessThan(String value) {
            addCriterion("CREATECODE_ID <", value, "createcodeId");
            return (Criteria) this;
        }

        public Criteria andCreatecodeIdLessThanOrEqualTo(String value) {
            addCriterion("CREATECODE_ID <=", value, "createcodeId");
            return (Criteria) this;
        }

        public Criteria andCreatecodeIdLike(String value) {
            addCriterion("CREATECODE_ID like", value, "createcodeId");
            return (Criteria) this;
        }

        public Criteria andCreatecodeIdNotLike(String value) {
            addCriterion("CREATECODE_ID not like", value, "createcodeId");
            return (Criteria) this;
        }

        public Criteria andCreatecodeIdIn(List<String> values) {
            addCriterion("CREATECODE_ID in", values, "createcodeId");
            return (Criteria) this;
        }

        public Criteria andCreatecodeIdNotIn(List<String> values) {
            addCriterion("CREATECODE_ID not in", values, "createcodeId");
            return (Criteria) this;
        }

        public Criteria andCreatecodeIdBetween(String value1, String value2) {
            addCriterion("CREATECODE_ID between", value1, value2, "createcodeId");
            return (Criteria) this;
        }

        public Criteria andCreatecodeIdNotBetween(String value1, String value2) {
            addCriterion("CREATECODE_ID not between", value1, value2, "createcodeId");
            return (Criteria) this;
        }

        public Criteria andPackagenameIsNull() {
            addCriterion("PACKAGENAME is null");
            return (Criteria) this;
        }

        public Criteria andPackagenameIsNotNull() {
            addCriterion("PACKAGENAME is not null");
            return (Criteria) this;
        }

        public Criteria andPackagenameEqualTo(String value) {
            addCriterion("PACKAGENAME =", value, "packagename");
            return (Criteria) this;
        }

        public Criteria andPackagenameNotEqualTo(String value) {
            addCriterion("PACKAGENAME <>", value, "packagename");
            return (Criteria) this;
        }

        public Criteria andPackagenameGreaterThan(String value) {
            addCriterion("PACKAGENAME >", value, "packagename");
            return (Criteria) this;
        }

        public Criteria andPackagenameGreaterThanOrEqualTo(String value) {
            addCriterion("PACKAGENAME >=", value, "packagename");
            return (Criteria) this;
        }

        public Criteria andPackagenameLessThan(String value) {
            addCriterion("PACKAGENAME <", value, "packagename");
            return (Criteria) this;
        }

        public Criteria andPackagenameLessThanOrEqualTo(String value) {
            addCriterion("PACKAGENAME <=", value, "packagename");
            return (Criteria) this;
        }

        public Criteria andPackagenameLike(String value) {
            addCriterion("PACKAGENAME like", value, "packagename");
            return (Criteria) this;
        }

        public Criteria andPackagenameNotLike(String value) {
            addCriterion("PACKAGENAME not like", value, "packagename");
            return (Criteria) this;
        }

        public Criteria andPackagenameIn(List<String> values) {
            addCriterion("PACKAGENAME in", values, "packagename");
            return (Criteria) this;
        }

        public Criteria andPackagenameNotIn(List<String> values) {
            addCriterion("PACKAGENAME not in", values, "packagename");
            return (Criteria) this;
        }

        public Criteria andPackagenameBetween(String value1, String value2) {
            addCriterion("PACKAGENAME between", value1, value2, "packagename");
            return (Criteria) this;
        }

        public Criteria andPackagenameNotBetween(String value1, String value2) {
            addCriterion("PACKAGENAME not between", value1, value2, "packagename");
            return (Criteria) this;
        }

        public Criteria andObjectnameIsNull() {
            addCriterion("OBJECTNAME is null");
            return (Criteria) this;
        }

        public Criteria andObjectnameIsNotNull() {
            addCriterion("OBJECTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andObjectnameEqualTo(String value) {
            addCriterion("OBJECTNAME =", value, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameNotEqualTo(String value) {
            addCriterion("OBJECTNAME <>", value, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameGreaterThan(String value) {
            addCriterion("OBJECTNAME >", value, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameGreaterThanOrEqualTo(String value) {
            addCriterion("OBJECTNAME >=", value, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameLessThan(String value) {
            addCriterion("OBJECTNAME <", value, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameLessThanOrEqualTo(String value) {
            addCriterion("OBJECTNAME <=", value, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameLike(String value) {
            addCriterion("OBJECTNAME like", value, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameNotLike(String value) {
            addCriterion("OBJECTNAME not like", value, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameIn(List<String> values) {
            addCriterion("OBJECTNAME in", values, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameNotIn(List<String> values) {
            addCriterion("OBJECTNAME not in", values, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameBetween(String value1, String value2) {
            addCriterion("OBJECTNAME between", value1, value2, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameNotBetween(String value1, String value2) {
            addCriterion("OBJECTNAME not between", value1, value2, "objectname");
            return (Criteria) this;
        }

        public Criteria andTablenameIsNull() {
            addCriterion("TABLENAME is null");
            return (Criteria) this;
        }

        public Criteria andTablenameIsNotNull() {
            addCriterion("TABLENAME is not null");
            return (Criteria) this;
        }

        public Criteria andTablenameEqualTo(String value) {
            addCriterion("TABLENAME =", value, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameNotEqualTo(String value) {
            addCriterion("TABLENAME <>", value, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameGreaterThan(String value) {
            addCriterion("TABLENAME >", value, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameGreaterThanOrEqualTo(String value) {
            addCriterion("TABLENAME >=", value, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameLessThan(String value) {
            addCriterion("TABLENAME <", value, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameLessThanOrEqualTo(String value) {
            addCriterion("TABLENAME <=", value, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameLike(String value) {
            addCriterion("TABLENAME like", value, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameNotLike(String value) {
            addCriterion("TABLENAME not like", value, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameIn(List<String> values) {
            addCriterion("TABLENAME in", values, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameNotIn(List<String> values) {
            addCriterion("TABLENAME not in", values, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameBetween(String value1, String value2) {
            addCriterion("TABLENAME between", value1, value2, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameNotBetween(String value1, String value2) {
            addCriterion("TABLENAME not between", value1, value2, "tablename");
            return (Criteria) this;
        }

        public Criteria andFieldlistIsNull() {
            addCriterion("FIELDLIST is null");
            return (Criteria) this;
        }

        public Criteria andFieldlistIsNotNull() {
            addCriterion("FIELDLIST is not null");
            return (Criteria) this;
        }

        public Criteria andFieldlistEqualTo(String value) {
            addCriterion("FIELDLIST =", value, "fieldlist");
            return (Criteria) this;
        }

        public Criteria andFieldlistNotEqualTo(String value) {
            addCriterion("FIELDLIST <>", value, "fieldlist");
            return (Criteria) this;
        }

        public Criteria andFieldlistGreaterThan(String value) {
            addCriterion("FIELDLIST >", value, "fieldlist");
            return (Criteria) this;
        }

        public Criteria andFieldlistGreaterThanOrEqualTo(String value) {
            addCriterion("FIELDLIST >=", value, "fieldlist");
            return (Criteria) this;
        }

        public Criteria andFieldlistLessThan(String value) {
            addCriterion("FIELDLIST <", value, "fieldlist");
            return (Criteria) this;
        }

        public Criteria andFieldlistLessThanOrEqualTo(String value) {
            addCriterion("FIELDLIST <=", value, "fieldlist");
            return (Criteria) this;
        }

        public Criteria andFieldlistLike(String value) {
            addCriterion("FIELDLIST like", value, "fieldlist");
            return (Criteria) this;
        }

        public Criteria andFieldlistNotLike(String value) {
            addCriterion("FIELDLIST not like", value, "fieldlist");
            return (Criteria) this;
        }

        public Criteria andFieldlistIn(List<String> values) {
            addCriterion("FIELDLIST in", values, "fieldlist");
            return (Criteria) this;
        }

        public Criteria andFieldlistNotIn(List<String> values) {
            addCriterion("FIELDLIST not in", values, "fieldlist");
            return (Criteria) this;
        }

        public Criteria andFieldlistBetween(String value1, String value2) {
            addCriterion("FIELDLIST between", value1, value2, "fieldlist");
            return (Criteria) this;
        }

        public Criteria andFieldlistNotBetween(String value1, String value2) {
            addCriterion("FIELDLIST not between", value1, value2, "fieldlist");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(String value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(String value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(String value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(String value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLike(String value) {
            addCriterion("CREATETIME like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotLike(String value) {
            addCriterion("CREATETIME not like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<String> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<String> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(String value1, String value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(String value1, String value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("TITLE =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("TITLE <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("TITLE >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("TITLE <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("TITLE <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("TITLE like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("TITLE not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("TITLE in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("TITLE not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("TITLE between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("TITLE not between", value1, value2, "title");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
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
}