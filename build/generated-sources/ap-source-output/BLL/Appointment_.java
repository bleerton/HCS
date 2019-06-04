package BLL;

import BLL.Doctor;
import BLL.Patient;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-04T19:59:48")
@StaticMetamodel(Appointment.class)
public class Appointment_ { 

    public static volatile SingularAttribute<Appointment, Date> dateTime;
    public static volatile SingularAttribute<Appointment, String> note;
    public static volatile SingularAttribute<Appointment, Doctor> doctorID;
    public static volatile SingularAttribute<Appointment, Patient> patientID;
    public static volatile SingularAttribute<Appointment, Integer> appointmentID;
    public static volatile SingularAttribute<Appointment, String> firstNameOfPatient;
    public static volatile SingularAttribute<Appointment, String> location;
    public static volatile SingularAttribute<Appointment, String> lastNameOfPatient;
    public static volatile SingularAttribute<Appointment, String> status;

}