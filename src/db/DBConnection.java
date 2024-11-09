package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    static Connection con;

    @SuppressWarnings({"UseSpecificCatch", "CallToPrintStackTrace"})
    public static Connection createConnection() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String user = "root";
            String pass = "Prabhu@123";
            String url = "jdbc:mysql://localhost:3306/student_d?autoReconnect=true&useSSL=false";

            con = DriverManager.getConnection(url, user, pass);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return con;
    }
}

