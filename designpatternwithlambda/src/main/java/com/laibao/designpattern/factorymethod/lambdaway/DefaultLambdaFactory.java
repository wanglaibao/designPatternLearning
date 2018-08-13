package com.laibao.designpattern.factorymethod.lambdaway;

import org.apache.commons.collections.MapUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 * @author laibao wang
 * @date 2018-08-13
 * @version 1.0
 */
public interface DefaultLambdaFactory {

    Map<String, Supplier<Shape>> shapeMap = new HashMap();

    static Shape getShape(String shapeType){
        if (MapUtils.isEmpty(shapeMap)) {
            initShapes();
        }
        Supplier<Shape> shape = shapeMap.get(shapeType.toUpperCase());
        if(shape != null) {
            return shape.get();
        }
        throw new IllegalArgumentException("No such shape " + shapeType.toUpperCase());
    }

    static void initShapes() {
        shapeMap.put("CIRCLE", Circle::new);
        shapeMap.put("RECTANGLE", Rectangle::new);
        shapeMap.put("TRIANGLE", Triangle::new);
    }


}
