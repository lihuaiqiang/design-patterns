package com.atguigu.design.creation.factory.abstractfactory;

/**
 * @author lihuaiqiang
 * @description
 * @date 2021/3/9 16:19
 * <p>
 * 五菱分厂：生产普通口罩的分厂
 */
public class WuLingHangZhouMaskFactory extends WuLingFactory {
    @Override
    AbstractCar newCar() {
        return null;
    }

    /**
     * 只生产普通口罩
     *
     * @return
     */
    @Override
    AbstractMask newMask() {
        return new CommonMask();
    }
}
