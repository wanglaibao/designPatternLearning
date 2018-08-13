package com.laibao.designpattern.templatemethod.oldway;

/**
 * One of the extensions of the abstract workflow manager
 *
 * @author laibao wang
 * @date 2018-08-12
 * @version 1.0
 */
public class WorkflowManagerImpl1 extends WorkflowManager{
    @Override
    public void doTask2() {
        System.out.println("Doing Task2.1...");
    }

    @Override
    public void doTask3() {
        System.out.println("Doing Task3.1...");
    }
}
