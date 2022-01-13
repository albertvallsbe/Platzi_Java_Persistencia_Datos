/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Albert
 */
public class DAO_Messages {

    public static void createMessageDB(Messages message) {
        Conexion db_connect = new Conexion();

        try (Connection conexion = db_connect.get_connection()) {

            PreparedStatement ps = null;
            try {
                String query = "INSERT INTO `messages` (message,  message_author) "
                        + "VALUES (?,?)";
                ps = conexion.prepareStatement(query);
                ps.setString(1, message.getMessage());
                ps.setString(2, message.getMessage_author());
                ps.executeUpdate();
                System.out.println("Message created successfully");

            } catch (SQLException ex) {
                System.out.println(ex);

            }
        } catch (SQLException e) {
            System.out.println(e);

        }
    }

    public static void readMessagesDB() {
        Conexion db_connect = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try (Connection conexion = db_connect.get_connection()) {

            String query = "SELECT * FROM messages";
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id_message"));
                System.out.println("Message: " + rs.getString("message"));
                System.out.println("Message Author: " + rs.getString("message_author"));
                System.out.println("Message Date: " + rs.getString("message_date"));
                System.out.println(" ");
            }

        } catch (SQLException e) {
            System.out.println("Messages could not be accessed");
            System.out.println(e);

        }

    }

    public static void deleteMessageDB(int id_message) {
        Conexion db_connect = new Conexion();

        try (Connection conexion = db_connect.get_connection()) {
            PreparedStatement ps = null;

            try {
                String query = "DELETE FROM messages WHERE id_message = ?";
                ps = conexion.prepareStatement(query);
                ps.setInt(1, id_message);
                ps.executeUpdate();
                System.out.println("Message has been deleted");

            } catch (SQLException ex) {
                System.out.println("Message could not be deleted");
                System.out.println(ex);

            }

        } catch (SQLException e) {
            System.out.println("Messages could not be accessed");
            System.out.println(e);

        }

    }

    public static void updateMessageDB(Messages message) {
        Conexion db_connect = new Conexion();

        try (Connection conexion = db_connect.get_connection()) {
            PreparedStatement ps = null;

            try {
                String query = "UPDATE messages SET message = ? "
                        + "WHERE id_message = ?";
                ps = conexion.prepareStatement(query);
                ps.setString(1, message.getMessage());
                ps.setInt(2, message.getId_message());
                ps.executeUpdate();
                System.out.println("Message has been updated");
            } catch (SQLException ex) {
                System.out.println("Message could not be updated");
                System.out.println(ex);
            }
        } catch (SQLException e) {
            System.out.println("Messages could not be accessed");
            System.out.println(e);

        }

    }
}
