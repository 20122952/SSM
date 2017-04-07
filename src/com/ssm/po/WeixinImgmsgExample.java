package com.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class WeixinImgmsgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WeixinImgmsgExample() {
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

        public Criteria andImgmsgIdIsNull() {
            addCriterion("IMGMSG_ID is null");
            return (Criteria) this;
        }

        public Criteria andImgmsgIdIsNotNull() {
            addCriterion("IMGMSG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andImgmsgIdEqualTo(String value) {
            addCriterion("IMGMSG_ID =", value, "imgmsgId");
            return (Criteria) this;
        }

        public Criteria andImgmsgIdNotEqualTo(String value) {
            addCriterion("IMGMSG_ID <>", value, "imgmsgId");
            return (Criteria) this;
        }

        public Criteria andImgmsgIdGreaterThan(String value) {
            addCriterion("IMGMSG_ID >", value, "imgmsgId");
            return (Criteria) this;
        }

        public Criteria andImgmsgIdGreaterThanOrEqualTo(String value) {
            addCriterion("IMGMSG_ID >=", value, "imgmsgId");
            return (Criteria) this;
        }

        public Criteria andImgmsgIdLessThan(String value) {
            addCriterion("IMGMSG_ID <", value, "imgmsgId");
            return (Criteria) this;
        }

        public Criteria andImgmsgIdLessThanOrEqualTo(String value) {
            addCriterion("IMGMSG_ID <=", value, "imgmsgId");
            return (Criteria) this;
        }

        public Criteria andImgmsgIdLike(String value) {
            addCriterion("IMGMSG_ID like", value, "imgmsgId");
            return (Criteria) this;
        }

        public Criteria andImgmsgIdNotLike(String value) {
            addCriterion("IMGMSG_ID not like", value, "imgmsgId");
            return (Criteria) this;
        }

        public Criteria andImgmsgIdIn(List<String> values) {
            addCriterion("IMGMSG_ID in", values, "imgmsgId");
            return (Criteria) this;
        }

        public Criteria andImgmsgIdNotIn(List<String> values) {
            addCriterion("IMGMSG_ID not in", values, "imgmsgId");
            return (Criteria) this;
        }

        public Criteria andImgmsgIdBetween(String value1, String value2) {
            addCriterion("IMGMSG_ID between", value1, value2, "imgmsgId");
            return (Criteria) this;
        }

        public Criteria andImgmsgIdNotBetween(String value1, String value2) {
            addCriterion("IMGMSG_ID not between", value1, value2, "imgmsgId");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNull() {
            addCriterion("KEYWORD is null");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNotNull() {
            addCriterion("KEYWORD is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordEqualTo(String value) {
            addCriterion("KEYWORD =", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotEqualTo(String value) {
            addCriterion("KEYWORD <>", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThan(String value) {
            addCriterion("KEYWORD >", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("KEYWORD >=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThan(String value) {
            addCriterion("KEYWORD <", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThanOrEqualTo(String value) {
            addCriterion("KEYWORD <=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLike(String value) {
            addCriterion("KEYWORD like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotLike(String value) {
            addCriterion("KEYWORD not like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordIn(List<String> values) {
            addCriterion("KEYWORD in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotIn(List<String> values) {
            addCriterion("KEYWORD not in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordBetween(String value1, String value2) {
            addCriterion("KEYWORD between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotBetween(String value1, String value2) {
            addCriterion("KEYWORD not between", value1, value2, "keyword");
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

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("STATUS not between", value1, value2, "status");
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

        public Criteria andTitle1IsNull() {
            addCriterion("TITLE1 is null");
            return (Criteria) this;
        }

        public Criteria andTitle1IsNotNull() {
            addCriterion("TITLE1 is not null");
            return (Criteria) this;
        }

        public Criteria andTitle1EqualTo(String value) {
            addCriterion("TITLE1 =", value, "title1");
            return (Criteria) this;
        }

        public Criteria andTitle1NotEqualTo(String value) {
            addCriterion("TITLE1 <>", value, "title1");
            return (Criteria) this;
        }

        public Criteria andTitle1GreaterThan(String value) {
            addCriterion("TITLE1 >", value, "title1");
            return (Criteria) this;
        }

        public Criteria andTitle1GreaterThanOrEqualTo(String value) {
            addCriterion("TITLE1 >=", value, "title1");
            return (Criteria) this;
        }

        public Criteria andTitle1LessThan(String value) {
            addCriterion("TITLE1 <", value, "title1");
            return (Criteria) this;
        }

        public Criteria andTitle1LessThanOrEqualTo(String value) {
            addCriterion("TITLE1 <=", value, "title1");
            return (Criteria) this;
        }

        public Criteria andTitle1Like(String value) {
            addCriterion("TITLE1 like", value, "title1");
            return (Criteria) this;
        }

        public Criteria andTitle1NotLike(String value) {
            addCriterion("TITLE1 not like", value, "title1");
            return (Criteria) this;
        }

        public Criteria andTitle1In(List<String> values) {
            addCriterion("TITLE1 in", values, "title1");
            return (Criteria) this;
        }

        public Criteria andTitle1NotIn(List<String> values) {
            addCriterion("TITLE1 not in", values, "title1");
            return (Criteria) this;
        }

        public Criteria andTitle1Between(String value1, String value2) {
            addCriterion("TITLE1 between", value1, value2, "title1");
            return (Criteria) this;
        }

        public Criteria andTitle1NotBetween(String value1, String value2) {
            addCriterion("TITLE1 not between", value1, value2, "title1");
            return (Criteria) this;
        }

        public Criteria andDescription1IsNull() {
            addCriterion("DESCRIPTION1 is null");
            return (Criteria) this;
        }

        public Criteria andDescription1IsNotNull() {
            addCriterion("DESCRIPTION1 is not null");
            return (Criteria) this;
        }

        public Criteria andDescription1EqualTo(String value) {
            addCriterion("DESCRIPTION1 =", value, "description1");
            return (Criteria) this;
        }

        public Criteria andDescription1NotEqualTo(String value) {
            addCriterion("DESCRIPTION1 <>", value, "description1");
            return (Criteria) this;
        }

        public Criteria andDescription1GreaterThan(String value) {
            addCriterion("DESCRIPTION1 >", value, "description1");
            return (Criteria) this;
        }

        public Criteria andDescription1GreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION1 >=", value, "description1");
            return (Criteria) this;
        }

        public Criteria andDescription1LessThan(String value) {
            addCriterion("DESCRIPTION1 <", value, "description1");
            return (Criteria) this;
        }

        public Criteria andDescription1LessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION1 <=", value, "description1");
            return (Criteria) this;
        }

        public Criteria andDescription1Like(String value) {
            addCriterion("DESCRIPTION1 like", value, "description1");
            return (Criteria) this;
        }

        public Criteria andDescription1NotLike(String value) {
            addCriterion("DESCRIPTION1 not like", value, "description1");
            return (Criteria) this;
        }

        public Criteria andDescription1In(List<String> values) {
            addCriterion("DESCRIPTION1 in", values, "description1");
            return (Criteria) this;
        }

        public Criteria andDescription1NotIn(List<String> values) {
            addCriterion("DESCRIPTION1 not in", values, "description1");
            return (Criteria) this;
        }

        public Criteria andDescription1Between(String value1, String value2) {
            addCriterion("DESCRIPTION1 between", value1, value2, "description1");
            return (Criteria) this;
        }

        public Criteria andDescription1NotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION1 not between", value1, value2, "description1");
            return (Criteria) this;
        }

        public Criteria andImgurl1IsNull() {
            addCriterion("IMGURL1 is null");
            return (Criteria) this;
        }

        public Criteria andImgurl1IsNotNull() {
            addCriterion("IMGURL1 is not null");
            return (Criteria) this;
        }

        public Criteria andImgurl1EqualTo(String value) {
            addCriterion("IMGURL1 =", value, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1NotEqualTo(String value) {
            addCriterion("IMGURL1 <>", value, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1GreaterThan(String value) {
            addCriterion("IMGURL1 >", value, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1GreaterThanOrEqualTo(String value) {
            addCriterion("IMGURL1 >=", value, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1LessThan(String value) {
            addCriterion("IMGURL1 <", value, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1LessThanOrEqualTo(String value) {
            addCriterion("IMGURL1 <=", value, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1Like(String value) {
            addCriterion("IMGURL1 like", value, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1NotLike(String value) {
            addCriterion("IMGURL1 not like", value, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1In(List<String> values) {
            addCriterion("IMGURL1 in", values, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1NotIn(List<String> values) {
            addCriterion("IMGURL1 not in", values, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1Between(String value1, String value2) {
            addCriterion("IMGURL1 between", value1, value2, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1NotBetween(String value1, String value2) {
            addCriterion("IMGURL1 not between", value1, value2, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andTourl1IsNull() {
            addCriterion("TOURL1 is null");
            return (Criteria) this;
        }

        public Criteria andTourl1IsNotNull() {
            addCriterion("TOURL1 is not null");
            return (Criteria) this;
        }

        public Criteria andTourl1EqualTo(String value) {
            addCriterion("TOURL1 =", value, "tourl1");
            return (Criteria) this;
        }

        public Criteria andTourl1NotEqualTo(String value) {
            addCriterion("TOURL1 <>", value, "tourl1");
            return (Criteria) this;
        }

        public Criteria andTourl1GreaterThan(String value) {
            addCriterion("TOURL1 >", value, "tourl1");
            return (Criteria) this;
        }

        public Criteria andTourl1GreaterThanOrEqualTo(String value) {
            addCriterion("TOURL1 >=", value, "tourl1");
            return (Criteria) this;
        }

        public Criteria andTourl1LessThan(String value) {
            addCriterion("TOURL1 <", value, "tourl1");
            return (Criteria) this;
        }

        public Criteria andTourl1LessThanOrEqualTo(String value) {
            addCriterion("TOURL1 <=", value, "tourl1");
            return (Criteria) this;
        }

        public Criteria andTourl1Like(String value) {
            addCriterion("TOURL1 like", value, "tourl1");
            return (Criteria) this;
        }

        public Criteria andTourl1NotLike(String value) {
            addCriterion("TOURL1 not like", value, "tourl1");
            return (Criteria) this;
        }

        public Criteria andTourl1In(List<String> values) {
            addCriterion("TOURL1 in", values, "tourl1");
            return (Criteria) this;
        }

        public Criteria andTourl1NotIn(List<String> values) {
            addCriterion("TOURL1 not in", values, "tourl1");
            return (Criteria) this;
        }

        public Criteria andTourl1Between(String value1, String value2) {
            addCriterion("TOURL1 between", value1, value2, "tourl1");
            return (Criteria) this;
        }

        public Criteria andTourl1NotBetween(String value1, String value2) {
            addCriterion("TOURL1 not between", value1, value2, "tourl1");
            return (Criteria) this;
        }

        public Criteria andTitle2IsNull() {
            addCriterion("TITLE2 is null");
            return (Criteria) this;
        }

        public Criteria andTitle2IsNotNull() {
            addCriterion("TITLE2 is not null");
            return (Criteria) this;
        }

        public Criteria andTitle2EqualTo(String value) {
            addCriterion("TITLE2 =", value, "title2");
            return (Criteria) this;
        }

        public Criteria andTitle2NotEqualTo(String value) {
            addCriterion("TITLE2 <>", value, "title2");
            return (Criteria) this;
        }

        public Criteria andTitle2GreaterThan(String value) {
            addCriterion("TITLE2 >", value, "title2");
            return (Criteria) this;
        }

        public Criteria andTitle2GreaterThanOrEqualTo(String value) {
            addCriterion("TITLE2 >=", value, "title2");
            return (Criteria) this;
        }

        public Criteria andTitle2LessThan(String value) {
            addCriterion("TITLE2 <", value, "title2");
            return (Criteria) this;
        }

        public Criteria andTitle2LessThanOrEqualTo(String value) {
            addCriterion("TITLE2 <=", value, "title2");
            return (Criteria) this;
        }

        public Criteria andTitle2Like(String value) {
            addCriterion("TITLE2 like", value, "title2");
            return (Criteria) this;
        }

        public Criteria andTitle2NotLike(String value) {
            addCriterion("TITLE2 not like", value, "title2");
            return (Criteria) this;
        }

        public Criteria andTitle2In(List<String> values) {
            addCriterion("TITLE2 in", values, "title2");
            return (Criteria) this;
        }

        public Criteria andTitle2NotIn(List<String> values) {
            addCriterion("TITLE2 not in", values, "title2");
            return (Criteria) this;
        }

        public Criteria andTitle2Between(String value1, String value2) {
            addCriterion("TITLE2 between", value1, value2, "title2");
            return (Criteria) this;
        }

        public Criteria andTitle2NotBetween(String value1, String value2) {
            addCriterion("TITLE2 not between", value1, value2, "title2");
            return (Criteria) this;
        }

        public Criteria andDescription2IsNull() {
            addCriterion("DESCRIPTION2 is null");
            return (Criteria) this;
        }

        public Criteria andDescription2IsNotNull() {
            addCriterion("DESCRIPTION2 is not null");
            return (Criteria) this;
        }

        public Criteria andDescription2EqualTo(String value) {
            addCriterion("DESCRIPTION2 =", value, "description2");
            return (Criteria) this;
        }

        public Criteria andDescription2NotEqualTo(String value) {
            addCriterion("DESCRIPTION2 <>", value, "description2");
            return (Criteria) this;
        }

        public Criteria andDescription2GreaterThan(String value) {
            addCriterion("DESCRIPTION2 >", value, "description2");
            return (Criteria) this;
        }

        public Criteria andDescription2GreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION2 >=", value, "description2");
            return (Criteria) this;
        }

        public Criteria andDescription2LessThan(String value) {
            addCriterion("DESCRIPTION2 <", value, "description2");
            return (Criteria) this;
        }

        public Criteria andDescription2LessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION2 <=", value, "description2");
            return (Criteria) this;
        }

        public Criteria andDescription2Like(String value) {
            addCriterion("DESCRIPTION2 like", value, "description2");
            return (Criteria) this;
        }

        public Criteria andDescription2NotLike(String value) {
            addCriterion("DESCRIPTION2 not like", value, "description2");
            return (Criteria) this;
        }

        public Criteria andDescription2In(List<String> values) {
            addCriterion("DESCRIPTION2 in", values, "description2");
            return (Criteria) this;
        }

        public Criteria andDescription2NotIn(List<String> values) {
            addCriterion("DESCRIPTION2 not in", values, "description2");
            return (Criteria) this;
        }

        public Criteria andDescription2Between(String value1, String value2) {
            addCriterion("DESCRIPTION2 between", value1, value2, "description2");
            return (Criteria) this;
        }

        public Criteria andDescription2NotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION2 not between", value1, value2, "description2");
            return (Criteria) this;
        }

        public Criteria andImgurl2IsNull() {
            addCriterion("IMGURL2 is null");
            return (Criteria) this;
        }

        public Criteria andImgurl2IsNotNull() {
            addCriterion("IMGURL2 is not null");
            return (Criteria) this;
        }

        public Criteria andImgurl2EqualTo(String value) {
            addCriterion("IMGURL2 =", value, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2NotEqualTo(String value) {
            addCriterion("IMGURL2 <>", value, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2GreaterThan(String value) {
            addCriterion("IMGURL2 >", value, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2GreaterThanOrEqualTo(String value) {
            addCriterion("IMGURL2 >=", value, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2LessThan(String value) {
            addCriterion("IMGURL2 <", value, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2LessThanOrEqualTo(String value) {
            addCriterion("IMGURL2 <=", value, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2Like(String value) {
            addCriterion("IMGURL2 like", value, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2NotLike(String value) {
            addCriterion("IMGURL2 not like", value, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2In(List<String> values) {
            addCriterion("IMGURL2 in", values, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2NotIn(List<String> values) {
            addCriterion("IMGURL2 not in", values, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2Between(String value1, String value2) {
            addCriterion("IMGURL2 between", value1, value2, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2NotBetween(String value1, String value2) {
            addCriterion("IMGURL2 not between", value1, value2, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andTourl2IsNull() {
            addCriterion("TOURL2 is null");
            return (Criteria) this;
        }

        public Criteria andTourl2IsNotNull() {
            addCriterion("TOURL2 is not null");
            return (Criteria) this;
        }

        public Criteria andTourl2EqualTo(String value) {
            addCriterion("TOURL2 =", value, "tourl2");
            return (Criteria) this;
        }

        public Criteria andTourl2NotEqualTo(String value) {
            addCriterion("TOURL2 <>", value, "tourl2");
            return (Criteria) this;
        }

        public Criteria andTourl2GreaterThan(String value) {
            addCriterion("TOURL2 >", value, "tourl2");
            return (Criteria) this;
        }

        public Criteria andTourl2GreaterThanOrEqualTo(String value) {
            addCriterion("TOURL2 >=", value, "tourl2");
            return (Criteria) this;
        }

        public Criteria andTourl2LessThan(String value) {
            addCriterion("TOURL2 <", value, "tourl2");
            return (Criteria) this;
        }

        public Criteria andTourl2LessThanOrEqualTo(String value) {
            addCriterion("TOURL2 <=", value, "tourl2");
            return (Criteria) this;
        }

        public Criteria andTourl2Like(String value) {
            addCriterion("TOURL2 like", value, "tourl2");
            return (Criteria) this;
        }

        public Criteria andTourl2NotLike(String value) {
            addCriterion("TOURL2 not like", value, "tourl2");
            return (Criteria) this;
        }

        public Criteria andTourl2In(List<String> values) {
            addCriterion("TOURL2 in", values, "tourl2");
            return (Criteria) this;
        }

        public Criteria andTourl2NotIn(List<String> values) {
            addCriterion("TOURL2 not in", values, "tourl2");
            return (Criteria) this;
        }

        public Criteria andTourl2Between(String value1, String value2) {
            addCriterion("TOURL2 between", value1, value2, "tourl2");
            return (Criteria) this;
        }

        public Criteria andTourl2NotBetween(String value1, String value2) {
            addCriterion("TOURL2 not between", value1, value2, "tourl2");
            return (Criteria) this;
        }

        public Criteria andTitle3IsNull() {
            addCriterion("TITLE3 is null");
            return (Criteria) this;
        }

        public Criteria andTitle3IsNotNull() {
            addCriterion("TITLE3 is not null");
            return (Criteria) this;
        }

        public Criteria andTitle3EqualTo(String value) {
            addCriterion("TITLE3 =", value, "title3");
            return (Criteria) this;
        }

        public Criteria andTitle3NotEqualTo(String value) {
            addCriterion("TITLE3 <>", value, "title3");
            return (Criteria) this;
        }

        public Criteria andTitle3GreaterThan(String value) {
            addCriterion("TITLE3 >", value, "title3");
            return (Criteria) this;
        }

        public Criteria andTitle3GreaterThanOrEqualTo(String value) {
            addCriterion("TITLE3 >=", value, "title3");
            return (Criteria) this;
        }

        public Criteria andTitle3LessThan(String value) {
            addCriterion("TITLE3 <", value, "title3");
            return (Criteria) this;
        }

        public Criteria andTitle3LessThanOrEqualTo(String value) {
            addCriterion("TITLE3 <=", value, "title3");
            return (Criteria) this;
        }

        public Criteria andTitle3Like(String value) {
            addCriterion("TITLE3 like", value, "title3");
            return (Criteria) this;
        }

        public Criteria andTitle3NotLike(String value) {
            addCriterion("TITLE3 not like", value, "title3");
            return (Criteria) this;
        }

        public Criteria andTitle3In(List<String> values) {
            addCriterion("TITLE3 in", values, "title3");
            return (Criteria) this;
        }

        public Criteria andTitle3NotIn(List<String> values) {
            addCriterion("TITLE3 not in", values, "title3");
            return (Criteria) this;
        }

        public Criteria andTitle3Between(String value1, String value2) {
            addCriterion("TITLE3 between", value1, value2, "title3");
            return (Criteria) this;
        }

        public Criteria andTitle3NotBetween(String value1, String value2) {
            addCriterion("TITLE3 not between", value1, value2, "title3");
            return (Criteria) this;
        }

        public Criteria andDescription3IsNull() {
            addCriterion("DESCRIPTION3 is null");
            return (Criteria) this;
        }

        public Criteria andDescription3IsNotNull() {
            addCriterion("DESCRIPTION3 is not null");
            return (Criteria) this;
        }

        public Criteria andDescription3EqualTo(String value) {
            addCriterion("DESCRIPTION3 =", value, "description3");
            return (Criteria) this;
        }

        public Criteria andDescription3NotEqualTo(String value) {
            addCriterion("DESCRIPTION3 <>", value, "description3");
            return (Criteria) this;
        }

        public Criteria andDescription3GreaterThan(String value) {
            addCriterion("DESCRIPTION3 >", value, "description3");
            return (Criteria) this;
        }

        public Criteria andDescription3GreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION3 >=", value, "description3");
            return (Criteria) this;
        }

        public Criteria andDescription3LessThan(String value) {
            addCriterion("DESCRIPTION3 <", value, "description3");
            return (Criteria) this;
        }

        public Criteria andDescription3LessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION3 <=", value, "description3");
            return (Criteria) this;
        }

        public Criteria andDescription3Like(String value) {
            addCriterion("DESCRIPTION3 like", value, "description3");
            return (Criteria) this;
        }

        public Criteria andDescription3NotLike(String value) {
            addCriterion("DESCRIPTION3 not like", value, "description3");
            return (Criteria) this;
        }

        public Criteria andDescription3In(List<String> values) {
            addCriterion("DESCRIPTION3 in", values, "description3");
            return (Criteria) this;
        }

        public Criteria andDescription3NotIn(List<String> values) {
            addCriterion("DESCRIPTION3 not in", values, "description3");
            return (Criteria) this;
        }

        public Criteria andDescription3Between(String value1, String value2) {
            addCriterion("DESCRIPTION3 between", value1, value2, "description3");
            return (Criteria) this;
        }

        public Criteria andDescription3NotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION3 not between", value1, value2, "description3");
            return (Criteria) this;
        }

        public Criteria andImgurl3IsNull() {
            addCriterion("IMGURL3 is null");
            return (Criteria) this;
        }

        public Criteria andImgurl3IsNotNull() {
            addCriterion("IMGURL3 is not null");
            return (Criteria) this;
        }

        public Criteria andImgurl3EqualTo(String value) {
            addCriterion("IMGURL3 =", value, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3NotEqualTo(String value) {
            addCriterion("IMGURL3 <>", value, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3GreaterThan(String value) {
            addCriterion("IMGURL3 >", value, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3GreaterThanOrEqualTo(String value) {
            addCriterion("IMGURL3 >=", value, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3LessThan(String value) {
            addCriterion("IMGURL3 <", value, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3LessThanOrEqualTo(String value) {
            addCriterion("IMGURL3 <=", value, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3Like(String value) {
            addCriterion("IMGURL3 like", value, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3NotLike(String value) {
            addCriterion("IMGURL3 not like", value, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3In(List<String> values) {
            addCriterion("IMGURL3 in", values, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3NotIn(List<String> values) {
            addCriterion("IMGURL3 not in", values, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3Between(String value1, String value2) {
            addCriterion("IMGURL3 between", value1, value2, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3NotBetween(String value1, String value2) {
            addCriterion("IMGURL3 not between", value1, value2, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andTourl3IsNull() {
            addCriterion("TOURL3 is null");
            return (Criteria) this;
        }

        public Criteria andTourl3IsNotNull() {
            addCriterion("TOURL3 is not null");
            return (Criteria) this;
        }

        public Criteria andTourl3EqualTo(String value) {
            addCriterion("TOURL3 =", value, "tourl3");
            return (Criteria) this;
        }

        public Criteria andTourl3NotEqualTo(String value) {
            addCriterion("TOURL3 <>", value, "tourl3");
            return (Criteria) this;
        }

        public Criteria andTourl3GreaterThan(String value) {
            addCriterion("TOURL3 >", value, "tourl3");
            return (Criteria) this;
        }

        public Criteria andTourl3GreaterThanOrEqualTo(String value) {
            addCriterion("TOURL3 >=", value, "tourl3");
            return (Criteria) this;
        }

        public Criteria andTourl3LessThan(String value) {
            addCriterion("TOURL3 <", value, "tourl3");
            return (Criteria) this;
        }

        public Criteria andTourl3LessThanOrEqualTo(String value) {
            addCriterion("TOURL3 <=", value, "tourl3");
            return (Criteria) this;
        }

        public Criteria andTourl3Like(String value) {
            addCriterion("TOURL3 like", value, "tourl3");
            return (Criteria) this;
        }

        public Criteria andTourl3NotLike(String value) {
            addCriterion("TOURL3 not like", value, "tourl3");
            return (Criteria) this;
        }

        public Criteria andTourl3In(List<String> values) {
            addCriterion("TOURL3 in", values, "tourl3");
            return (Criteria) this;
        }

        public Criteria andTourl3NotIn(List<String> values) {
            addCriterion("TOURL3 not in", values, "tourl3");
            return (Criteria) this;
        }

        public Criteria andTourl3Between(String value1, String value2) {
            addCriterion("TOURL3 between", value1, value2, "tourl3");
            return (Criteria) this;
        }

        public Criteria andTourl3NotBetween(String value1, String value2) {
            addCriterion("TOURL3 not between", value1, value2, "tourl3");
            return (Criteria) this;
        }

        public Criteria andTitle4IsNull() {
            addCriterion("TITLE4 is null");
            return (Criteria) this;
        }

        public Criteria andTitle4IsNotNull() {
            addCriterion("TITLE4 is not null");
            return (Criteria) this;
        }

        public Criteria andTitle4EqualTo(String value) {
            addCriterion("TITLE4 =", value, "title4");
            return (Criteria) this;
        }

        public Criteria andTitle4NotEqualTo(String value) {
            addCriterion("TITLE4 <>", value, "title4");
            return (Criteria) this;
        }

        public Criteria andTitle4GreaterThan(String value) {
            addCriterion("TITLE4 >", value, "title4");
            return (Criteria) this;
        }

        public Criteria andTitle4GreaterThanOrEqualTo(String value) {
            addCriterion("TITLE4 >=", value, "title4");
            return (Criteria) this;
        }

        public Criteria andTitle4LessThan(String value) {
            addCriterion("TITLE4 <", value, "title4");
            return (Criteria) this;
        }

        public Criteria andTitle4LessThanOrEqualTo(String value) {
            addCriterion("TITLE4 <=", value, "title4");
            return (Criteria) this;
        }

        public Criteria andTitle4Like(String value) {
            addCriterion("TITLE4 like", value, "title4");
            return (Criteria) this;
        }

        public Criteria andTitle4NotLike(String value) {
            addCriterion("TITLE4 not like", value, "title4");
            return (Criteria) this;
        }

        public Criteria andTitle4In(List<String> values) {
            addCriterion("TITLE4 in", values, "title4");
            return (Criteria) this;
        }

        public Criteria andTitle4NotIn(List<String> values) {
            addCriterion("TITLE4 not in", values, "title4");
            return (Criteria) this;
        }

        public Criteria andTitle4Between(String value1, String value2) {
            addCriterion("TITLE4 between", value1, value2, "title4");
            return (Criteria) this;
        }

        public Criteria andTitle4NotBetween(String value1, String value2) {
            addCriterion("TITLE4 not between", value1, value2, "title4");
            return (Criteria) this;
        }

        public Criteria andDescription4IsNull() {
            addCriterion("DESCRIPTION4 is null");
            return (Criteria) this;
        }

        public Criteria andDescription4IsNotNull() {
            addCriterion("DESCRIPTION4 is not null");
            return (Criteria) this;
        }

        public Criteria andDescription4EqualTo(String value) {
            addCriterion("DESCRIPTION4 =", value, "description4");
            return (Criteria) this;
        }

        public Criteria andDescription4NotEqualTo(String value) {
            addCriterion("DESCRIPTION4 <>", value, "description4");
            return (Criteria) this;
        }

        public Criteria andDescription4GreaterThan(String value) {
            addCriterion("DESCRIPTION4 >", value, "description4");
            return (Criteria) this;
        }

        public Criteria andDescription4GreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION4 >=", value, "description4");
            return (Criteria) this;
        }

        public Criteria andDescription4LessThan(String value) {
            addCriterion("DESCRIPTION4 <", value, "description4");
            return (Criteria) this;
        }

        public Criteria andDescription4LessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION4 <=", value, "description4");
            return (Criteria) this;
        }

        public Criteria andDescription4Like(String value) {
            addCriterion("DESCRIPTION4 like", value, "description4");
            return (Criteria) this;
        }

        public Criteria andDescription4NotLike(String value) {
            addCriterion("DESCRIPTION4 not like", value, "description4");
            return (Criteria) this;
        }

        public Criteria andDescription4In(List<String> values) {
            addCriterion("DESCRIPTION4 in", values, "description4");
            return (Criteria) this;
        }

        public Criteria andDescription4NotIn(List<String> values) {
            addCriterion("DESCRIPTION4 not in", values, "description4");
            return (Criteria) this;
        }

        public Criteria andDescription4Between(String value1, String value2) {
            addCriterion("DESCRIPTION4 between", value1, value2, "description4");
            return (Criteria) this;
        }

        public Criteria andDescription4NotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION4 not between", value1, value2, "description4");
            return (Criteria) this;
        }

        public Criteria andImgurl4IsNull() {
            addCriterion("IMGURL4 is null");
            return (Criteria) this;
        }

        public Criteria andImgurl4IsNotNull() {
            addCriterion("IMGURL4 is not null");
            return (Criteria) this;
        }

        public Criteria andImgurl4EqualTo(String value) {
            addCriterion("IMGURL4 =", value, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl4NotEqualTo(String value) {
            addCriterion("IMGURL4 <>", value, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl4GreaterThan(String value) {
            addCriterion("IMGURL4 >", value, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl4GreaterThanOrEqualTo(String value) {
            addCriterion("IMGURL4 >=", value, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl4LessThan(String value) {
            addCriterion("IMGURL4 <", value, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl4LessThanOrEqualTo(String value) {
            addCriterion("IMGURL4 <=", value, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl4Like(String value) {
            addCriterion("IMGURL4 like", value, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl4NotLike(String value) {
            addCriterion("IMGURL4 not like", value, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl4In(List<String> values) {
            addCriterion("IMGURL4 in", values, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl4NotIn(List<String> values) {
            addCriterion("IMGURL4 not in", values, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl4Between(String value1, String value2) {
            addCriterion("IMGURL4 between", value1, value2, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl4NotBetween(String value1, String value2) {
            addCriterion("IMGURL4 not between", value1, value2, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andTourl4IsNull() {
            addCriterion("TOURL4 is null");
            return (Criteria) this;
        }

        public Criteria andTourl4IsNotNull() {
            addCriterion("TOURL4 is not null");
            return (Criteria) this;
        }

        public Criteria andTourl4EqualTo(String value) {
            addCriterion("TOURL4 =", value, "tourl4");
            return (Criteria) this;
        }

        public Criteria andTourl4NotEqualTo(String value) {
            addCriterion("TOURL4 <>", value, "tourl4");
            return (Criteria) this;
        }

        public Criteria andTourl4GreaterThan(String value) {
            addCriterion("TOURL4 >", value, "tourl4");
            return (Criteria) this;
        }

        public Criteria andTourl4GreaterThanOrEqualTo(String value) {
            addCriterion("TOURL4 >=", value, "tourl4");
            return (Criteria) this;
        }

        public Criteria andTourl4LessThan(String value) {
            addCriterion("TOURL4 <", value, "tourl4");
            return (Criteria) this;
        }

        public Criteria andTourl4LessThanOrEqualTo(String value) {
            addCriterion("TOURL4 <=", value, "tourl4");
            return (Criteria) this;
        }

        public Criteria andTourl4Like(String value) {
            addCriterion("TOURL4 like", value, "tourl4");
            return (Criteria) this;
        }

        public Criteria andTourl4NotLike(String value) {
            addCriterion("TOURL4 not like", value, "tourl4");
            return (Criteria) this;
        }

        public Criteria andTourl4In(List<String> values) {
            addCriterion("TOURL4 in", values, "tourl4");
            return (Criteria) this;
        }

        public Criteria andTourl4NotIn(List<String> values) {
            addCriterion("TOURL4 not in", values, "tourl4");
            return (Criteria) this;
        }

        public Criteria andTourl4Between(String value1, String value2) {
            addCriterion("TOURL4 between", value1, value2, "tourl4");
            return (Criteria) this;
        }

        public Criteria andTourl4NotBetween(String value1, String value2) {
            addCriterion("TOURL4 not between", value1, value2, "tourl4");
            return (Criteria) this;
        }

        public Criteria andTitle5IsNull() {
            addCriterion("TITLE5 is null");
            return (Criteria) this;
        }

        public Criteria andTitle5IsNotNull() {
            addCriterion("TITLE5 is not null");
            return (Criteria) this;
        }

        public Criteria andTitle5EqualTo(String value) {
            addCriterion("TITLE5 =", value, "title5");
            return (Criteria) this;
        }

        public Criteria andTitle5NotEqualTo(String value) {
            addCriterion("TITLE5 <>", value, "title5");
            return (Criteria) this;
        }

        public Criteria andTitle5GreaterThan(String value) {
            addCriterion("TITLE5 >", value, "title5");
            return (Criteria) this;
        }

        public Criteria andTitle5GreaterThanOrEqualTo(String value) {
            addCriterion("TITLE5 >=", value, "title5");
            return (Criteria) this;
        }

        public Criteria andTitle5LessThan(String value) {
            addCriterion("TITLE5 <", value, "title5");
            return (Criteria) this;
        }

        public Criteria andTitle5LessThanOrEqualTo(String value) {
            addCriterion("TITLE5 <=", value, "title5");
            return (Criteria) this;
        }

        public Criteria andTitle5Like(String value) {
            addCriterion("TITLE5 like", value, "title5");
            return (Criteria) this;
        }

        public Criteria andTitle5NotLike(String value) {
            addCriterion("TITLE5 not like", value, "title5");
            return (Criteria) this;
        }

        public Criteria andTitle5In(List<String> values) {
            addCriterion("TITLE5 in", values, "title5");
            return (Criteria) this;
        }

        public Criteria andTitle5NotIn(List<String> values) {
            addCriterion("TITLE5 not in", values, "title5");
            return (Criteria) this;
        }

        public Criteria andTitle5Between(String value1, String value2) {
            addCriterion("TITLE5 between", value1, value2, "title5");
            return (Criteria) this;
        }

        public Criteria andTitle5NotBetween(String value1, String value2) {
            addCriterion("TITLE5 not between", value1, value2, "title5");
            return (Criteria) this;
        }

        public Criteria andDescription5IsNull() {
            addCriterion("DESCRIPTION5 is null");
            return (Criteria) this;
        }

        public Criteria andDescription5IsNotNull() {
            addCriterion("DESCRIPTION5 is not null");
            return (Criteria) this;
        }

        public Criteria andDescription5EqualTo(String value) {
            addCriterion("DESCRIPTION5 =", value, "description5");
            return (Criteria) this;
        }

        public Criteria andDescription5NotEqualTo(String value) {
            addCriterion("DESCRIPTION5 <>", value, "description5");
            return (Criteria) this;
        }

        public Criteria andDescription5GreaterThan(String value) {
            addCriterion("DESCRIPTION5 >", value, "description5");
            return (Criteria) this;
        }

        public Criteria andDescription5GreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION5 >=", value, "description5");
            return (Criteria) this;
        }

        public Criteria andDescription5LessThan(String value) {
            addCriterion("DESCRIPTION5 <", value, "description5");
            return (Criteria) this;
        }

        public Criteria andDescription5LessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION5 <=", value, "description5");
            return (Criteria) this;
        }

        public Criteria andDescription5Like(String value) {
            addCriterion("DESCRIPTION5 like", value, "description5");
            return (Criteria) this;
        }

        public Criteria andDescription5NotLike(String value) {
            addCriterion("DESCRIPTION5 not like", value, "description5");
            return (Criteria) this;
        }

        public Criteria andDescription5In(List<String> values) {
            addCriterion("DESCRIPTION5 in", values, "description5");
            return (Criteria) this;
        }

        public Criteria andDescription5NotIn(List<String> values) {
            addCriterion("DESCRIPTION5 not in", values, "description5");
            return (Criteria) this;
        }

        public Criteria andDescription5Between(String value1, String value2) {
            addCriterion("DESCRIPTION5 between", value1, value2, "description5");
            return (Criteria) this;
        }

        public Criteria andDescription5NotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION5 not between", value1, value2, "description5");
            return (Criteria) this;
        }

        public Criteria andImgurl5IsNull() {
            addCriterion("IMGURL5 is null");
            return (Criteria) this;
        }

        public Criteria andImgurl5IsNotNull() {
            addCriterion("IMGURL5 is not null");
            return (Criteria) this;
        }

        public Criteria andImgurl5EqualTo(String value) {
            addCriterion("IMGURL5 =", value, "imgurl5");
            return (Criteria) this;
        }

        public Criteria andImgurl5NotEqualTo(String value) {
            addCriterion("IMGURL5 <>", value, "imgurl5");
            return (Criteria) this;
        }

        public Criteria andImgurl5GreaterThan(String value) {
            addCriterion("IMGURL5 >", value, "imgurl5");
            return (Criteria) this;
        }

        public Criteria andImgurl5GreaterThanOrEqualTo(String value) {
            addCriterion("IMGURL5 >=", value, "imgurl5");
            return (Criteria) this;
        }

        public Criteria andImgurl5LessThan(String value) {
            addCriterion("IMGURL5 <", value, "imgurl5");
            return (Criteria) this;
        }

        public Criteria andImgurl5LessThanOrEqualTo(String value) {
            addCriterion("IMGURL5 <=", value, "imgurl5");
            return (Criteria) this;
        }

        public Criteria andImgurl5Like(String value) {
            addCriterion("IMGURL5 like", value, "imgurl5");
            return (Criteria) this;
        }

        public Criteria andImgurl5NotLike(String value) {
            addCriterion("IMGURL5 not like", value, "imgurl5");
            return (Criteria) this;
        }

        public Criteria andImgurl5In(List<String> values) {
            addCriterion("IMGURL5 in", values, "imgurl5");
            return (Criteria) this;
        }

        public Criteria andImgurl5NotIn(List<String> values) {
            addCriterion("IMGURL5 not in", values, "imgurl5");
            return (Criteria) this;
        }

        public Criteria andImgurl5Between(String value1, String value2) {
            addCriterion("IMGURL5 between", value1, value2, "imgurl5");
            return (Criteria) this;
        }

        public Criteria andImgurl5NotBetween(String value1, String value2) {
            addCriterion("IMGURL5 not between", value1, value2, "imgurl5");
            return (Criteria) this;
        }

        public Criteria andTourl5IsNull() {
            addCriterion("TOURL5 is null");
            return (Criteria) this;
        }

        public Criteria andTourl5IsNotNull() {
            addCriterion("TOURL5 is not null");
            return (Criteria) this;
        }

        public Criteria andTourl5EqualTo(String value) {
            addCriterion("TOURL5 =", value, "tourl5");
            return (Criteria) this;
        }

        public Criteria andTourl5NotEqualTo(String value) {
            addCriterion("TOURL5 <>", value, "tourl5");
            return (Criteria) this;
        }

        public Criteria andTourl5GreaterThan(String value) {
            addCriterion("TOURL5 >", value, "tourl5");
            return (Criteria) this;
        }

        public Criteria andTourl5GreaterThanOrEqualTo(String value) {
            addCriterion("TOURL5 >=", value, "tourl5");
            return (Criteria) this;
        }

        public Criteria andTourl5LessThan(String value) {
            addCriterion("TOURL5 <", value, "tourl5");
            return (Criteria) this;
        }

        public Criteria andTourl5LessThanOrEqualTo(String value) {
            addCriterion("TOURL5 <=", value, "tourl5");
            return (Criteria) this;
        }

        public Criteria andTourl5Like(String value) {
            addCriterion("TOURL5 like", value, "tourl5");
            return (Criteria) this;
        }

        public Criteria andTourl5NotLike(String value) {
            addCriterion("TOURL5 not like", value, "tourl5");
            return (Criteria) this;
        }

        public Criteria andTourl5In(List<String> values) {
            addCriterion("TOURL5 in", values, "tourl5");
            return (Criteria) this;
        }

        public Criteria andTourl5NotIn(List<String> values) {
            addCriterion("TOURL5 not in", values, "tourl5");
            return (Criteria) this;
        }

        public Criteria andTourl5Between(String value1, String value2) {
            addCriterion("TOURL5 between", value1, value2, "tourl5");
            return (Criteria) this;
        }

        public Criteria andTourl5NotBetween(String value1, String value2) {
            addCriterion("TOURL5 not between", value1, value2, "tourl5");
            return (Criteria) this;
        }

        public Criteria andTitle6IsNull() {
            addCriterion("TITLE6 is null");
            return (Criteria) this;
        }

        public Criteria andTitle6IsNotNull() {
            addCriterion("TITLE6 is not null");
            return (Criteria) this;
        }

        public Criteria andTitle6EqualTo(String value) {
            addCriterion("TITLE6 =", value, "title6");
            return (Criteria) this;
        }

        public Criteria andTitle6NotEqualTo(String value) {
            addCriterion("TITLE6 <>", value, "title6");
            return (Criteria) this;
        }

        public Criteria andTitle6GreaterThan(String value) {
            addCriterion("TITLE6 >", value, "title6");
            return (Criteria) this;
        }

        public Criteria andTitle6GreaterThanOrEqualTo(String value) {
            addCriterion("TITLE6 >=", value, "title6");
            return (Criteria) this;
        }

        public Criteria andTitle6LessThan(String value) {
            addCriterion("TITLE6 <", value, "title6");
            return (Criteria) this;
        }

        public Criteria andTitle6LessThanOrEqualTo(String value) {
            addCriterion("TITLE6 <=", value, "title6");
            return (Criteria) this;
        }

        public Criteria andTitle6Like(String value) {
            addCriterion("TITLE6 like", value, "title6");
            return (Criteria) this;
        }

        public Criteria andTitle6NotLike(String value) {
            addCriterion("TITLE6 not like", value, "title6");
            return (Criteria) this;
        }

        public Criteria andTitle6In(List<String> values) {
            addCriterion("TITLE6 in", values, "title6");
            return (Criteria) this;
        }

        public Criteria andTitle6NotIn(List<String> values) {
            addCriterion("TITLE6 not in", values, "title6");
            return (Criteria) this;
        }

        public Criteria andTitle6Between(String value1, String value2) {
            addCriterion("TITLE6 between", value1, value2, "title6");
            return (Criteria) this;
        }

        public Criteria andTitle6NotBetween(String value1, String value2) {
            addCriterion("TITLE6 not between", value1, value2, "title6");
            return (Criteria) this;
        }

        public Criteria andDescription6IsNull() {
            addCriterion("DESCRIPTION6 is null");
            return (Criteria) this;
        }

        public Criteria andDescription6IsNotNull() {
            addCriterion("DESCRIPTION6 is not null");
            return (Criteria) this;
        }

        public Criteria andDescription6EqualTo(String value) {
            addCriterion("DESCRIPTION6 =", value, "description6");
            return (Criteria) this;
        }

        public Criteria andDescription6NotEqualTo(String value) {
            addCriterion("DESCRIPTION6 <>", value, "description6");
            return (Criteria) this;
        }

        public Criteria andDescription6GreaterThan(String value) {
            addCriterion("DESCRIPTION6 >", value, "description6");
            return (Criteria) this;
        }

        public Criteria andDescription6GreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION6 >=", value, "description6");
            return (Criteria) this;
        }

        public Criteria andDescription6LessThan(String value) {
            addCriterion("DESCRIPTION6 <", value, "description6");
            return (Criteria) this;
        }

        public Criteria andDescription6LessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION6 <=", value, "description6");
            return (Criteria) this;
        }

        public Criteria andDescription6Like(String value) {
            addCriterion("DESCRIPTION6 like", value, "description6");
            return (Criteria) this;
        }

        public Criteria andDescription6NotLike(String value) {
            addCriterion("DESCRIPTION6 not like", value, "description6");
            return (Criteria) this;
        }

        public Criteria andDescription6In(List<String> values) {
            addCriterion("DESCRIPTION6 in", values, "description6");
            return (Criteria) this;
        }

        public Criteria andDescription6NotIn(List<String> values) {
            addCriterion("DESCRIPTION6 not in", values, "description6");
            return (Criteria) this;
        }

        public Criteria andDescription6Between(String value1, String value2) {
            addCriterion("DESCRIPTION6 between", value1, value2, "description6");
            return (Criteria) this;
        }

        public Criteria andDescription6NotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION6 not between", value1, value2, "description6");
            return (Criteria) this;
        }

        public Criteria andImgurl6IsNull() {
            addCriterion("IMGURL6 is null");
            return (Criteria) this;
        }

        public Criteria andImgurl6IsNotNull() {
            addCriterion("IMGURL6 is not null");
            return (Criteria) this;
        }

        public Criteria andImgurl6EqualTo(String value) {
            addCriterion("IMGURL6 =", value, "imgurl6");
            return (Criteria) this;
        }

        public Criteria andImgurl6NotEqualTo(String value) {
            addCriterion("IMGURL6 <>", value, "imgurl6");
            return (Criteria) this;
        }

        public Criteria andImgurl6GreaterThan(String value) {
            addCriterion("IMGURL6 >", value, "imgurl6");
            return (Criteria) this;
        }

        public Criteria andImgurl6GreaterThanOrEqualTo(String value) {
            addCriterion("IMGURL6 >=", value, "imgurl6");
            return (Criteria) this;
        }

        public Criteria andImgurl6LessThan(String value) {
            addCriterion("IMGURL6 <", value, "imgurl6");
            return (Criteria) this;
        }

        public Criteria andImgurl6LessThanOrEqualTo(String value) {
            addCriterion("IMGURL6 <=", value, "imgurl6");
            return (Criteria) this;
        }

        public Criteria andImgurl6Like(String value) {
            addCriterion("IMGURL6 like", value, "imgurl6");
            return (Criteria) this;
        }

        public Criteria andImgurl6NotLike(String value) {
            addCriterion("IMGURL6 not like", value, "imgurl6");
            return (Criteria) this;
        }

        public Criteria andImgurl6In(List<String> values) {
            addCriterion("IMGURL6 in", values, "imgurl6");
            return (Criteria) this;
        }

        public Criteria andImgurl6NotIn(List<String> values) {
            addCriterion("IMGURL6 not in", values, "imgurl6");
            return (Criteria) this;
        }

        public Criteria andImgurl6Between(String value1, String value2) {
            addCriterion("IMGURL6 between", value1, value2, "imgurl6");
            return (Criteria) this;
        }

        public Criteria andImgurl6NotBetween(String value1, String value2) {
            addCriterion("IMGURL6 not between", value1, value2, "imgurl6");
            return (Criteria) this;
        }

        public Criteria andTourl6IsNull() {
            addCriterion("TOURL6 is null");
            return (Criteria) this;
        }

        public Criteria andTourl6IsNotNull() {
            addCriterion("TOURL6 is not null");
            return (Criteria) this;
        }

        public Criteria andTourl6EqualTo(String value) {
            addCriterion("TOURL6 =", value, "tourl6");
            return (Criteria) this;
        }

        public Criteria andTourl6NotEqualTo(String value) {
            addCriterion("TOURL6 <>", value, "tourl6");
            return (Criteria) this;
        }

        public Criteria andTourl6GreaterThan(String value) {
            addCriterion("TOURL6 >", value, "tourl6");
            return (Criteria) this;
        }

        public Criteria andTourl6GreaterThanOrEqualTo(String value) {
            addCriterion("TOURL6 >=", value, "tourl6");
            return (Criteria) this;
        }

        public Criteria andTourl6LessThan(String value) {
            addCriterion("TOURL6 <", value, "tourl6");
            return (Criteria) this;
        }

        public Criteria andTourl6LessThanOrEqualTo(String value) {
            addCriterion("TOURL6 <=", value, "tourl6");
            return (Criteria) this;
        }

        public Criteria andTourl6Like(String value) {
            addCriterion("TOURL6 like", value, "tourl6");
            return (Criteria) this;
        }

        public Criteria andTourl6NotLike(String value) {
            addCriterion("TOURL6 not like", value, "tourl6");
            return (Criteria) this;
        }

        public Criteria andTourl6In(List<String> values) {
            addCriterion("TOURL6 in", values, "tourl6");
            return (Criteria) this;
        }

        public Criteria andTourl6NotIn(List<String> values) {
            addCriterion("TOURL6 not in", values, "tourl6");
            return (Criteria) this;
        }

        public Criteria andTourl6Between(String value1, String value2) {
            addCriterion("TOURL6 between", value1, value2, "tourl6");
            return (Criteria) this;
        }

        public Criteria andTourl6NotBetween(String value1, String value2) {
            addCriterion("TOURL6 not between", value1, value2, "tourl6");
            return (Criteria) this;
        }

        public Criteria andTitle7IsNull() {
            addCriterion("TITLE7 is null");
            return (Criteria) this;
        }

        public Criteria andTitle7IsNotNull() {
            addCriterion("TITLE7 is not null");
            return (Criteria) this;
        }

        public Criteria andTitle7EqualTo(String value) {
            addCriterion("TITLE7 =", value, "title7");
            return (Criteria) this;
        }

        public Criteria andTitle7NotEqualTo(String value) {
            addCriterion("TITLE7 <>", value, "title7");
            return (Criteria) this;
        }

        public Criteria andTitle7GreaterThan(String value) {
            addCriterion("TITLE7 >", value, "title7");
            return (Criteria) this;
        }

        public Criteria andTitle7GreaterThanOrEqualTo(String value) {
            addCriterion("TITLE7 >=", value, "title7");
            return (Criteria) this;
        }

        public Criteria andTitle7LessThan(String value) {
            addCriterion("TITLE7 <", value, "title7");
            return (Criteria) this;
        }

        public Criteria andTitle7LessThanOrEqualTo(String value) {
            addCriterion("TITLE7 <=", value, "title7");
            return (Criteria) this;
        }

        public Criteria andTitle7Like(String value) {
            addCriterion("TITLE7 like", value, "title7");
            return (Criteria) this;
        }

        public Criteria andTitle7NotLike(String value) {
            addCriterion("TITLE7 not like", value, "title7");
            return (Criteria) this;
        }

        public Criteria andTitle7In(List<String> values) {
            addCriterion("TITLE7 in", values, "title7");
            return (Criteria) this;
        }

        public Criteria andTitle7NotIn(List<String> values) {
            addCriterion("TITLE7 not in", values, "title7");
            return (Criteria) this;
        }

        public Criteria andTitle7Between(String value1, String value2) {
            addCriterion("TITLE7 between", value1, value2, "title7");
            return (Criteria) this;
        }

        public Criteria andTitle7NotBetween(String value1, String value2) {
            addCriterion("TITLE7 not between", value1, value2, "title7");
            return (Criteria) this;
        }

        public Criteria andDescription7IsNull() {
            addCriterion("DESCRIPTION7 is null");
            return (Criteria) this;
        }

        public Criteria andDescription7IsNotNull() {
            addCriterion("DESCRIPTION7 is not null");
            return (Criteria) this;
        }

        public Criteria andDescription7EqualTo(String value) {
            addCriterion("DESCRIPTION7 =", value, "description7");
            return (Criteria) this;
        }

        public Criteria andDescription7NotEqualTo(String value) {
            addCriterion("DESCRIPTION7 <>", value, "description7");
            return (Criteria) this;
        }

        public Criteria andDescription7GreaterThan(String value) {
            addCriterion("DESCRIPTION7 >", value, "description7");
            return (Criteria) this;
        }

        public Criteria andDescription7GreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION7 >=", value, "description7");
            return (Criteria) this;
        }

        public Criteria andDescription7LessThan(String value) {
            addCriterion("DESCRIPTION7 <", value, "description7");
            return (Criteria) this;
        }

        public Criteria andDescription7LessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION7 <=", value, "description7");
            return (Criteria) this;
        }

        public Criteria andDescription7Like(String value) {
            addCriterion("DESCRIPTION7 like", value, "description7");
            return (Criteria) this;
        }

        public Criteria andDescription7NotLike(String value) {
            addCriterion("DESCRIPTION7 not like", value, "description7");
            return (Criteria) this;
        }

        public Criteria andDescription7In(List<String> values) {
            addCriterion("DESCRIPTION7 in", values, "description7");
            return (Criteria) this;
        }

        public Criteria andDescription7NotIn(List<String> values) {
            addCriterion("DESCRIPTION7 not in", values, "description7");
            return (Criteria) this;
        }

        public Criteria andDescription7Between(String value1, String value2) {
            addCriterion("DESCRIPTION7 between", value1, value2, "description7");
            return (Criteria) this;
        }

        public Criteria andDescription7NotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION7 not between", value1, value2, "description7");
            return (Criteria) this;
        }

        public Criteria andImgurl7IsNull() {
            addCriterion("IMGURL7 is null");
            return (Criteria) this;
        }

        public Criteria andImgurl7IsNotNull() {
            addCriterion("IMGURL7 is not null");
            return (Criteria) this;
        }

        public Criteria andImgurl7EqualTo(String value) {
            addCriterion("IMGURL7 =", value, "imgurl7");
            return (Criteria) this;
        }

        public Criteria andImgurl7NotEqualTo(String value) {
            addCriterion("IMGURL7 <>", value, "imgurl7");
            return (Criteria) this;
        }

        public Criteria andImgurl7GreaterThan(String value) {
            addCriterion("IMGURL7 >", value, "imgurl7");
            return (Criteria) this;
        }

        public Criteria andImgurl7GreaterThanOrEqualTo(String value) {
            addCriterion("IMGURL7 >=", value, "imgurl7");
            return (Criteria) this;
        }

        public Criteria andImgurl7LessThan(String value) {
            addCriterion("IMGURL7 <", value, "imgurl7");
            return (Criteria) this;
        }

        public Criteria andImgurl7LessThanOrEqualTo(String value) {
            addCriterion("IMGURL7 <=", value, "imgurl7");
            return (Criteria) this;
        }

        public Criteria andImgurl7Like(String value) {
            addCriterion("IMGURL7 like", value, "imgurl7");
            return (Criteria) this;
        }

        public Criteria andImgurl7NotLike(String value) {
            addCriterion("IMGURL7 not like", value, "imgurl7");
            return (Criteria) this;
        }

        public Criteria andImgurl7In(List<String> values) {
            addCriterion("IMGURL7 in", values, "imgurl7");
            return (Criteria) this;
        }

        public Criteria andImgurl7NotIn(List<String> values) {
            addCriterion("IMGURL7 not in", values, "imgurl7");
            return (Criteria) this;
        }

        public Criteria andImgurl7Between(String value1, String value2) {
            addCriterion("IMGURL7 between", value1, value2, "imgurl7");
            return (Criteria) this;
        }

        public Criteria andImgurl7NotBetween(String value1, String value2) {
            addCriterion("IMGURL7 not between", value1, value2, "imgurl7");
            return (Criteria) this;
        }

        public Criteria andTourl7IsNull() {
            addCriterion("TOURL7 is null");
            return (Criteria) this;
        }

        public Criteria andTourl7IsNotNull() {
            addCriterion("TOURL7 is not null");
            return (Criteria) this;
        }

        public Criteria andTourl7EqualTo(String value) {
            addCriterion("TOURL7 =", value, "tourl7");
            return (Criteria) this;
        }

        public Criteria andTourl7NotEqualTo(String value) {
            addCriterion("TOURL7 <>", value, "tourl7");
            return (Criteria) this;
        }

        public Criteria andTourl7GreaterThan(String value) {
            addCriterion("TOURL7 >", value, "tourl7");
            return (Criteria) this;
        }

        public Criteria andTourl7GreaterThanOrEqualTo(String value) {
            addCriterion("TOURL7 >=", value, "tourl7");
            return (Criteria) this;
        }

        public Criteria andTourl7LessThan(String value) {
            addCriterion("TOURL7 <", value, "tourl7");
            return (Criteria) this;
        }

        public Criteria andTourl7LessThanOrEqualTo(String value) {
            addCriterion("TOURL7 <=", value, "tourl7");
            return (Criteria) this;
        }

        public Criteria andTourl7Like(String value) {
            addCriterion("TOURL7 like", value, "tourl7");
            return (Criteria) this;
        }

        public Criteria andTourl7NotLike(String value) {
            addCriterion("TOURL7 not like", value, "tourl7");
            return (Criteria) this;
        }

        public Criteria andTourl7In(List<String> values) {
            addCriterion("TOURL7 in", values, "tourl7");
            return (Criteria) this;
        }

        public Criteria andTourl7NotIn(List<String> values) {
            addCriterion("TOURL7 not in", values, "tourl7");
            return (Criteria) this;
        }

        public Criteria andTourl7Between(String value1, String value2) {
            addCriterion("TOURL7 between", value1, value2, "tourl7");
            return (Criteria) this;
        }

        public Criteria andTourl7NotBetween(String value1, String value2) {
            addCriterion("TOURL7 not between", value1, value2, "tourl7");
            return (Criteria) this;
        }

        public Criteria andTitle8IsNull() {
            addCriterion("TITLE8 is null");
            return (Criteria) this;
        }

        public Criteria andTitle8IsNotNull() {
            addCriterion("TITLE8 is not null");
            return (Criteria) this;
        }

        public Criteria andTitle8EqualTo(String value) {
            addCriterion("TITLE8 =", value, "title8");
            return (Criteria) this;
        }

        public Criteria andTitle8NotEqualTo(String value) {
            addCriterion("TITLE8 <>", value, "title8");
            return (Criteria) this;
        }

        public Criteria andTitle8GreaterThan(String value) {
            addCriterion("TITLE8 >", value, "title8");
            return (Criteria) this;
        }

        public Criteria andTitle8GreaterThanOrEqualTo(String value) {
            addCriterion("TITLE8 >=", value, "title8");
            return (Criteria) this;
        }

        public Criteria andTitle8LessThan(String value) {
            addCriterion("TITLE8 <", value, "title8");
            return (Criteria) this;
        }

        public Criteria andTitle8LessThanOrEqualTo(String value) {
            addCriterion("TITLE8 <=", value, "title8");
            return (Criteria) this;
        }

        public Criteria andTitle8Like(String value) {
            addCriterion("TITLE8 like", value, "title8");
            return (Criteria) this;
        }

        public Criteria andTitle8NotLike(String value) {
            addCriterion("TITLE8 not like", value, "title8");
            return (Criteria) this;
        }

        public Criteria andTitle8In(List<String> values) {
            addCriterion("TITLE8 in", values, "title8");
            return (Criteria) this;
        }

        public Criteria andTitle8NotIn(List<String> values) {
            addCriterion("TITLE8 not in", values, "title8");
            return (Criteria) this;
        }

        public Criteria andTitle8Between(String value1, String value2) {
            addCriterion("TITLE8 between", value1, value2, "title8");
            return (Criteria) this;
        }

        public Criteria andTitle8NotBetween(String value1, String value2) {
            addCriterion("TITLE8 not between", value1, value2, "title8");
            return (Criteria) this;
        }

        public Criteria andDescription8IsNull() {
            addCriterion("DESCRIPTION8 is null");
            return (Criteria) this;
        }

        public Criteria andDescription8IsNotNull() {
            addCriterion("DESCRIPTION8 is not null");
            return (Criteria) this;
        }

        public Criteria andDescription8EqualTo(String value) {
            addCriterion("DESCRIPTION8 =", value, "description8");
            return (Criteria) this;
        }

        public Criteria andDescription8NotEqualTo(String value) {
            addCriterion("DESCRIPTION8 <>", value, "description8");
            return (Criteria) this;
        }

        public Criteria andDescription8GreaterThan(String value) {
            addCriterion("DESCRIPTION8 >", value, "description8");
            return (Criteria) this;
        }

        public Criteria andDescription8GreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION8 >=", value, "description8");
            return (Criteria) this;
        }

        public Criteria andDescription8LessThan(String value) {
            addCriterion("DESCRIPTION8 <", value, "description8");
            return (Criteria) this;
        }

        public Criteria andDescription8LessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION8 <=", value, "description8");
            return (Criteria) this;
        }

        public Criteria andDescription8Like(String value) {
            addCriterion("DESCRIPTION8 like", value, "description8");
            return (Criteria) this;
        }

        public Criteria andDescription8NotLike(String value) {
            addCriterion("DESCRIPTION8 not like", value, "description8");
            return (Criteria) this;
        }

        public Criteria andDescription8In(List<String> values) {
            addCriterion("DESCRIPTION8 in", values, "description8");
            return (Criteria) this;
        }

        public Criteria andDescription8NotIn(List<String> values) {
            addCriterion("DESCRIPTION8 not in", values, "description8");
            return (Criteria) this;
        }

        public Criteria andDescription8Between(String value1, String value2) {
            addCriterion("DESCRIPTION8 between", value1, value2, "description8");
            return (Criteria) this;
        }

        public Criteria andDescription8NotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION8 not between", value1, value2, "description8");
            return (Criteria) this;
        }

        public Criteria andImgurl8IsNull() {
            addCriterion("IMGURL8 is null");
            return (Criteria) this;
        }

        public Criteria andImgurl8IsNotNull() {
            addCriterion("IMGURL8 is not null");
            return (Criteria) this;
        }

        public Criteria andImgurl8EqualTo(String value) {
            addCriterion("IMGURL8 =", value, "imgurl8");
            return (Criteria) this;
        }

        public Criteria andImgurl8NotEqualTo(String value) {
            addCriterion("IMGURL8 <>", value, "imgurl8");
            return (Criteria) this;
        }

        public Criteria andImgurl8GreaterThan(String value) {
            addCriterion("IMGURL8 >", value, "imgurl8");
            return (Criteria) this;
        }

        public Criteria andImgurl8GreaterThanOrEqualTo(String value) {
            addCriterion("IMGURL8 >=", value, "imgurl8");
            return (Criteria) this;
        }

        public Criteria andImgurl8LessThan(String value) {
            addCriterion("IMGURL8 <", value, "imgurl8");
            return (Criteria) this;
        }

        public Criteria andImgurl8LessThanOrEqualTo(String value) {
            addCriterion("IMGURL8 <=", value, "imgurl8");
            return (Criteria) this;
        }

        public Criteria andImgurl8Like(String value) {
            addCriterion("IMGURL8 like", value, "imgurl8");
            return (Criteria) this;
        }

        public Criteria andImgurl8NotLike(String value) {
            addCriterion("IMGURL8 not like", value, "imgurl8");
            return (Criteria) this;
        }

        public Criteria andImgurl8In(List<String> values) {
            addCriterion("IMGURL8 in", values, "imgurl8");
            return (Criteria) this;
        }

        public Criteria andImgurl8NotIn(List<String> values) {
            addCriterion("IMGURL8 not in", values, "imgurl8");
            return (Criteria) this;
        }

        public Criteria andImgurl8Between(String value1, String value2) {
            addCriterion("IMGURL8 between", value1, value2, "imgurl8");
            return (Criteria) this;
        }

        public Criteria andImgurl8NotBetween(String value1, String value2) {
            addCriterion("IMGURL8 not between", value1, value2, "imgurl8");
            return (Criteria) this;
        }

        public Criteria andTourl8IsNull() {
            addCriterion("TOURL8 is null");
            return (Criteria) this;
        }

        public Criteria andTourl8IsNotNull() {
            addCriterion("TOURL8 is not null");
            return (Criteria) this;
        }

        public Criteria andTourl8EqualTo(String value) {
            addCriterion("TOURL8 =", value, "tourl8");
            return (Criteria) this;
        }

        public Criteria andTourl8NotEqualTo(String value) {
            addCriterion("TOURL8 <>", value, "tourl8");
            return (Criteria) this;
        }

        public Criteria andTourl8GreaterThan(String value) {
            addCriterion("TOURL8 >", value, "tourl8");
            return (Criteria) this;
        }

        public Criteria andTourl8GreaterThanOrEqualTo(String value) {
            addCriterion("TOURL8 >=", value, "tourl8");
            return (Criteria) this;
        }

        public Criteria andTourl8LessThan(String value) {
            addCriterion("TOURL8 <", value, "tourl8");
            return (Criteria) this;
        }

        public Criteria andTourl8LessThanOrEqualTo(String value) {
            addCriterion("TOURL8 <=", value, "tourl8");
            return (Criteria) this;
        }

        public Criteria andTourl8Like(String value) {
            addCriterion("TOURL8 like", value, "tourl8");
            return (Criteria) this;
        }

        public Criteria andTourl8NotLike(String value) {
            addCriterion("TOURL8 not like", value, "tourl8");
            return (Criteria) this;
        }

        public Criteria andTourl8In(List<String> values) {
            addCriterion("TOURL8 in", values, "tourl8");
            return (Criteria) this;
        }

        public Criteria andTourl8NotIn(List<String> values) {
            addCriterion("TOURL8 not in", values, "tourl8");
            return (Criteria) this;
        }

        public Criteria andTourl8Between(String value1, String value2) {
            addCriterion("TOURL8 between", value1, value2, "tourl8");
            return (Criteria) this;
        }

        public Criteria andTourl8NotBetween(String value1, String value2) {
            addCriterion("TOURL8 not between", value1, value2, "tourl8");
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