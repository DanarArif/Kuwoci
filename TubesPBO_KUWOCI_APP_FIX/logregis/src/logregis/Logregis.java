package logregis;
import java.sql.*;
public class Logregis {

    //public static void main(String[] args) {}
        // TODO code application logic here
        public static Connection koneksiDB(){
            Connection connection = null;
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/daftar", "root", "p0t@to3$m4n!");
                //"daftar" adalah nama file database, "root adalah kita, "p0t@to3$m4n!" adalah password sql ku,-
                //ganti dengan punya kalian masing"
                //jangan lupa tambahkan file mysql-connector jar pada library package project
                System.out.println("Connected With the database successfully"); //Message after successful connection
                return connection;
            }catch (SQLException e) {
                System.out.println("Error while connecting to the database"); //Message if something goes wrong while conneting to the database
                return null;
            }
            
        }
    
    
}
