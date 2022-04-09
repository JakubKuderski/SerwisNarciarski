package sample;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.*;

public class DBConnection {
    private static Connection connection = null;

    private static void connect() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sklep_narciarski", "root", "tomholubek200119");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    private static void disConnect() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static ResultSet dbExecuteQuery(String statementQuery) throws SQLException {
        Statement statement = null;
        ResultSet resultSet = null;
        //aby zapobiec zamknięciu połączenia z bazą w czasie uzyskiwania danych (moglibysmy utracic polaczenia podcczas przytwarzania danych)
        CachedRowSet cachedRowSet = RowSetProvider.newFactory().createCachedRowSet();

        try {
            connect();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(statementQuery);
            cachedRowSet.populate(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) resultSet.close();
            if (statement != null) statement.close();
            disConnect();
        }

        return cachedRowSet;
    }


    public static void dbExecuteUpdate(String SQLstatement) throws SQLException {
        Statement statement = null;
        try{
            connect();
            statement = connection.createStatement();
            statement.executeUpdate(SQLstatement);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        finally {
            if(statement!=null) statement.close();
            disConnect();
        }
    }

}

