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
@Table(name = "Administrator")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Administrator.findAll", query = "SELECT a FROM Administrator a")
    , @NamedQuery(name = "Administrator.findByAdministratorID", query = "SELECT a FROM Administrator a WHERE a.administratorID = :administratorID")
    , @NamedQuery(name = "Administrator.findByFirstName", query = "SELECT a FROM Administrator a WHERE a.firstName = :firstName")
    , @NamedQuery(name = "Administrator.findByLastName", query = "SELECT a FROM Administrator a WHERE a.lastName = :lastName")
    , @NamedQuery(name = "Administrator.findByDateOfbirth", query = "SELECT a FROM Administrator a WHERE a.dateOfbirth = :dateOfbirth")
    , @NamedQuery(name = "Administrator.findByPhoneNumber", query = "SELECT a FROM Administrator a WHERE a.phoneNumber = :phoneNumber")
    , @NamedQuery(name = "Administrator.findByEmail", query = "SELECT a FROM Administrator a WHERE a.email = :email")
    , @NamedQuery(name = "Administrator.findBySex", query = "SELECT a FROM Administrator a WHERE a.sex = :sex")
    , @NamedQuery(name = "Administrator.findByUsername", query = "SELECT a FROM Administrator a WHERE a.username = :username")
    , @NamedQuery(name = "Administrator.findByPassword", query = "SELECT a FROM Administrator a WHERE a.password = :password")})
public class Administrator implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "AdministratorID")
    @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator(name = "InvSeq", sequenceName = "INV_SEQ", allocationSize = 1)
    private Integer administratorID;
    @Basic(optional = false)
    @Column(name = "First_Name")
    private String firstName;
    @Basic(optional = false)
    @Column(name = "Last_Name")
    private String lastName;
    @Basic(optional = false)
    @Column(name = "Date_Of_birth")
    @Temporal(TemporalType.DATE)
    private Date dateOfbirth;
    @Basic(optional = false)
    @Column(name = "Phone_Number")
    private String phoneNumber;
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

    public Administrator() {
    }

    public Administrator(Integer administratorID) {
        this.administratorID = administratorID;
    }

    public Administrator(Integer administratorID, String firstName, String lastName, Date dateOfbirth, String phoneNumber, String email, String sex) {
        this.administratorID = administratorID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfbirth = dateOfbirth;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.sex = sex;
    }

    public Integer getAdministratorID() {
        return administratorID;
    }

    public void setAdministratorID(Integer administratorID) {
        this.administratorID = administratorID;
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

    public Date getDateOfbirth() {
        return dateOfbirth;
    }

    public void setDateOfbirth(Date dateOfbirth) {
        this.dateOfbirth = dateOfbirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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
        hash += (administratorID != null ? administratorID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Administrator)) {
            return false;
        }
        Administrator other = (Administrator) object;
        if ((this.administratorID == null && other.administratorID != null) || (this.administratorID != null && !this.administratorID.equals(other.administratorID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

}
