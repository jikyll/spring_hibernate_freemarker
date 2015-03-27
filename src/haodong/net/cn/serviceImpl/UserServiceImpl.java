package haodong.net.cn.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import haodong.net.cn.dao.BaseDAO;
import haodong.net.cn.model.User;
import haodong.net.cn.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Resource
	private BaseDAO<User> baseDAO;

	public void saveUser(User user) {
		baseDAO.save(user);
	}

	public List<User> findAllUser() {
		return baseDAO.find("from User u order by u.createTime desc");
	}

	public void updateUser(User user) {
		baseDAO.update(user);
	}

	public void deleteUser(User user) {
		baseDAO.delete(user);
	}
}
