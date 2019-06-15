/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Model;

import BLL.Appointment;
import BLL.Patient;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Enis
 */
public class PatientTableModel extends AbstractTableModel{
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    List<Patient> list;
    String [] cols={"PatientID.","First Name","Last Name","Date of birth","Sex","Email"};
    
    
    public PatientTableModel(){}
    
    public PatientTableModel(List<Patient> list){
        this.list=list;
    }
    public void addList(List<Patient> list){
        this.list=list;
    }
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return cols.length;
    }
    @Override
    public String getColumnName(int col){
        return cols[col];
    }
    public void remove(int row){
        list.remove(row);
    }
    public Patient getPatient(int index){
        return list.get(index);
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Patient a = list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return a.getPatientID();
            case 1:
                return a.getFirstName();
            case 2:
                return a.getLastName();
            case 3:
                DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
                return dateformat.format(a.getDateOfBirth());
            case 4:
                return a.getSex();
            case 5:
                return a.getPhoneNumber();
            case 6:
                return a.getAddress();
            default:
                return null;
        }
    }
}


