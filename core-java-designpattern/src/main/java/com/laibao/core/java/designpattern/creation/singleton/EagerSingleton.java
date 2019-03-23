package com.laibao.core.java.designpattern.creation.singleton;

/**
 *  提前初始化单例
 */
public class EagerSingleton {

    private static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton() {}

    public EagerSingleton getInstance() {
        return INSTANCE;
    }
}
