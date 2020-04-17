/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.impl;

import domain.Message;

/**
 *
 * @author urosv
 */
public class TextMessage implements Message {

    private String content;

    public TextMessage(String message) {
        this.content = message;
    }

    public TextMessage() {
    }

    @Override
    public String getContent() {
        return this.content;
    }

}
