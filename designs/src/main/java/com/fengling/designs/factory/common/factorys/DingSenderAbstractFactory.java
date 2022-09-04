package com.fengling.designs.factory.common.factorys;

import com.fengling.designs.factory.common.Sender;
import com.fengling.designs.factory.common.impl.DingSender;
import com.fengling.designs.factory.common.impl.MailSender;

/**
 * ding
 * @author Administrator
 */
public class DingSenderAbstractFactory implements Provider {

    @Override
    public Sender produce() {
        return new DingSender();
    }
}
