package fr.scoop.FindUrDev.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
 
import fr.scoop.FindUrDev.entity.AppRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
 
@Repository
@Transactional
public class AppRoleDAO {
 
    @Autowired
    private EntityManager entityManager;
 
    public List<String> getRoleNames(int i) {
        String sql = "Select ur.AppRole.role_name from " + AppRole.class.getName() + " ur " //
                + " where ur.AppUser.user_id = :user_id ";
 
        Query query = this.entityManager.createQuery(sql, String.class);
        query.setParameter("user_id", i);
        return query.getResultList();
    }
 
}