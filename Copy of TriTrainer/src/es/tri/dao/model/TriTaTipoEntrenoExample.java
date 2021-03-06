package es.tri.dao.model;

import java.util.ArrayList;
import java.util.List;

public class TriTaTipoEntrenoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TriTaTipoEntrenoExample() {
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

        public Criteria andId_tipo_entrenoIsNull() {
            addCriterion("id_tipo_entreno is null");
            return (Criteria) this;
        }

        public Criteria andId_tipo_entrenoIsNotNull() {
            addCriterion("id_tipo_entreno is not null");
            return (Criteria) this;
        }

        public Criteria andId_tipo_entrenoEqualTo(Integer value) {
            addCriterion("id_tipo_entreno =", value, "id_tipo_entreno");
            return (Criteria) this;
        }

        public Criteria andId_tipo_entrenoNotEqualTo(Integer value) {
            addCriterion("id_tipo_entreno <>", value, "id_tipo_entreno");
            return (Criteria) this;
        }

        public Criteria andId_tipo_entrenoGreaterThan(Integer value) {
            addCriterion("id_tipo_entreno >", value, "id_tipo_entreno");
            return (Criteria) this;
        }

        public Criteria andId_tipo_entrenoGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_tipo_entreno >=", value, "id_tipo_entreno");
            return (Criteria) this;
        }

        public Criteria andId_tipo_entrenoLessThan(Integer value) {
            addCriterion("id_tipo_entreno <", value, "id_tipo_entreno");
            return (Criteria) this;
        }

        public Criteria andId_tipo_entrenoLessThanOrEqualTo(Integer value) {
            addCriterion("id_tipo_entreno <=", value, "id_tipo_entreno");
            return (Criteria) this;
        }

        public Criteria andId_tipo_entrenoIn(List<Integer> values) {
            addCriterion("id_tipo_entreno in", values, "id_tipo_entreno");
            return (Criteria) this;
        }

        public Criteria andId_tipo_entrenoNotIn(List<Integer> values) {
            addCriterion("id_tipo_entreno not in", values, "id_tipo_entreno");
            return (Criteria) this;
        }

        public Criteria andId_tipo_entrenoBetween(Integer value1, Integer value2) {
            addCriterion("id_tipo_entreno between", value1, value2, "id_tipo_entreno");
            return (Criteria) this;
        }

        public Criteria andId_tipo_entrenoNotBetween(Integer value1, Integer value2) {
            addCriterion("id_tipo_entreno not between", value1, value2, "id_tipo_entreno");
            return (Criteria) this;
        }

        public Criteria andDescripci�nIsNull() {
            addCriterion("Descripci�n is null");
            return (Criteria) this;
        }

        public Criteria andDescripci�nIsNotNull() {
            addCriterion("Descripci�n is not null");
            return (Criteria) this;
        }

        public Criteria andDescripci�nEqualTo(Integer value) {
            addCriterion("Descripci�n =", value, "descripci�n");
            return (Criteria) this;
        }

        public Criteria andDescripci�nNotEqualTo(Integer value) {
            addCriterion("Descripci�n <>", value, "descripci�n");
            return (Criteria) this;
        }

        public Criteria andDescripci�nGreaterThan(Integer value) {
            addCriterion("Descripci�n >", value, "descripci�n");
            return (Criteria) this;
        }

        public Criteria andDescripci�nGreaterThanOrEqualTo(Integer value) {
            addCriterion("Descripci�n >=", value, "descripci�n");
            return (Criteria) this;
        }

        public Criteria andDescripci�nLessThan(Integer value) {
            addCriterion("Descripci�n <", value, "descripci�n");
            return (Criteria) this;
        }

        public Criteria andDescripci�nLessThanOrEqualTo(Integer value) {
            addCriterion("Descripci�n <=", value, "descripci�n");
            return (Criteria) this;
        }

        public Criteria andDescripci�nIn(List<Integer> values) {
            addCriterion("Descripci�n in", values, "descripci�n");
            return (Criteria) this;
        }

        public Criteria andDescripci�nNotIn(List<Integer> values) {
            addCriterion("Descripci�n not in", values, "descripci�n");
            return (Criteria) this;
        }

        public Criteria andDescripci�nBetween(Integer value1, Integer value2) {
            addCriterion("Descripci�n between", value1, value2, "descripci�n");
            return (Criteria) this;
        }

        public Criteria andDescripci�nNotBetween(Integer value1, Integer value2) {
            addCriterion("Descripci�n not between", value1, value2, "descripci�n");
            return (Criteria) this;
        }

        public Criteria andFecha_bajaIsNull() {
            addCriterion("Fecha_baja is null");
            return (Criteria) this;
        }

        public Criteria andFecha_bajaIsNotNull() {
            addCriterion("Fecha_baja is not null");
            return (Criteria) this;
        }

        public Criteria andFecha_bajaEqualTo(Integer value) {
            addCriterion("Fecha_baja =", value, "fecha_baja");
            return (Criteria) this;
        }

        public Criteria andFecha_bajaNotEqualTo(Integer value) {
            addCriterion("Fecha_baja <>", value, "fecha_baja");
            return (Criteria) this;
        }

        public Criteria andFecha_bajaGreaterThan(Integer value) {
            addCriterion("Fecha_baja >", value, "fecha_baja");
            return (Criteria) this;
        }

        public Criteria andFecha_bajaGreaterThanOrEqualTo(Integer value) {
            addCriterion("Fecha_baja >=", value, "fecha_baja");
            return (Criteria) this;
        }

        public Criteria andFecha_bajaLessThan(Integer value) {
            addCriterion("Fecha_baja <", value, "fecha_baja");
            return (Criteria) this;
        }

        public Criteria andFecha_bajaLessThanOrEqualTo(Integer value) {
            addCriterion("Fecha_baja <=", value, "fecha_baja");
            return (Criteria) this;
        }

        public Criteria andFecha_bajaIn(List<Integer> values) {
            addCriterion("Fecha_baja in", values, "fecha_baja");
            return (Criteria) this;
        }

        public Criteria andFecha_bajaNotIn(List<Integer> values) {
            addCriterion("Fecha_baja not in", values, "fecha_baja");
            return (Criteria) this;
        }

        public Criteria andFecha_bajaBetween(Integer value1, Integer value2) {
            addCriterion("Fecha_baja between", value1, value2, "fecha_baja");
            return (Criteria) this;
        }

        public Criteria andFecha_bajaNotBetween(Integer value1, Integer value2) {
            addCriterion("Fecha_baja not between", value1, value2, "fecha_baja");
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