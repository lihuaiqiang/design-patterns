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
        System.out.println(instance == instance2);

        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
    }
}

enum Singleton {
    INSTANCE;


}
