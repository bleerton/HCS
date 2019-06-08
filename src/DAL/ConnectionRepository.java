/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Connection;
import BLL.Patient;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Enis
 */
public class ConnectionRepository extends EntMng implements ConnectionInterface{

    @Override
    public void create(Connection p) throws HealthException {
        try {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new HealthException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Connection p) throws HealthException {
        try {
            em.getTransaction().begin();
            em.merge(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new HealthException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Connection p) throws HealthException {
        try {
            em.getTransaction().begin();
            em.remove(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new HealthException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<Connection> findAll() throws HealthException {
        try {
            return em.createNamedQuery("Connection.findAll").getResultList();
        } catch (Exception e) {
            throw new HealthException("Msg! \n" + e.getMessage());
        }
    }

    @Override
    public Connection findByID(Integer ID) throws HealthException {
        try {
           Query q=em.createQuery("Select p from Connection p where p.id=:abcde");
           q.setParameter("abcde",ID);
           return (Connection)q.getSingleResult();
        } catch (Exception e) {
            throw new HealthException("Msg! \n" + e.getMessage());
        }
    }
    
}
