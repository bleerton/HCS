/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Login;
import BLL.Patient;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author bleer
 */
public class LoginRepository extends EntMng implements LoginInterface {
    
    @Override
    public void create(Login p) throws HealthException {
        try {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new HealthException("Msg \n" + e.getMessage());
        }
    }
    
    @Override
    public void edit(Login p) throws HealthException {
        try {
            em.getTransaction().begin();
            em.merge(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new HealthException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public Login findByID(Integer id) throws HealthException {
        try {
            Query q = em.createQuery("SELECT l FROM Login l WHERE l.loginID = :loginID");
            q.setParameter("loginID", id);
            return (Login) q.getSingleResult();
        } catch (Exception e) {
            throw new HealthException("MSG:findByID " + e.getMessage());
        }
    }
    
    @Override
    public void delete(Login l) throws HealthException {
        try {
            em.getTransaction().begin();
            em.remove(l);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new HealthException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public Login loginByUsernamePassowrd(String login, String password) throws HealthException {
        try {
            Query q = em.createQuery("SELECT l FROM Login l WHERE l.username = :username AND l.password = :password ");
            q.setParameter("username", login);
            q.setParameter("password", password);
            return (Login) q.getSingleResult();
        } catch (Exception e) {
            throw new HealthException("MSG:findByID " + e.getMessage());
        }
    }
    
    @Override
    public List<Login> findAll() throws HealthException {
        try {
            return em.createNamedQuery("Login.findAll").getResultList();
        } catch (Exception e) {
            throw new HealthException("Msg! \n" + e.getMessage());
        }
    }
}