package com.atguigu.design.creation.factory.abstractfactory;

/**
 * @author lihuaiqiang
 * @description
 * @date 2021/3/9 17:43
 */
public abstract class WuLingMaskFactory extends WuLingFactory{

    @Override
    AbstractCar newCar() {
        return null;
    }

    @Override
    abstract AbstractMask newMask();
}
