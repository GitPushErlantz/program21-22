/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author garate.erlantz
 */
public class Model {

    private static final String DB = ":C:/Users/garate.erlantz/Documents/GitHub/program21-22/ud4/HiztegiaSQLiteMVC/db/Hiztegia.db";
    private static String taula = "terminoak";

    public static Connection connect() {
        Connection conn = null;
        try {
            String url = "jdbc:sqlite" + DB;
            conn = DriverManager.getConnection(url);
            System.out.println("Connection to SQLite has been established.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public static void terminoakInprimatu() {
        String sql = "SELECT * FROM " + taula;

        try (Connection conn = connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            System.out.println("=========================================");
            while (rs.next()) {
                System.out.printf("%-5d %-15s %-15s\n", rs.getInt("id"), rs.getString("euskeraz"), rs.getString("gazteleraz"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void terminoaGehitu(String euskeraz, String gazteleraz) {
        String sql = "INSERT INTO " + taula + "(euskeraz,gazteleraz) VALUES(?, ?)";

        try (Connection conn = connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, euskeraz);
            pstmt.setString(2, gazteleraz);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void terminoaAldatu(int id, String euskeraz, String gazteleraz) {
        String sql = "UPDATE " + taula + " SET euskeraz = ? , " + "gazteleraz = ? " + "WHERE id = ?";

        try (Connection conn = Model.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // set the corresponding param
            pstmt.setString(1, euskeraz);
            pstmt.setString(2, gazteleraz);
            // update 
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void terminoaEzabatu(int id) {
        String sql = "DELETE FROM " + taula + " WHERE id = ?";

        try (Connection conn = connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // set the corresponding param
            pstmt.setInt(1, id);
            // execute the delete statement
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
