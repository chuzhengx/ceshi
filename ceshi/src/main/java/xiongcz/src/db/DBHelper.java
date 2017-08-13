package xiongcz.src.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import xiongcz.src.entiy.User;

public class DBHelper {
	private Connection connection;
	
	String url = "jdbc:oracle:thin:@192.168.16.105:1521:xiongcz";
	String driver = "oracle.jdbc.driver.OracleDriver";
	String user = "scott";
	String password = "18535259";
	
	
	public DBHelper(){
		
	}


	public List<User> queryAll() {
		List<User> users = new ArrayList<User>();
		User user;
		ResultSet rs=null;
		try {
			Statement statement = connection.createStatement();
			rs = statement.executeQuery("select * from EMP");
			while(rs.next()){
				user = new User();
				user.setName(rs.getString("ENAME"));
				user.setJob(rs.getString("JOB"));
				user.setSal(rs.getFloat("SAL"));
				users.add(user);
			}
			if(rs!=null){
				rs.close();
			}
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{

		}
		return users;
	}


	//获取数据库链接
	public Connection getConnection(){
		
		//注册驱动
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//链接数据库
		try {
			connection= DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

}
