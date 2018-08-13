package com.laibao.designpattern.factorymethod.lambdaway;

import java.util.function.Supplier;

/**
 * @author laibao wang
 * @date 2018-08-13
 * @version 1.0
 */
public class DefaultLambdaFactoryTest {

    public static void main(String[] args) {
        Shape circle =  DefaultLambdaFactory.getShape("CIRCLE");
        circle.draw();

        Shape rectangle = DefaultLambdaFactory.getShape("RECTANGLE");
        rectangle.draw();

        Shape triangle = DefaultLambdaFactory.getShape("TRIANGLE");
        triangle.draw();
    }
}
