import java.sql.*;

// you have to download MySQL-J Connector - to run this file.


public class JDBC_Connection {
    public static void main(String[] args) throws SQLException {
        tableValues();
        //insertdata();
        //delete();
        //update();
    }
    public static void tableValues() throws SQLException{
        String userName = "root";
        String password = "Vr1300488$";
        String url = "jdbc:mysql://localhost:3306/DbDemo";
        String query = "SELECT * FROM Employees";
        Connection con = DriverManager.getConnection(url,userName,password);
        Statement st = con.createStatement();
        ResultSet resultSet = st.executeQuery(query);
        while(resultSet.next()) {
            System.out.println("Name is : " + resultSet.getString(1));
            System.out.println("Salary is : " + resultSet.getInt(2));
            System.out.println("Company Name is : " + resultSet.getString(3));
            System.out.println("----------");
        }
        con.close();
    }
    public static void update() throws SQLException{
        String userName = "root";
        String password = "Vr1300488$";
        String url = "jdbc:mysql://localhost:3306/DbDemo";
        String query = "UPDATE Employees set name='virat' where Salary = 25000";
        Connection con = DriverManager.getConnection(url,userName,password);
        Statement st = con.createStatement();
        int rows = st.executeUpdate(query);
        System.out.println("Number of rows affected "+rows);
        con.close();
    }
    public static void delete() throws SQLException{
        String userName = "root";
        String password = "Vr1300488$";
        String url = "jdbc:mysql://localhost:3306/DbDemo";
        String query = "delete from Employees where salary = 25000";
        Connection con = DriverManager.getConnection(url,userName,password);
        Statement st = con.createStatement();
        int rows = st.executeUpdate(query);
        System.out.println("Number of rows affected "+rows);
        con.close();
    }
    public static void insertdata() throws SQLException{
        String userName = "root";
        String password = "Vr1300488$";
        String url = "jdbc:mysql://localhost:3306/DbDemo";
        String query = "Insert into Employees values('raja',27000,'zoho')";
        Connection con = DriverManager.getConnection(url,userName,password);
        Statement st = con.createStatement();
        int rows = st.executeUpdate(query);
        System.out.println("Number of rows affected "+rows);
        con.close();
    }
}
