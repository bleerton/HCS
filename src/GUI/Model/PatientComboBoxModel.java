/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Model;

import BLL.Patient;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author Enis
 */
public class PatientComboBoxModel extends AbstractListModel<Patient> implements ComboBoxModel<Patient>{
    List<Patient> data;
    Patient selectedItem;

    public PatientComboBoxModel(List<Patient> data) {
        this.data = data;
    }

    public PatientComboBoxModel() {
    }
    public void add(List<Patient> data) {
        this.data = data;
    }
    @Override
    public int getSize() {
        return data.size();
    }

    @Override
    public Patient getElementAt(int index) {
        return data.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selectedItem=(Patient)anItem;
    }

    @Override
    public Object getSelectedItem() {
        return selectedItem;
    }
    
}