package xiongcz.src;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import xiongcz.src.entiy.User;
import xiongcz.src.mapper.UserMapper;


public class SpringTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "classpath:applicationcontext.xml" });
		SqlSessionFactory factory = (SqlSessionFactory) context.getBean("sqlSessionFactory");
		SqlSession session = factory.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		List<User> users = mapper.selectAll();
		for (User user : users) {
			System.out.println(user);
		}
	}
}
