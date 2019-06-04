/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Report;
import java.util.List;

/**
 *
 * @author bleer
 */
public class ReportRepository extends EntMng implements ReportInterface{
     @Override
    public void create(Report p) throws HealthException {
        try {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new HealthException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Report p) throws HealthException {
        try {
            em.getTransaction().begin();
            em.merge(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new HealthException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Report p) throws HealthException {
        try {
            em.getTransaction().begin();
            em.remove(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new HealthException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<Report> findAll() throws HealthException {
        try {
            return em.createNamedQuery("Report.findAll").getResultList();
        } catch (Exception e) {
            throw new HealthException("Msg! \n" + e.getMessage());
        }
    }

    @Override
    public Report findByID(Integer ID) throws HealthException {
        throw new UnsupportedOperationException("Per ma vone !");
    }

   
}
