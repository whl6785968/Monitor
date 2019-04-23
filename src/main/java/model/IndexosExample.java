package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IndexosExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IndexosExample() {
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

        public Criteria andIidIsNull() {
            addCriterion("iid is null");
            return (Criteria) this;
        }

        public Criteria andIidIsNotNull() {
            addCriterion("iid is not null");
            return (Criteria) this;
        }

        public Criteria andIidEqualTo(String value) {
            addCriterion("iid =", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidNotEqualTo(String value) {
            addCriterion("iid <>", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidGreaterThan(String value) {
            addCriterion("iid >", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidGreaterThanOrEqualTo(String value) {
            addCriterion("iid >=", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidLessThan(String value) {
            addCriterion("iid <", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidLessThanOrEqualTo(String value) {
            addCriterion("iid <=", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidLike(String value) {
            addCriterion("iid like", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidNotLike(String value) {
            addCriterion("iid not like", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidIn(List<String> values) {
            addCriterion("iid in", values, "iid");
            return (Criteria) this;
        }

        public Criteria andIidNotIn(List<String> values) {
            addCriterion("iid not in", values, "iid");
            return (Criteria) this;
        }

        public Criteria andIidBetween(String value1, String value2) {
            addCriterion("iid between", value1, value2, "iid");
            return (Criteria) this;
        }

        public Criteria andIidNotBetween(String value1, String value2) {
            addCriterion("iid not between", value1, value2, "iid");
            return (Criteria) this;
        }

        public Criteria andItimeIsNull() {
            addCriterion("itime is null");
            return (Criteria) this;
        }

        public Criteria andItimeIsNotNull() {
            addCriterion("itime is not null");
            return (Criteria) this;
        }

        public Criteria andItimeEqualTo(Date value) {
            addCriterion("itime =", value, "itime");
            return (Criteria) this;
        }

        public Criteria andItimeNotEqualTo(Date value) {
            addCriterion("itime <>", value, "itime");
            return (Criteria) this;
        }

        public Criteria andItimeGreaterThan(Date value) {
            addCriterion("itime >", value, "itime");
            return (Criteria) this;
        }

        public Criteria andItimeGreaterThanOrEqualTo(Date value) {
            addCriterion("itime >=", value, "itime");
            return (Criteria) this;
        }

        public Criteria andItimeLessThan(Date value) {
            addCriterion("itime <", value, "itime");
            return (Criteria) this;
        }

        public Criteria andItimeLessThanOrEqualTo(Date value) {
            addCriterion("itime <=", value, "itime");
            return (Criteria) this;
        }

        public Criteria andItimeIn(List<Date> values) {
            addCriterion("itime in", values, "itime");
            return (Criteria) this;
        }

        public Criteria andItimeNotIn(List<Date> values) {
            addCriterion("itime not in", values, "itime");
            return (Criteria) this;
        }

        public Criteria andItimeBetween(Date value1, Date value2) {
            addCriterion("itime between", value1, value2, "itime");
            return (Criteria) this;
        }

        public Criteria andItimeNotBetween(Date value1, Date value2) {
            addCriterion("itime not between", value1, value2, "itime");
            return (Criteria) this;
        }

        public Criteria andTssIsNull() {
            addCriterion("tss is null");
            return (Criteria) this;
        }

        public Criteria andTssIsNotNull() {
            addCriterion("tss is not null");
            return (Criteria) this;
        }

        public Criteria andTssEqualTo(Float value) {
            addCriterion("tss =", value, "tss");
            return (Criteria) this;
        }

        public Criteria andTssNotEqualTo(Float value) {
            addCriterion("tss <>", value, "tss");
            return (Criteria) this;
        }

        public Criteria andTssGreaterThan(Float value) {
            addCriterion("tss >", value, "tss");
            return (Criteria) this;
        }

        public Criteria andTssGreaterThanOrEqualTo(Float value) {
            addCriterion("tss >=", value, "tss");
            return (Criteria) this;
        }

        public Criteria andTssLessThan(Float value) {
            addCriterion("tss <", value, "tss");
            return (Criteria) this;
        }

        public Criteria andTssLessThanOrEqualTo(Float value) {
            addCriterion("tss <=", value, "tss");
            return (Criteria) this;
        }

        public Criteria andTssIn(List<Float> values) {
            addCriterion("tss in", values, "tss");
            return (Criteria) this;
        }

        public Criteria andTssNotIn(List<Float> values) {
            addCriterion("tss not in", values, "tss");
            return (Criteria) this;
        }

        public Criteria andTssBetween(Float value1, Float value2) {
            addCriterion("tss between", value1, value2, "tss");
            return (Criteria) this;
        }

        public Criteria andTssNotBetween(Float value1, Float value2) {
            addCriterion("tss not between", value1, value2, "tss");
            return (Criteria) this;
        }

        public Criteria andCodIsNull() {
            addCriterion("cod is null");
            return (Criteria) this;
        }

        public Criteria andCodIsNotNull() {
            addCriterion("cod is not null");
            return (Criteria) this;
        }

        public Criteria andCodEqualTo(Float value) {
            addCriterion("cod =", value, "cod");
            return (Criteria) this;
        }

        public Criteria andCodNotEqualTo(Float value) {
            addCriterion("cod <>", value, "cod");
            return (Criteria) this;
        }

        public Criteria andCodGreaterThan(Float value) {
            addCriterion("cod >", value, "cod");
            return (Criteria) this;
        }

        public Criteria andCodGreaterThanOrEqualTo(Float value) {
            addCriterion("cod >=", value, "cod");
            return (Criteria) this;
        }

        public Criteria andCodLessThan(Float value) {
            addCriterion("cod <", value, "cod");
            return (Criteria) this;
        }

        public Criteria andCodLessThanOrEqualTo(Float value) {
            addCriterion("cod <=", value, "cod");
            return (Criteria) this;
        }

        public Criteria andCodIn(List<Float> values) {
            addCriterion("cod in", values, "cod");
            return (Criteria) this;
        }

        public Criteria andCodNotIn(List<Float> values) {
            addCriterion("cod not in", values, "cod");
            return (Criteria) this;
        }

        public Criteria andCodBetween(Float value1, Float value2) {
            addCriterion("cod between", value1, value2, "cod");
            return (Criteria) this;
        }

        public Criteria andCodNotBetween(Float value1, Float value2) {
            addCriterion("cod not between", value1, value2, "cod");
            return (Criteria) this;
        }

        public Criteria andTnIsNull() {
            addCriterion("tn is null");
            return (Criteria) this;
        }

        public Criteria andTnIsNotNull() {
            addCriterion("tn is not null");
            return (Criteria) this;
        }

        public Criteria andTnEqualTo(Float value) {
            addCriterion("tn =", value, "tn");
            return (Criteria) this;
        }

        public Criteria andTnNotEqualTo(Float value) {
            addCriterion("tn <>", value, "tn");
            return (Criteria) this;
        }

        public Criteria andTnGreaterThan(Float value) {
            addCriterion("tn >", value, "tn");
            return (Criteria) this;
        }

        public Criteria andTnGreaterThanOrEqualTo(Float value) {
            addCriterion("tn >=", value, "tn");
            return (Criteria) this;
        }

        public Criteria andTnLessThan(Float value) {
            addCriterion("tn <", value, "tn");
            return (Criteria) this;
        }

        public Criteria andTnLessThanOrEqualTo(Float value) {
            addCriterion("tn <=", value, "tn");
            return (Criteria) this;
        }

        public Criteria andTnIn(List<Float> values) {
            addCriterion("tn in", values, "tn");
            return (Criteria) this;
        }

        public Criteria andTnNotIn(List<Float> values) {
            addCriterion("tn not in", values, "tn");
            return (Criteria) this;
        }

        public Criteria andTnBetween(Float value1, Float value2) {
            addCriterion("tn between", value1, value2, "tn");
            return (Criteria) this;
        }

        public Criteria andTnNotBetween(Float value1, Float value2) {
            addCriterion("tn not between", value1, value2, "tn");
            return (Criteria) this;
        }

        public Criteria andTpIsNull() {
            addCriterion("tp is null");
            return (Criteria) this;
        }

        public Criteria andTpIsNotNull() {
            addCriterion("tp is not null");
            return (Criteria) this;
        }

        public Criteria andTpEqualTo(Float value) {
            addCriterion("tp =", value, "tp");
            return (Criteria) this;
        }

        public Criteria andTpNotEqualTo(Float value) {
            addCriterion("tp <>", value, "tp");
            return (Criteria) this;
        }

        public Criteria andTpGreaterThan(Float value) {
            addCriterion("tp >", value, "tp");
            return (Criteria) this;
        }

        public Criteria andTpGreaterThanOrEqualTo(Float value) {
            addCriterion("tp >=", value, "tp");
            return (Criteria) this;
        }

        public Criteria andTpLessThan(Float value) {
            addCriterion("tp <", value, "tp");
            return (Criteria) this;
        }

        public Criteria andTpLessThanOrEqualTo(Float value) {
            addCriterion("tp <=", value, "tp");
            return (Criteria) this;
        }

        public Criteria andTpIn(List<Float> values) {
            addCriterion("tp in", values, "tp");
            return (Criteria) this;
        }

        public Criteria andTpNotIn(List<Float> values) {
            addCriterion("tp not in", values, "tp");
            return (Criteria) this;
        }

        public Criteria andTpBetween(Float value1, Float value2) {
            addCriterion("tp between", value1, value2, "tp");
            return (Criteria) this;
        }

        public Criteria andTpNotBetween(Float value1, Float value2) {
            addCriterion("tp not between", value1, value2, "tp");
            return (Criteria) this;
        }

        public Criteria andDissolveIsNull() {
            addCriterion("dissolve is null");
            return (Criteria) this;
        }

        public Criteria andDissolveIsNotNull() {
            addCriterion("dissolve is not null");
            return (Criteria) this;
        }

        public Criteria andDissolveEqualTo(Float value) {
            addCriterion("dissolve =", value, "dissolve");
            return (Criteria) this;
        }

        public Criteria andDissolveNotEqualTo(Float value) {
            addCriterion("dissolve <>", value, "dissolve");
            return (Criteria) this;
        }

        public Criteria andDissolveGreaterThan(Float value) {
            addCriterion("dissolve >", value, "dissolve");
            return (Criteria) this;
        }

        public Criteria andDissolveGreaterThanOrEqualTo(Float value) {
            addCriterion("dissolve >=", value, "dissolve");
            return (Criteria) this;
        }

        public Criteria andDissolveLessThan(Float value) {
            addCriterion("dissolve <", value, "dissolve");
            return (Criteria) this;
        }

        public Criteria andDissolveLessThanOrEqualTo(Float value) {
            addCriterion("dissolve <=", value, "dissolve");
            return (Criteria) this;
        }

        public Criteria andDissolveIn(List<Float> values) {
            addCriterion("dissolve in", values, "dissolve");
            return (Criteria) this;
        }

        public Criteria andDissolveNotIn(List<Float> values) {
            addCriterion("dissolve not in", values, "dissolve");
            return (Criteria) this;
        }

        public Criteria andDissolveBetween(Float value1, Float value2) {
            addCriterion("dissolve between", value1, value2, "dissolve");
            return (Criteria) this;
        }

        public Criteria andDissolveNotBetween(Float value1, Float value2) {
            addCriterion("dissolve not between", value1, value2, "dissolve");
            return (Criteria) this;
        }

        public Criteria andPhIsNull() {
            addCriterion("ph is null");
            return (Criteria) this;
        }

        public Criteria andPhIsNotNull() {
            addCriterion("ph is not null");
            return (Criteria) this;
        }

        public Criteria andPhEqualTo(Float value) {
            addCriterion("ph =", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhNotEqualTo(Float value) {
            addCriterion("ph <>", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhGreaterThan(Float value) {
            addCriterion("ph >", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhGreaterThanOrEqualTo(Float value) {
            addCriterion("ph >=", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhLessThan(Float value) {
            addCriterion("ph <", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhLessThanOrEqualTo(Float value) {
            addCriterion("ph <=", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhIn(List<Float> values) {
            addCriterion("ph in", values, "ph");
            return (Criteria) this;
        }

        public Criteria andPhNotIn(List<Float> values) {
            addCriterion("ph not in", values, "ph");
            return (Criteria) this;
        }

        public Criteria andPhBetween(Float value1, Float value2) {
            addCriterion("ph between", value1, value2, "ph");
            return (Criteria) this;
        }

        public Criteria andPhNotBetween(Float value1, Float value2) {
            addCriterion("ph not between", value1, value2, "ph");
            return (Criteria) this;
        }

        public Criteria andTemperIsNull() {
            addCriterion("temper is null");
            return (Criteria) this;
        }

        public Criteria andTemperIsNotNull() {
            addCriterion("temper is not null");
            return (Criteria) this;
        }

        public Criteria andTemperEqualTo(Float value) {
            addCriterion("temper =", value, "temper");
            return (Criteria) this;
        }

        public Criteria andTemperNotEqualTo(Float value) {
            addCriterion("temper <>", value, "temper");
            return (Criteria) this;
        }

        public Criteria andTemperGreaterThan(Float value) {
            addCriterion("temper >", value, "temper");
            return (Criteria) this;
        }

        public Criteria andTemperGreaterThanOrEqualTo(Float value) {
            addCriterion("temper >=", value, "temper");
            return (Criteria) this;
        }

        public Criteria andTemperLessThan(Float value) {
            addCriterion("temper <", value, "temper");
            return (Criteria) this;
        }

        public Criteria andTemperLessThanOrEqualTo(Float value) {
            addCriterion("temper <=", value, "temper");
            return (Criteria) this;
        }

        public Criteria andTemperIn(List<Float> values) {
            addCriterion("temper in", values, "temper");
            return (Criteria) this;
        }

        public Criteria andTemperNotIn(List<Float> values) {
            addCriterion("temper not in", values, "temper");
            return (Criteria) this;
        }

        public Criteria andTemperBetween(Float value1, Float value2) {
            addCriterion("temper between", value1, value2, "temper");
            return (Criteria) this;
        }

        public Criteria andTemperNotBetween(Float value1, Float value2) {
            addCriterion("temper not between", value1, value2, "temper");
            return (Criteria) this;
        }

        public Criteria andNhnIsNull() {
            addCriterion("nhn is null");
            return (Criteria) this;
        }

        public Criteria andNhnIsNotNull() {
            addCriterion("nhn is not null");
            return (Criteria) this;
        }

        public Criteria andNhnEqualTo(Float value) {
            addCriterion("nhn =", value, "nhn");
            return (Criteria) this;
        }

        public Criteria andNhnNotEqualTo(Float value) {
            addCriterion("nhn <>", value, "nhn");
            return (Criteria) this;
        }

        public Criteria andNhnGreaterThan(Float value) {
            addCriterion("nhn >", value, "nhn");
            return (Criteria) this;
        }

        public Criteria andNhnGreaterThanOrEqualTo(Float value) {
            addCriterion("nhn >=", value, "nhn");
            return (Criteria) this;
        }

        public Criteria andNhnLessThan(Float value) {
            addCriterion("nhn <", value, "nhn");
            return (Criteria) this;
        }

        public Criteria andNhnLessThanOrEqualTo(Float value) {
            addCriterion("nhn <=", value, "nhn");
            return (Criteria) this;
        }

        public Criteria andNhnIn(List<Float> values) {
            addCriterion("nhn in", values, "nhn");
            return (Criteria) this;
        }

        public Criteria andNhnNotIn(List<Float> values) {
            addCriterion("nhn not in", values, "nhn");
            return (Criteria) this;
        }

        public Criteria andNhnBetween(Float value1, Float value2) {
            addCriterion("nhn between", value1, value2, "nhn");
            return (Criteria) this;
        }

        public Criteria andNhnNotBetween(Float value1, Float value2) {
            addCriterion("nhn not between", value1, value2, "nhn");
            return (Criteria) this;
        }

        public Criteria andConductivityIsNull() {
            addCriterion("conductivity is null");
            return (Criteria) this;
        }

        public Criteria andConductivityIsNotNull() {
            addCriterion("conductivity is not null");
            return (Criteria) this;
        }

        public Criteria andConductivityEqualTo(Float value) {
            addCriterion("conductivity =", value, "conductivity");
            return (Criteria) this;
        }

        public Criteria andConductivityNotEqualTo(Float value) {
            addCriterion("conductivity <>", value, "conductivity");
            return (Criteria) this;
        }

        public Criteria andConductivityGreaterThan(Float value) {
            addCriterion("conductivity >", value, "conductivity");
            return (Criteria) this;
        }

        public Criteria andConductivityGreaterThanOrEqualTo(Float value) {
            addCriterion("conductivity >=", value, "conductivity");
            return (Criteria) this;
        }

        public Criteria andConductivityLessThan(Float value) {
            addCriterion("conductivity <", value, "conductivity");
            return (Criteria) this;
        }

        public Criteria andConductivityLessThanOrEqualTo(Float value) {
            addCriterion("conductivity <=", value, "conductivity");
            return (Criteria) this;
        }

        public Criteria andConductivityIn(List<Float> values) {
            addCriterion("conductivity in", values, "conductivity");
            return (Criteria) this;
        }

        public Criteria andConductivityNotIn(List<Float> values) {
            addCriterion("conductivity not in", values, "conductivity");
            return (Criteria) this;
        }

        public Criteria andConductivityBetween(Float value1, Float value2) {
            addCriterion("conductivity between", value1, value2, "conductivity");
            return (Criteria) this;
        }

        public Criteria andConductivityNotBetween(Float value1, Float value2) {
            addCriterion("conductivity not between", value1, value2, "conductivity");
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