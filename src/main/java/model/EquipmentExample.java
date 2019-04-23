package model;

import java.util.ArrayList;
import java.util.List;

public class EquipmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EquipmentExample() {
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

        public Criteria andEidIsNull() {
            addCriterion("eid is null");
            return (Criteria) this;
        }

        public Criteria andEidIsNotNull() {
            addCriterion("eid is not null");
            return (Criteria) this;
        }

        public Criteria andEidEqualTo(Long value) {
            addCriterion("eid =", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotEqualTo(Long value) {
            addCriterion("eid <>", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThan(Long value) {
            addCriterion("eid >", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThanOrEqualTo(Long value) {
            addCriterion("eid >=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThan(Long value) {
            addCriterion("eid <", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThanOrEqualTo(Long value) {
            addCriterion("eid <=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidIn(List<Long> values) {
            addCriterion("eid in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotIn(List<Long> values) {
            addCriterion("eid not in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidBetween(Long value1, Long value2) {
            addCriterion("eid between", value1, value2, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotBetween(Long value1, Long value2) {
            addCriterion("eid not between", value1, value2, "eid");
            return (Criteria) this;
        }

        public Criteria andEnameIsNull() {
            addCriterion("ename is null");
            return (Criteria) this;
        }

        public Criteria andEnameIsNotNull() {
            addCriterion("ename is not null");
            return (Criteria) this;
        }

        public Criteria andEnameEqualTo(String value) {
            addCriterion("ename =", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotEqualTo(String value) {
            addCriterion("ename <>", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameGreaterThan(String value) {
            addCriterion("ename >", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameGreaterThanOrEqualTo(String value) {
            addCriterion("ename >=", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLessThan(String value) {
            addCriterion("ename <", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLessThanOrEqualTo(String value) {
            addCriterion("ename <=", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLike(String value) {
            addCriterion("ename like", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotLike(String value) {
            addCriterion("ename not like", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameIn(List<String> values) {
            addCriterion("ename in", values, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotIn(List<String> values) {
            addCriterion("ename not in", values, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameBetween(String value1, String value2) {
            addCriterion("ename between", value1, value2, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotBetween(String value1, String value2) {
            addCriterion("ename not between", value1, value2, "ename");
            return (Criteria) this;
        }

        public Criteria andEparam1IsNull() {
            addCriterion("eparam1 is null");
            return (Criteria) this;
        }

        public Criteria andEparam1IsNotNull() {
            addCriterion("eparam1 is not null");
            return (Criteria) this;
        }

        public Criteria andEparam1EqualTo(Float value) {
            addCriterion("eparam1 =", value, "eparam1");
            return (Criteria) this;
        }

        public Criteria andEparam1NotEqualTo(Float value) {
            addCriterion("eparam1 <>", value, "eparam1");
            return (Criteria) this;
        }

        public Criteria andEparam1GreaterThan(Float value) {
            addCriterion("eparam1 >", value, "eparam1");
            return (Criteria) this;
        }

        public Criteria andEparam1GreaterThanOrEqualTo(Float value) {
            addCriterion("eparam1 >=", value, "eparam1");
            return (Criteria) this;
        }

        public Criteria andEparam1LessThan(Float value) {
            addCriterion("eparam1 <", value, "eparam1");
            return (Criteria) this;
        }

        public Criteria andEparam1LessThanOrEqualTo(Float value) {
            addCriterion("eparam1 <=", value, "eparam1");
            return (Criteria) this;
        }

        public Criteria andEparam1In(List<Float> values) {
            addCriterion("eparam1 in", values, "eparam1");
            return (Criteria) this;
        }

        public Criteria andEparam1NotIn(List<Float> values) {
            addCriterion("eparam1 not in", values, "eparam1");
            return (Criteria) this;
        }

        public Criteria andEparam1Between(Float value1, Float value2) {
            addCriterion("eparam1 between", value1, value2, "eparam1");
            return (Criteria) this;
        }

        public Criteria andEparam1NotBetween(Float value1, Float value2) {
            addCriterion("eparam1 not between", value1, value2, "eparam1");
            return (Criteria) this;
        }

        public Criteria andEparam2IsNull() {
            addCriterion("eparam2 is null");
            return (Criteria) this;
        }

        public Criteria andEparam2IsNotNull() {
            addCriterion("eparam2 is not null");
            return (Criteria) this;
        }

        public Criteria andEparam2EqualTo(Float value) {
            addCriterion("eparam2 =", value, "eparam2");
            return (Criteria) this;
        }

        public Criteria andEparam2NotEqualTo(Float value) {
            addCriterion("eparam2 <>", value, "eparam2");
            return (Criteria) this;
        }

        public Criteria andEparam2GreaterThan(Float value) {
            addCriterion("eparam2 >", value, "eparam2");
            return (Criteria) this;
        }

        public Criteria andEparam2GreaterThanOrEqualTo(Float value) {
            addCriterion("eparam2 >=", value, "eparam2");
            return (Criteria) this;
        }

        public Criteria andEparam2LessThan(Float value) {
            addCriterion("eparam2 <", value, "eparam2");
            return (Criteria) this;
        }

        public Criteria andEparam2LessThanOrEqualTo(Float value) {
            addCriterion("eparam2 <=", value, "eparam2");
            return (Criteria) this;
        }

        public Criteria andEparam2In(List<Float> values) {
            addCriterion("eparam2 in", values, "eparam2");
            return (Criteria) this;
        }

        public Criteria andEparam2NotIn(List<Float> values) {
            addCriterion("eparam2 not in", values, "eparam2");
            return (Criteria) this;
        }

        public Criteria andEparam2Between(Float value1, Float value2) {
            addCriterion("eparam2 between", value1, value2, "eparam2");
            return (Criteria) this;
        }

        public Criteria andEparam2NotBetween(Float value1, Float value2) {
            addCriterion("eparam2 not between", value1, value2, "eparam2");
            return (Criteria) this;
        }

        public Criteria andEparam3IsNull() {
            addCriterion("eparam3 is null");
            return (Criteria) this;
        }

        public Criteria andEparam3IsNotNull() {
            addCriterion("eparam3 is not null");
            return (Criteria) this;
        }

        public Criteria andEparam3EqualTo(Float value) {
            addCriterion("eparam3 =", value, "eparam3");
            return (Criteria) this;
        }

        public Criteria andEparam3NotEqualTo(Float value) {
            addCriterion("eparam3 <>", value, "eparam3");
            return (Criteria) this;
        }

        public Criteria andEparam3GreaterThan(Float value) {
            addCriterion("eparam3 >", value, "eparam3");
            return (Criteria) this;
        }

        public Criteria andEparam3GreaterThanOrEqualTo(Float value) {
            addCriterion("eparam3 >=", value, "eparam3");
            return (Criteria) this;
        }

        public Criteria andEparam3LessThan(Float value) {
            addCriterion("eparam3 <", value, "eparam3");
            return (Criteria) this;
        }

        public Criteria andEparam3LessThanOrEqualTo(Float value) {
            addCriterion("eparam3 <=", value, "eparam3");
            return (Criteria) this;
        }

        public Criteria andEparam3In(List<Float> values) {
            addCriterion("eparam3 in", values, "eparam3");
            return (Criteria) this;
        }

        public Criteria andEparam3NotIn(List<Float> values) {
            addCriterion("eparam3 not in", values, "eparam3");
            return (Criteria) this;
        }

        public Criteria andEparam3Between(Float value1, Float value2) {
            addCriterion("eparam3 between", value1, value2, "eparam3");
            return (Criteria) this;
        }

        public Criteria andEparam3NotBetween(Float value1, Float value2) {
            addCriterion("eparam3 not between", value1, value2, "eparam3");
            return (Criteria) this;
        }

        public Criteria andEparam4IsNull() {
            addCriterion("eparam4 is null");
            return (Criteria) this;
        }

        public Criteria andEparam4IsNotNull() {
            addCriterion("eparam4 is not null");
            return (Criteria) this;
        }

        public Criteria andEparam4EqualTo(Float value) {
            addCriterion("eparam4 =", value, "eparam4");
            return (Criteria) this;
        }

        public Criteria andEparam4NotEqualTo(Float value) {
            addCriterion("eparam4 <>", value, "eparam4");
            return (Criteria) this;
        }

        public Criteria andEparam4GreaterThan(Float value) {
            addCriterion("eparam4 >", value, "eparam4");
            return (Criteria) this;
        }

        public Criteria andEparam4GreaterThanOrEqualTo(Float value) {
            addCriterion("eparam4 >=", value, "eparam4");
            return (Criteria) this;
        }

        public Criteria andEparam4LessThan(Float value) {
            addCriterion("eparam4 <", value, "eparam4");
            return (Criteria) this;
        }

        public Criteria andEparam4LessThanOrEqualTo(Float value) {
            addCriterion("eparam4 <=", value, "eparam4");
            return (Criteria) this;
        }

        public Criteria andEparam4In(List<Float> values) {
            addCriterion("eparam4 in", values, "eparam4");
            return (Criteria) this;
        }

        public Criteria andEparam4NotIn(List<Float> values) {
            addCriterion("eparam4 not in", values, "eparam4");
            return (Criteria) this;
        }

        public Criteria andEparam4Between(Float value1, Float value2) {
            addCriterion("eparam4 between", value1, value2, "eparam4");
            return (Criteria) this;
        }

        public Criteria andEparam4NotBetween(Float value1, Float value2) {
            addCriterion("eparam4 not between", value1, value2, "eparam4");
            return (Criteria) this;
        }

        public Criteria andEparam5IsNull() {
            addCriterion("eparam5 is null");
            return (Criteria) this;
        }

        public Criteria andEparam5IsNotNull() {
            addCriterion("eparam5 is not null");
            return (Criteria) this;
        }

        public Criteria andEparam5EqualTo(Float value) {
            addCriterion("eparam5 =", value, "eparam5");
            return (Criteria) this;
        }

        public Criteria andEparam5NotEqualTo(Float value) {
            addCriterion("eparam5 <>", value, "eparam5");
            return (Criteria) this;
        }

        public Criteria andEparam5GreaterThan(Float value) {
            addCriterion("eparam5 >", value, "eparam5");
            return (Criteria) this;
        }

        public Criteria andEparam5GreaterThanOrEqualTo(Float value) {
            addCriterion("eparam5 >=", value, "eparam5");
            return (Criteria) this;
        }

        public Criteria andEparam5LessThan(Float value) {
            addCriterion("eparam5 <", value, "eparam5");
            return (Criteria) this;
        }

        public Criteria andEparam5LessThanOrEqualTo(Float value) {
            addCriterion("eparam5 <=", value, "eparam5");
            return (Criteria) this;
        }

        public Criteria andEparam5In(List<Float> values) {
            addCriterion("eparam5 in", values, "eparam5");
            return (Criteria) this;
        }

        public Criteria andEparam5NotIn(List<Float> values) {
            addCriterion("eparam5 not in", values, "eparam5");
            return (Criteria) this;
        }

        public Criteria andEparam5Between(Float value1, Float value2) {
            addCriterion("eparam5 between", value1, value2, "eparam5");
            return (Criteria) this;
        }

        public Criteria andEparam5NotBetween(Float value1, Float value2) {
            addCriterion("eparam5 not between", value1, value2, "eparam5");
            return (Criteria) this;
        }

        public Criteria andEparam6IsNull() {
            addCriterion("eparam6 is null");
            return (Criteria) this;
        }

        public Criteria andEparam6IsNotNull() {
            addCriterion("eparam6 is not null");
            return (Criteria) this;
        }

        public Criteria andEparam6EqualTo(Float value) {
            addCriterion("eparam6 =", value, "eparam6");
            return (Criteria) this;
        }

        public Criteria andEparam6NotEqualTo(Float value) {
            addCriterion("eparam6 <>", value, "eparam6");
            return (Criteria) this;
        }

        public Criteria andEparam6GreaterThan(Float value) {
            addCriterion("eparam6 >", value, "eparam6");
            return (Criteria) this;
        }

        public Criteria andEparam6GreaterThanOrEqualTo(Float value) {
            addCriterion("eparam6 >=", value, "eparam6");
            return (Criteria) this;
        }

        public Criteria andEparam6LessThan(Float value) {
            addCriterion("eparam6 <", value, "eparam6");
            return (Criteria) this;
        }

        public Criteria andEparam6LessThanOrEqualTo(Float value) {
            addCriterion("eparam6 <=", value, "eparam6");
            return (Criteria) this;
        }

        public Criteria andEparam6In(List<Float> values) {
            addCriterion("eparam6 in", values, "eparam6");
            return (Criteria) this;
        }

        public Criteria andEparam6NotIn(List<Float> values) {
            addCriterion("eparam6 not in", values, "eparam6");
            return (Criteria) this;
        }

        public Criteria andEparam6Between(Float value1, Float value2) {
            addCriterion("eparam6 between", value1, value2, "eparam6");
            return (Criteria) this;
        }

        public Criteria andEparam6NotBetween(Float value1, Float value2) {
            addCriterion("eparam6 not between", value1, value2, "eparam6");
            return (Criteria) this;
        }

        public Criteria andEparam7IsNull() {
            addCriterion("eparam7 is null");
            return (Criteria) this;
        }

        public Criteria andEparam7IsNotNull() {
            addCriterion("eparam7 is not null");
            return (Criteria) this;
        }

        public Criteria andEparam7EqualTo(Float value) {
            addCriterion("eparam7 =", value, "eparam7");
            return (Criteria) this;
        }

        public Criteria andEparam7NotEqualTo(Float value) {
            addCriterion("eparam7 <>", value, "eparam7");
            return (Criteria) this;
        }

        public Criteria andEparam7GreaterThan(Float value) {
            addCriterion("eparam7 >", value, "eparam7");
            return (Criteria) this;
        }

        public Criteria andEparam7GreaterThanOrEqualTo(Float value) {
            addCriterion("eparam7 >=", value, "eparam7");
            return (Criteria) this;
        }

        public Criteria andEparam7LessThan(Float value) {
            addCriterion("eparam7 <", value, "eparam7");
            return (Criteria) this;
        }

        public Criteria andEparam7LessThanOrEqualTo(Float value) {
            addCriterion("eparam7 <=", value, "eparam7");
            return (Criteria) this;
        }

        public Criteria andEparam7In(List<Float> values) {
            addCriterion("eparam7 in", values, "eparam7");
            return (Criteria) this;
        }

        public Criteria andEparam7NotIn(List<Float> values) {
            addCriterion("eparam7 not in", values, "eparam7");
            return (Criteria) this;
        }

        public Criteria andEparam7Between(Float value1, Float value2) {
            addCriterion("eparam7 between", value1, value2, "eparam7");
            return (Criteria) this;
        }

        public Criteria andEparam7NotBetween(Float value1, Float value2) {
            addCriterion("eparam7 not between", value1, value2, "eparam7");
            return (Criteria) this;
        }

        public Criteria andEstate1IsNull() {
            addCriterion("estate1 is null");
            return (Criteria) this;
        }

        public Criteria andEstate1IsNotNull() {
            addCriterion("estate1 is not null");
            return (Criteria) this;
        }

        public Criteria andEstate1EqualTo(String value) {
            addCriterion("estate1 =", value, "estate1");
            return (Criteria) this;
        }

        public Criteria andEstate1NotEqualTo(String value) {
            addCriterion("estate1 <>", value, "estate1");
            return (Criteria) this;
        }

        public Criteria andEstate1GreaterThan(String value) {
            addCriterion("estate1 >", value, "estate1");
            return (Criteria) this;
        }

        public Criteria andEstate1GreaterThanOrEqualTo(String value) {
            addCriterion("estate1 >=", value, "estate1");
            return (Criteria) this;
        }

        public Criteria andEstate1LessThan(String value) {
            addCriterion("estate1 <", value, "estate1");
            return (Criteria) this;
        }

        public Criteria andEstate1LessThanOrEqualTo(String value) {
            addCriterion("estate1 <=", value, "estate1");
            return (Criteria) this;
        }

        public Criteria andEstate1Like(String value) {
            addCriterion("estate1 like", value, "estate1");
            return (Criteria) this;
        }

        public Criteria andEstate1NotLike(String value) {
            addCriterion("estate1 not like", value, "estate1");
            return (Criteria) this;
        }

        public Criteria andEstate1In(List<String> values) {
            addCriterion("estate1 in", values, "estate1");
            return (Criteria) this;
        }

        public Criteria andEstate1NotIn(List<String> values) {
            addCriterion("estate1 not in", values, "estate1");
            return (Criteria) this;
        }

        public Criteria andEstate1Between(String value1, String value2) {
            addCriterion("estate1 between", value1, value2, "estate1");
            return (Criteria) this;
        }

        public Criteria andEstate1NotBetween(String value1, String value2) {
            addCriterion("estate1 not between", value1, value2, "estate1");
            return (Criteria) this;
        }

        public Criteria andEstate2IsNull() {
            addCriterion("estate2 is null");
            return (Criteria) this;
        }

        public Criteria andEstate2IsNotNull() {
            addCriterion("estate2 is not null");
            return (Criteria) this;
        }

        public Criteria andEstate2EqualTo(String value) {
            addCriterion("estate2 =", value, "estate2");
            return (Criteria) this;
        }

        public Criteria andEstate2NotEqualTo(String value) {
            addCriterion("estate2 <>", value, "estate2");
            return (Criteria) this;
        }

        public Criteria andEstate2GreaterThan(String value) {
            addCriterion("estate2 >", value, "estate2");
            return (Criteria) this;
        }

        public Criteria andEstate2GreaterThanOrEqualTo(String value) {
            addCriterion("estate2 >=", value, "estate2");
            return (Criteria) this;
        }

        public Criteria andEstate2LessThan(String value) {
            addCriterion("estate2 <", value, "estate2");
            return (Criteria) this;
        }

        public Criteria andEstate2LessThanOrEqualTo(String value) {
            addCriterion("estate2 <=", value, "estate2");
            return (Criteria) this;
        }

        public Criteria andEstate2Like(String value) {
            addCriterion("estate2 like", value, "estate2");
            return (Criteria) this;
        }

        public Criteria andEstate2NotLike(String value) {
            addCriterion("estate2 not like", value, "estate2");
            return (Criteria) this;
        }

        public Criteria andEstate2In(List<String> values) {
            addCriterion("estate2 in", values, "estate2");
            return (Criteria) this;
        }

        public Criteria andEstate2NotIn(List<String> values) {
            addCriterion("estate2 not in", values, "estate2");
            return (Criteria) this;
        }

        public Criteria andEstate2Between(String value1, String value2) {
            addCriterion("estate2 between", value1, value2, "estate2");
            return (Criteria) this;
        }

        public Criteria andEstate2NotBetween(String value1, String value2) {
            addCriterion("estate2 not between", value1, value2, "estate2");
            return (Criteria) this;
        }

        public Criteria andEstate3IsNull() {
            addCriterion("estate3 is null");
            return (Criteria) this;
        }

        public Criteria andEstate3IsNotNull() {
            addCriterion("estate3 is not null");
            return (Criteria) this;
        }

        public Criteria andEstate3EqualTo(String value) {
            addCriterion("estate3 =", value, "estate3");
            return (Criteria) this;
        }

        public Criteria andEstate3NotEqualTo(String value) {
            addCriterion("estate3 <>", value, "estate3");
            return (Criteria) this;
        }

        public Criteria andEstate3GreaterThan(String value) {
            addCriterion("estate3 >", value, "estate3");
            return (Criteria) this;
        }

        public Criteria andEstate3GreaterThanOrEqualTo(String value) {
            addCriterion("estate3 >=", value, "estate3");
            return (Criteria) this;
        }

        public Criteria andEstate3LessThan(String value) {
            addCriterion("estate3 <", value, "estate3");
            return (Criteria) this;
        }

        public Criteria andEstate3LessThanOrEqualTo(String value) {
            addCriterion("estate3 <=", value, "estate3");
            return (Criteria) this;
        }

        public Criteria andEstate3Like(String value) {
            addCriterion("estate3 like", value, "estate3");
            return (Criteria) this;
        }

        public Criteria andEstate3NotLike(String value) {
            addCriterion("estate3 not like", value, "estate3");
            return (Criteria) this;
        }

        public Criteria andEstate3In(List<String> values) {
            addCriterion("estate3 in", values, "estate3");
            return (Criteria) this;
        }

        public Criteria andEstate3NotIn(List<String> values) {
            addCriterion("estate3 not in", values, "estate3");
            return (Criteria) this;
        }

        public Criteria andEstate3Between(String value1, String value2) {
            addCriterion("estate3 between", value1, value2, "estate3");
            return (Criteria) this;
        }

        public Criteria andEstate3NotBetween(String value1, String value2) {
            addCriterion("estate3 not between", value1, value2, "estate3");
            return (Criteria) this;
        }

        public Criteria andEquipicIsNull() {
            addCriterion("equiPic is null");
            return (Criteria) this;
        }

        public Criteria andEquipicIsNotNull() {
            addCriterion("equiPic is not null");
            return (Criteria) this;
        }

        public Criteria andEquipicEqualTo(String value) {
            addCriterion("equiPic =", value, "equipic");
            return (Criteria) this;
        }

        public Criteria andEquipicNotEqualTo(String value) {
            addCriterion("equiPic <>", value, "equipic");
            return (Criteria) this;
        }

        public Criteria andEquipicGreaterThan(String value) {
            addCriterion("equiPic >", value, "equipic");
            return (Criteria) this;
        }

        public Criteria andEquipicGreaterThanOrEqualTo(String value) {
            addCriterion("equiPic >=", value, "equipic");
            return (Criteria) this;
        }

        public Criteria andEquipicLessThan(String value) {
            addCriterion("equiPic <", value, "equipic");
            return (Criteria) this;
        }

        public Criteria andEquipicLessThanOrEqualTo(String value) {
            addCriterion("equiPic <=", value, "equipic");
            return (Criteria) this;
        }

        public Criteria andEquipicLike(String value) {
            addCriterion("equiPic like", value, "equipic");
            return (Criteria) this;
        }

        public Criteria andEquipicNotLike(String value) {
            addCriterion("equiPic not like", value, "equipic");
            return (Criteria) this;
        }

        public Criteria andEquipicIn(List<String> values) {
            addCriterion("equiPic in", values, "equipic");
            return (Criteria) this;
        }

        public Criteria andEquipicNotIn(List<String> values) {
            addCriterion("equiPic not in", values, "equipic");
            return (Criteria) this;
        }

        public Criteria andEquipicBetween(String value1, String value2) {
            addCriterion("equiPic between", value1, value2, "equipic");
            return (Criteria) this;
        }

        public Criteria andEquipicNotBetween(String value1, String value2) {
            addCriterion("equiPic not between", value1, value2, "equipic");
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