package haodong.net.cn.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDAO<T> {
	/**
	 * save instance of type T
	 * @param o
	 * @return
	 */
	public Serializable save(T o);
	/**
	 * delete instance
	 * @param o
	 */
	public void delete(T o);
	/**
	 * update one instance
	 * @param o
	 */
	public void update(T o);
	/**
	 * find list of type T with hql sentence
	 * @param hql
	 * @return
	 */
	public List<T> find(String hql);
}
