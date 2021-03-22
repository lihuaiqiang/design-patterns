package com.atguigu.design.creation.factory.abstractfactory;

/**
 * @author lihuaiqiang
 * @description
 * @date 2021/3/9 14:57
 * <p>
 * 定义抽象的产品：口罩
 */
public abstract class AbstractMask {

    /**
     * 价格
     */
    Integer price;

    /**
     * 口罩的功能
     */
    public abstract void protectedMe();
}
