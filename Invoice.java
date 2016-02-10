import java.sql.Timestamp;
/**
 * This represents an Invoice from the purchase of an item(s)
 * 
 * @author Karl
 */
public class Invoice {
    //private int InvoiceId;
    private String customerName;
    private Timestamp dateTime;
    private String upc;
    private int quantity;
    private String paymentType;
    private double subtotal;
    private String cardNum;
    private double amountTendered;
    
    public Invoice(){
        
    }
    
    /*      ACCESSORS             */
    public String getCustomerName(){
        return customerName;
    }
    public Timestamp getTimeStamp(){
        return dateTime;
    }
    public String getUpc(){
        return upc;
    }
    public int getQuantity(){
        return quantity;
    }
    public String getPaymentType(){
        return paymentType;
    }
    public double getSubtotal(){
        return subtotal;
    }
    public String getCardNum(){
        return cardNum;
    }
    public double getAmountTendered(){
        return amountTendered;
    }
    
    /* MUTATORS                      */
    public void setCustomerName(String name){
        this.customerName = name;
    }
    public void setUpc(String upc){
        this.upc = upc;
    }
    public void setTimeStamp(Timestamp ts){
        this.dateTime=ts;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
    public void setPaymentType(String name){
        customerName = name;
    }
    public void setSubtotal(double subtotal){
        this.subtotal=subtotal;
    }
    public void setCardNum(String cardNum){
        this.cardNum = cardNum;
    }
    public void setAmountTendered(double amtTendered){
        this.amountTendered=amtTendered;
    }
}
