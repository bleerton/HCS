/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Connection;
import java.util.List;

/**
 *
 * @author Enis
 */
public interface ConnectionInterface {
    void create(Connection d) throws HealthException;

    void edit(Connection d) throws HealthException;

    void delete(Connection d) throws HealthException;

    Connection findByID(Integer id) throws HealthException;

    List<Connection> findAll() throws HealthException;
}
