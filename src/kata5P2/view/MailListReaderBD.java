
package kata5P2.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import kata5P2.model.Mail;


public class MailListReaderBD {
    
    public static Connection connect(String URL) {
        Connection connection = null;
        try {
        String url = "jdbc:sqlite:C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Kata5P2\\KATA5.db";
         connection = DriverManager.getConnection(url);
         System.out.println("Connexión a SQLite establecida");
        }
        catch (SQLException exception){
            System.out.println("Error en onnexión a SQLite" + exception.getMessage());
        }
        
        finally {
            try {
                if (connection != null){
                    connection.close();
                }
                
            }
            catch (SQLException exception){
            System.out.println("Error en onnexión a SQLite" + exception.getMessage());
            return connection;
        }
            
   }
        return connection;
}
   
   public static List<Mail> read(){
       List<Mail> lista = new ArrayList();
       Connection connection = null;
       String sql="SELECT Mail FROM EMAIL";
       try {
        String url = "jdbc:sqlite:C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Kata5P2\\KATA5.db";
         connection = DriverManager.getConnection(url);
         Statement stmt = connection.createStatement();
         ResultSet rs = stmt.executeQuery(sql);
         
         while (rs.next()) {
         lista.add( new Mail(rs.getString("Mail")));
        }
        }
        catch (SQLException e) {
        System.out.println(e.getMessage());
        }       
       return lista;
   }
    
}