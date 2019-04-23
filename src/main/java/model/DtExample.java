package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DtExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DtExample() {
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

        public Criteria andDdateIsNull() {
            addCriterion("ddate is null");
            return (Criteria) this;
        }

        public Criteria andDdateIsNotNull() {
            addCriterion("ddate is not null");
            return (Criteria) this;
        }

        public Criteria andDdateEqualTo(Date value) {
            addCriterion("ddate =", value, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateNotEqualTo(Date value) {
            addCriterion("ddate <>", value, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateGreaterThan(Date value) {
            addCriterion("ddate >", value, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateGreaterThanOrEqualTo(Date value) {
            addCriterion("ddate >=", value, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateLessThan(Date value) {
            addCriterion("ddate <", value, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateLessThanOrEqualTo(Date value) {
            addCriterion("ddate <=", value, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateIn(List<Date> values) {
            addCriterion("ddate in", values, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateNotIn(List<Date> values) {
            addCriterion("ddate not in", values, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateBetween(Date value1, Date value2) {
            addCriterion("ddate between", value1, value2, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateNotBetween(Date value1, Date value2) {
            addCriterion("ddate not between", value1, value2, "ddate");
            return (Criteria) this;
        }

        public Criteria andDparamIsNull() {
            addCriterion("dparam is null");
            return (Criteria) this;
        }

        public Criteria andDparamIsNotNull() {
            addCriterion("dparam is not null");
            return (Criteria) this;
        }

        public Criteria andDparamEqualTo(Double value) {
            addCriterion("dparam =", value, "dparam");
            return (Criteria) this;
        }

        public Criteria andDparamNotEqualTo(Double value) {
            addCriterion("dparam <>", value, "dparam");
            return (Criteria) this;
        }

        public Criteria andDparamGreaterThan(Double value) {
            addCriterion("dparam >", value, "dparam");
            return (Criteria) this;
        }

        public Criteria andDparamGreaterThanOrEqualTo(Double value) {
            addCriterion("dparam >=", value, "dparam");
            return (Criteria) this;
        }

        public Criteria andDparamLessThan(Double value) {
            addCriterion("dparam <", value, "dparam");
            return (Criteria) this;
        }

        public Criteria andDparamLessThanOrEqualTo(Double value) {
            addCriterion("dparam <=", value, "dparam");
            return (Criteria) this;
        }

        public Criteria andDparamIn(List<Double> values) {
            addCriterion("dparam in", values, "dparam");
            return (Criteria) this;
        }

        public Criteria andDparamNotIn(List<Double> values) {
            addCriterion("dparam not in", values, "dparam");
            return (Criteria) this;
        }

        public Criteria andDparamBetween(Double value1, Double value2) {
            addCriterion("dparam between", value1, value2, "dparam");
            return (Criteria) this;
        }

        public Criteria andDparamNotBetween(Double value1, Double value2) {
            addCriterion("dparam not between", value1, value2, "dparam");
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