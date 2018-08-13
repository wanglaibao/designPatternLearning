package com.laibao.designpattern.factorymethod.oldway;

/**
 * @author laibao wang
 * @date 2018-08-13
 * @version 1.0
 */
public class FactoryPatternTest {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.createShape("CIRCLE");
        circle.draw();

        Shape rectangle = shapeFactory.createShape("RECTANGLE");
        rectangle.draw();

        Shape triangle = shapeFactory.createShape("TRIANGLE");
        triangle.draw();
    }
}
