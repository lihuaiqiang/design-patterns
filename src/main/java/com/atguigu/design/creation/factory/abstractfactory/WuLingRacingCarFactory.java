package com.atguigu.design.creation.factory.abstractfactory;

/**
 * @author lihuaiqiang
 * @description
 * @date 2021/3/9 16:11
 * <p>
 * 五菱分厂：生产五菱跑车的分厂
 */
public class WuLingRacingCarFactory extends WuLingFactory {
    /**
     * 只生产五菱跑车，不生产口罩
     *
     * @return
     */
    @Override
    AbstractCar newCar() {
        return new RacingCar();
    }

    @Override
    AbstractMask newMask() {
        return null;
    }
}
