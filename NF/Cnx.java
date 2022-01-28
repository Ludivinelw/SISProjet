package NF;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cnx {
    private String server = "localhost";
    private String username = "root";
    private String password = "phantom";
    private String dbname = "users_db";
    private Integer portnumber = 3307;

    public Cnx getConnection(){
        Cnx cnx = null;
        MysqlDataSource dataSource = new MysqlDataSource();

        dataSource.setServerName(server);
        dataSource.setUser(username);
        dataSource.setPassword(password);
        dataSource.setDatabaseName(dbname);
        dataSource.setPortNumber(portnumber);

        try {
            cnx = (Cnx) dataSource.getConnection();
        } catch (SQLException e) {
            Logger.getLogger("Get Connection ->" + Cnx.class.getName()).log(Level.SEVERE, null,e);
        }
        return cnx;
    }



}
