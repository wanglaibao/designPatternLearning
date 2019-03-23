package com.laibao.core.java.designpattern.creation.singleton;

import java.io.*;

/**
 * 序列化单例测试
 */
public class SerializableSingleTonTest {

    public static void main(String[] args) throws Exception{
        SerializableSingleTon instanceOne = SerializableSingleTon.getInstance();

        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("c://filename.ser"));

        out.writeObject(instanceOne);
        out.close();

        // 从文件反序列化到对象
        ObjectInput in = new ObjectInputStream(new FileInputStream("c://filename.ser"));

        SerializableSingleTon instanceTwo = (SerializableSingleTon) in.readObject();
        in.close();

        System.out.println("instanceOne hashCode="+instanceOne.hashCode());
        System.out.println("instanceTwo hashCode="+instanceTwo.hashCode());

    }
}
