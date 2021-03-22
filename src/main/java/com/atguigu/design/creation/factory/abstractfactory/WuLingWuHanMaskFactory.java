package com.atguigu.design.creation.factory.abstractfactory;

/**
 * @author lihuaiqiang
 * @description
 * @date 2021/3/9 16:14
 * <p>
 * 五菱分厂：生产N95口罩的分厂
 */
public class WuLingWuHanMaskFactory extends WuLingFactory {
    @Override
    AbstractCar newCar() {
        return null;
    }

    /**
     * 只生产N95口罩，不生产汽车
     *
     * @return
     */
    @Override
    AbstractMask newMask() {
        return new N95Mask();
    }
}
