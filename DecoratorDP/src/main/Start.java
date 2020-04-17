/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import domain.Message;
import domain.decorator.Base64EncodedMessage;
import domain.decorator.HTMLEncodedMessage;
import domain.impl.TextMessage;

/**
 *
 * @author urosv
 */
public class Start {
    
    public static void main(String[] args) {
        Message message = new TextMessage("The <FORCE> is strong with this one !");
        System.out.println(message.getContent());
        
        Message messageDecorator = new HTMLEncodedMessage(message);
        System.out.println(messageDecorator.getContent());
        
        messageDecorator = new Base64EncodedMessage(messageDecorator);
        System.out.println(messageDecorator.getContent());
        
    }
    
}
