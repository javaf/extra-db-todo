# java-db-connector

Ever tried to access a database using *JDBC* in Java. It involves - making sure
the database driver class is loaded (`oracle.jdbc.driver.OracleDriver` for Oracle SQL)
and getting the connection from `java.sql.DriverManager` using database
*connection string*, *username* and *password*.


Since these steps are straight-forward and connecting to a database is common in
many projects, the are normally put in a separate class as a function. Whenever
connection to the database is required, this class' function is called.
`java-db-connector` is a skeleton class for this purpose.


## Example

```java
// required modules
import java.sql.*;
import org.db.*;

public class Main {

    public static void main(String[] args) {
        Connection conn = Db.conn(); // get connection
        Statement cmd = conn.createStatement();
        ResultStatement ans = cmd.executeQuery("SELECT * FROM tab");
        System.out.println("Tables in database:");
        while(ans.next())
            System.out.println(ans.getString(1));
        conn.close();
    }
}
```
```
Tables in database:
EMP
DEPT
```

