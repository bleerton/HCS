package BLL;

import BLL.Doctor;
import BLL.Patient;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-18T18:10:04")
@StaticMetamodel(Report.class)
public class Report_ { 

    public static volatile SingularAttribute<Report, Date> date;
    public static volatile SingularAttribute<Report, String> institution;
    public static volatile SingularAttribute<Report, Integer> code;
    public static volatile SingularAttribute<Report, Integer> reportID;
    public static volatile SingularAttribute<Report, String> city;
    public static volatile SingularAttribute<Report, Doctor> doctorID;
    public static volatile SingularAttribute<Report, Patient> patientID;
    public static volatile SingularAttribute<Report, String> diagnose;

}