/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author Albert
 */
public class Service_Messages {

    public static void createMessage() {
        Scanner in = new Scanner(System.in);
        System.out.println("Write your message: ");
        String message = in.nextLine();

        System.out.println("Your User: ");
        String message_author = in.nextLine();

        Messages register = new Messages();
        register.setMessage(message);
        register.setMessage_author(message_author);

        DAO_Messages.createMessageDB(register);

    }

    public static void readMessages() {
        DAO_Messages.readMessagesDB();
    }

    public static void deleteMessage() {
        Scanner in = new Scanner(System.in);
        System.out.println("Write the id_message to delete: ");
        int id_message = in.nextInt();
        DAO_Messages.deleteMessageDB(id_message);
    }

    public static void updateMessage() {
        Scanner in = new Scanner(System.in);
        System.out.println("Write your new message: ");
        String message = in.nextLine();
        
        System.out.println("Write the id_message to update: ");
        int id_message = in.nextInt();
        Messages updatable_message = new Messages();
        updatable_message.setId_message(id_message);
        updatable_message.setMessage(message);
                
        DAO_Messages.updateMessageDB(updatable_message);

    }
}
