package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class EmpsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmpsExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andJnameIsNull() {
            addCriterion("jname is null");
            return (Criteria) this;
        }

        public Criteria andJnameIsNotNull() {
            addCriterion("jname is not null");
            return (Criteria) this;
        }

        public Criteria andJnameEqualTo(String value) {
            addCriterion("jname =", value, "jname");
            return (Criteria) this;
        }

        public Criteria andJnameNotEqualTo(String value) {
            addCriterion("jname <>", value, "jname");
            return (Criteria) this;
        }

        public Criteria andJnameGreaterThan(String value) {
            addCriterion("jname >", value, "jname");
            return (Criteria) this;
        }

        public Criteria andJnameGreaterThanOrEqualTo(String value) {
            addCriterion("jname >=", value, "jname");
            return (Criteria) this;
        }

        public Criteria andJnameLessThan(String value) {
            addCriterion("jname <", value, "jname");
            return (Criteria) this;
        }

        public Criteria andJnameLessThanOrEqualTo(String value) {
            addCriterion("jname <=", value, "jname");
            return (Criteria) this;
        }

        public Criteria andJnameLike(String value) {
            addCriterion("jname like", value, "jname");
            return (Criteria) this;
        }

        public Criteria andJnameNotLike(String value) {
            addCriterion("jname not like", value, "jname");
            return (Criteria) this;
        }

        public Criteria andJnameIn(List<String> values) {
            addCriterion("jname in", values, "jname");
            return (Criteria) this;
        }

        public Criteria andJnameNotIn(List<String> values) {
            addCriterion("jname not in", values, "jname");
            return (Criteria) this;
        }

        public Criteria andJnameBetween(String value1, String value2) {
            addCriterion("jname between", value1, value2, "jname");
            return (Criteria) this;
        }

        public Criteria andJnameNotBetween(String value1, String value2) {
            addCriterion("jname not between", value1, value2, "jname");
            return (Criteria) this;
        }

        public Criteria andZnameIsNull() {
            addCriterion("zname is null");
            return (Criteria) this;
        }

        public Criteria andZnameIsNotNull() {
            addCriterion("zname is not null");
            return (Criteria) this;
        }

        public Criteria andZnameEqualTo(String value) {
            addCriterion("zname =", value, "zname");
            return (Criteria) this;
        }

        public Criteria andZnameNotEqualTo(String value) {
            addCriterion("zname <>", value, "zname");
            return (Criteria) this;
        }

        public Criteria andZnameGreaterThan(String value) {
            addCriterion("zname >", value, "zname");
            return (Criteria) this;
        }

        public Criteria andZnameGreaterThanOrEqualTo(String value) {
            addCriterion("zname >=", value, "zname");
            return (Criteria) this;
        }

        public Criteria andZnameLessThan(String value) {
            addCriterion("zname <", value, "zname");
            return (Criteria) this;
        }

        public Criteria andZnameLessThanOrEqualTo(String value) {
            addCriterion("zname <=", value, "zname");
            return (Criteria) this;
        }

        public Criteria andZnameLike(String value) {
            addCriterion("zname like", value, "zname");
            return (Criteria) this;
        }

        public Criteria andZnameNotLike(String value) {
            addCriterion("zname not like", value, "zname");
            return (Criteria) this;
        }

        public Criteria andZnameIn(List<String> values) {
            addCriterion("zname in", values, "zname");
            return (Criteria) this;
        }

        public Criteria andZnameNotIn(List<String> values) {
            addCriterion("zname not in", values, "zname");
            return (Criteria) this;
        }

        public Criteria andZnameBetween(String value1, String value2) {
            addCriterion("zname between", value1, value2, "zname");
            return (Criteria) this;
        }

        public Criteria andZnameNotBetween(String value1, String value2) {
            addCriterion("zname not between", value1, value2, "zname");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andAdressIsNull() {
            addCriterion("adress is null");
            return (Criteria) this;
        }

        public Criteria andAdressIsNotNull() {
            addCriterion("adress is not null");
            return (Criteria) this;
        }

        public Criteria andAdressEqualTo(String value) {
            addCriterion("adress =", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressNotEqualTo(String value) {
            addCriterion("adress <>", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressGreaterThan(String value) {
            addCriterion("adress >", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressGreaterThanOrEqualTo(String value) {
            addCriterion("adress >=", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressLessThan(String value) {
            addCriterion("adress <", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressLessThanOrEqualTo(String value) {
            addCriterion("adress <=", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressLike(String value) {
            addCriterion("adress like", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressNotLike(String value) {
            addCriterion("adress not like", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressIn(List<String> values) {
            addCriterion("adress in", values, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressNotIn(List<String> values) {
            addCriterion("adress not in", values, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressBetween(String value1, String value2) {
            addCriterion("adress between", value1, value2, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressNotBetween(String value1, String value2) {
            addCriterion("adress not between", value1, value2, "adress");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("idCard is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("idCard is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(Integer value) {
            addCriterion("idCard =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(Integer value) {
            addCriterion("idCard <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(Integer value) {
            addCriterion("idCard >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(Integer value) {
            addCriterion("idCard >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(Integer value) {
            addCriterion("idCard <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(Integer value) {
            addCriterion("idCard <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<Integer> values) {
            addCriterion("idCard in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<Integer> values) {
            addCriterion("idCard not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(Integer value1, Integer value2) {
            addCriterion("idCard between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(Integer value1, Integer value2) {
            addCriterion("idCard not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andJkzkIsNull() {
            addCriterion("jkzk is null");
            return (Criteria) this;
        }

        public Criteria andJkzkIsNotNull() {
            addCriterion("jkzk is not null");
            return (Criteria) this;
        }

        public Criteria andJkzkEqualTo(String value) {
            addCriterion("jkzk =", value, "jkzk");
            return (Criteria) this;
        }

        public Criteria andJkzkNotEqualTo(String value) {
            addCriterion("jkzk <>", value, "jkzk");
            return (Criteria) this;
        }

        public Criteria andJkzkGreaterThan(String value) {
            addCriterion("jkzk >", value, "jkzk");
            return (Criteria) this;
        }

        public Criteria andJkzkGreaterThanOrEqualTo(String value) {
            addCriterion("jkzk >=", value, "jkzk");
            return (Criteria) this;
        }

        public Criteria andJkzkLessThan(String value) {
            addCriterion("jkzk <", value, "jkzk");
            return (Criteria) this;
        }

        public Criteria andJkzkLessThanOrEqualTo(String value) {
            addCriterion("jkzk <=", value, "jkzk");
            return (Criteria) this;
        }

        public Criteria andJkzkLike(String value) {
            addCriterion("jkzk like", value, "jkzk");
            return (Criteria) this;
        }

        public Criteria andJkzkNotLike(String value) {
            addCriterion("jkzk not like", value, "jkzk");
            return (Criteria) this;
        }

        public Criteria andJkzkIn(List<String> values) {
            addCriterion("jkzk in", values, "jkzk");
            return (Criteria) this;
        }

        public Criteria andJkzkNotIn(List<String> values) {
            addCriterion("jkzk not in", values, "jkzk");
            return (Criteria) this;
        }

        public Criteria andJkzkBetween(String value1, String value2) {
            addCriterion("jkzk between", value1, value2, "jkzk");
            return (Criteria) this;
        }

        public Criteria andJkzkNotBetween(String value1, String value2) {
            addCriterion("jkzk not between", value1, value2, "jkzk");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(String value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(String value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(String value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(String value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(String value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(String value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLike(String value) {
            addCriterion("date like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotLike(String value) {
            addCriterion("date not like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<String> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<String> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(String value1, String value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(String value1, String value2) {
            addCriterion("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andMzIsNull() {
            addCriterion("mz is null");
            return (Criteria) this;
        }

        public Criteria andMzIsNotNull() {
            addCriterion("mz is not null");
            return (Criteria) this;
        }

        public Criteria andMzEqualTo(String value) {
            addCriterion("mz =", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzNotEqualTo(String value) {
            addCriterion("mz <>", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzGreaterThan(String value) {
            addCriterion("mz >", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzGreaterThanOrEqualTo(String value) {
            addCriterion("mz >=", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzLessThan(String value) {
            addCriterion("mz <", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzLessThanOrEqualTo(String value) {
            addCriterion("mz <=", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzLike(String value) {
            addCriterion("mz like", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzNotLike(String value) {
            addCriterion("mz not like", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzIn(List<String> values) {
            addCriterion("mz in", values, "mz");
            return (Criteria) this;
        }

        public Criteria andMzNotIn(List<String> values) {
            addCriterion("mz not in", values, "mz");
            return (Criteria) this;
        }

        public Criteria andMzBetween(String value1, String value2) {
            addCriterion("mz between", value1, value2, "mz");
            return (Criteria) this;
        }

        public Criteria andMzNotBetween(String value1, String value2) {
            addCriterion("mz not between", value1, value2, "mz");
            return (Criteria) this;
        }

        public Criteria andZzmmIsNull() {
            addCriterion("zzmm is null");
            return (Criteria) this;
        }

        public Criteria andZzmmIsNotNull() {
            addCriterion("zzmm is not null");
            return (Criteria) this;
        }

        public Criteria andZzmmEqualTo(String value) {
            addCriterion("zzmm =", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmNotEqualTo(String value) {
            addCriterion("zzmm <>", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmGreaterThan(String value) {
            addCriterion("zzmm >", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmGreaterThanOrEqualTo(String value) {
            addCriterion("zzmm >=", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmLessThan(String value) {
            addCriterion("zzmm <", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmLessThanOrEqualTo(String value) {
            addCriterion("zzmm <=", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmLike(String value) {
            addCriterion("zzmm like", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmNotLike(String value) {
            addCriterion("zzmm not like", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmIn(List<String> values) {
            addCriterion("zzmm in", values, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmNotIn(List<String> values) {
            addCriterion("zzmm not in", values, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmBetween(String value1, String value2) {
            addCriterion("zzmm between", value1, value2, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmNotBetween(String value1, String value2) {
            addCriterion("zzmm not between", value1, value2, "zzmm");
            return (Criteria) this;
        }

        public Criteria andXqahIsNull() {
            addCriterion("xqah is null");
            return (Criteria) this;
        }

        public Criteria andXqahIsNotNull() {
            addCriterion("xqah is not null");
            return (Criteria) this;
        }

        public Criteria andXqahEqualTo(String value) {
            addCriterion("xqah =", value, "xqah");
            return (Criteria) this;
        }

        public Criteria andXqahNotEqualTo(String value) {
            addCriterion("xqah <>", value, "xqah");
            return (Criteria) this;
        }

        public Criteria andXqahGreaterThan(String value) {
            addCriterion("xqah >", value, "xqah");
            return (Criteria) this;
        }

        public Criteria andXqahGreaterThanOrEqualTo(String value) {
            addCriterion("xqah >=", value, "xqah");
            return (Criteria) this;
        }

        public Criteria andXqahLessThan(String value) {
            addCriterion("xqah <", value, "xqah");
            return (Criteria) this;
        }

        public Criteria andXqahLessThanOrEqualTo(String value) {
            addCriterion("xqah <=", value, "xqah");
            return (Criteria) this;
        }

        public Criteria andXqahLike(String value) {
            addCriterion("xqah like", value, "xqah");
            return (Criteria) this;
        }

        public Criteria andXqahNotLike(String value) {
            addCriterion("xqah not like", value, "xqah");
            return (Criteria) this;
        }

        public Criteria andXqahIn(List<String> values) {
            addCriterion("xqah in", values, "xqah");
            return (Criteria) this;
        }

        public Criteria andXqahNotIn(List<String> values) {
            addCriterion("xqah not in", values, "xqah");
            return (Criteria) this;
        }

        public Criteria andXqahBetween(String value1, String value2) {
            addCriterion("xqah between", value1, value2, "xqah");
            return (Criteria) this;
        }

        public Criteria andXqahNotBetween(String value1, String value2) {
            addCriterion("xqah not between", value1, value2, "xqah");
            return (Criteria) this;
        }

        public Criteria andJgIsNull() {
            addCriterion("jg is null");
            return (Criteria) this;
        }

        public Criteria andJgIsNotNull() {
            addCriterion("jg is not null");
            return (Criteria) this;
        }

        public Criteria andJgEqualTo(String value) {
            addCriterion("jg =", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgNotEqualTo(String value) {
            addCriterion("jg <>", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgGreaterThan(String value) {
            addCriterion("jg >", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgGreaterThanOrEqualTo(String value) {
            addCriterion("jg >=", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgLessThan(String value) {
            addCriterion("jg <", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgLessThanOrEqualTo(String value) {
            addCriterion("jg <=", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgLike(String value) {
            addCriterion("jg like", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgNotLike(String value) {
            addCriterion("jg not like", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgIn(List<String> values) {
            addCriterion("jg in", values, "jg");
            return (Criteria) this;
        }

        public Criteria andJgNotIn(List<String> values) {
            addCriterion("jg not in", values, "jg");
            return (Criteria) this;
        }

        public Criteria andJgBetween(String value1, String value2) {
            addCriterion("jg between", value1, value2, "jg");
            return (Criteria) this;
        }

        public Criteria andJgNotBetween(String value1, String value2) {
            addCriterion("jg not between", value1, value2, "jg");
            return (Criteria) this;
        }

        public Criteria andHjxzIsNull() {
            addCriterion("hjxz is null");
            return (Criteria) this;
        }

        public Criteria andHjxzIsNotNull() {
            addCriterion("hjxz is not null");
            return (Criteria) this;
        }

        public Criteria andHjxzEqualTo(String value) {
            addCriterion("hjxz =", value, "hjxz");
            return (Criteria) this;
        }

        public Criteria andHjxzNotEqualTo(String value) {
            addCriterion("hjxz <>", value, "hjxz");
            return (Criteria) this;
        }

        public Criteria andHjxzGreaterThan(String value) {
            addCriterion("hjxz >", value, "hjxz");
            return (Criteria) this;
        }

        public Criteria andHjxzGreaterThanOrEqualTo(String value) {
            addCriterion("hjxz >=", value, "hjxz");
            return (Criteria) this;
        }

        public Criteria andHjxzLessThan(String value) {
            addCriterion("hjxz <", value, "hjxz");
            return (Criteria) this;
        }

        public Criteria andHjxzLessThanOrEqualTo(String value) {
            addCriterion("hjxz <=", value, "hjxz");
            return (Criteria) this;
        }

        public Criteria andHjxzLike(String value) {
            addCriterion("hjxz like", value, "hjxz");
            return (Criteria) this;
        }

        public Criteria andHjxzNotLike(String value) {
            addCriterion("hjxz not like", value, "hjxz");
            return (Criteria) this;
        }

        public Criteria andHjxzIn(List<String> values) {
            addCriterion("hjxz in", values, "hjxz");
            return (Criteria) this;
        }

        public Criteria andHjxzNotIn(List<String> values) {
            addCriterion("hjxz not in", values, "hjxz");
            return (Criteria) this;
        }

        public Criteria andHjxzBetween(String value1, String value2) {
            addCriterion("hjxz between", value1, value2, "hjxz");
            return (Criteria) this;
        }

        public Criteria andHjxzNotBetween(String value1, String value2) {
            addCriterion("hjxz not between", value1, value2, "hjxz");
            return (Criteria) this;
        }

        public Criteria andHomeadressIsNull() {
            addCriterion("homeAdress is null");
            return (Criteria) this;
        }

        public Criteria andHomeadressIsNotNull() {
            addCriterion("homeAdress is not null");
            return (Criteria) this;
        }

        public Criteria andHomeadressEqualTo(String value) {
            addCriterion("homeAdress =", value, "homeadress");
            return (Criteria) this;
        }

        public Criteria andHomeadressNotEqualTo(String value) {
            addCriterion("homeAdress <>", value, "homeadress");
            return (Criteria) this;
        }

        public Criteria andHomeadressGreaterThan(String value) {
            addCriterion("homeAdress >", value, "homeadress");
            return (Criteria) this;
        }

        public Criteria andHomeadressGreaterThanOrEqualTo(String value) {
            addCriterion("homeAdress >=", value, "homeadress");
            return (Criteria) this;
        }

        public Criteria andHomeadressLessThan(String value) {
            addCriterion("homeAdress <", value, "homeadress");
            return (Criteria) this;
        }

        public Criteria andHomeadressLessThanOrEqualTo(String value) {
            addCriterion("homeAdress <=", value, "homeadress");
            return (Criteria) this;
        }

        public Criteria andHomeadressLike(String value) {
            addCriterion("homeAdress like", value, "homeadress");
            return (Criteria) this;
        }

        public Criteria andHomeadressNotLike(String value) {
            addCriterion("homeAdress not like", value, "homeadress");
            return (Criteria) this;
        }

        public Criteria andHomeadressIn(List<String> values) {
            addCriterion("homeAdress in", values, "homeadress");
            return (Criteria) this;
        }

        public Criteria andHomeadressNotIn(List<String> values) {
            addCriterion("homeAdress not in", values, "homeadress");
            return (Criteria) this;
        }

        public Criteria andHomeadressBetween(String value1, String value2) {
            addCriterion("homeAdress between", value1, value2, "homeadress");
            return (Criteria) this;
        }

        public Criteria andHomeadressNotBetween(String value1, String value2) {
            addCriterion("homeAdress not between", value1, value2, "homeadress");
            return (Criteria) this;
        }

        public Criteria andRdateIsNull() {
            addCriterion("rdate is null");
            return (Criteria) this;
        }

        public Criteria andRdateIsNotNull() {
            addCriterion("rdate is not null");
            return (Criteria) this;
        }

        public Criteria andRdateEqualTo(String value) {
            addCriterion("rdate =", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateNotEqualTo(String value) {
            addCriterion("rdate <>", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateGreaterThan(String value) {
            addCriterion("rdate >", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateGreaterThanOrEqualTo(String value) {
            addCriterion("rdate >=", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateLessThan(String value) {
            addCriterion("rdate <", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateLessThanOrEqualTo(String value) {
            addCriterion("rdate <=", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateLike(String value) {
            addCriterion("rdate like", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateNotLike(String value) {
            addCriterion("rdate not like", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateIn(List<String> values) {
            addCriterion("rdate in", values, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateNotIn(List<String> values) {
            addCriterion("rdate not in", values, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateBetween(String value1, String value2) {
            addCriterion("rdate between", value1, value2, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateNotBetween(String value1, String value2) {
            addCriterion("rdate not between", value1, value2, "rdate");
            return (Criteria) this;
        }

        public Criteria andGznsIsNull() {
            addCriterion("gzns is null");
            return (Criteria) this;
        }

        public Criteria andGznsIsNotNull() {
            addCriterion("gzns is not null");
            return (Criteria) this;
        }

        public Criteria andGznsEqualTo(Integer value) {
            addCriterion("gzns =", value, "gzns");
            return (Criteria) this;
        }

        public Criteria andGznsNotEqualTo(Integer value) {
            addCriterion("gzns <>", value, "gzns");
            return (Criteria) this;
        }

        public Criteria andGznsGreaterThan(Integer value) {
            addCriterion("gzns >", value, "gzns");
            return (Criteria) this;
        }

        public Criteria andGznsGreaterThanOrEqualTo(Integer value) {
            addCriterion("gzns >=", value, "gzns");
            return (Criteria) this;
        }

        public Criteria andGznsLessThan(Integer value) {
            addCriterion("gzns <", value, "gzns");
            return (Criteria) this;
        }

        public Criteria andGznsLessThanOrEqualTo(Integer value) {
            addCriterion("gzns <=", value, "gzns");
            return (Criteria) this;
        }

        public Criteria andGznsIn(List<Integer> values) {
            addCriterion("gzns in", values, "gzns");
            return (Criteria) this;
        }

        public Criteria andGznsNotIn(List<Integer> values) {
            addCriterion("gzns not in", values, "gzns");
            return (Criteria) this;
        }

        public Criteria andGznsBetween(Integer value1, Integer value2) {
            addCriterion("gzns between", value1, value2, "gzns");
            return (Criteria) this;
        }

        public Criteria andGznsNotBetween(Integer value1, Integer value2) {
            addCriterion("gzns not between", value1, value2, "gzns");
            return (Criteria) this;
        }

        public Criteria andSdateIsNull() {
            addCriterion("sdate is null");
            return (Criteria) this;
        }

        public Criteria andSdateIsNotNull() {
            addCriterion("sdate is not null");
            return (Criteria) this;
        }

        public Criteria andSdateEqualTo(Integer value) {
            addCriterion("sdate =", value, "sdate");
            return (Criteria) this;
        }

        public Criteria andSdateNotEqualTo(Integer value) {
            addCriterion("sdate <>", value, "sdate");
            return (Criteria) this;
        }

        public Criteria andSdateGreaterThan(Integer value) {
            addCriterion("sdate >", value, "sdate");
            return (Criteria) this;
        }

        public Criteria andSdateGreaterThanOrEqualTo(Integer value) {
            addCriterion("sdate >=", value, "sdate");
            return (Criteria) this;
        }

        public Criteria andSdateLessThan(Integer value) {
            addCriterion("sdate <", value, "sdate");
            return (Criteria) this;
        }

        public Criteria andSdateLessThanOrEqualTo(Integer value) {
            addCriterion("sdate <=", value, "sdate");
            return (Criteria) this;
        }

        public Criteria andSdateIn(List<Integer> values) {
            addCriterion("sdate in", values, "sdate");
            return (Criteria) this;
        }

        public Criteria andSdateNotIn(List<Integer> values) {
            addCriterion("sdate not in", values, "sdate");
            return (Criteria) this;
        }

        public Criteria andSdateBetween(Integer value1, Integer value2) {
            addCriterion("sdate between", value1, value2, "sdate");
            return (Criteria) this;
        }

        public Criteria andSdateNotBetween(Integer value1, Integer value2) {
            addCriterion("sdate not between", value1, value2, "sdate");
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