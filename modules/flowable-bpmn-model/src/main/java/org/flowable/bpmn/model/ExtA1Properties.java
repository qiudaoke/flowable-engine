/**
 * Copyright (c) 2019-2023 A1Bpm All rights reserved.
 * <p>
 * http://www.a1bpm.com
 * <p>
 * 版权所有，侵权必究！
 */
package org.flowable.bpmn.model;


public class ExtA1Properties extends BaseElement {

   private String id;
    private  String subjectRule;
    private  String description;
    private  String propNotifyType;
    private  String parameterUserAssign;
    private  String propSkipRules;
    private String propDateType;
    private  String dateTypeDay;
    private   String dateTypeMinute;
    public ExtA1Properties() {

    }
    public ExtA1Properties(String id, String subjectRule, String description, String propNotifyType, String parameterUserAssign, String propSkipRules,
        String propDateType, String dateTypeDay, String dateTypeMinute) {
        this.id = id;
        this.subjectRule = subjectRule;
        this.description = description;
        this.propNotifyType = propNotifyType;
        this.parameterUserAssign = parameterUserAssign;
        this.propSkipRules = propSkipRules;
        this.propDateType = propDateType;
        this.dateTypeDay = dateTypeDay;
        this.dateTypeMinute = dateTypeMinute;
    }

    @Override
    public String getId() {
        return id;
    }
    @Override
    public void setId(String id) {
        this.id = id;
    }
    public String getSubjectRule() {
        return subjectRule;
    }
    public void setSubjectRule(String subjectRule) {
        this.subjectRule = subjectRule;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getPropNotifyType() {
        return propNotifyType;
    }
    public void setPropNotifyType(String propNotifyType) {
        this.propNotifyType = propNotifyType;
    }
    public String getParameterUserAssign() {
        return parameterUserAssign;
    }
    public void setParameterUserAssign(String parameterUserAssign) {
        this.parameterUserAssign = parameterUserAssign;
    }
    public String getPropSkipRules() {
        return propSkipRules;
    }
    public void setPropSkipRules(String propSkipRules) {
        this.propSkipRules = propSkipRules;
    }
    public String getPropDateType() {
        return propDateType;
    }
    public void setPropDateType(String propDateType) {
        this.propDateType = propDateType;
    }
    public String getDateTypeDay() {
        return dateTypeDay;
    }
    public void setDateTypeDay(String dateTypeDay) {
        this.dateTypeDay = dateTypeDay;
    }
    public String getDateTypeMinute() {
        return dateTypeMinute;
    }
    public void setDateTypeMinute(String dateTypeMinute) {
        this.dateTypeMinute = dateTypeMinute;
    }
    @Override
    public BaseElement clone() {
//        ExtA1Properties clone = new ExtA1Properties();
//        clone.setValues(this);
//        return clone;
        return null;
    }


}
