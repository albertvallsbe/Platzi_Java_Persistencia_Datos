/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Albert
 */
public class Messages {
    int id_message;
    String message;
    String message_author;
    String message_date;
    
    public Messages(){
        
    }

    public Messages(String message, String message_author, String message_date) {
        this.message = message;
        this.message_author = message_author;
        this.message_date = message_date;
    }
    
    

    public int getId_message() {
        return id_message;
    }

    public void setId_message(int id_message) {
        this.id_message = id_message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage_author() {
        return message_author;
    }

    public void setMessage_author(String message_author) {
        this.message_author = message_author;
    }

    public String getMessage_date() {
        return message_date;
    }

    public void setMessage_date(String message_date) {
        this.message_date = message_date;
    }
    
    
}
