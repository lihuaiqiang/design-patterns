package com.atguigu.design.creation.factory.simplefactory;

/**
 * @author lihuaiqiang
 * @description
 * @date 2021/3/8 17:28
 * <p>
 * 简单工厂类：
 * 1、产品数量极少
 */
public class WuLingSimpleFactory {

    public AbstractCar newCar(String type) {
        //简单工厂的核心就是：一切从简
        if ("van".equals(type)) {
            return new VanCar();
        } else if ("mini".equals(type)) {
            return new MiniCar();
        }

        //如果需要更多产品，就需要修改上面的if判断，这样就违反了开闭原则。应该是直接扩展出一个类来造出更多其他的产品。
        return null;
    }

}
