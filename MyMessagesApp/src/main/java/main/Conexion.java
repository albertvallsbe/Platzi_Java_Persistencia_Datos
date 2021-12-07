package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public Connection get_connection() {

        Connection conection = null;
        try {
            conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/messages_app", "root", "");
            if (conection != null) {
                System.out.println("Connexió Exitosa ");
            }
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("Error Connexió ");

        }
        return conection;
    }

}
