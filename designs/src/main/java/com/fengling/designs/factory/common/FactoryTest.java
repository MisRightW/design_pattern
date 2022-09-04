package com.fengling.designs.factory.common;

import com.fengling.designs.factory.common.factorys.*;

/**
 *工厂模式：凡是出现了大量的产品需要创建，并且具有共同的接口时，可以通过工厂方法模式进行创建。
 * 在以上的三种模式中，第一种如果传入的字符串有误，不能正确创建对象，
 * 第三种相对于第二种，不需要实例化工厂类，所以，大多数情况下，我们会选用第三种——静态工厂方法模式。
 * @author Administrator
 */
public class FactoryTest {

    public static void main(String[] args) {
        // 简单工厂模式 ： 必须要传个type，type错了就会出错
//        String type = "mail";
//        Sender sender = new SenderFactory().handle(type);
//        String send = sender.send("哈哈哈");
//        System.out.printf(send);

        // 多个工厂模式 ： 可以解决上面的这个问题
//        Sender sender = new SenderNFactory().produceMail();
//        String result = sender.send("哈哈哈");
//        System.out.printf(result);

        // 静态工厂模式： 可以直接调用，一般直接用静态工厂，因为不用再创建工厂对象
//        Sender sender = SenderStaticFactory.produceMail();
//        System.out.printf(sender.send("哈哈哈"));

        // 抽象工厂模式：更好扩展：比如我想加一个钉钉的发送器，只需要加一个工厂类和一个send实现即可，不影响之前的类
//        Provider sender = new DingSenderAbstractFactory();
//        Sender result = sender.produce();
//        System.out.println(result.send("哈哈哈"));
    }

}
