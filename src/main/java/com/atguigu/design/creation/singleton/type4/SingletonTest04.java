package com.atguigu.design.creation.singleton.type4;

/**
 * @author lihuaiqiang
 * @description
 * @date 2021/2/22 21:11
 */
public class SingletonTest04 {

    public static void main(String[] args) {

    }
}

/**
 * 懒汉式 - 同步方法：效率低，不推荐使用
 */
class Singleton {

    //1、私有化构造器
    private Singleton() {

    }

    //2、本类内部创建对象实例
    private static Singleton instance;

    //3、提供一个公共的静态方法，加入同步处理的方法，解决线程安全问题
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
