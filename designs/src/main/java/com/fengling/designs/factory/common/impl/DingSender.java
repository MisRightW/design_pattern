package com.fengling.designs.factory.common.impl;

import com.fengling.designs.factory.common.Sender;

/**
 * @author Administrator
 */
public class DingSender implements Sender {
    @Override
    public String send(String message) {
        return "ding send :{" + message + "} success";
    }
}
