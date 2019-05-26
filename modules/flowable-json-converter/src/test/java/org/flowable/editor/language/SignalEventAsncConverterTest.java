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
package org.flowable.editor.language;

import static junit.framework.TestCase.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.flowable.bpmn.model.BpmnModel;
import org.flowable.bpmn.model.EventDefinition;
import org.flowable.bpmn.model.SignalEventDefinition;
import org.flowable.bpmn.model.ThrowEvent;
import org.junit.Test;

/**
 * @author Zheng Ji
 */
public class SignalEventAsncConverterTest extends AbstractConverterTest {

    @Test
    public void convertJsonToModel() throws Exception {
        BpmnModel bpmnModel = readJsonFile();
        validateModel(bpmnModel);
    }

    @Override
    protected String getResource() {
        return "test.signaleventasnc.json";
    }

    private void validateModel(BpmnModel model) {

        ThrowEvent throwEvent = (ThrowEvent) model.getMainProcess().getFlowElement("throwEvent", true);
        List<EventDefinition> eventDefinitions = throwEvent.getEventDefinitions();
        assertNotNull(eventDefinitions.size());

        EventDefinition eventDefinition = eventDefinitions.get(0);
        assertNotNull(eventDefinitions);

        SignalEventDefinition signalEventDefinition= (SignalEventDefinition) eventDefinition;
        assertTrue(signalEventDefinition.isAsync());

    }

}
