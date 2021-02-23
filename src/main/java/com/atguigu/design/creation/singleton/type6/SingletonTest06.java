package com.atguigu.design.creation.singleton.type6;

/**
 * @author lihuaiqiang
 * @description
 * @date 2021/2/22 21:20
 */
public class SingletonTest06 {

    public static void main(String[] args) {

    }
}

/**
 * 懒汉式 - 双重检查，线程安全，推荐使用
 */
class Singleton {
    //1、私有化构造器
    private Singleton() {

    }

    //2、本类内部创建对象实例
    private static volatile Singleton instance;

    //3、提供一个公共的静态方法
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            //加入同步代码块
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
