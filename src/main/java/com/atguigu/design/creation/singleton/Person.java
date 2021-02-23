package com.atguigu.design.creation.singleton;

/**
 * @author lihuaiqiang
 * @description
 * @date 2021/2/22 20:22
 */
public class Person {

    private String name;

    private Integer age;

    private static Person instance;

    /**
     * 构造器私有，外部不能实例化
     */
    private Person() {

    }

    /**
     * 提供给外部的供外部调用的获取实例的方法
     *
     * @return
     */
    public static Person getGuiGuBoss() {
        return instance;
    }
}
