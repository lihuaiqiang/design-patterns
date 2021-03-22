package com.atguigu.design.creation.factory.abstractfactory;

/**
 * @author lihuaiqiang
 * @description
 * @date 2021/3/9 16:48
 */
public class MainTest {

    public static void main(String[] args) {
        WuLingFactory wuLingFactory = new WuLingWuHanMaskFactory();
        AbstractCar abstractCar = wuLingFactory.newCar();
        System.out.println(abstractCar); //null
        AbstractMask abstractMask = wuLingFactory.newMask();
        abstractMask.protectedMe(); //N95口罩，超级防护...

        wuLingFactory = new WuLingRacingCarFactory();
        AbstractCar abstractCar1 = wuLingFactory.newCar();
        abstractCar1.run(); //赛车===八缸配置：嗖...
        AbstractMask abstractMask1 = wuLingFactory.newMask();
        System.out.println(abstractMask1); //null

        System.out.println("=========================");

        WuLingHangZhouMaskFactory2 factory2 = new WuLingHangZhouMaskFactory2();
        AbstractCar abstractCar2 = factory2.newCar();
        System.out.println(abstractCar); //null
        AbstractMask abstractMask2 = factory2.newMask();
        abstractMask2.protectedMe(); //普通口罩，简单防护，请及时更换新的...

        WuLingRacingCarFactory2 factory21 = new WuLingRacingCarFactory2();
        AbstractCar abstractCar3 = factory21.newCar();
        abstractCar3.run(); //赛车===八缸配置：嗖...
        AbstractMask abstractMask3 = factory21.newMask();
        System.out.println(abstractMask3); //null
    }
}
