/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.decorator;

import domain.Message;
/**
 *
 * @author urosv
 */
public class HTMLEncodedMessage implements Message{

    private Message message;

    public HTMLEncodedMessage(Message message) {
        this.message = message;
    }
    
    @Override
    public String getContent() {
        return "<p>" + message.getContent() + "</p>";
    }
    
}
