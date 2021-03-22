package com.atguigu.design.creation.factory.abstractfactory;

/**
 * @author lihuaiqiang
 * @description
 * @date 2021/3/9 15:56
 * <p>
 * 五菱总厂（五菱集团），规范：
 */
public abstract class WuLingFactory {
    /**
     * 生产汽车
     *
     * @return
     */
    abstract AbstractCar newCar();

    /**
     * 生产口罩
     *
     * @return
     */
    abstract AbstractMask newMask();
}
