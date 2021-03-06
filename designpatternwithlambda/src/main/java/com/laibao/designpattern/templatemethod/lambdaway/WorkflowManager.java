package com.laibao.designpattern.templatemethod.lambdaway;

import com.laibao.designpattern.templatemethod.lambdaway.DefaultFlowManager;
import com.laibao.designpattern.templatemethod.lambdaway.FlowManager;

/**
 * @author laibao wang
 * @date 2018-08-12
 * @version 1.0
 */
public abstract class WorkflowManager implements DefaultFlowManager{

    private FlowManager flowManager;

    public WorkflowManager(FlowManager flowManager) {
        this.flowManager = flowManager;
    }

    protected void templateMethod() {
        doTask1();
        flowManager.doTask();
        doTask3();
        doTask4();
    }
}
