package BLL;

import BLL.Doctor;
import BLL.Patient;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-10T15:54:48")
@StaticMetamodel(Report.class)
public class Report_ { 

    public static volatile SingularAttribute<Report, Date> date;
    public static volatile SingularAttribute<Report, Integer> reportID;
    public static volatile SingularAttribute<Report, Doctor> doctorID;
    public static volatile SingularAttribute<Report, Patient> patientID;

}