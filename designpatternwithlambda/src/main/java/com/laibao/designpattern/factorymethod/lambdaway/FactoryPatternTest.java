package com.laibao.designpattern.factorymethod.lambdaway;

import java.util.function.Supplier;

/**
 * @author laibao wang
 * @date 2018-08-13
 * @version 1.0
 */
public class FactoryPatternTest {

    public static void main(String[] args) {
        Supplier<LambdaFactoryPattern> supplier =  LambdaFactoryPattern::new;
        LambdaFactoryPattern factory = supplier.get();

        Shape circle =  factory.createShape("CIRCLE");
        circle.draw();

        Shape rectangle = factory.createShape("RECTANGLE");
        rectangle.draw();

        Shape triangle = factory.createShape("TRIANGLE");
        triangle.draw();
    }
}
