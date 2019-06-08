/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Model;

import BLL.Request;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Enis
 */
public class RequestTableModel extends AbstractTableModel {
    List<Request> list;
    String [] cols={"Requester Name","Assigned Too","DueBy","Status"};
    
    
    public RequestTableModel(){}
    
    public RequestTableModel(List<Request> list){
        this.list=list;
    }
    public void addList(List<Request> list){
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
    
    public String getTime(){
//        java.util.Date dt = new java.util.Date();
//                java.text.SimpleDateFormat sdf = 
//                new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//                return sdf.format(dt);

    DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Calendar calendar = Calendar.getInstance();
    String s = dateformat.format(calendar.getTime());
    return s;
    
    }
    public Request getRequest(int index){
        return list.get(index);
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Request a = list.get(rowIndex);
        
        switch(columnIndex){
            case 0:
                return a.getPatientID().toString();
            case 1:
                return a.getDoctorID().toString();
            case 2:
                return getTime();
            case 3:
                return a.getStatus();
            default:
                return null;
        }
    }
}
