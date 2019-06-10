package BLL;

import BLL.Login;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-10T15:54:48")
@StaticMetamodel(Patient.class)
public class Patient_ { 

    public static volatile SingularAttribute<Patient, String> lastName;
    public static volatile SingularAttribute<Patient, String> firstName;
    public static volatile SingularAttribute<Patient, String> password;
    public static volatile SingularAttribute<Patient, String> parentName;
    public static volatile SingularAttribute<Patient, String> address;
    public static volatile SingularAttribute<Patient, Login> loginId;
    public static volatile SingularAttribute<Patient, String> phoneNumber;
    public static volatile SingularAttribute<Patient, Integer> patientID;
    public static volatile SingularAttribute<Patient, String> sex;
    public static volatile SingularAttribute<Patient, Date> dateOfBirth;
    public static volatile SingularAttribute<Patient, String> email;
    public static volatile SingularAttribute<Patient, String> username;

}