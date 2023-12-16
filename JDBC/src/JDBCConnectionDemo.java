import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnectionDemo {

	public static void main(String[] args) {
		String URL="jdbc:mysql://localhost:3306/university";
		String USER_NAME="root";
		String PASSWORD="root";
		//String CREATE_STUDENT_QUERY="create table student6 (id int, name varchar(20),marks int);";
		//String INSERT_STUDENT_QUERY="insert into student6 values(1,'Monica',100);";
		String DELETE_STUDENT_QUERY="delete from student6 where id=1;";
		//String UPDATE_STUDENT_QUERY="Update  student6 set name='moni' where name='Monica';";
		
		try {
			//1.Load & Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("=====>Driver Loded & Registered Sucessfully !");
			//FQCN(Fully Qualified Class name) ----canonical name
			//2.establish connection with database
			Connection con=DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			System.out.println("Connection Established sucessfully "+con);
			
			//3.create Statement Object
			Statement stmt=con.createStatement();
			
			//4.send & execute query for creation
//			stmt.execute(CREATE_STUDENT_QUERY);
//			System.out.println("--------> student6 table is sucessfully created !");
			//4.send & execute query for insert
//			int rowAffected=stmt.executeUpdate(INSERT_STUDENT_QUERY);
//			System.out.println(rowAffected+" rows Affected!");
			//4.send & execute query for update
//			int rowAffected=stmt.executeUpdate(UPDATE_STUDENT_QUERY);
//			System.out.println(rowAffected+" rows Affected!");
			//4.send & execute query for delete
			int rowAffected=stmt.executeUpdate(DELETE_STUDENT_QUERY);
			System.out.println(rowAffected+" rows Affected!");
			
			
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("-----------> Drive Not Found !");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("-----------> Failed to establish connection !");
			e.printStackTrace();
		}

	}

}
