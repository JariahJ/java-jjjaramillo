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
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DB extends DefaultDB {

    public static String DEFAULT_DB = "cars.db";
    public static String DEFAULT_URL = "jdbc:sqlite:" + DEFAULT_DB;

    DB() {
        this(DEFAULT_URL);
    }

    DB(String url) {
        setURL(url);
    }

    void reset() throws SQLException {
        sql("drop table if exists cars");
        sql("create table cars (id integer primary key, name string)");
    }

    long insertCar(String name) throws SQLException {
        return longResult(sql("insert into cars (name) values (?)", name));
    }

    String getCar(long id) throws SQLException {
        return stringResult(sql("select name from cars where id=?", id));
    }

    void run() throws SQLException {
        reset();
        long toyotaId = insertCar("toyota");
        System.out.println("toyotaId=" + toyotaId);
        long hondaId = insertCar("honda");
        System.out.println("toyota name=" + getCar(toyotaId));
    }

}
