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

package org.flowable.a1bpm;

import org.flowable.bpmn.model.BpmnModel;
import org.flowable.bpmn.model.ExtA1Properties;
import org.flowable.engine.impl.test.ResourceFlowableTestCase;
import org.flowable.engine.runtime.ProcessInstance;
import org.flowable.engine.test.Deployment;
import org.junit.jupiter.api.Test;

/**
 * @author shareniu
 */
public class A1BtnTest extends ResourceFlowableTestCase {

    public A1BtnTest() {
        super("org/flowable/a1bpm/simple/flowable.cfg.xml");
    }
    @Test
 @Deployment
    public void testSimple() {
                ProcessInstance pi = runtimeService.startProcessInstanceByKey("ddd");
        String processDefinitionId = pi.getProcessDefinitionId();
        BpmnModel bpmnModel = repositoryService.getBpmnModel(processDefinitionId);
        System.out.println(bpmnModel);
        ExtA1Properties extA1Properties = bpmnModel.getExtA1Properties();
        System.out.println(extA1Properties);
    }

}
