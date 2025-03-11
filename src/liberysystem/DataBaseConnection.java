
package liberysystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataBaseConnection {
    Connection con;
    String url="jdbc:mySql://localhost:3306/librarysystem";
    String username="root";
    String password="";
    
//    String url="jdbc:mySql://nvtibaddegama.tech:3306/nvtibad1_2023_13_ librarysystem";
//    String username="nvtibad1_SandunDeshan";
//    String password="@Sandun13De";
     public void DBConnection(){
         try {
             Class.forName("com.mysql.cj.jdbc.Driver");
             con=DriverManager.getConnection(url,username,password);
         } catch (ClassNotFoundException | SQLException ex) {
             Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
}
