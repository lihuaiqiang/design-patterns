package com.atguigu.design.creation.factory.abstractfactory;

/**
 * @author lihuaiqiang
 * @description
 * @date 2021/3/9 16:08
 * <p>
 * 五菱分厂：生产五菱货车的分厂
 */
public class WuLingVanCarFactory extends WuLingFactory {
    /**
     * 只生产五菱货车，不生产口罩
     *
     * @return
     */
    @Override
    AbstractCar newCar() {
        return new VanCar();
    }

    @Override
    AbstractMask newMask() {
        return null;
    }
}
