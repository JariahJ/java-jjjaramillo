/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sqlite;

/**
 *
 * @author jaria
 */
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class App {

    private Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DB.DEFAULT_URL);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void insert(String name, double capacity) {
        String sql = "INSERT INTO cars(name,capacity) VALUES(?,?)";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setDouble(2, capacity);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void createNewTable(String tableName) {
        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS "+ tableName +"(\n"
                + "	id integer PRIMARY KEY,\n"
                + "	name text NOT NULL,\n"
                + "	capacity real\n"
                + ");";

        try (Connection conn = connect();
                Statement stmt = conn.createStatement()) {
            // create a new table
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Connect to a sample database
     *
     * @param testdb the database file name
     */
    public void createNewDatabase() {

        try (Connection conn = connect()) {
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("A new database has been created.");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        App app = new App();
        app.run("cars on hand", "Toyota", 20);
        app.run("cars on hand", "Honda", 40);
        app.run("cars on hand", "Mitsubishi", 5);
        app.run("cars in storage","Nissan", 2000);
        app.run("cars in storage","Volks Wagen", 400);
        app.run("cars in storage","Tesla", 350 );
    }

    void run(String tableName, String name, double capacity) {
        createNewDatabase();
        createNewTable(tableName);
     
        insert(name, capacity);
    }
}
