/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.io.Serializable;
import java.util.Date;
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
 * @author Enis
 */
@Entity
@Table(name = "Doctor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Doctor.findAll", query = "SELECT d FROM Doctor d")
    , @NamedQuery(name = "Doctor.findByDoctorID", query = "SELECT d FROM Doctor d WHERE d.doctorID = :doctorID")
    , @NamedQuery(name = "Doctor.findByFirstName", query = "SELECT d FROM Doctor d WHERE d.firstName = :firstName")
    , @NamedQuery(name = "Doctor.findByLastName", query = "SELECT d FROM Doctor d WHERE d.lastName = :lastName")
    , @NamedQuery(name = "Doctor.findBySpecalization", query = "SELECT d FROM Doctor d WHERE d.specalization = :specalization")
    , @NamedQuery(name = "Doctor.findByDateOfBirth", query = "SELECT d FROM Doctor d WHERE d.dateOfBirth = :dateOfBirth")
    , @NamedQuery(name = "Doctor.findByPhoneNumber", query = "SELECT d FROM Doctor d WHERE d.phoneNumber = :phoneNumber")
    , @NamedQuery(name = "Doctor.findByAddress", query = "SELECT d FROM Doctor d WHERE d.address = :address")
    , @NamedQuery(name = "Doctor.findByEmail", query = "SELECT d FROM Doctor d WHERE d.email = :email")
    , @NamedQuery(name = "Doctor.findBySex", query = "SELECT d FROM Doctor d WHERE d.sex = :sex")
    , @NamedQuery(name = "Doctor.findByUsername", query = "SELECT d FROM Doctor d WHERE d.username = :username")
    , @NamedQuery(name = "Doctor.findByPassword", query = "SELECT d FROM Doctor d WHERE d.password = :password")})
public class Doctor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DoctorID")
    @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator(name = "InvSeq", sequenceName = "INV_SEQ", allocationSize = 1)
    private Integer doctorID;
    @Basic(optional = false)
    @Column(name = "First_Name")
    private String firstName;
    @Basic(optional = false)
    @Column(name = "Last_Name")
    private String lastName;
    @Basic(optional = false)
    @Column(name = "Specalization")
    private String specalization;
    @Basic(optional = false)
    @Column(name = "Date_Of_Birth")
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
    @Basic(optional = false)
    @Column(name = "Phone_Number")
    private String phoneNumber;
    @Basic(optional = false)
    @Column(name = "Address")
    private String address;
    @Basic(optional = false)
    @Column(name = "Email")
    private String email;
    @Basic(optional = false)
    @Column(name = "Sex")
    private String sex;
    @Column(name = "Username")
    private String username;
    @Column(name = "Password")
    private String password;
    @JoinColumn(name = "Login_ID", referencedColumnName = "LoginID")
    @ManyToOne
    private Login loginID;

    public Doctor() {
    }

    public Doctor(Integer doctorID) {
        this.doctorID = doctorID;
    }

    public Doctor(Integer doctorID, String firstName, String lastName, String specalization, Date dateOfBirth, String phoneNumber, String address, String email, String sex) {
        this.doctorID = doctorID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.specalization = specalization;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
        this.sex = sex;
    }

    public Integer getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(Integer doctorID) {
        this.doctorID = doctorID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpecalization() {
        return specalization;
    }

    public void setSpecalization(String specalization) {
        this.specalization = specalization;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Login getLoginID() {
        return loginID;
    }

    public void setLoginID(Login loginID) {
        this.loginID = loginID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (doctorID != null ? doctorID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Doctor)) {
            return false;
        }
        Doctor other = (Doctor) object;
        if ((this.doctorID == null && other.doctorID != null) || (this.doctorID != null && !this.doctorID.equals(other.doctorID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return firstName+" "+lastName;
    }
    
}
