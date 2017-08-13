package xiongcz.src;

import java.io.IOException;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import xiongcz.src.entiy.User;
import xiongcz.src.mapper.UserMapper;

public class MybatisTest {

	public static void main(String[] args) {
		String configPath = "xiongcz/src/config/mabatis-config.xml";
		// Resources.getResourceAsReader(configPath)
		SqlSessionFactory factory = null;
		SqlSession session = null;
		try {
			factory = new SqlSessionFactoryBuilder().build(Resources
					.getResourceAsReader(configPath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (factory != null) {
			session = factory.openSession(true);
		}
		if (session != null) {

			UserMapper mapper = session
					.getMapper(xiongcz.src.mapper.UserMapper.class);

			User user = new User();
			user = mapper.selectUserById(1112);
			mapper.deleteUser(1112);
			session.close();
		}
	}

}
