package com.atguigu.design.creation.singleton.type5;

/**
 * @author lihuaiqiang
 * @description
 * @date 2021/2/22 21:16
 */
public class SingletonTest05 {

    public static void main(String[] args) {

    }
}

/**
 * 懒汉式 - 同步代码块
 */
class Singleton {
    //1、私有化构造器
    private Singleton() {

    }

    //2、本类内部创建对象实例
    private static Singleton instance;

    //3、提供一个公共的静态方法
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            //加入同步代码块
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }
}