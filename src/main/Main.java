// @wolfram77
package main;

// required modules
import java.sql.*;
import org.db.*;



public class Main {

    public static void main(String[] args) throws Exception {
        Connection conn = Db.conn();
        Statement cmd = conn.createStatement();
        ResultSet ans = cmd.executeQuery("SELECT * FROM tab");
        while(ans.next())
            System.out.println(ans.getString(1));
        conn.close();
    }
}
