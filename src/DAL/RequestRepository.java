/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Request;
import java.util.List;

/**
 *
 * @author Enis
 */
public class RequestRepository extends EntMng implements RequestInterface {
     @Override
    public void create(Request p) throws HealthException {
        try {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new HealthException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Request p) throws HealthException {
        try {
            em.getTransaction().begin();
            em.merge(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new HealthException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Request p) throws HealthException {
        try {
            em.getTransaction().begin();
            em.remove(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new HealthException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<Request> findAll() throws HealthException {
        try {
            return em.createNamedQuery("Request.findAll").getResultList();
        } catch (Exception e) {
            throw new HealthException("Msg! \n" + e.getMessage());
        }
    }

    @Override
    public Request findByID(Integer ID) throws HealthException {
        throw new UnsupportedOperationException("Per ma vone !");
    }
}
