package com.atguigu.design.structural.adapter;

/**
 * @author lihuaiqiang
 * @description
 * @date 2021/2/24 16:52
 * <p>
 * 2、系统原有接口，可以翻译文字内容
 *
 * 不同的实现类，便可实现不同的功能
 * ZH_JP翻译器
 * ZH_EN翻译器
 * .....
 */
public interface Translator {

    String translate(String content);
}
