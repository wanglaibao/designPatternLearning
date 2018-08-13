package com.laibao.designpattern.templatemethod.oldway;

/**
 * @author laibao wang
 * @date 2018-08-13
 * @version 1.0
 */
public class TemplateMethodPattern {

    public static void main(String[] args) {
        initiateWorkFlow(new WorkflowManagerImpl1());
        initiateWorkFlow(new WorkflowManagerImpl2());
    }

    private static void initiateWorkFlow(WorkflowManager workflowMgr){
        System.out.println("Starting the workflow ... the old way");
        workflowMgr.doTask1();
        workflowMgr.doTask2();
        workflowMgr.doTask3();
        workflowMgr.doTask4();
    }
}
