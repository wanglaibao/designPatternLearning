package com.laibao.designpattern.factorymethod.lambdaway;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 * @author laibao wang
 * @date 2018-08-13
 * @version 1.0
 */
public class LambdaFactoryPattern{
    final static Map<String, Supplier<Shape>> shapeMap = new HashMap<>();

    static {
        shapeMap.put("CIRCLE", Circle::new);
        shapeMap.put("RECTANGLE", Rectangle::new);
        shapeMap.put("TRIANGLE", Triangle::new);
    }

    public Shape createShape(String shapeType){
        Supplier<Shape> shape = shapeMap.get(shapeType.toUpperCase());
        if(shape != null) {
            return shape.get();
        }
        throw new IllegalArgumentException("No such shape " + shapeType.toUpperCase());
    }
}
