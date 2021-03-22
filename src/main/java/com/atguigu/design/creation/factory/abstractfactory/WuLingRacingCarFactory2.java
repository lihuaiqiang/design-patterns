package com.atguigu.design.creation.factory.abstractfactory;

/**
 * @author lihuaiqiang
 * @description
 * @date 2021/3/9 17:56
 */
public class WuLingRacingCarFactory2 extends WuLingCarFactory{
    @Override
    AbstractCar newCar() {
        return new RacingCar();
    }
}
