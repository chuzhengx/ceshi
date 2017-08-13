package xiongcz.src.mapper;

import java.util.List;

import xiongcz.src.entiy.User;

public interface UserMapper {
	
	public List<User> selectAll();
	
	public User selectUserById(int id);
	
	public void addUser(User user);
	
	public void updateUser(User user);
	
	public void deleteUser(int id);
}
