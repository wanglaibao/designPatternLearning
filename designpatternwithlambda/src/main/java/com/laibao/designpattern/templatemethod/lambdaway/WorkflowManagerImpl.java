package com.laibao.designpattern.templatemethod.lambdaway;

import com.laibao.designpattern.templatemethod.lambdaway.FlowManager;
import com.laibao.designpattern.templatemethod.lambdaway.WorkflowManager;

/**
 * @author laibao wang
 * @date 2018-08-12
 * @version 1.0
 */
public class WorkflowManagerImpl extends WorkflowManager {

    public WorkflowManagerImpl(FlowManager flowManager) {
        super(flowManager);
    }

}
