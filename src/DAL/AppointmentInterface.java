/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Appointment;
import java.util.List;

/**
 *
 * @author bleer
 */
public interface AppointmentInterface {
    void create(Appointment a) throws HealthException;
    void edit(Appointment a) throws HealthException;    
    void delete(Appointment a) throws HealthException ;
    
    Appointment findByID(Integer id) throws HealthException ;
    
    List<Appointment> findAll() throws HealthException ;
    
}
