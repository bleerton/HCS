/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Model;

import BLL.Report;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author bleer
 */
public class ChooseReportComboBox extends AbstractListModel<Report> implements ComboBoxModel<Report>{
    List<Report> data;
    Report selectedItem;

    public ChooseReportComboBox(List<Report> data) {
        this.data = data;
    }

    public ChooseReportComboBox() {
    }
    public void add(List<Report> data) {
        this.data = data;
    }
    @Override
    public int getSize() {
        return data.size();
    }

    @Override
    public Report getElementAt(int index) {
        return data.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selectedItem=(Report)anItem;
    }

    @Override
    public Object getSelectedItem() {
        return selectedItem;
    }
    
}