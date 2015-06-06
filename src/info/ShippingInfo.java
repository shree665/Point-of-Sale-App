package info;

/**
 * 
 * @author shree665
 */
public class ShippingInfo {
    
    private String fNameShip;
    private String lNameShip;
    private String addressShip;
    private String cityShip;
    private Object stateShip;
    private String zipShip;

     public ShippingInfo(){
        
    }
    
    public ShippingInfo(Object shipping){
        
        this.fNameShip = fNameShip;
    }
    /**
     * @return the fNameShip
     */
    public String getfNameShip() {
        return fNameShip;
    }

    /**
     * @param fNameShip the fNameShip to set
     */
    public void setfNameShip(String fNameShip) {
        this.fNameShip = fNameShip;
    }

    /**
     * @return the lNameShip
     */
    public String getlNameShip() {
        return lNameShip;
    }

    /**
     * @param lNameShip the lNameShip to set
     */
    public void setlNameShip(String lNameShip) {
        this.lNameShip = lNameShip;
    }

    /**
     * @return the addressShip
     */
    public String getAddressShip() {
        return addressShip;
    }

    /**
     * @param addressShip the addressShip to set
     */
    public void setAddressShip(String addressShip) {
        this.addressShip = addressShip;
    }

    /**
     * @return the cityShip
     */
    public String getCityShip() {
        return cityShip;
    }

    /**
     * @param cityShip the cityShip to set
     */
    public void setCityShip(String cityShip) {
        this.cityShip = cityShip;
    }

    /**
     * @return the stateShip
     */
    public Object getStateShip() {
        return stateShip;
    }

    /**
     * @param stateShip the stateShip to set
     */
    public void setStateShip(Object stateShip) {
        this.stateShip = stateShip;
    }

    /**
     * @return the zipShip
     */
    public String getZipShip() {
        return zipShip;
    }

    /**
     * @param zipShip the zipShip to set
     */
    public void setZipShip(String zipShip) {
        this.zipShip = zipShip;
    }
    
    
    
}
