package xiongcz.src;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import xiongcz.src.mapper.UserMapper;



public class MybatisTest {
	
	public static void main(String[] args) {
		String configPath = "mabatis-config.xml";
		SqlSessionFactory factory =null;
		SqlSession sqlSession=null;
		try {
			factory = new SqlSessionFactoryBuilder().build(new FileInputStream(new File(configPath)));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		if(factory!=null){
			sqlSession = factory.openSession();
			UserMapper mapper = sqlSession.getMapper(xiongcz.src.mapper.UserMapper.class);
			mapper.selectAll();
		}
		
	}
	

}
