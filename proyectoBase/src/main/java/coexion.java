/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author e-zof
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class coexion {
 
    
    public static void main(String[] args) throws SQLException {
   Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRs = null;

       

        try {
            // 1. Get a connection to database
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testlocal?user=ricardo&password=12345?allowPublicKeyRetrieval=true&useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
          
            

            // 2. Create a statement
            myStmt = myConn.createStatement();

            // 3. Execute SQL query
            myRs = myStmt.executeQuery("select * from records");

            // 4. Process the result set
            while (myRs.next()) {
                System.out.println(myRs.getString("mensaje") + ", " + myRs.getString("id_stand"));
            }

        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {
            if (myRs != null) {
                myRs.close();
            }

            if (myStmt != null) {
                myStmt.close();
            }

            if (myConn != null) {
                myConn.close();
            }
        }
    }
    
}
