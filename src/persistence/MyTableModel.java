package persistence;

import info.TableInformation;
import java.awt.event.ActionEvent;
import javax.swing.event.*;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

/**
 * s
 * @author shree665
 */
public class MyTableModel extends AbstractTableModel
        implements TableModelListener {
private Object[] names = {"First Name", "Last Name", "Billing Address", "Item Ordered", 
    "Quantity Ordered"};
private static ArrayList data = new ArrayList(10);



public MyTableModel() {
    
    
  
}

@Override
public String getColumnName(int i) {
    return (String) names[i];
}

@Override
public Object getValueAt(int r, int c) {
        TableInformation add = (TableInformation) data.get(r);
        return add.getValue(c);
   
}

@Override
public Class getColumnClass(int c) {
    
        return String.class;
}

@Override
public void setValueAt(Object value, int r, int c) {
        System.out.println(" Value Changed for Row = " + r + " Col = " + c + " :: " + (String) value);
        TableInformation add = (TableInformation) data.get(r);
        add.setValue(c, value);
}

@Override
public int getColumnCount() { return names.length;}

@Override
public int getRowCount() {return data.size();}

@Override
public boolean isCellEditable(int r, int c) {
    if (c == 3) return true;
    return false;
}

@Override
public void tableChanged(TableModelEvent tme) {
        int row = tme.getFirstRow();
        int col = tme.getColumn();
        int type = tme.getType();
        System.out.println(" Row Changed = " + row);
        System.out.println(" Col Changed = " + col);
        System.out.println(" Operation = " + type);

    }



public void editData(ActionEvent ae, int row, String fName, String lname, 
        String address, String itemOrder, String qty) {
    
     TableInformation add = (TableInformation) data.get(row);
      
        
        add.setValue(0, fName);
        add.setValue(1, lname);
        add.setValue(2, address);
        add.setValue(3, itemOrder);
        add.setValue(4, qty);
        
       

        super.fireTableRowsUpdated((int)row, (int)row);
       
        
       
  }

public void addData(ActionEvent ae, String fName, String lname, 
        String address, String itemOrder, String qty) {
        
 
           
        TableInformation add1 = new TableInformation();
      
         add1.setValue(0, fName);
         add1.setValue(1, lname);
         add1.setValue(2, address);
         add1.setValue(3, itemOrder);
         add1.setValue(4, qty);
      
        data.add(add1);

        super.fireTableRowsInserted(data.size()-1, data.size()-1);
  }
  
}