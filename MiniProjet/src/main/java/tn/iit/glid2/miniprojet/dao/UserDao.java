package tn.iit.glid2.miniprojet.dao;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import tn.iit.glid2.miniprojet.model.User;
import tn.iit.glid2.miniprojet.utils.HibernateUtils;

public class UserDao {
public User getByLoginPwd(String login, String pwd) {
	String queryString = "From User where login=?1 and pwd=?2";
	Session session = HibernateUtils.getSessionFactory().openSession();
	//Transaction trx = session.beginTransaction();
	Query query = session.createQuery(queryString);
	query.setParameter(1, login).setParameter(2, pwd);
	List<User> listeUser = query.list();
	return listeUser.get(0);
}
}
