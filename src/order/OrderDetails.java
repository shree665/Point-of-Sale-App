
package order;

/**
 * 
 * @author shree665
 */
public class OrderDetails {
    
      //Order Details
    private boolean credit;
    private boolean debit;
    private boolean payPal;
    
    private Object item;
    private String total;
    private String quantiy;
    private String price;
    private char[] creditNum;

    /**
     * @return the credit
     */
    public boolean isCredit() {
        return credit;
    }

    /**
     * @param credit the credit to set
     */
    public void setCredit(boolean credit) {
        this.credit = credit;
    }

    /**
     * @return the debit
     */
    public boolean isDebit() {
        return debit;
    }

    /**
     * @param debit the debit to set
     */
    public void setDebit(boolean debit) {
        this.debit = debit;
    }

    /**
     * @return the payPal
     */
    public boolean isPayPal() {
        return payPal;
    }

    /**
     * @param payPal the payPal to set
     */
    public void setPayPal(boolean payPal) {
        this.payPal = payPal;
    }

    /**
     * @return the item
     */
    public Object getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(Object item) {
        this.item = item;
    }

    /**
     * @return the total
     */
    public String getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(String total) {
        this.total = total;
    }

    /**
     * @return the quantiy
     */
    public String getQuantiy() {
        return quantiy;
    }

    /**
     * @param quantiy the quantiy to set
     */
    public void setQuantiy(String quantiy) {
        this.quantiy = quantiy;
    }

    /**
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * @return the creditNum
     */
    public char[] getCreditNum() {
        return creditNum;
    }

    /**
     * @param creditNum the creditNum to set
     */
    public void setCreditNum(char[] creditNum) {
        this.creditNum = creditNum;
    }
    
    
    
}
