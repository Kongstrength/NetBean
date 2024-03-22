import javax.persistence.*;
@Entity
@Table(name = "products")
public class Products {
    @Id
    @Column(name = "ProductID")
    private int ProductID;
    @Column(name = "ProductName")
    private String ProductName;
    @Column(name = "SupplierID")
    private int SupplierID;
    @Column(name = "CategoryID")
    private int CategoryID;
    @Column(name = "Unit")
    private String Unit;
    @Column(name = "Price")
    private double Price;

    public Products(){ }
    
    public Products(int ProductID, String ProductName, int SupplierID, int CategoryID, String Unit, double Price) {
        this.ProductID = ProductID;
        this.ProductName = ProductName;
        this.SupplierID = SupplierID;
        this.CategoryID = CategoryID;
        this.Unit = Unit;
        this.Price = Price;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int ProductID) {
        this.ProductID = ProductID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public int getSupplierID() {
        return SupplierID;
    }

    public void setSupplierID(int SupplierID) {
        this.SupplierID = SupplierID;
    }

    public int getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(int CategoryID) {
        this.CategoryID = CategoryID;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

}