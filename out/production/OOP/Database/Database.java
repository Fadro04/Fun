package OOP.Database;

import java.io.File;
import java.sql.*;

public class Database {
    public static Connection myconn = null;
    public static String sqliteServer = "jdbc:sqlite:";
    public static String resetPath = "";

    public Database() {
    }

    public static boolean isDatabaseExists(String dbFilePath) {
        File dbFile = new File(dbFilePath);
        return dbFile.exists();
    }

    public static Connection getConnection() {
        try {
            sqliteServer = "jdbc:sqlite:";
            String getFilePath = new File("").getAbsolutePath();
            String fileAbsolutePath = getFilePath.concat("\\Databases\\CinemaSanctuary");

            if (isDatabaseExists(fileAbsolutePath)) {
                myconn = DriverManager.getConnection(sqliteServer + fileAbsolutePath);
                System.out.println("Connection to SQLite has been established!");
            } else {
                createNewDatabase("Databases", "CinemaSanctuary");
                myconn = DriverManager.getConnection(sqliteServer + fileAbsolutePath);
                System.out.println("Connection to SQLite has been established!");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return myconn;
    }
    public static void createNewDatabase(String fileSubFolder, String filename) {
        String getfilePath = new File("").getAbsolutePath();
        String fileAbsolutePath;

        if (fileSubFolder.isEmpty()) {
            fileAbsolutePath = getfilePath.concat("\\" + filename + ".db");
            resetPath = fileAbsolutePath;
        } else {
            fileAbsolutePath = getfilePath.concat("\\" + fileSubFolder + "\\" + filename + ".db");
            resetPath = fileAbsolutePath;
        }
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(sqliteServer + fileAbsolutePath);
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
