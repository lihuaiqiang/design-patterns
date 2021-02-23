package com.atguigu.design.creation.singleton.type3;

/**
 * @author lihuaiqiang
 * @description
 * @date 2021/2/22 21:06
 */
public class SingletonTest03 {

    public static void main(String[] args) {

    }
}

/**
 * 懒汉式 - 线程不安全
 */
class Singleton {
    //1、私有化构造器
    private Singleton() {

    }

    //2、本类内部创建对象实例
    private static Singleton instance;

    //3、提供一个公共的静态方法，当时用该方法时，才去创建实例
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
