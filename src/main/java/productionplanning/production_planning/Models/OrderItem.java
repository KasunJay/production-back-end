package productionplanning.production_planning.Models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class OrderItem {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name="system-uuid",strategy = "uuid")
    private String orderItemId;

    private int quantity;

    @ManyToOne
    private SalesOrder salesOrderId;

    @OneToOne
    private Inspection inspectionId;

    @ManyToOne
    private Product productId;

    private String orderItemStatus;


    public String getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public SalesOrder getSalesOrderId() {
        return salesOrderId;
    }

    public void setSalesOrderId(SalesOrder salesOrderId) {
        this.salesOrderId = salesOrderId;
    }

    public Inspection getInspectionId() {
        return inspectionId;
    }

    public void setInspectionId(Inspection inspectionId) {
        this.inspectionId = inspectionId;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public String getOrderItemStatus() {
        return orderItemStatus;
    }

    public void setOrderItemStatus(String orderItemStatus) {
        this.orderItemStatus = orderItemStatus;
    }
}
