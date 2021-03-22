package com.atguigu.design.creation.factory.factorymethod;


/**
 * @author lihuaiqiang
 * @description
 * @date 2021/3/8 17:32
 */
public class VanCar extends AbstractCar {

    VanCar() {
        this.engine = "货车===单杠柴油机";
    }

    @Override
    public void run() {
        System.out.println(engine + "：哒哒哒...");
    }
}
