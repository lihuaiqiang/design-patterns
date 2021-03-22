package com.atguigu.design.creation.factory.simplefactory;

/**
 * @author lihuaiqiang
 * @description
 * @date 2021/3/8 17:11
 */
public class MainTest {

    public static void main(String[] args) {
        WuLingSimpleFactory factory = new WuLingSimpleFactory();
        AbstractCar van = factory.newCar("van");
        van.run();

        AbstractCar mini = factory.newCar("mini");
        mini.run();
    }
}
