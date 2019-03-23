package com.laibao.core.java.designpattern.creation.singleton;

/**
 * 发射单例
 */
public class ReflectionSingleton {

    private static ReflectionSingleton INSTANCE;

    private ReflectionSingleton() {
        throw new InstantiationError("不能通过反射创建单例");
    }

    public static synchronized ReflectionSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ReflectionSingleton();
        }
        return INSTANCE;
    }
}
