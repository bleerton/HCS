package BLL;

import BLL.Doctor;
import BLL.Patient;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-18T18:10:04")
@StaticMetamodel(Request.class)
public class Request_ { 

    public static volatile SingularAttribute<Request, Date> date;
    public static volatile SingularAttribute<Request, Doctor> doctorID;
    public static volatile SingularAttribute<Request, Patient> patientID;
    public static volatile SingularAttribute<Request, Integer> id;
    public static volatile SingularAttribute<Request, String> status;

}