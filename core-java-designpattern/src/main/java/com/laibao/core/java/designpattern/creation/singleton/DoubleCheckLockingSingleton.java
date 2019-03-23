package com.laibao.core.java.designpattern.creation.singleton;

/**
 * 双重检查锁定单例
 */
public class DoubleCheckLockingSingleton {

    private static volatile DoubleCheckLockingSingleton INSTANCE;

    private DoubleCheckLockingSingleton() {}

    public static DoubleCheckLockingSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (DoubleCheckLockingSingleton.class) {
                // 双重检查
                if (INSTANCE == null) {
                    INSTANCE = new DoubleCheckLockingSingleton();
                }
            }
        }
        return INSTANCE;
    }
}
