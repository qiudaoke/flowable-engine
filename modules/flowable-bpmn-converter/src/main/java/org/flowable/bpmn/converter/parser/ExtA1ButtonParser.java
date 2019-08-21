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
import org.flowable.bpmn.model.ExtA1Button;
import org.flowable.bpmn.model.ExtA1Properties;

/**
 * @author Jizheng
 */
public class ExtA1ButtonParser implements BpmnXMLConstants {

    public void parse(XMLStreamReader xtr, BpmnModel model) throws Exception {

        String id = xtr.getAttributeValue(null, ATTRIBUTE_ID);
        String alias = xtr.getAttributeValue(null, "alias");
        String btnName = xtr.getAttributeValue(null, "btnName");
        String nodeId = xtr.getAttributeValue(null, "nodeId");

        ExtA1Button extA1Button = new ExtA1Button(id,alias,btnName,nodeId);
        BpmnXMLUtil.addXMLLocation(extA1Button, xtr);
       model.addExtA1ButtonProperties(extA1Button);
    }
}
