package com.atguigu.design.creation.factory.abstractfactory;

/**
 * @author lihuaiqiang
 * @description
 * @date 2021/3/9 11:53
 */
public class RacingCar extends AbstractCar {

    RacingCar() {
        this.engine = "赛车===八缸配置";
    }

    @Override
    public void run() {
        System.out.println(engine + "：嗖...");
    }
}
