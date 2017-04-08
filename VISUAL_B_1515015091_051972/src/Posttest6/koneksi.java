package Posttest6;

// Mengimport kelas
import java.sql.*;
import javax.swing.JOptionPane;


public class koneksi {
     private static Connection con;
    
    public static Connection getConnection(){
        try{
        
        con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/praktikum_visual","root",""); // Untuk membuat koneksi
        // localhost dengan database yang telah dibuat bernama praktikum_visual, dan usernya adalah root
        JOptionPane.showMessageDialog(null, "Koneksi berhasil"); // Jika koneksi berhasil
        // maka akan muncul pesan atau JOptionPane yang memberitahukan bahwa koneksi berhasil
   
        } catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Koneski Gagal: " +e.getMessage());
           // Namun jika koneksi gagal, maka akan muncul pesan JOptionPane yang memberitahukan bahwa koneksi gagal
}
    return con; 
}
}
