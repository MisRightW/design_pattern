package com.fengling.designs.factory.common.factorys;

import com.fengling.designs.factory.common.Sender;
import com.fengling.designs.factory.common.impl.MailSender;
import com.fengling.designs.factory.common.impl.SmsSender;

/**
 * @author Administrator
 */
public class SenderNFactory {

    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }

}
