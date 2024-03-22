
public class InsertProductCmd {
    public static void main(String args[]){
        ProductDAO pdao = new ProductDAO();
        int productId = 78;
        String productName = "Coke";
        int supplierId = 1;
        int categoryId = 1;
        String unit = "bottle";
        int price = 9;
        
        Products p = new Products(productId,productName,supplierId,categoryId,unit,price  );
        pdao.add(p);
    }
}
