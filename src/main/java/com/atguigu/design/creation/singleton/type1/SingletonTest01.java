package com.atguigu.design.creation.singleton.type1;

/**
 * @author lihuaiqiang
 * @description
 * @date 2021/2/22 20:44
 */
public class SingletonTest01 {

    public static void main(String[] args) {
        //测试
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}

/**
 * 饿汉式 - 静态变量
 * <p>
 * ①优点：这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同步问题。
 * ②缺点：在类装载的时候就完成实例化，没有达到 Lazy Loading 的效果。如果从始至终从未使用过这个实例，则会造成内存的浪费。
 * ③
 */
class Singleton {

    //1、构造器私有化，外部不能 new
    private Singleton() {

    }

    //2、本类内部创建对象实例。final用在饿汉式中
    private static final Singleton instance = new Singleton();

    //3、提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance() {
        return instance;
    }
}
