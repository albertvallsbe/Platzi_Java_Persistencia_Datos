package main;

import java.sql.Connection;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int option = 0;

        do {

            System.out.println("---------------------");
            System.out.println(" Messages Aplication ");
            System.out.println(" 1. Create Messages  ");
            System.out.println(" 2. Read Messages    ");
            System.out.println(" 3. Delete Messages  ");
            System.out.println(" 4. Update Messages  ");
            System.out.println(" 5. Exit             ");

            option = in.nextInt();

            switch (option) {
                case 1:
                    Service_Messages.createMessage();
                    break;

                case 2:
                    Service_Messages.readMessages();
                    break;

                case 3:
                    Service_Messages.deleteMessage();
                    break;

                case 4:
                    Service_Messages.updateMessage();
                    break;

                default:
                    break;

            }

        } while (option != 5);
            System.out.println("Successful exit from the program");
            in.close();
//        Conexion conexion = new Conexion();
//
//        try (Connection cnx = conexion.get_connection()) {
//
//        } catch (Exception e) {
//            System.out.println(e);
//
//        }
    }
}
