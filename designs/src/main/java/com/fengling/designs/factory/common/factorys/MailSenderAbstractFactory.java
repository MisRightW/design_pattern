package com.fengling.designs.factory.common.factorys;

import com.fengling.designs.factory.common.Sender;
import com.fengling.designs.factory.common.impl.MailSender;
import com.fengling.designs.factory.common.impl.SmsSender;

/**
 * mail
 * @author Administrator
 */
public class MailSenderAbstractFactory implements Provider {

    @Override
    public Sender produce() {
        return new MailSender();
    }
}
