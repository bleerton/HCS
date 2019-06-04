package BLL;

import BLL.Appointment;
import BLL.Login;
import BLL.Report;
import BLL.Request;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-04T19:59:48")
@StaticMetamodel(Patient.class)
public class Patient_ { 

    public static volatile SingularAttribute<Patient, String> lastName;
    public static volatile CollectionAttribute<Patient, Request> requestCollection;
    public static volatile SingularAttribute<Patient, String> address;
    public static volatile SingularAttribute<Patient, Login> loginId;
    public static volatile SingularAttribute<Patient, Integer> patientID;
    public static volatile SingularAttribute<Patient, String> sex;
    public static volatile SingularAttribute<Patient, Date> dateOfBirth;
    public static volatile CollectionAttribute<Patient, Appointment> appointmentCollection;
    public static volatile SingularAttribute<Patient, String> firstName;
    public static volatile SingularAttribute<Patient, String> password;
    public static volatile SingularAttribute<Patient, String> phoneNumber;
    public static volatile CollectionAttribute<Patient, Report> reportCollection;
    public static volatile SingularAttribute<Patient, String> email;
    public static volatile SingularAttribute<Patient, String> username;

}