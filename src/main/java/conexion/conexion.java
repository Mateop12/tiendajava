package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {

    public Connection  getConnectDB(){

        Connection connection = null;

        try{

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda","root","");
            if (connection != null){
                System.out.println("Database is connected");
            }
        }catch (SQLException e) {
            System.out.println(e);
        }

        return connection;
    }
}
