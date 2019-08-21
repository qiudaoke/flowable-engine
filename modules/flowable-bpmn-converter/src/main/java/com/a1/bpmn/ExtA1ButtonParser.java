/**
 * Copyright (c) 2019-2023 A1Bpm All rights reserved.
 * <p>
 * http://www.a1bpm.com
 * <p>
 * 版权所有，侵权必究！
 */
package com.a1.bpmn;

import java.util.List;

import javax.xml.stream.XMLStreamReader;

import org.flowable.bpmn.constants.BpmnXMLConstants;
import org.flowable.bpmn.converter.child.BaseChildElementParser;
import org.flowable.bpmn.converter.util.BpmnXMLUtil;
import org.flowable.bpmn.model.BaseElement;
import org.flowable.bpmn.model.BpmnModel;
import org.flowable.bpmn.model.ExtA1Button;
import org.flowable.bpmn.model.ExtA1Properties;

public class ExtA1ButtonParser  extends BaseChildElementParser implements BpmnXMLConstants {
    @Override
    public String getElementName() {
        return "Button";
    }
    @Override
    public void parseChildElement(XMLStreamReader xtr, BaseElement parentElement, BpmnModel model) throws Exception {





         String id = xtr.getAttributeValue(null, ATTRIBUTE_ID);
        String alias = xtr.getAttributeValue(null, "alias");
        String btnName = xtr.getAttributeValue(null, "btnName");
        String nodeId = xtr.getAttributeValue(null, "nodeId");

        ExtA1Button extA1Button = new ExtA1Button(id,alias,btnName,nodeId);
        BpmnXMLUtil.addXMLLocation(extA1Button, xtr);
        model.addExtA1Buttons(extA1Button);
    }
}
