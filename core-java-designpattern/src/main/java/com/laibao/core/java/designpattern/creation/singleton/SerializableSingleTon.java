package com.laibao.core.java.designpattern.creation.singleton;

import java.io.Serializable;

/**
 * 序列化的单例模式
 */
public class SerializableSingleTon implements Serializable {

    private static final long serialVersionUID = -8771232477460154908L;

    private static class LazyHolder{
        private static final SerializableSingleTon INSTANCE = new SerializableSingleTon();
    }

    public static SerializableSingleTon getInstance(){
        return LazyHolder.INSTANCE;
    }

    // 确保反序列化单例
    private Object readResolve() {
        return getInstance();
    }
}
