package BLL;

import BLL.Appointment;
import BLL.Connection;
import BLL.Login;
import BLL.Report;
import BLL.Request;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-18T18:10:04")
@StaticMetamodel(Doctor.class)
public class Doctor_ { 

    public static volatile SingularAttribute<Doctor, String> lastName;
    public static volatile CollectionAttribute<Doctor, Request> requestCollection;
    public static volatile SingularAttribute<Doctor, String> address;
    public static volatile SingularAttribute<Doctor, Login> loginID;
    public static volatile CollectionAttribute<Doctor, Connection> connectionCollection;
    public static volatile SingularAttribute<Doctor, String> sex;
    public static volatile SingularAttribute<Doctor, Date> dateOfBirth;
    public static volatile CollectionAttribute<Doctor, Appointment> appointmentCollection;
    public static volatile SingularAttribute<Doctor, String> firstName;
    public static volatile SingularAttribute<Doctor, String> password;
    public static volatile SingularAttribute<Doctor, String> specalization;
    public static volatile SingularAttribute<Doctor, String> phoneNumber;
    public static volatile CollectionAttribute<Doctor, Report> reportCollection;
    public static volatile SingularAttribute<Doctor, Integer> doctorID;
    public static volatile SingularAttribute<Doctor, String> email;
    public static volatile SingularAttribute<Doctor, String> username;

}