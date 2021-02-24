package com.atguigu.design.structural.adapter;

/**
 * @author lihuaiqiang
 * @description
 * @date 2021/2/24 17:14
 */
public class MvPlayer implements Player {
    @Override
    public String play() {
        //播放器播放的内容
        String content = "你好";
        System.out.println("MvPlayer播放器中打印出字幕：" + content);
        return content;
    }
}
