package com.atguigu.design.creation.factory.abstractfactory;

/**
 * @author lihuaiqiang
 * @description
 * @date 2021/3/9 15:02
 * <p>
 * 具体产品：普通口罩
 */
public class CommonMask extends AbstractMask {

    public CommonMask() {
        this.price = 1;
    }

    @Override
    public void protectedMe() {
        System.out.println("普通口罩，简单防护，请及时更换新的...");
    }
}
