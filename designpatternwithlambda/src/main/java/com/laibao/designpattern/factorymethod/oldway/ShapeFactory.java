package com.laibao.designpattern.factorymethod.oldway;

/**
 * @author laibao wang
 * @date 2018-08-13
 * @version 1.0
 */
public class ShapeFactory {

    public Shape createShape(String shapeType){
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("TRIANGLE")) {
            return new Triangle();
        }
        return new Circle();
    }
}
