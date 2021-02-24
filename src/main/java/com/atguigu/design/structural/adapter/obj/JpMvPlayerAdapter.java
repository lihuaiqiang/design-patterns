package com.atguigu.design.structural.adapter.obj;

import com.atguigu.design.structural.adapter.Player;
import com.atguigu.design.structural.adapter.Translator;
import com.atguigu.design.structural.adapter.ZhJpTranslator;

/**
 * 本类是一个适配器类，它是一个转换器，通过继承或引用适配者的对象（本类采用此方式），把适配者接口转换成目标接口。
 *
 * @author lihuaiqiang
 * @description
 * @date 2021/2/24 17:52
 * <p>
 * 创建适配器：这个是对象结构型模式
 * 适配转换到了翻译器的功能上。
 * <p>
 * 适配器模式：类结构性模式、对象结构型模式
 * <p>
 * 1、对象结构型模式关心类与对象的组合，通过关联关系在一个类中定义另一个类的实例对象（组合）
 * 2、根据“合成复用原则”，在系统中尽量使用关联关系来替代继承关系，因此大部分结构型模式都是对象结构型模式。
 *
 * 适配器模式包含的角色：
 * 1、目标接口（target） ：抽象类或者接口，客户希望直接用的接口。
 * 2、适配者类（Adaptee）：隐藏的转换接口，适配者的对象，即被适配的对象。
 * 3、适配器类（Adapter）：它是一个转换器，通过继承或者组合（在适配器类中引用适配者的对象当做自己的一个属性）的方式，
 *                       把适配者的接口转成客户想要使用的目标接口。
 */
public class JpMvPlayerAdapter implements Player {

    //组合的方式

    //目标接口
    private Translator translator = new ZhJpTranslator();

    //适配者的对象（隐藏的转换接口）  即被适配的对象
    private Player target;

    public JpMvPlayerAdapter(Player player) {
        this.target = player;
    }

    @Override
    public String play() {
        //播放器播放的内容，被适配的对象（适配者的对象）执行
        String content = target.play();
        String result = translator.translate(content);
        System.out.println("翻译器翻译后的日文：" + result);
        return content;
    }
}
