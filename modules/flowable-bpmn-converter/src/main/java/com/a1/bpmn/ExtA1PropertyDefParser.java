/**
 * Copyright (c) 2019-2023 A1Bpm All rights reserved.
 * <p>
 * http://www.a1bpm.com
 * <p>
 * 版权所有，侵权必究！
 */
package com.a1.bpmn;

import javax.xml.stream.XMLStreamReader;

import org.flowable.bpmn.constants.BpmnXMLConstants;
import org.flowable.bpmn.converter.child.BaseChildElementParser;
import org.flowable.bpmn.converter.util.BpmnXMLUtil;
import org.flowable.bpmn.model.BaseElement;
import org.flowable.bpmn.model.BpmnModel;
import org.flowable.bpmn.model.ExtA1Properties;

public class ExtA1PropertyDefParser extends BaseChildElementParser implements BpmnXMLConstants{

    @Override
    public String getElementName() {
        return "PropertiesDef";
    }
    @Override
    public void parseChildElement(XMLStreamReader xtr, BaseElement parentElement, BpmnModel model) throws Exception {
        String id = xtr.getAttributeValue(null, ATTRIBUTE_ID);
        String subjectRule = xtr.getAttributeValue(null, "subjectRule");
        String description = xtr.getAttributeValue(null, "description");
        String propNotifyType = xtr.getAttributeValue(null, "propNotifyType");
        String parameterUserAssign = xtr.getAttributeValue(null, "parameterUserAssign");
        String propSkipRules = xtr.getAttributeValue(null, "propSkipRules");
        String propDateType = xtr.getAttributeValue(null, "propDateType");
        String dateTypeDay = xtr.getAttributeValue(null, "dateTypeDay");
        String dateTypeMinute = xtr.getAttributeValue(null, "dateTypeMinute");
        ExtA1Properties extA1Properties = new ExtA1Properties(id,subjectRule,description,propNotifyType,parameterUserAssign,
            propSkipRules,propDateType,dateTypeDay,dateTypeMinute);
        model.addExtA1Properties(extA1Properties);
    }
}
