package com.laibao.core.java.designpattern.creation.singleton;

/**
 * 静态初始化块单例
 */
public class StaticBlockSingleton {

    private static final StaticBlockSingleton INSTANCE;

    //JVM价值的时候就执行这个操作是最早的比类的实例化还要早
    static {
        INSTANCE = new StaticBlockSingleton();
    }

    private StaticBlockSingleton() {

    }

    public static StaticBlockSingleton getInstance() {
        return INSTANCE;
    }
}
