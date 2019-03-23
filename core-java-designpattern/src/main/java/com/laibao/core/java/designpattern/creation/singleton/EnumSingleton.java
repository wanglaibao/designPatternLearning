package com.laibao.core.java.designpattern.creation.singleton;

/**
 * 枚举单例【这种单例模式比较推荐,可以使用】
 */
public enum  EnumSingleton {
    INSTANCE;

    // 添加单例方法
    public void testMethod() {
        System.out.println("Singleton method called...");
    }
}
