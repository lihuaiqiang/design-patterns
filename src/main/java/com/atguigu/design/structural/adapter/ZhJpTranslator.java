package com.atguigu.design.structural.adapter;

/**
 * @author lihuaiqiang
 * @description
 * @date 2021/2/24 16:56
 */
public class ZhJpTranslator implements Translator {

    @Override
    public String translate(String content) {
        if ("你好".equals(content)) {
            return "空尼几哇";
        }
        if ("什么".equals(content)) {
            return "纳尼";
        }
        return null;
    }
}
