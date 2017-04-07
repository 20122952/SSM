package com.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class SysFhsmsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysFhsmsExample() {
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

        public Criteria andFhsmsIdIsNull() {
            addCriterion("FHSMS_ID is null");
            return (Criteria) this;
        }

        public Criteria andFhsmsIdIsNotNull() {
            addCriterion("FHSMS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFhsmsIdEqualTo(String value) {
            addCriterion("FHSMS_ID =", value, "fhsmsId");
            return (Criteria) this;
        }

        public Criteria andFhsmsIdNotEqualTo(String value) {
            addCriterion("FHSMS_ID <>", value, "fhsmsId");
            return (Criteria) this;
        }

        public Criteria andFhsmsIdGreaterThan(String value) {
            addCriterion("FHSMS_ID >", value, "fhsmsId");
            return (Criteria) this;
        }

        public Criteria andFhsmsIdGreaterThanOrEqualTo(String value) {
            addCriterion("FHSMS_ID >=", value, "fhsmsId");
            return (Criteria) this;
        }

        public Criteria andFhsmsIdLessThan(String value) {
            addCriterion("FHSMS_ID <", value, "fhsmsId");
            return (Criteria) this;
        }

        public Criteria andFhsmsIdLessThanOrEqualTo(String value) {
            addCriterion("FHSMS_ID <=", value, "fhsmsId");
            return (Criteria) this;
        }

        public Criteria andFhsmsIdLike(String value) {
            addCriterion("FHSMS_ID like", value, "fhsmsId");
            return (Criteria) this;
        }

        public Criteria andFhsmsIdNotLike(String value) {
            addCriterion("FHSMS_ID not like", value, "fhsmsId");
            return (Criteria) this;
        }

        public Criteria andFhsmsIdIn(List<String> values) {
            addCriterion("FHSMS_ID in", values, "fhsmsId");
            return (Criteria) this;
        }

        public Criteria andFhsmsIdNotIn(List<String> values) {
            addCriterion("FHSMS_ID not in", values, "fhsmsId");
            return (Criteria) this;
        }

        public Criteria andFhsmsIdBetween(String value1, String value2) {
            addCriterion("FHSMS_ID between", value1, value2, "fhsmsId");
            return (Criteria) this;
        }

        public Criteria andFhsmsIdNotBetween(String value1, String value2) {
            addCriterion("FHSMS_ID not between", value1, value2, "fhsmsId");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("CONTENT =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("CONTENT <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("CONTENT >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENT >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("CONTENT <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("CONTENT <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("CONTENT like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("CONTENT not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("CONTENT in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("CONTENT not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("CONTENT between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("CONTENT not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andToUsernameIsNull() {
            addCriterion("TO_USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andToUsernameIsNotNull() {
            addCriterion("TO_USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andToUsernameEqualTo(String value) {
            addCriterion("TO_USERNAME =", value, "toUsername");
            return (Criteria) this;
        }

        public Criteria andToUsernameNotEqualTo(String value) {
            addCriterion("TO_USERNAME <>", value, "toUsername");
            return (Criteria) this;
        }

        public Criteria andToUsernameGreaterThan(String value) {
            addCriterion("TO_USERNAME >", value, "toUsername");
            return (Criteria) this;
        }

        public Criteria andToUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("TO_USERNAME >=", value, "toUsername");
            return (Criteria) this;
        }

        public Criteria andToUsernameLessThan(String value) {
            addCriterion("TO_USERNAME <", value, "toUsername");
            return (Criteria) this;
        }

        public Criteria andToUsernameLessThanOrEqualTo(String value) {
            addCriterion("TO_USERNAME <=", value, "toUsername");
            return (Criteria) this;
        }

        public Criteria andToUsernameLike(String value) {
            addCriterion("TO_USERNAME like", value, "toUsername");
            return (Criteria) this;
        }

        public Criteria andToUsernameNotLike(String value) {
            addCriterion("TO_USERNAME not like", value, "toUsername");
            return (Criteria) this;
        }

        public Criteria andToUsernameIn(List<String> values) {
            addCriterion("TO_USERNAME in", values, "toUsername");
            return (Criteria) this;
        }

        public Criteria andToUsernameNotIn(List<String> values) {
            addCriterion("TO_USERNAME not in", values, "toUsername");
            return (Criteria) this;
        }

        public Criteria andToUsernameBetween(String value1, String value2) {
            addCriterion("TO_USERNAME between", value1, value2, "toUsername");
            return (Criteria) this;
        }

        public Criteria andToUsernameNotBetween(String value1, String value2) {
            addCriterion("TO_USERNAME not between", value1, value2, "toUsername");
            return (Criteria) this;
        }

        public Criteria andFromUsernameIsNull() {
            addCriterion("FROM_USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andFromUsernameIsNotNull() {
            addCriterion("FROM_USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andFromUsernameEqualTo(String value) {
            addCriterion("FROM_USERNAME =", value, "fromUsername");
            return (Criteria) this;
        }

        public Criteria andFromUsernameNotEqualTo(String value) {
            addCriterion("FROM_USERNAME <>", value, "fromUsername");
            return (Criteria) this;
        }

        public Criteria andFromUsernameGreaterThan(String value) {
            addCriterion("FROM_USERNAME >", value, "fromUsername");
            return (Criteria) this;
        }

        public Criteria andFromUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("FROM_USERNAME >=", value, "fromUsername");
            return (Criteria) this;
        }

        public Criteria andFromUsernameLessThan(String value) {
            addCriterion("FROM_USERNAME <", value, "fromUsername");
            return (Criteria) this;
        }

        public Criteria andFromUsernameLessThanOrEqualTo(String value) {
            addCriterion("FROM_USERNAME <=", value, "fromUsername");
            return (Criteria) this;
        }

        public Criteria andFromUsernameLike(String value) {
            addCriterion("FROM_USERNAME like", value, "fromUsername");
            return (Criteria) this;
        }

        public Criteria andFromUsernameNotLike(String value) {
            addCriterion("FROM_USERNAME not like", value, "fromUsername");
            return (Criteria) this;
        }

        public Criteria andFromUsernameIn(List<String> values) {
            addCriterion("FROM_USERNAME in", values, "fromUsername");
            return (Criteria) this;
        }

        public Criteria andFromUsernameNotIn(List<String> values) {
            addCriterion("FROM_USERNAME not in", values, "fromUsername");
            return (Criteria) this;
        }

        public Criteria andFromUsernameBetween(String value1, String value2) {
            addCriterion("FROM_USERNAME between", value1, value2, "fromUsername");
            return (Criteria) this;
        }

        public Criteria andFromUsernameNotBetween(String value1, String value2) {
            addCriterion("FROM_USERNAME not between", value1, value2, "fromUsername");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNull() {
            addCriterion("SEND_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNotNull() {
            addCriterion("SEND_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSendTimeEqualTo(String value) {
            addCriterion("SEND_TIME =", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotEqualTo(String value) {
            addCriterion("SEND_TIME <>", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThan(String value) {
            addCriterion("SEND_TIME >", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThanOrEqualTo(String value) {
            addCriterion("SEND_TIME >=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThan(String value) {
            addCriterion("SEND_TIME <", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThanOrEqualTo(String value) {
            addCriterion("SEND_TIME <=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLike(String value) {
            addCriterion("SEND_TIME like", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotLike(String value) {
            addCriterion("SEND_TIME not like", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeIn(List<String> values) {
            addCriterion("SEND_TIME in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotIn(List<String> values) {
            addCriterion("SEND_TIME not in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeBetween(String value1, String value2) {
            addCriterion("SEND_TIME between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotBetween(String value1, String value2) {
            addCriterion("SEND_TIME not between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andSanmeIdIsNull() {
            addCriterion("SANME_ID is null");
            return (Criteria) this;
        }

        public Criteria andSanmeIdIsNotNull() {
            addCriterion("SANME_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSanmeIdEqualTo(String value) {
            addCriterion("SANME_ID =", value, "sanmeId");
            return (Criteria) this;
        }

        public Criteria andSanmeIdNotEqualTo(String value) {
            addCriterion("SANME_ID <>", value, "sanmeId");
            return (Criteria) this;
        }

        public Criteria andSanmeIdGreaterThan(String value) {
            addCriterion("SANME_ID >", value, "sanmeId");
            return (Criteria) this;
        }

        public Criteria andSanmeIdGreaterThanOrEqualTo(String value) {
            addCriterion("SANME_ID >=", value, "sanmeId");
            return (Criteria) this;
        }

        public Criteria andSanmeIdLessThan(String value) {
            addCriterion("SANME_ID <", value, "sanmeId");
            return (Criteria) this;
        }

        public Criteria andSanmeIdLessThanOrEqualTo(String value) {
            addCriterion("SANME_ID <=", value, "sanmeId");
            return (Criteria) this;
        }

        public Criteria andSanmeIdLike(String value) {
            addCriterion("SANME_ID like", value, "sanmeId");
            return (Criteria) this;
        }

        public Criteria andSanmeIdNotLike(String value) {
            addCriterion("SANME_ID not like", value, "sanmeId");
            return (Criteria) this;
        }

        public Criteria andSanmeIdIn(List<String> values) {
            addCriterion("SANME_ID in", values, "sanmeId");
            return (Criteria) this;
        }

        public Criteria andSanmeIdNotIn(List<String> values) {
            addCriterion("SANME_ID not in", values, "sanmeId");
            return (Criteria) this;
        }

        public Criteria andSanmeIdBetween(String value1, String value2) {
            addCriterion("SANME_ID between", value1, value2, "sanmeId");
            return (Criteria) this;
        }

        public Criteria andSanmeIdNotBetween(String value1, String value2) {
            addCriterion("SANME_ID not between", value1, value2, "sanmeId");
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