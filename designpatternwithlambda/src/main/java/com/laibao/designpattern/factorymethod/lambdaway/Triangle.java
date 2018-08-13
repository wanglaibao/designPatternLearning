package com.laibao.designpattern.factorymethod.lambdaway;

/**
 * @author laibao wang
 * @date 2018-08-13
 * @version 1.0
 */
public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Triangle::draw() method.");
    }
}
