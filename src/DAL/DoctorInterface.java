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
public interface DoctorInterface {

    void create(Doctor d) throws HealthException;

    void edit(Doctor d) throws HealthException;

    void delete(Doctor d) throws HealthException;

    Doctor findByID(Integer id) throws HealthException;

    List<Doctor> findAll() throws HealthException;
}
