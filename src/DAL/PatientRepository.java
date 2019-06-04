/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import BLL.Patient;
import java.util.List;

/**
 *
 * @author bleer
 */
public class PatientRepository extends EntMng implements PatientInterface{
     @Override
    public void create(Patient p) throws HealthException {
        try {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new HealthException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Patient p) throws HealthException {
        try {
            em.getTransaction().begin();
            em.merge(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new HealthException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Patient p) throws HealthException {
        try {
            em.getTransaction().begin();
            em.remove(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new HealthException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<Patient> findAll() throws HealthException {
        try {
            return em.createNamedQuery("Patient.findAll").getResultList();
        } catch (Exception e) {
            throw new HealthException("Msg! \n" + e.getMessage());
        }
    }

    @Override
    public Patient findByID(Integer ID) throws HealthException {
        throw new UnsupportedOperationException("Per ma vone !");
    }

   
}
