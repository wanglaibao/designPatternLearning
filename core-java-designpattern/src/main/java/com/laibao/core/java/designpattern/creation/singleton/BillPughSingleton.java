package com.laibao.core.java.designpattern.creation.singleton;

/**
 * 比尔.普夫单例【这种单例模式比较推荐,可以使用】
 */
public class BillPughSingleton {

    private BillPughSingleton() {}

    private static class LazyHolder {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }
}
