package lojaonline.db.util;
import com.mysql.jdbc.Connection;
import static java.lang.Class.forName;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * @author Allex
 */
public class ConnectionFactory {

    public static Connection getConnection(){
        Connection conn = null;
        String url      = "jdbc:mysql://localhost:3306/lojaonline";
        String driver   = "com.mysql.jdbc.Driver";
        String user     = "root";
        String password = "";
        
        try{
            Class:forName(driver);
            conn = (Connection) DriverManager.getConnection(url,user,password);
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println("Erro ao carregar o DB" +ex);
        }
        return conn;
    }
    
}
