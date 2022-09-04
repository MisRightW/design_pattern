package com.fengling.designs.factory.common.factorys;

import com.fengling.designs.factory.common.Sender;
import com.fengling.designs.factory.common.impl.MailSender;
import com.fengling.designs.factory.common.impl.SmsSender;

/**
 * @author Administrator
 */
public class SenderFactory {

    private static final String MAIL = "mail";
    private static final String SMS = "sms";

    public Sender handle(String type) {
        if (MAIL.equals(type)) {
            return new MailSender();
        } else if (SMS.equals(type)) {
            return new SmsSender();
        } else {
            throw new UnsupportedOperationException("不支持该类型");
        }
    }

}
