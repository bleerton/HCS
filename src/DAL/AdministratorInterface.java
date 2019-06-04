/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Administrator;
import java.util.List;

/**
 *
 * @author bleer
 */
public interface AdministratorInterface {

    void create(Administrator a) throws HealthException;

    void edit(Administrator a) throws HealthException;

    void delete(Administrator a) throws HealthException;

    Administrator findByID(Integer id) throws HealthException;

    List<Administrator> findAll() throws HealthException;
}
