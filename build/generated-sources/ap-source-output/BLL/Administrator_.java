package BLL;

import BLL.Login;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-04T19:59:48")
@StaticMetamodel(Administrator.class)
public class Administrator_ { 

    public static volatile SingularAttribute<Administrator, String> firstName;
    public static volatile SingularAttribute<Administrator, String> lastName;
    public static volatile SingularAttribute<Administrator, Integer> administratorID;
    public static volatile SingularAttribute<Administrator, String> password;
    public static volatile SingularAttribute<Administrator, String> phoneNumber;
    public static volatile SingularAttribute<Administrator, Login> loginID;
    public static volatile SingularAttribute<Administrator, String> sex;
    public static volatile SingularAttribute<Administrator, Date> dateOfbirth;
    public static volatile SingularAttribute<Administrator, String> email;
    public static volatile SingularAttribute<Administrator, String> username;

}