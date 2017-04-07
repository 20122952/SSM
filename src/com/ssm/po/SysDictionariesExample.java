package com.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class SysDictionariesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysDictionariesExample() {
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

        public Criteria andDictionariesIdIsNull() {
            addCriterion("DICTIONARIES_ID is null");
            return (Criteria) this;
        }

        public Criteria andDictionariesIdIsNotNull() {
            addCriterion("DICTIONARIES_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDictionariesIdEqualTo(String value) {
            addCriterion("DICTIONARIES_ID =", value, "dictionariesId");
            return (Criteria) this;
        }

        public Criteria andDictionariesIdNotEqualTo(String value) {
            addCriterion("DICTIONARIES_ID <>", value, "dictionariesId");
            return (Criteria) this;
        }

        public Criteria andDictionariesIdGreaterThan(String value) {
            addCriterion("DICTIONARIES_ID >", value, "dictionariesId");
            return (Criteria) this;
        }

        public Criteria andDictionariesIdGreaterThanOrEqualTo(String value) {
            addCriterion("DICTIONARIES_ID >=", value, "dictionariesId");
            return (Criteria) this;
        }

        public Criteria andDictionariesIdLessThan(String value) {
            addCriterion("DICTIONARIES_ID <", value, "dictionariesId");
            return (Criteria) this;
        }

        public Criteria andDictionariesIdLessThanOrEqualTo(String value) {
            addCriterion("DICTIONARIES_ID <=", value, "dictionariesId");
            return (Criteria) this;
        }

        public Criteria andDictionariesIdLike(String value) {
            addCriterion("DICTIONARIES_ID like", value, "dictionariesId");
            return (Criteria) this;
        }

        public Criteria andDictionariesIdNotLike(String value) {
            addCriterion("DICTIONARIES_ID not like", value, "dictionariesId");
            return (Criteria) this;
        }

        public Criteria andDictionariesIdIn(List<String> values) {
            addCriterion("DICTIONARIES_ID in", values, "dictionariesId");
            return (Criteria) this;
        }

        public Criteria andDictionariesIdNotIn(List<String> values) {
            addCriterion("DICTIONARIES_ID not in", values, "dictionariesId");
            return (Criteria) this;
        }

        public Criteria andDictionariesIdBetween(String value1, String value2) {
            addCriterion("DICTIONARIES_ID between", value1, value2, "dictionariesId");
            return (Criteria) this;
        }

        public Criteria andDictionariesIdNotBetween(String value1, String value2) {
            addCriterion("DICTIONARIES_ID not between", value1, value2, "dictionariesId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameEnIsNull() {
            addCriterion("NAME_EN is null");
            return (Criteria) this;
        }

        public Criteria andNameEnIsNotNull() {
            addCriterion("NAME_EN is not null");
            return (Criteria) this;
        }

        public Criteria andNameEnEqualTo(String value) {
            addCriterion("NAME_EN =", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotEqualTo(String value) {
            addCriterion("NAME_EN <>", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnGreaterThan(String value) {
            addCriterion("NAME_EN >", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("NAME_EN >=", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnLessThan(String value) {
            addCriterion("NAME_EN <", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnLessThanOrEqualTo(String value) {
            addCriterion("NAME_EN <=", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnLike(String value) {
            addCriterion("NAME_EN like", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotLike(String value) {
            addCriterion("NAME_EN not like", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnIn(List<String> values) {
            addCriterion("NAME_EN in", values, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotIn(List<String> values) {
            addCriterion("NAME_EN not in", values, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnBetween(String value1, String value2) {
            addCriterion("NAME_EN between", value1, value2, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotBetween(String value1, String value2) {
            addCriterion("NAME_EN not between", value1, value2, "nameEn");
            return (Criteria) this;
        }

        public Criteria andBianmaIsNull() {
            addCriterion("BIANMA is null");
            return (Criteria) this;
        }

        public Criteria andBianmaIsNotNull() {
            addCriterion("BIANMA is not null");
            return (Criteria) this;
        }

        public Criteria andBianmaEqualTo(String value) {
            addCriterion("BIANMA =", value, "bianma");
            return (Criteria) this;
        }

        public Criteria andBianmaNotEqualTo(String value) {
            addCriterion("BIANMA <>", value, "bianma");
            return (Criteria) this;
        }

        public Criteria andBianmaGreaterThan(String value) {
            addCriterion("BIANMA >", value, "bianma");
            return (Criteria) this;
        }

        public Criteria andBianmaGreaterThanOrEqualTo(String value) {
            addCriterion("BIANMA >=", value, "bianma");
            return (Criteria) this;
        }

        public Criteria andBianmaLessThan(String value) {
            addCriterion("BIANMA <", value, "bianma");
            return (Criteria) this;
        }

        public Criteria andBianmaLessThanOrEqualTo(String value) {
            addCriterion("BIANMA <=", value, "bianma");
            return (Criteria) this;
        }

        public Criteria andBianmaLike(String value) {
            addCriterion("BIANMA like", value, "bianma");
            return (Criteria) this;
        }

        public Criteria andBianmaNotLike(String value) {
            addCriterion("BIANMA not like", value, "bianma");
            return (Criteria) this;
        }

        public Criteria andBianmaIn(List<String> values) {
            addCriterion("BIANMA in", values, "bianma");
            return (Criteria) this;
        }

        public Criteria andBianmaNotIn(List<String> values) {
            addCriterion("BIANMA not in", values, "bianma");
            return (Criteria) this;
        }

        public Criteria andBianmaBetween(String value1, String value2) {
            addCriterion("BIANMA between", value1, value2, "bianma");
            return (Criteria) this;
        }

        public Criteria andBianmaNotBetween(String value1, String value2) {
            addCriterion("BIANMA not between", value1, value2, "bianma");
            return (Criteria) this;
        }

        public Criteria andOrderByIsNull() {
            addCriterion("ORDER_BY is null");
            return (Criteria) this;
        }

        public Criteria andOrderByIsNotNull() {
            addCriterion("ORDER_BY is not null");
            return (Criteria) this;
        }

        public Criteria andOrderByEqualTo(Integer value) {
            addCriterion("ORDER_BY =", value, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByNotEqualTo(Integer value) {
            addCriterion("ORDER_BY <>", value, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByGreaterThan(Integer value) {
            addCriterion("ORDER_BY >", value, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORDER_BY >=", value, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByLessThan(Integer value) {
            addCriterion("ORDER_BY <", value, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByLessThanOrEqualTo(Integer value) {
            addCriterion("ORDER_BY <=", value, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByIn(List<Integer> values) {
            addCriterion("ORDER_BY in", values, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByNotIn(List<Integer> values) {
            addCriterion("ORDER_BY not in", values, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_BY between", value1, value2, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByNotBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_BY not between", value1, value2, "orderBy");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("PARENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("PARENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(String value) {
            addCriterion("PARENT_ID =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(String value) {
            addCriterion("PARENT_ID <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(String value) {
            addCriterion("PARENT_ID >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_ID >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(String value) {
            addCriterion("PARENT_ID <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(String value) {
            addCriterion("PARENT_ID <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLike(String value) {
            addCriterion("PARENT_ID like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotLike(String value) {
            addCriterion("PARENT_ID not like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<String> values) {
            addCriterion("PARENT_ID in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<String> values) {
            addCriterion("PARENT_ID not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(String value1, String value2) {
            addCriterion("PARENT_ID between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(String value1, String value2) {
            addCriterion("PARENT_ID not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andBzIsNull() {
            addCriterion("BZ is null");
            return (Criteria) this;
        }

        public Criteria andBzIsNotNull() {
            addCriterion("BZ is not null");
            return (Criteria) this;
        }

        public Criteria andBzEqualTo(String value) {
            addCriterion("BZ =", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotEqualTo(String value) {
            addCriterion("BZ <>", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThan(String value) {
            addCriterion("BZ >", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThanOrEqualTo(String value) {
            addCriterion("BZ >=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThan(String value) {
            addCriterion("BZ <", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThanOrEqualTo(String value) {
            addCriterion("BZ <=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLike(String value) {
            addCriterion("BZ like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotLike(String value) {
            addCriterion("BZ not like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzIn(List<String> values) {
            addCriterion("BZ in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotIn(List<String> values) {
            addCriterion("BZ not in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzBetween(String value1, String value2) {
            addCriterion("BZ between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotBetween(String value1, String value2) {
            addCriterion("BZ not between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andTbsnameIsNull() {
            addCriterion("TBSNAME is null");
            return (Criteria) this;
        }

        public Criteria andTbsnameIsNotNull() {
            addCriterion("TBSNAME is not null");
            return (Criteria) this;
        }

        public Criteria andTbsnameEqualTo(String value) {
            addCriterion("TBSNAME =", value, "tbsname");
            return (Criteria) this;
        }

        public Criteria andTbsnameNotEqualTo(String value) {
            addCriterion("TBSNAME <>", value, "tbsname");
            return (Criteria) this;
        }

        public Criteria andTbsnameGreaterThan(String value) {
            addCriterion("TBSNAME >", value, "tbsname");
            return (Criteria) this;
        }

        public Criteria andTbsnameGreaterThanOrEqualTo(String value) {
            addCriterion("TBSNAME >=", value, "tbsname");
            return (Criteria) this;
        }

        public Criteria andTbsnameLessThan(String value) {
            addCriterion("TBSNAME <", value, "tbsname");
            return (Criteria) this;
        }

        public Criteria andTbsnameLessThanOrEqualTo(String value) {
            addCriterion("TBSNAME <=", value, "tbsname");
            return (Criteria) this;
        }

        public Criteria andTbsnameLike(String value) {
            addCriterion("TBSNAME like", value, "tbsname");
            return (Criteria) this;
        }

        public Criteria andTbsnameNotLike(String value) {
            addCriterion("TBSNAME not like", value, "tbsname");
            return (Criteria) this;
        }

        public Criteria andTbsnameIn(List<String> values) {
            addCriterion("TBSNAME in", values, "tbsname");
            return (Criteria) this;
        }

        public Criteria andTbsnameNotIn(List<String> values) {
            addCriterion("TBSNAME not in", values, "tbsname");
            return (Criteria) this;
        }

        public Criteria andTbsnameBetween(String value1, String value2) {
            addCriterion("TBSNAME between", value1, value2, "tbsname");
            return (Criteria) this;
        }

        public Criteria andTbsnameNotBetween(String value1, String value2) {
            addCriterion("TBSNAME not between", value1, value2, "tbsname");
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