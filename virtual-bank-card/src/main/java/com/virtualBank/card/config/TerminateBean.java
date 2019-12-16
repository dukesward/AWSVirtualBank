package com.virtualBank.card.config;

import javax.annotation.PreDestroy;

public class TerminateBean {
    @PreDestroy
    public void preDestroy() {
        System.out.println("TerminalBean is destroyed");
    }

}
