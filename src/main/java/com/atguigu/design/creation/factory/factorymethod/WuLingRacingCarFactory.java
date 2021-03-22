package com.atguigu.design.creation.factory.factorymethod;

/**
 * @author lihuaiqiang
 * @description
 * @date 2021/3/9 11:56
 */
public class WuLingRacingCarFactory extends AbstractCarFactory {
    @Override
    AbstractCar newCar() {
        return new RacingCar();
    }
}
