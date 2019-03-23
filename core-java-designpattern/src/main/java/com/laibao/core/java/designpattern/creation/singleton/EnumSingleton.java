package com.laibao.core.java.designpattern.creation.singleton;

/**
 * 枚举单例
 */
public enum  EnumSingleton {
    INSTANCE;

    // 添加单例方法
    public void testMethod() {
        System.out.println("Singleton method called...");
    }
}
