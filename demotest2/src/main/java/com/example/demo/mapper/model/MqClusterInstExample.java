package com.example.demo.mapper.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MqClusterInstExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MqClusterInstExample() {
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

        public Criteria andClusterNameIsNull() {
            addCriterion("cluster_name is null");
            return (Criteria) this;
        }

        public Criteria andClusterNameIsNotNull() {
            addCriterion("cluster_name is not null");
            return (Criteria) this;
        }

        public Criteria andClusterNameEqualTo(String value) {
            addCriterion("cluster_name =", value, "clusterName");
            return (Criteria) this;
        }

        public Criteria andClusterNameNotEqualTo(String value) {
            addCriterion("cluster_name <>", value, "clusterName");
            return (Criteria) this;
        }

        public Criteria andClusterNameGreaterThan(String value) {
            addCriterion("cluster_name >", value, "clusterName");
            return (Criteria) this;
        }

        public Criteria andClusterNameGreaterThanOrEqualTo(String value) {
            addCriterion("cluster_name >=", value, "clusterName");
            return (Criteria) this;
        }

        public Criteria andClusterNameLessThan(String value) {
            addCriterion("cluster_name <", value, "clusterName");
            return (Criteria) this;
        }

        public Criteria andClusterNameLessThanOrEqualTo(String value) {
            addCriterion("cluster_name <=", value, "clusterName");
            return (Criteria) this;
        }

        public Criteria andClusterNameLike(String value) {
            addCriterion("cluster_name like", value, "clusterName");
            return (Criteria) this;
        }

        public Criteria andClusterNameNotLike(String value) {
            addCriterion("cluster_name not like", value, "clusterName");
            return (Criteria) this;
        }

        public Criteria andClusterNameIn(List<String> values) {
            addCriterion("cluster_name in", values, "clusterName");
            return (Criteria) this;
        }

        public Criteria andClusterNameNotIn(List<String> values) {
            addCriterion("cluster_name not in", values, "clusterName");
            return (Criteria) this;
        }

        public Criteria andClusterNameBetween(String value1, String value2) {
            addCriterion("cluster_name between", value1, value2, "clusterName");
            return (Criteria) this;
        }

        public Criteria andClusterNameNotBetween(String value1, String value2) {
            addCriterion("cluster_name not between", value1, value2, "clusterName");
            return (Criteria) this;
        }

        public Criteria andCrtTimeIsNull() {
            addCriterion("crt_time is null");
            return (Criteria) this;
        }

        public Criteria andCrtTimeIsNotNull() {
            addCriterion("crt_time is not null");
            return (Criteria) this;
        }

        public Criteria andCrtTimeEqualTo(Date value) {
            addCriterion("crt_time =", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeNotEqualTo(Date value) {
            addCriterion("crt_time <>", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeGreaterThan(Date value) {
            addCriterion("crt_time >", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("crt_time >=", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeLessThan(Date value) {
            addCriterion("crt_time <", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeLessThanOrEqualTo(Date value) {
            addCriterion("crt_time <=", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeIn(List<Date> values) {
            addCriterion("crt_time in", values, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeNotIn(List<Date> values) {
            addCriterion("crt_time not in", values, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeBetween(Date value1, Date value2) {
            addCriterion("crt_time between", value1, value2, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeNotBetween(Date value1, Date value2) {
            addCriterion("crt_time not between", value1, value2, "crtTime");
            return (Criteria) this;
        }

        public Criteria andClusterUserIsNull() {
            addCriterion("cluster_user is null");
            return (Criteria) this;
        }

        public Criteria andClusterUserIsNotNull() {
            addCriterion("cluster_user is not null");
            return (Criteria) this;
        }

        public Criteria andClusterUserEqualTo(String value) {
            addCriterion("cluster_user =", value, "clusterUser");
            return (Criteria) this;
        }

        public Criteria andClusterUserNotEqualTo(String value) {
            addCriterion("cluster_user <>", value, "clusterUser");
            return (Criteria) this;
        }

        public Criteria andClusterUserGreaterThan(String value) {
            addCriterion("cluster_user >", value, "clusterUser");
            return (Criteria) this;
        }

        public Criteria andClusterUserGreaterThanOrEqualTo(String value) {
            addCriterion("cluster_user >=", value, "clusterUser");
            return (Criteria) this;
        }

        public Criteria andClusterUserLessThan(String value) {
            addCriterion("cluster_user <", value, "clusterUser");
            return (Criteria) this;
        }

        public Criteria andClusterUserLessThanOrEqualTo(String value) {
            addCriterion("cluster_user <=", value, "clusterUser");
            return (Criteria) this;
        }

        public Criteria andClusterUserLike(String value) {
            addCriterion("cluster_user like", value, "clusterUser");
            return (Criteria) this;
        }

        public Criteria andClusterUserNotLike(String value) {
            addCriterion("cluster_user not like", value, "clusterUser");
            return (Criteria) this;
        }

        public Criteria andClusterUserIn(List<String> values) {
            addCriterion("cluster_user in", values, "clusterUser");
            return (Criteria) this;
        }

        public Criteria andClusterUserNotIn(List<String> values) {
            addCriterion("cluster_user not in", values, "clusterUser");
            return (Criteria) this;
        }

        public Criteria andClusterUserBetween(String value1, String value2) {
            addCriterion("cluster_user between", value1, value2, "clusterUser");
            return (Criteria) this;
        }

        public Criteria andClusterUserNotBetween(String value1, String value2) {
            addCriterion("cluster_user not between", value1, value2, "clusterUser");
            return (Criteria) this;
        }

        public Criteria andTanantidIsNull() {
            addCriterion("tanantId is null");
            return (Criteria) this;
        }

        public Criteria andTanantidIsNotNull() {
            addCriterion("tanantId is not null");
            return (Criteria) this;
        }

        public Criteria andTanantidEqualTo(String value) {
            addCriterion("tanantId =", value, "tanantid");
            return (Criteria) this;
        }

        public Criteria andTanantidNotEqualTo(String value) {
            addCriterion("tanantId <>", value, "tanantid");
            return (Criteria) this;
        }

        public Criteria andTanantidGreaterThan(String value) {
            addCriterion("tanantId >", value, "tanantid");
            return (Criteria) this;
        }

        public Criteria andTanantidGreaterThanOrEqualTo(String value) {
            addCriterion("tanantId >=", value, "tanantid");
            return (Criteria) this;
        }

        public Criteria andTanantidLessThan(String value) {
            addCriterion("tanantId <", value, "tanantid");
            return (Criteria) this;
        }

        public Criteria andTanantidLessThanOrEqualTo(String value) {
            addCriterion("tanantId <=", value, "tanantid");
            return (Criteria) this;
        }

        public Criteria andTanantidLike(String value) {
            addCriterion("tanantId like", value, "tanantid");
            return (Criteria) this;
        }

        public Criteria andTanantidNotLike(String value) {
            addCriterion("tanantId not like", value, "tanantid");
            return (Criteria) this;
        }

        public Criteria andTanantidIn(List<String> values) {
            addCriterion("tanantId in", values, "tanantid");
            return (Criteria) this;
        }

        public Criteria andTanantidNotIn(List<String> values) {
            addCriterion("tanantId not in", values, "tanantid");
            return (Criteria) this;
        }

        public Criteria andTanantidBetween(String value1, String value2) {
            addCriterion("tanantId between", value1, value2, "tanantid");
            return (Criteria) this;
        }

        public Criteria andTanantidNotBetween(String value1, String value2) {
            addCriterion("tanantId not between", value1, value2, "tanantid");
            return (Criteria) this;
        }

        public Criteria andDeployResourceIsNull() {
            addCriterion("deploy_resource is null");
            return (Criteria) this;
        }

        public Criteria andDeployResourceIsNotNull() {
            addCriterion("deploy_resource is not null");
            return (Criteria) this;
        }

        public Criteria andDeployResourceEqualTo(String value) {
            addCriterion("deploy_resource =", value, "deployResource");
            return (Criteria) this;
        }

        public Criteria andDeployResourceNotEqualTo(String value) {
            addCriterion("deploy_resource <>", value, "deployResource");
            return (Criteria) this;
        }

        public Criteria andDeployResourceGreaterThan(String value) {
            addCriterion("deploy_resource >", value, "deployResource");
            return (Criteria) this;
        }

        public Criteria andDeployResourceGreaterThanOrEqualTo(String value) {
            addCriterion("deploy_resource >=", value, "deployResource");
            return (Criteria) this;
        }

        public Criteria andDeployResourceLessThan(String value) {
            addCriterion("deploy_resource <", value, "deployResource");
            return (Criteria) this;
        }

        public Criteria andDeployResourceLessThanOrEqualTo(String value) {
            addCriterion("deploy_resource <=", value, "deployResource");
            return (Criteria) this;
        }

        public Criteria andDeployResourceLike(String value) {
            addCriterion("deploy_resource like", value, "deployResource");
            return (Criteria) this;
        }

        public Criteria andDeployResourceNotLike(String value) {
            addCriterion("deploy_resource not like", value, "deployResource");
            return (Criteria) this;
        }

        public Criteria andDeployResourceIn(List<String> values) {
            addCriterion("deploy_resource in", values, "deployResource");
            return (Criteria) this;
        }

        public Criteria andDeployResourceNotIn(List<String> values) {
            addCriterion("deploy_resource not in", values, "deployResource");
            return (Criteria) this;
        }

        public Criteria andDeployResourceBetween(String value1, String value2) {
            addCriterion("deploy_resource between", value1, value2, "deployResource");
            return (Criteria) this;
        }

        public Criteria andDeployResourceNotBetween(String value1, String value2) {
            addCriterion("deploy_resource not between", value1, value2, "deployResource");
            return (Criteria) this;
        }

        public Criteria andTanantnameIsNull() {
            addCriterion("tanantName is null");
            return (Criteria) this;
        }

        public Criteria andTanantnameIsNotNull() {
            addCriterion("tanantName is not null");
            return (Criteria) this;
        }

        public Criteria andTanantnameEqualTo(String value) {
            addCriterion("tanantName =", value, "tanantname");
            return (Criteria) this;
        }

        public Criteria andTanantnameNotEqualTo(String value) {
            addCriterion("tanantName <>", value, "tanantname");
            return (Criteria) this;
        }

        public Criteria andTanantnameGreaterThan(String value) {
            addCriterion("tanantName >", value, "tanantname");
            return (Criteria) this;
        }

        public Criteria andTanantnameGreaterThanOrEqualTo(String value) {
            addCriterion("tanantName >=", value, "tanantname");
            return (Criteria) this;
        }

        public Criteria andTanantnameLessThan(String value) {
            addCriterion("tanantName <", value, "tanantname");
            return (Criteria) this;
        }

        public Criteria andTanantnameLessThanOrEqualTo(String value) {
            addCriterion("tanantName <=", value, "tanantname");
            return (Criteria) this;
        }

        public Criteria andTanantnameLike(String value) {
            addCriterion("tanantName like", value, "tanantname");
            return (Criteria) this;
        }

        public Criteria andTanantnameNotLike(String value) {
            addCriterion("tanantName not like", value, "tanantname");
            return (Criteria) this;
        }

        public Criteria andTanantnameIn(List<String> values) {
            addCriterion("tanantName in", values, "tanantname");
            return (Criteria) this;
        }

        public Criteria andTanantnameNotIn(List<String> values) {
            addCriterion("tanantName not in", values, "tanantname");
            return (Criteria) this;
        }

        public Criteria andTanantnameBetween(String value1, String value2) {
            addCriterion("tanantName between", value1, value2, "tanantname");
            return (Criteria) this;
        }

        public Criteria andTanantnameNotBetween(String value1, String value2) {
            addCriterion("tanantName not between", value1, value2, "tanantname");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
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