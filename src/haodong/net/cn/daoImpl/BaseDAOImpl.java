package haodong.net.cn.daoImpl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import haodong.net.cn.dao.BaseDAO;

@SuppressWarnings("all")
@Repository
public class BaseDAOImpl<T> implements BaseDAO<T> {
	@Resource
	private SessionFactory sessionFactory;
	/**
	 * return current session
	 * @return
	 */
	private Session getCurrentSession() {
		return this.sessionFactory.getCurrentSession();
	}
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Serializable save(T o) {
		return this.getCurrentSession().save(o);
	}

	public void delete(T o) {
		this.getCurrentSession().delete(o);
	}

	public void update(T o) {
		this.getCurrentSession().update(o);
	}

	public List<T> find(String hql) {
		return this.getCurrentSession().createQuery(hql).list();
	}
}
