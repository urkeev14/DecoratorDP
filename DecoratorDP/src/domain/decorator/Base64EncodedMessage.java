/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.decorator;

import domain.Message;
import java.util.Base64;

/**
 *
 * @author urosv
 */
public class Base64EncodedMessage implements Message {

    private Message message;

    public Base64EncodedMessage(Message message) {
        this.message = message;
    }

    @Override
    public String getContent() {
        return Base64.getEncoder().encodeToString(message.getContent().getBytes());
    }

}
