package com.openthinks.svm.core.model;

import java.util.ArrayList;
import java.util.List;

public class BizMetaProductlineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BizMetaProductlineExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("category like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("category not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andPrjIdIsNull() {
            addCriterion("prj_id is null");
            return (Criteria) this;
        }

        public Criteria andPrjIdIsNotNull() {
            addCriterion("prj_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrjIdEqualTo(String value) {
            addCriterion("prj_id =", value, "prjId");
            return (Criteria) this;
        }

        public Criteria andPrjIdNotEqualTo(String value) {
            addCriterion("prj_id <>", value, "prjId");
            return (Criteria) this;
        }

        public Criteria andPrjIdGreaterThan(String value) {
            addCriterion("prj_id >", value, "prjId");
            return (Criteria) this;
        }

        public Criteria andPrjIdGreaterThanOrEqualTo(String value) {
            addCriterion("prj_id >=", value, "prjId");
            return (Criteria) this;
        }

        public Criteria andPrjIdLessThan(String value) {
            addCriterion("prj_id <", value, "prjId");
            return (Criteria) this;
        }

        public Criteria andPrjIdLessThanOrEqualTo(String value) {
            addCriterion("prj_id <=", value, "prjId");
            return (Criteria) this;
        }

        public Criteria andPrjIdLike(String value) {
            addCriterion("prj_id like", value, "prjId");
            return (Criteria) this;
        }

        public Criteria andPrjIdNotLike(String value) {
            addCriterion("prj_id not like", value, "prjId");
            return (Criteria) this;
        }

        public Criteria andPrjIdIn(List<String> values) {
            addCriterion("prj_id in", values, "prjId");
            return (Criteria) this;
        }

        public Criteria andPrjIdNotIn(List<String> values) {
            addCriterion("prj_id not in", values, "prjId");
            return (Criteria) this;
        }

        public Criteria andPrjIdBetween(String value1, String value2) {
            addCriterion("prj_id between", value1, value2, "prjId");
            return (Criteria) this;
        }

        public Criteria andPrjIdNotBetween(String value1, String value2) {
            addCriterion("prj_id not between", value1, value2, "prjId");
            return (Criteria) this;
        }

        public Criteria andPlIdIsNull() {
            addCriterion("pl_id is null");
            return (Criteria) this;
        }

        public Criteria andPlIdIsNotNull() {
            addCriterion("pl_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlIdEqualTo(String value) {
            addCriterion("pl_id =", value, "plId");
            return (Criteria) this;
        }

        public Criteria andPlIdNotEqualTo(String value) {
            addCriterion("pl_id <>", value, "plId");
            return (Criteria) this;
        }

        public Criteria andPlIdGreaterThan(String value) {
            addCriterion("pl_id >", value, "plId");
            return (Criteria) this;
        }

        public Criteria andPlIdGreaterThanOrEqualTo(String value) {
            addCriterion("pl_id >=", value, "plId");
            return (Criteria) this;
        }

        public Criteria andPlIdLessThan(String value) {
            addCriterion("pl_id <", value, "plId");
            return (Criteria) this;
        }

        public Criteria andPlIdLessThanOrEqualTo(String value) {
            addCriterion("pl_id <=", value, "plId");
            return (Criteria) this;
        }

        public Criteria andPlIdLike(String value) {
            addCriterion("pl_id like", value, "plId");
            return (Criteria) this;
        }

        public Criteria andPlIdNotLike(String value) {
            addCriterion("pl_id not like", value, "plId");
            return (Criteria) this;
        }

        public Criteria andPlIdIn(List<String> values) {
            addCriterion("pl_id in", values, "plId");
            return (Criteria) this;
        }

        public Criteria andPlIdNotIn(List<String> values) {
            addCriterion("pl_id not in", values, "plId");
            return (Criteria) this;
        }

        public Criteria andPlIdBetween(String value1, String value2) {
            addCriterion("pl_id between", value1, value2, "plId");
            return (Criteria) this;
        }

        public Criteria andPlIdNotBetween(String value1, String value2) {
            addCriterion("pl_id not between", value1, value2, "plId");
            return (Criteria) this;
        }

        public Criteria andPlNameIsNull() {
            addCriterion("pl_name is null");
            return (Criteria) this;
        }

        public Criteria andPlNameIsNotNull() {
            addCriterion("pl_name is not null");
            return (Criteria) this;
        }

        public Criteria andPlNameEqualTo(String value) {
            addCriterion("pl_name =", value, "plName");
            return (Criteria) this;
        }

        public Criteria andPlNameNotEqualTo(String value) {
            addCriterion("pl_name <>", value, "plName");
            return (Criteria) this;
        }

        public Criteria andPlNameGreaterThan(String value) {
            addCriterion("pl_name >", value, "plName");
            return (Criteria) this;
        }

        public Criteria andPlNameGreaterThanOrEqualTo(String value) {
            addCriterion("pl_name >=", value, "plName");
            return (Criteria) this;
        }

        public Criteria andPlNameLessThan(String value) {
            addCriterion("pl_name <", value, "plName");
            return (Criteria) this;
        }

        public Criteria andPlNameLessThanOrEqualTo(String value) {
            addCriterion("pl_name <=", value, "plName");
            return (Criteria) this;
        }

        public Criteria andPlNameLike(String value) {
            addCriterion("pl_name like", value, "plName");
            return (Criteria) this;
        }

        public Criteria andPlNameNotLike(String value) {
            addCriterion("pl_name not like", value, "plName");
            return (Criteria) this;
        }

        public Criteria andPlNameIn(List<String> values) {
            addCriterion("pl_name in", values, "plName");
            return (Criteria) this;
        }

        public Criteria andPlNameNotIn(List<String> values) {
            addCriterion("pl_name not in", values, "plName");
            return (Criteria) this;
        }

        public Criteria andPlNameBetween(String value1, String value2) {
            addCriterion("pl_name between", value1, value2, "plName");
            return (Criteria) this;
        }

        public Criteria andPlNameNotBetween(String value1, String value2) {
            addCriterion("pl_name not between", value1, value2, "plName");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andGenericSubquery(String subQueryClause) {
            addCriterion(subQueryClause);
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