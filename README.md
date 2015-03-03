# java-db-connector

Ever tried to access a database using *JDBC* in Java. It involves - making sure
the database driver class is loaded (`oracle.jdbc.driver.OracleDriver` for Oracle SQL)
and getting the connection from `java.sql.DriverManager` using database
*connection string*, *username* and *password*.

