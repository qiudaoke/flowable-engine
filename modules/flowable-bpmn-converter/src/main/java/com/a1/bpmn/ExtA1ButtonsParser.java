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
package com.a1.bpmn;

import javax.xml.stream.XMLStreamReader;

import org.flowable.bpmn.constants.BpmnXMLConstants;
import org.flowable.bpmn.converter.child.ExecutionListenerParser;
import org.flowable.bpmn.converter.child.FlowableEventListenerParser;
import org.flowable.bpmn.converter.parser.PotentialStarterParser;
import org.flowable.bpmn.converter.util.BpmnXMLUtil;
import org.flowable.bpmn.model.BaseElement;
import org.flowable.bpmn.model.BpmnModel;
import org.flowable.bpmn.model.ExtA1Button;
import org.flowable.bpmn.model.ExtA1Properties;
import org.flowable.bpmn.model.ExtensionElement;

/**
 * @author Jizheng
 */
public class ExtA1ButtonsParser implements BpmnXMLConstants {

    public void parse(XMLStreamReader xtr, BpmnModel model) throws Exception {


//        BpmnXMLUtil.parseChildElements("Button", null, xtr, model);

        BaseElement parentElement = null;
        boolean readyWithChildElements = false;
        while (!readyWithChildElements && xtr.hasNext()) {
            xtr.next();
            if (xtr.isStartElement()) {
                if ("Button".equals(xtr.getLocalName())) {
                    String id = xtr.getAttributeValue(null, ATTRIBUTE_ID);
                    String alias = xtr.getAttributeValue(null, "alias");
                    String btnName = xtr.getAttributeValue(null, "btnName");
                    String nodeId = xtr.getAttributeValue(null, "nodeId");
                    ExtA1Button extA1Button = new ExtA1Button(id,alias,btnName,nodeId);
                    BpmnXMLUtil.addXMLLocation(extA1Button, xtr);
                    model.addExtA1Buttons(extA1Button);
                }  else {
                    ExtensionElement extensionElement = BpmnXMLUtil.parseExtensionElement(xtr);
                    parentElement.addExtensionElement(extensionElement);
                }

            } else if (xtr.isEndElement()) {
                if ("Buttons".equals(xtr.getLocalName())) {
                    readyWithChildElements = true;
                }
            }
        }
    }
}
