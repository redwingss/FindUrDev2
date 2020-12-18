package fr.scoop.FindUrDev.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
 
import fr.scoop.FindUrDev.entity.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class AppUserDAO {
	
	@Autowired
	private EntityManager entityManager;
	
	public AppUser findUserAccount(String user_name) {
		try {
		String sql = "Select e from" + AppUser.class.getName() + "e" + "Where e.user_name = :user_name";
		
		Query query = entityManager.createQuery(sql,AppUser.class);
		query.setParameter("user_name", user_name);
		
		return (AppUser) query.getSingleResult();
	}catch(NoResultException e){
			return null;
	}
}
}
