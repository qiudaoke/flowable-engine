/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.flowable.bpmn.converter.parser;

import javax.xml.stream.XMLStreamReader;

import org.flowable.bpmn.constants.BpmnXMLConstants;
import org.flowable.bpmn.converter.util.BpmnXMLUtil;
import org.flowable.bpmn.model.BpmnModel;
import org.flowable.bpmn.model.ExtA1Properties;

/**
 * @author Jizheng
 */
public class ExtA1PropertiesParser implements BpmnXMLConstants {

    public void parse(XMLStreamReader xtr, BpmnModel model) throws Exception {

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
//
//
//        String scope = BpmnXMLUtil.getAttributeValue(ATTRIBUTE_SCOPE, xtr);
//        if (scope != null) {
//            signal.setScope(scope);
//        }
//
        BpmnXMLUtil.addXMLLocation(extA1Properties, xtr);
//        BpmnXMLUtil.parseChildElements(ELEMENT_SIGNAL, signal, xtr, model);
       model.addExtA1Properties(extA1Properties);
    }
}
