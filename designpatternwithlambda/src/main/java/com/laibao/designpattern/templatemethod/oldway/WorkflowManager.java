package com.laibao.designpattern.templatemethod.oldway;

/**
 * @author laibao wang
 * @date 2018-08-13
 * @version 1.0
 */
public abstract class WorkflowManager {

    protected void templateMethod() {
        doTask1();
        doTask2();
        doTask3();
        doTask4();
    }

    public void doTask1(){
        System.out.println("Doing Task1...");
    }

    public abstract void doTask2();

    public abstract void doTask3();

    public void doTask4(){
        System.out.println("Doing Task4...");
    }
}
