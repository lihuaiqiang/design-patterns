package com.atguigu.design.creation.factory.abstractfactory;

/**
 * @author lihuaiqiang
 * @description
 * @date 2021/3/9 15:01
 * <p>
 * 具体的产品：N95口罩
 */
public class N95Mask extends AbstractMask {

    public N95Mask() {
        this.price = 2;
    }

    @Override
    public void protectedMe() {
        System.out.println("N95口罩，超级防护...");
    }
}
