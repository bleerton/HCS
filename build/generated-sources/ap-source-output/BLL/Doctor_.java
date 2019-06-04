package BLL;

import BLL.Login;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-04T19:59:48")
@StaticMetamodel(Doctor.class)
public class Doctor_ { 

    public static volatile SingularAttribute<Doctor, String> lastName;
    public static volatile SingularAttribute<Doctor, String> firstName;
    public static volatile SingularAttribute<Doctor, String> password;
    public static volatile SingularAttribute<Doctor, String> address;
    public static volatile SingularAttribute<Doctor, Login> loginID;
    public static volatile SingularAttribute<Doctor, String> specalization;
    public static volatile SingularAttribute<Doctor, String> phoneNumber;
    public static volatile SingularAttribute<Doctor, Integer> doctorID;
    public static volatile SingularAttribute<Doctor, String> sex;
    public static volatile SingularAttribute<Doctor, Date> dateOfBirth;
    public static volatile SingularAttribute<Doctor, String> email;
    public static volatile SingularAttribute<Doctor, String> username;

}