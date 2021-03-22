package com.atguigu.design.creation.factory.abstractfactory;

/**
 * @author lihuaiqiang
 * @description
 * @date 2021/3/9 16:53
 */
public abstract class WuLingCarFactory extends WuLingFactory {
    @Override
    abstract AbstractCar newCar();

    @Override
    AbstractMask newMask() {
        return null;
    }
}
