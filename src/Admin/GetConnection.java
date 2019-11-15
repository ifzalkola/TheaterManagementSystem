/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author ifzal
 */
public class GetConnection {
    public ResultSet exQu(String query) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinemadb","root","Bilal_1053");
          Statement st = con.createStatement();
          ResultSet rs = st.executeQuery(query);
        
        return rs;
    }
    public void exUp(String query) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinemadb","root","Bilal_1053");
          Statement st = con.createStatement();
          st.executeUpdate(query);
    }
}
