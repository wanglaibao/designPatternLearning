package com.laibao.designpattern.templatemethod;

/**
 * @author laibao wang
 * @date 2018-08-12
 * @version 1.0
 */
public interface DefaultFlowManager{

    default void doTask1(){
        System.out.println("Doing Task1...");
    }

    default void doTask3() {
        System.out.println("Doing Task3...");
    }

    default void doTask4(){System.out.println("Doing Task4...");}
}
