/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.AppointmentRepository;
import DAL.HealthException;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author bleer
 */
@Entity
@Table(name = "Appointment")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Appointment.findAll", query = "SELECT a FROM Appointment a")
    , @NamedQuery(name = "Appointment.findByAppointmentID", query = "SELECT a FROM Appointment a WHERE a.appointmentID = :appointmentID")
    , @NamedQuery(name = "Appointment.findByFirstNameOfPatient", query = "SELECT a FROM Appointment a WHERE a.firstNameOfPatient = :firstNameOfPatient")
    , @NamedQuery(name = "Appointment.findByLastNameOfPatient", query = "SELECT a FROM Appointment a WHERE a.lastNameOfPatient = :lastNameOfPatient")
    , @NamedQuery(name = "Appointment.findByLocation", query = "SELECT a FROM Appointment a WHERE a.location = :location")
    , @NamedQuery(name = "Appointment.findByDateTime", query = "SELECT a FROM Appointment a WHERE a.dateTime = :dateTime")
    , @NamedQuery(name = "Appointment.findByNote", query = "SELECT a FROM Appointment a WHERE a.note = :note")
    , @NamedQuery(name = "Appointment.findByStatus", query = "SELECT a FROM Appointment a WHERE a.status = :status")})
public class Appointment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "AppointmentID")
    private Integer appointmentID;
    @Basic(optional = false)
    @Column(name = "First_Name_Of_Patient")
    private String firstNameOfPatient;
    @Basic(optional = false)
    @Column(name = "Last_Name_Of_Patient")
    private String lastNameOfPatient;
    @Basic(optional = false)
    @Column(name = "Location")
    private String location;
    @Column(name = "DateTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTime;
    @Basic(optional = false)
    @Column(name = "Note")
    private String note;
    @Column(name = "Status")
    private String status;
    @JoinColumn(name = "DoctorID", referencedColumnName = "DoctorID")
    @ManyToOne(optional = false)
    private Doctor doctorID;
    @JoinColumn(name = "PatientID", referencedColumnName = "PatientID")
    @ManyToOne(optional = false)
    private Patient patientID;

    public Appointment() {
    }

    public Appointment(Integer appointmentID) {
        this.appointmentID = appointmentID;
    }

    public Appointment(Integer appointmentID, String firstNameOfPatient, String lastNameOfPatient, String location, String note) {
        this.appointmentID = appointmentID;
        this.firstNameOfPatient = firstNameOfPatient;
        this.lastNameOfPatient = lastNameOfPatient;
        this.location = location;
        this.note = note;
    }

    public Integer getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(Integer appointmentID) {
        this.appointmentID = appointmentID;
    }

    public String getFirstNameOfPatient() {
        return firstNameOfPatient;
    }

    public void setFirstNameOfPatient(String firstNameOfPatient) {
        this.firstNameOfPatient = firstNameOfPatient;
    }

    public String getLastNameOfPatient() {
        return lastNameOfPatient;
    }

    public void setLastNameOfPatient(String lastNameOfPatient) {
        this.lastNameOfPatient = lastNameOfPatient;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (appointmentID != null ? appointmentID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Appointment)) {
            return false;
        }
        Appointment other = (Appointment) object;
        if ((this.appointmentID == null && other.appointmentID != null) || (this.appointmentID != null && !this.appointmentID.equals(other.appointmentID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BLL.Appointment[ appointmentID=" + appointmentID + " ]";
    }
 public static boolean exist(Appointment a) throws HealthException{
        AppointmentRepository ar = new AppointmentRepository();
        List<Appointment> all = ar.findAll();
        for (Appointment appointment : all) {
            if (appointment.getDoctorID().getDoctorID() == a.getDoctorID().getDoctorID() && appointment.getPatientID().getPatientID() == a.getPatientID().getPatientID()) {
                return true;
            }
        }
        return false;
    }   
}
