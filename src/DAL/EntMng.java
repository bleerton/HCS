/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author bleer
 */
public class EntMng {
    EntityManager em = Persistence.createEntityManagerFactory("HealthCarePU").createEntityManager() ;
}
