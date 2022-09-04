package com.fengling.designs.factory.common.impl;

import com.fengling.designs.factory.common.Sender;

/**
 * @author Administrator
 */
public class SmsSender implements Sender {
    @Override
    public String send(String message) {
        return "sms send :{" + message + "} success";
    }
}
