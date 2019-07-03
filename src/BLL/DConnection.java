/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DConnection {
    public Connection getConnection() throws SQLException{ //Me kriju connection per database se na vyn re raportet.
        //Qikjo metod kthen Connection , 
        Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=HealthCareScheduling","sa","as");
        //JDBC:sql server .... merret tek Services,databases, edhe e merr url e connection ton me db
        return conn;//kthe qit connection.shithahah
    }//a
}//mir