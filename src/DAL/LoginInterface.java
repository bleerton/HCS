/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Doctor;
import BLL.Login;
import BLL.Patient;
import java.util.List;

/**
 *
 * @author bleer
 */
public interface LoginInterface {
    Login findByID(Integer id) throws HealthException ;
    Login loginByUsernamePassowrd(String login , String password) throws HealthException ;
    void create(Login l) throws HealthException;
    void delete(Login d) throws HealthException;
    List<Login> findAll() throws HealthException ;
    void edit(Login p) throws HealthException ;
}
