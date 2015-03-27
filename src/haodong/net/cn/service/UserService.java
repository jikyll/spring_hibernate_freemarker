package haodong.net.cn.service;

import java.util.List;

import haodong.net.cn.model.User;

public interface UserService {
	/**
	 * save user
	 * @param user
	 */
	public void saveUser(User user);
	/**
	 * find all user
	 * @return
	 */
	public List<User> findAllUser();
	/**
	 * update user
	 * @param user
	 */
	public void updateUser(User user);
	/**
	 * delete user
	 * @param user
	 */
	public void deleteUser(User user);
}
