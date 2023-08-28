/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class config {

     private Connection akses;
    public Connection akses(){
        try{
            String url = "jdbc:mysql://localhost:3306/toko_kue2";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            akses = DriverManager.getConnection(url, user, pass);
        }catch(SQLException ex){
            Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
        }
        return akses;
    }
}
