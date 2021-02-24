package com.atguigu.design.structural.adapter.obj;

import com.atguigu.design.structural.adapter.MvPlayer;

/**
 * @author lihuaiqiang
 * @description
 * @date 2021/2/24 18:24
 */
public class ObjAdapterMainTest {

    public static void main(String[] args) {
        JpMvPlayerAdapter adapter = new JpMvPlayerAdapter(new MvPlayer());
        String play = adapter.play();
        System.out.println("主测试类打印出的播放器的内容：" + play);
    }
}
