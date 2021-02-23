package com.atguigu.design.creation.singleton.type8;

/**
 * @author lihuaiqiang
 * @description
 * @date 2021/2/22 21:28
 */
public class SingletonTest08 {

    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance == instance2);//true

        System.out.println(instance.hashCode()); //356573597
        System.out.println(instance2.hashCode());//356573597
    }
}

/**
 * 枚举：借助 JDK1.5 中的枚举实现单例模式
 * 1、避免了多线程同步问题，而且还能防止反序列化重新创建新的对象。
 * 2、这种方式是 Effective Java 作者 Josh Bloch 提倡的方式。
 * 3、推荐使用。
 */
enum Singleton {
    INSTANCE;
}
