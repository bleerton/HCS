/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Model;

import BLL.Patient;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author bleer
 */
public class MyPatientsTableModel extends AbstractTableModel{
    
    List<Patient> list;
    String [] cols={"Patient ID","First Name","Last Name","Location","Date","Doctor","Status"};
    
    
    public MyPatientsTableModel(){}
    
    public MyPatientsTableModel(List<Patient> list){
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
                return a.getDateOfBirth();
            case 4:
                return a.getSex();
            case 5:
                return a.getEmail();
            default:
                return null;
        }
    }
}
