package model;

import java.util.ArrayList;
import java.util.List;

public class UserrecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserrecordExample() {
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

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andIdsrecordIsNull() {
            addCriterion("idsRecord is null");
            return (Criteria) this;
        }

        public Criteria andIdsrecordIsNotNull() {
            addCriterion("idsRecord is not null");
            return (Criteria) this;
        }

        public Criteria andIdsrecordEqualTo(String value) {
            addCriterion("idsRecord =", value, "idsrecord");
            return (Criteria) this;
        }

        public Criteria andIdsrecordNotEqualTo(String value) {
            addCriterion("idsRecord <>", value, "idsrecord");
            return (Criteria) this;
        }

        public Criteria andIdsrecordGreaterThan(String value) {
            addCriterion("idsRecord >", value, "idsrecord");
            return (Criteria) this;
        }

        public Criteria andIdsrecordGreaterThanOrEqualTo(String value) {
            addCriterion("idsRecord >=", value, "idsrecord");
            return (Criteria) this;
        }

        public Criteria andIdsrecordLessThan(String value) {
            addCriterion("idsRecord <", value, "idsrecord");
            return (Criteria) this;
        }

        public Criteria andIdsrecordLessThanOrEqualTo(String value) {
            addCriterion("idsRecord <=", value, "idsrecord");
            return (Criteria) this;
        }

        public Criteria andIdsrecordLike(String value) {
            addCriterion("idsRecord like", value, "idsrecord");
            return (Criteria) this;
        }

        public Criteria andIdsrecordNotLike(String value) {
            addCriterion("idsRecord not like", value, "idsrecord");
            return (Criteria) this;
        }

        public Criteria andIdsrecordIn(List<String> values) {
            addCriterion("idsRecord in", values, "idsrecord");
            return (Criteria) this;
        }

        public Criteria andIdsrecordNotIn(List<String> values) {
            addCriterion("idsRecord not in", values, "idsrecord");
            return (Criteria) this;
        }

        public Criteria andIdsrecordBetween(String value1, String value2) {
            addCriterion("idsRecord between", value1, value2, "idsrecord");
            return (Criteria) this;
        }

        public Criteria andIdsrecordNotBetween(String value1, String value2) {
            addCriterion("idsRecord not between", value1, value2, "idsrecord");
            return (Criteria) this;
        }

        public Criteria andPicrecordIsNull() {
            addCriterion("picRecord is null");
            return (Criteria) this;
        }

        public Criteria andPicrecordIsNotNull() {
            addCriterion("picRecord is not null");
            return (Criteria) this;
        }

        public Criteria andPicrecordEqualTo(String value) {
            addCriterion("picRecord =", value, "picrecord");
            return (Criteria) this;
        }

        public Criteria andPicrecordNotEqualTo(String value) {
            addCriterion("picRecord <>", value, "picrecord");
            return (Criteria) this;
        }

        public Criteria andPicrecordGreaterThan(String value) {
            addCriterion("picRecord >", value, "picrecord");
            return (Criteria) this;
        }

        public Criteria andPicrecordGreaterThanOrEqualTo(String value) {
            addCriterion("picRecord >=", value, "picrecord");
            return (Criteria) this;
        }

        public Criteria andPicrecordLessThan(String value) {
            addCriterion("picRecord <", value, "picrecord");
            return (Criteria) this;
        }

        public Criteria andPicrecordLessThanOrEqualTo(String value) {
            addCriterion("picRecord <=", value, "picrecord");
            return (Criteria) this;
        }

        public Criteria andPicrecordLike(String value) {
            addCriterion("picRecord like", value, "picrecord");
            return (Criteria) this;
        }

        public Criteria andPicrecordNotLike(String value) {
            addCriterion("picRecord not like", value, "picrecord");
            return (Criteria) this;
        }

        public Criteria andPicrecordIn(List<String> values) {
            addCriterion("picRecord in", values, "picrecord");
            return (Criteria) this;
        }

        public Criteria andPicrecordNotIn(List<String> values) {
            addCriterion("picRecord not in", values, "picrecord");
            return (Criteria) this;
        }

        public Criteria andPicrecordBetween(String value1, String value2) {
            addCriterion("picRecord between", value1, value2, "picrecord");
            return (Criteria) this;
        }

        public Criteria andPicrecordNotBetween(String value1, String value2) {
            addCriterion("picRecord not between", value1, value2, "picrecord");
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