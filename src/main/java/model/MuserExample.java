package model;

import java.util.ArrayList;
import java.util.List;

public class MuserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MuserExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMnameIsNull() {
            addCriterion("mname is null");
            return (Criteria) this;
        }

        public Criteria andMnameIsNotNull() {
            addCriterion("mname is not null");
            return (Criteria) this;
        }

        public Criteria andMnameEqualTo(String value) {
            addCriterion("mname =", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotEqualTo(String value) {
            addCriterion("mname <>", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameGreaterThan(String value) {
            addCriterion("mname >", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameGreaterThanOrEqualTo(String value) {
            addCriterion("mname >=", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLessThan(String value) {
            addCriterion("mname <", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLessThanOrEqualTo(String value) {
            addCriterion("mname <=", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLike(String value) {
            addCriterion("mname like", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotLike(String value) {
            addCriterion("mname not like", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameIn(List<String> values) {
            addCriterion("mname in", values, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotIn(List<String> values) {
            addCriterion("mname not in", values, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameBetween(String value1, String value2) {
            addCriterion("mname between", value1, value2, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotBetween(String value1, String value2) {
            addCriterion("mname not between", value1, value2, "mname");
            return (Criteria) this;
        }

        public Criteria andMdateIsNull() {
            addCriterion("mdate is null");
            return (Criteria) this;
        }

        public Criteria andMdateIsNotNull() {
            addCriterion("mdate is not null");
            return (Criteria) this;
        }

        public Criteria andMdateEqualTo(String value) {
            addCriterion("mdate =", value, "mdate");
            return (Criteria) this;
        }

        public Criteria andMdateNotEqualTo(String value) {
            addCriterion("mdate <>", value, "mdate");
            return (Criteria) this;
        }

        public Criteria andMdateGreaterThan(String value) {
            addCriterion("mdate >", value, "mdate");
            return (Criteria) this;
        }

        public Criteria andMdateGreaterThanOrEqualTo(String value) {
            addCriterion("mdate >=", value, "mdate");
            return (Criteria) this;
        }

        public Criteria andMdateLessThan(String value) {
            addCriterion("mdate <", value, "mdate");
            return (Criteria) this;
        }

        public Criteria andMdateLessThanOrEqualTo(String value) {
            addCriterion("mdate <=", value, "mdate");
            return (Criteria) this;
        }

        public Criteria andMdateLike(String value) {
            addCriterion("mdate like", value, "mdate");
            return (Criteria) this;
        }

        public Criteria andMdateNotLike(String value) {
            addCriterion("mdate not like", value, "mdate");
            return (Criteria) this;
        }

        public Criteria andMdateIn(List<String> values) {
            addCriterion("mdate in", values, "mdate");
            return (Criteria) this;
        }

        public Criteria andMdateNotIn(List<String> values) {
            addCriterion("mdate not in", values, "mdate");
            return (Criteria) this;
        }

        public Criteria andMdateBetween(String value1, String value2) {
            addCriterion("mdate between", value1, value2, "mdate");
            return (Criteria) this;
        }

        public Criteria andMdateNotBetween(String value1, String value2) {
            addCriterion("mdate not between", value1, value2, "mdate");
            return (Criteria) this;
        }

        public Criteria andAuthIsNull() {
            addCriterion("auth is null");
            return (Criteria) this;
        }

        public Criteria andAuthIsNotNull() {
            addCriterion("auth is not null");
            return (Criteria) this;
        }

        public Criteria andAuthEqualTo(String value) {
            addCriterion("auth =", value, "auth");
            return (Criteria) this;
        }

        public Criteria andAuthNotEqualTo(String value) {
            addCriterion("auth <>", value, "auth");
            return (Criteria) this;
        }

        public Criteria andAuthGreaterThan(String value) {
            addCriterion("auth >", value, "auth");
            return (Criteria) this;
        }

        public Criteria andAuthGreaterThanOrEqualTo(String value) {
            addCriterion("auth >=", value, "auth");
            return (Criteria) this;
        }

        public Criteria andAuthLessThan(String value) {
            addCriterion("auth <", value, "auth");
            return (Criteria) this;
        }

        public Criteria andAuthLessThanOrEqualTo(String value) {
            addCriterion("auth <=", value, "auth");
            return (Criteria) this;
        }

        public Criteria andAuthLike(String value) {
            addCriterion("auth like", value, "auth");
            return (Criteria) this;
        }

        public Criteria andAuthNotLike(String value) {
            addCriterion("auth not like", value, "auth");
            return (Criteria) this;
        }

        public Criteria andAuthIn(List<String> values) {
            addCriterion("auth in", values, "auth");
            return (Criteria) this;
        }

        public Criteria andAuthNotIn(List<String> values) {
            addCriterion("auth not in", values, "auth");
            return (Criteria) this;
        }

        public Criteria andAuthBetween(String value1, String value2) {
            addCriterion("auth between", value1, value2, "auth");
            return (Criteria) this;
        }

        public Criteria andAuthNotBetween(String value1, String value2) {
            addCriterion("auth not between", value1, value2, "auth");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andLinksIsNull() {
            addCriterion("links is null");
            return (Criteria) this;
        }

        public Criteria andLinksIsNotNull() {
            addCriterion("links is not null");
            return (Criteria) this;
        }

        public Criteria andLinksEqualTo(String value) {
            addCriterion("links =", value, "links");
            return (Criteria) this;
        }

        public Criteria andLinksNotEqualTo(String value) {
            addCriterion("links <>", value, "links");
            return (Criteria) this;
        }

        public Criteria andLinksGreaterThan(String value) {
            addCriterion("links >", value, "links");
            return (Criteria) this;
        }

        public Criteria andLinksGreaterThanOrEqualTo(String value) {
            addCriterion("links >=", value, "links");
            return (Criteria) this;
        }

        public Criteria andLinksLessThan(String value) {
            addCriterion("links <", value, "links");
            return (Criteria) this;
        }

        public Criteria andLinksLessThanOrEqualTo(String value) {
            addCriterion("links <=", value, "links");
            return (Criteria) this;
        }

        public Criteria andLinksLike(String value) {
            addCriterion("links like", value, "links");
            return (Criteria) this;
        }

        public Criteria andLinksNotLike(String value) {
            addCriterion("links not like", value, "links");
            return (Criteria) this;
        }

        public Criteria andLinksIn(List<String> values) {
            addCriterion("links in", values, "links");
            return (Criteria) this;
        }

        public Criteria andLinksNotIn(List<String> values) {
            addCriterion("links not in", values, "links");
            return (Criteria) this;
        }

        public Criteria andLinksBetween(String value1, String value2) {
            addCriterion("links between", value1, value2, "links");
            return (Criteria) this;
        }

        public Criteria andLinksNotBetween(String value1, String value2) {
            addCriterion("links not between", value1, value2, "links");
            return (Criteria) this;
        }

        public Criteria andOthersIsNull() {
            addCriterion("others is null");
            return (Criteria) this;
        }

        public Criteria andOthersIsNotNull() {
            addCriterion("others is not null");
            return (Criteria) this;
        }

        public Criteria andOthersEqualTo(String value) {
            addCriterion("others =", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersNotEqualTo(String value) {
            addCriterion("others <>", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersGreaterThan(String value) {
            addCriterion("others >", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersGreaterThanOrEqualTo(String value) {
            addCriterion("others >=", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersLessThan(String value) {
            addCriterion("others <", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersLessThanOrEqualTo(String value) {
            addCriterion("others <=", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersLike(String value) {
            addCriterion("others like", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersNotLike(String value) {
            addCriterion("others not like", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersIn(List<String> values) {
            addCriterion("others in", values, "others");
            return (Criteria) this;
        }

        public Criteria andOthersNotIn(List<String> values) {
            addCriterion("others not in", values, "others");
            return (Criteria) this;
        }

        public Criteria andOthersBetween(String value1, String value2) {
            addCriterion("others between", value1, value2, "others");
            return (Criteria) this;
        }

        public Criteria andOthersNotBetween(String value1, String value2) {
            addCriterion("others not between", value1, value2, "others");
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