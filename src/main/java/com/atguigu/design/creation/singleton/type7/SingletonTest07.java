package com.atguigu.design.creation.singleton.type7;

/**
 * @author lihuaiqiang
 * @description
 * @date 2021/2/22 21:23
 */
public class SingletonTest07 {

    public static void main(String[] args) {

    }
}

class Singleton {
    //1、私有化构造器
    private Singleton() {

    }

    //2、本类内部创建对象实例
    private static volatile Singleton instance;

    //3、写一个静态内部类，该类中有一个静态属性 Singleton
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    //4、提供一个公共的静态方法，直接返回
    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}