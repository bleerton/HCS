/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Model;

import BLL.Appointment;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

public class AppointmentTableModel extends AbstractTableModel{
    List<Appointment> list;
    String [] cols={"Appointment ID","First Name","Last Name","Location","Date","Doctor","Status"};
    
    
    public AppointmentTableModel(){}
    
    public AppointmentTableModel(List<Appointment> list){
        this.list=list;
    }
    public void addList(List<Appointment> list){
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
    public Appointment getAppointment(int index){
        return list.get(index);
    }
    
    public String turnDate(Date d){
        String theDate = d.toString();
        System.out.println(theDate);
        String date1 = null;
        try { 
            date1=new SimpleDateFormat("yyyy/MM/dd").parse(theDate).toString();
        } catch (ParseException ex) {
            Logger.getLogger(AppointmentTableModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return date1;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Appointment a = list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return a.getAppointmentID();
            case 1:
                return a.getFirstNameOfPatient();
            case 2:
                return a.getLastNameOfPatient();
            case 3:
                return a.getLocation();
            case 4:
                return turnDate(a.getDateTime());
            case 5:
                return a.getDoctorID().getFirstName()+" "+a.getDoctorID().getLastName();
                case 6:
                return a.getStatus();
            default:
                return null;
        }
    }
}
