package com.fengling.designs.factory.common.factorys;

import com.fengling.designs.factory.common.Sender;
import com.fengling.designs.factory.common.impl.MailSender;
import com.fengling.designs.factory.common.impl.SmsSender;

/**
 * 静态工厂
 * @author Administrator
 */
public class SenderStaticFactory {

    public static Sender produceMail() {
        return new MailSender();
    }

    public static Sender produceSms() {
        return new SmsSender();
    }

}
