package BLL;

import BLL.Doctor;
import BLL.Patient;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-09T12:42:08")
@StaticMetamodel(Connection.class)
public class Connection_ { 

    public static volatile SingularAttribute<Connection, Doctor> doctorID;
    public static volatile SingularAttribute<Connection, Patient> patientID;
    public static volatile SingularAttribute<Connection, Integer> id;

}