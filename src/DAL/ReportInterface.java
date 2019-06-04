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
public interface ReportInterface {
    void create(Report p) throws HealthException;

    void edit(Report p) throws HealthException;

    void delete(Report p) throws HealthException;

    Report findByID(Integer id) throws HealthException;

    List<Report> findAll() throws HealthException;
}
