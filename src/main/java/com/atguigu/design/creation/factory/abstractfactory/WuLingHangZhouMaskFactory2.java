package com.atguigu.design.creation.factory.abstractfactory;

/**
 * @author lihuaiqiang
 * @description
 * @date 2021/3/9 16:53
 */
public class WuLingHangZhouMaskFactory2 extends WuLingMaskFactory{
    @Override
    AbstractMask newMask() {
        return new CommonMask();
    }
}
