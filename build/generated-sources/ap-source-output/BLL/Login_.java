package BLL;

import BLL.Administrator;
import BLL.Doctor;
import BLL.Patient;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-04T19:59:48")
@StaticMetamodel(Login.class)
public class Login_ { 

    public static volatile SingularAttribute<Login, String> password;
    public static volatile SingularAttribute<Login, Integer> loginID;
    public static volatile CollectionAttribute<Login, Administrator> administratorCollection;
    public static volatile CollectionAttribute<Login, Patient> patientCollection;
    public static volatile CollectionAttribute<Login, Doctor> doctorCollection;
    public static volatile SingularAttribute<Login, String> username;
    public static volatile SingularAttribute<Login, Integer> roli;

}