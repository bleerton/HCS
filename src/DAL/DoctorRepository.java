/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Doctor;
import java.util.List;

/**
 *
 * @author bleer
 */
public class DoctorRepository extends EntMng implements DoctorInterface{
     @Override
    public void create(Doctor p) throws HealthException {
        try {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new HealthException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Doctor p) throws HealthException {
        try {
            em.getTransaction().begin();
            em.merge(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new HealthException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Doctor p) throws HealthException {
        try {
            em.getTransaction().begin();
            em.remove(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new HealthException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<Doctor> findAll() throws HealthException {
        try {
            return em.createNamedQuery("Doctor.findAll").getResultList();
        } catch (Exception e) {
            throw new HealthException("Msg! \n" + e.getMessage());
        }
    }

    @Override
    public Doctor findByID(Integer ID) throws HealthException {
        throw new UnsupportedOperationException("Per ma vone !");
    }

   
}
