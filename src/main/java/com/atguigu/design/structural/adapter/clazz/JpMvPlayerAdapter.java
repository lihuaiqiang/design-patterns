package com.atguigu.design.structural.adapter.clazz;

import com.atguigu.design.structural.adapter.Player;
import com.atguigu.design.structural.adapter.ZhJpTranslator;

/**
 * @author lihuaiqiang
 * @description
 * @date 2021/2/25 8:00
 */
public class JpMvPlayerAdapter extends ZhJpTranslator implements Player {

    private Player target;

    public JpMvPlayerAdapter(Player player) {
        this.target = player;
    }

    @Override
    public String play() {
        String content = target.play();
        //转换字幕
        String result = translate(content);
        System.out.println("翻译后的日文：" + result);
        return content;
    }
}
