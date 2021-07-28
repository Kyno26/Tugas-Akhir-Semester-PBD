/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import com.mysql.cj.jdbc.Driver;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
//mengimport komponen yang diperlukan

/**
 *
 * @author Suisei
 */
public class ConnectionHelper {
    //Parameter JDBC yang diperlukan agar dapat terhubung ke database
    private static final String DB_NAME = "storeHand";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static final String URL = "jdbc:mysql://localhost:3306/" +DB_NAME;
    
    private static Connection connection;
    public static Connection getConnection(){
        JFrame frame = new JFrame();
        try {
            DriverManager.registerDriver(new Driver());
            //menghubungkan ke database menggunakan URL, USER, dan PASS
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
        return connection;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(frame,"Koneksi Error!","FATAL",JOptionPane.ERROR_MESSAGE);
        }
        return connection;
    }
}
