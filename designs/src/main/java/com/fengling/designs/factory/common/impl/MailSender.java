package com.fengling.designs.factory.common.impl;

import com.fengling.designs.factory.common.Sender;

/**
 * @author Administrator
 */
public class MailSender implements Sender {
    @Override
    public String send(String message) {
        return "mail send :{" + message + "} success";
    }
}
