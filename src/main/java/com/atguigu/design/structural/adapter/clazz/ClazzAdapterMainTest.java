package com.atguigu.design.structural.adapter.clazz;

import com.atguigu.design.structural.adapter.MvPlayer;

/**
 * @author lihuaiqiang
 * @description
 * @date 2021/2/25 8:08
 */
public class ClazzAdapterMainTest {

    public static void main(String[] args) {
        JpMvPlayerAdapter adapter = new JpMvPlayerAdapter(new MvPlayer());
        String play = adapter.play();
    }
}
