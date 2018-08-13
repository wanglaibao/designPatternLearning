package com.laibao.designpattern.templatemethod.oldway;

/**
 * Another extension of the abstract workflow manager
 * @author laibao wang
 * @date 2018-08-13
 * @version 1.0
 */
public class WorkflowManagerImpl2 extends WorkflowManager{

    @Override
    public void doTask2() {
        System.out.println("Doing Task2.2...");
    }

    @Override
    public void doTask3() {
        System.out.println("Doing Task3.2...");
    }
}
