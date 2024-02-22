
package healthcare;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class connectionclass {
    Connection con=null;
public static Connection connectDB(){
    try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/medico", "root", "");
            JOptionPane.showMessageDialog(null, "Database connected!");
            return con;
        } catch (Exception e) {
            System.out.println("not connected"); 
            return null;
}


}
}