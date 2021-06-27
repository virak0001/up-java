import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class MyConnection {
    private static MyConnection connection;
    MyConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/pms_api","root","");
            Statement stmt=con.createStatement();
            ResultSet resultSet= stmt.executeQuery("select * from users");
            System.out.println(resultSet);
            while(resultSet.next())
                System.out.println(resultSet.getInt(1) + "  " + resultSet.getString(2));
            con.close();
        }catch(Exception e){ System.out.println(e);}
    }
    public static  MyConnection connect(){
        if(connection == null) {
            synchronized (MyConnection.class) {
                if(connection == null) {
                  connection = new MyConnection();
                    return  connection;
                }
            }
        }
        return  connection;
    }
}