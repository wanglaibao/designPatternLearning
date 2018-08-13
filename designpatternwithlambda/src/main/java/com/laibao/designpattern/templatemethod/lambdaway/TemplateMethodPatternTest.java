package com.laibao.designpattern.templatemethod.lambdaway;

/**
 * @author laibao wang
 * @date 2018-08-12
 * @version 1.0
 */
public class TemplateMethodPatternTest {

    public static void main(String[] args) {
        WorkflowManager workflowManager = new WorkflowManagerImpl(() -> System.out.println("Doing Task2..."));
        workflowManager.templateMethod();
    }
}
