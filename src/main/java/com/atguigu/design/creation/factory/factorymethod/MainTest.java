package com.atguigu.design.creation.factory.factorymethod;

/**
 * @author lihuaiqiang
 * @description
 * @date 2021/3/9 11:27
 */
public class MainTest {

    public static void main(String[] args) {
        WuLingMiniCarFactory miniCarFactory = new WuLingMiniCarFactory();
        AbstractCar abstractCar = miniCarFactory.newCar();
        abstractCar.run(); //家用小汽车===四缸配置：嘟嘟嘟...

        WuLingRacingCarFactory factory = new WuLingRacingCarFactory();
        AbstractCar abstractCar1 = factory.newCar();
        abstractCar1.run(); //赛车===八缸配置：嗖...

        WuLingVanCarFactory factory1 = new WuLingVanCarFactory();
        AbstractCar abstractCar2 = factory1.newCar();
        abstractCar2.run(); //货车===单杠柴油机：哒哒哒...
    }
}
