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
public interface RequestInterface {
    void create(Request p) throws HealthException;

    void edit(Request p) throws HealthException;

    void delete(Request p) throws HealthException;

    Request findByID(Integer id) throws HealthException;

    List<Request> findAll() throws HealthException;
}
