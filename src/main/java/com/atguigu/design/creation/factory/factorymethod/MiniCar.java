package com.atguigu.design.creation.factory.factorymethod;


/**
 * @author lihuaiqiang
 * @description
 * @date 2021/3/8 17:35
 */
public class MiniCar extends AbstractCar {

    MiniCar() {
        this.engine = "家用小汽车===四缸配置";
    }

    @Override
    public void run() {
        System.out.println(engine + "：嘟嘟嘟...");
    }
}
