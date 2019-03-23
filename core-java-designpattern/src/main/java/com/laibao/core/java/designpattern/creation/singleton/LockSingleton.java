package com.laibao.core.java.designpattern.creation.singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 通过lock方式实现线程安全的单例
 */
public class LockSingleton {

    private static Lock lock = new ReentrantLock();

    private static LockSingleton INSTANCE;

    private LockSingleton(){}

    public static LockSingleton getInstance() {
        try {
            lock.lock();
            if (INSTANCE == null) {
                INSTANCE = new LockSingleton();
            }
            return INSTANCE;
        }finally {
            lock.unlock();
        }
    }

}
