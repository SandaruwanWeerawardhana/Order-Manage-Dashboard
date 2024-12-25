
package Model;

/**
 *
 * @author a
 */
public class OrderDetail {
    private String oderId;
    private String itemCode;
    private int qty;
    private double unitPrice;

    public OrderDetail() {
    }

    public OrderDetail(String oderId, String itemCode, int qty, double unitPrice) {
        this.oderId = oderId;
        this.itemCode = itemCode;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    /**
     * @return the oderId
     */
    public String getOderId() {
        return oderId;
    }

    /**
     * @param oderId the oderId to set
     */
    public void setOderId(String oderId) {
        this.oderId = oderId;
    }

    /**
     * @return the itemCode
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * @param itemCode the itemCode to set
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    /**
     * @return the qty
     */
    public int getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(int qty) {
        this.qty = qty;
    }

    /**
     * @return the unitPrice
     */
    public double getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    
    
}
