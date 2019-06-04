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
public interface PatientInterface {

    void create(Patient p) throws HealthException;

    void edit(Patient p) throws HealthException;

    void delete(Patient p) throws HealthException;

    Patient findByID(Integer id) throws HealthException;

    List<Patient> findAll() throws HealthException;
}
