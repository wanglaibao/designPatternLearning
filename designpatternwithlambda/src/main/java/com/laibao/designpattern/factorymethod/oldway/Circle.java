package com.laibao.designpattern.factorymethod.oldway;

/**
 * @author laibao wang
 * @date 2018-08-13
 * @version 1.0
 */
public class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
