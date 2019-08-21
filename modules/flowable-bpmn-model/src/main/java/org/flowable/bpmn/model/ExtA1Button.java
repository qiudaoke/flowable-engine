/**
 * Copyright (c) 2019-2023 A1Bpm All rights reserved.
 * <p>
 * http://www.a1bpm.com
 * <p>
 * 版权所有，侵权必究！
 */
package org.flowable.bpmn.model;

public class ExtA1Button extends   BaseElement {

    @Override
    public BaseElement clone() {
        return null;
    }

   private   String id ;
    private String alias ;
    private  String btnName ;
    private  String nodeId ;
    @Override
    public String getId() {
        return id;
    }
    @Override
    public void setId(String id) {
        this.id = id;
    }
    public String getAlias() {
        return alias;
    }
    public void setAlias(String alias) {
        this.alias = alias;
    }
    public String getBtnName() {
        return btnName;
    }
    public void setBtnName(String btnName) {
        this.btnName = btnName;
    }
    public String getNodeId() {
        return nodeId;
    }
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public ExtA1Button(String id, String alias, String btnName, String nodeId) {
        this.id = id;
        this.alias = alias;
        this.btnName = btnName;
        this.nodeId = nodeId;
    }
    public ExtA1Button() {
    }
}
