/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.HealthException;
import DAL.RequestRepository;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author bleer
 */
@Entity
@Table(name = "Request")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Request.findAll", query = "SELECT r FROM Request r")
    , @NamedQuery(name = "Request.findById", query = "SELECT r FROM Request r WHERE r.id = :id")
    , @NamedQuery(name = "Request.findByStatus", query = "SELECT r FROM Request r WHERE r.status = :status")
    , @NamedQuery(name = "Request.findByDate", query = "SELECT r FROM Request r WHERE r.date = :date")})
public class Request implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator(name = "InvSeq", sequenceName = "INV_SEQ", allocationSize = 1)
    private Integer id;
    @Column(name = "Status")
    private String status;
    @Column(name = "Date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @JoinColumn(name = "DoctorID", referencedColumnName = "DoctorID")
    @ManyToOne(optional = false)
    private Doctor doctorID;
    @JoinColumn(name = "PatientID", referencedColumnName = "PatientID")
    @ManyToOne(optional = false)
    private Patient patientID;

    public Request() {
    }

    public Request(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Doctor getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(Doctor doctorID) {
        this.doctorID = doctorID;
    }

    public Patient getPatientID() {
        return patientID;
    }

    public void setPatientID(Patient patientID) {
        this.patientID = patientID;
    }
    
    public static boolean exist(Request a) throws HealthException{
        RequestRepository ar = new RequestRepository();
        List<Request> all = ar.findAll();
        for (Request appointment : all) {
            if (appointment.getDoctorID().getDoctorID() == a.getDoctorID().getDoctorID() && appointment.getPatientID().getPatientID() == a.getPatientID().getPatientID()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Request)) {
            return false;
        }
        Request other = (Request) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BLL.Request[ id=" + id + " ]";
    }
    
}
