package info;

/**
 * 
 * @author shree665
 */
public class TableInformation {

    public String fName;
    public String lName;
    public String address;
    public String itemOrder;
    public String qty;

   

    public Object getValue(int i) {
        switch (i) {
            case 0:
                return fName;
            case 1:
                return lName;
            case 2:
                return address;
            case 3:
                return itemOrder;
            case 4:
                return qty;
      
       
        }
        return "";
     }

    public void setValue(int i, Object val) {
        switch (i) {
            case 0:
                 fName = (String) val;
                 break;
            case 1:
                lName = (String) val;
                break;
            case 2:
                address = (String) val;
                break;
            case 3:
                itemOrder = (String) val;
                break;
            case 4:
                qty = (String) val;
                break;
      
        
        }

     }

}