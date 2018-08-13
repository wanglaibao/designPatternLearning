package com.laibao.designpattern.templatemethod.lambdaway;

/**
 * @author laibao wang
 * @date 2018-08-12
 * @version 1.0
 */
@FunctionalInterface
public interface FlowManager {
    void doTask();

    default void doTask1(){
        System.out.println("Doing Task1...");
    }

    default void doTask3() {
        System.out.println("Doing Task3...");
    }

    default void doTask4(){System.out.println("Doing Task4...");}
}
