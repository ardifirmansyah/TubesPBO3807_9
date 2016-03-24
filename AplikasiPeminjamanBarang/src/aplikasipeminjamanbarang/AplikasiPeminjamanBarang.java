/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasipeminjamanbarang;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ardifirmansyah
 */
public class AplikasiPeminjamanBarang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        
        Connection koneksi = null;
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/pbo"; // sesuaikan dengan nama database anda
        String user = "root"; // user mysql anda
        String pass = ""; // passowrd mysql
 
        try {
            Class.forName(driver);
            koneksi = DriverManager.getConnection(url,user,pass);
            System.out.println("Koneksi Berhasil");
        } catch (SQLException e) {
            System.out.println("SQLException: "+e.getMessage());
            System.out.println("SQLState: "+e.getSQLState());
            System.out.println("VendorError: "+e.getErrorCode());
        }
        
        if (koneksi != null) {
            Launcher launcher = new Launcher();
            launcher.setLocationRelativeTo(null);
            launcher.setVisible(true);
        }
    }    
}
