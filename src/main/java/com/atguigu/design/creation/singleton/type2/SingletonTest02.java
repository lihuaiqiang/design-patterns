package com.atguigu.design.creation.singleton.type2;


/**
 * @author lihuaiqiang
 * @description
 * @date 2021/2/22 20:56
 */
public class SingletonTest02 {

    public static void main(String[] args) {
        //测试
        Singleton2 instance = Singleton2.getInstance();
        Singleton2 instance2 = Singleton2.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}

/**
 * 饿汉式- 静态代码块
 *
 * 1、
 */
class Singleton2 {

    //1、私有化构造器
    private Singleton2() {

    }

    //2、本类内部创建对象实例。final用在饿汉式中
    private static final Singleton2 instance;

    static {
        //在静态代码块中创建单例对象
        instance = new Singleton2();
    }

    //3、提供一个公有的静态方法，返回实例对象
    public static Singleton2 getInstance() {
        return instance;
    }
}
