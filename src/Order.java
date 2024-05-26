package MagicBook;
public class Order {
    private int Company_ID;
    private int User_ID;
    private int Order_ID;
    private int Product_ID;
    private String Product_Name;
    private int Product_Amount;

    public Order(int Company_ID, int User_ID) {
        this.Company_ID = Company_ID;
        this.User_ID = User_ID;
    }

    private String Product_Description;

    public Order(int company_ID, int user_ID, int order_ID, int product_ID, String product_Name, int product_Amount, String product_Description) {
        Company_ID = company_ID;
        User_ID = user_ID;
        Order_ID = order_ID;
        Product_ID = product_ID;
        Product_Name = product_Name;
        Product_Amount = product_Amount;
        Product_Description = product_Description;
    }

    public int getCompant_ID() {
        return Company_ID;
    }

    public void setCompany_ID(int company_ID) {
        Company_ID = company_ID;
    }

    public int getUser_ID() {
        return User_ID;
    }

    public void setUser_ID(int user_ID) {
        User_ID = user_ID;
    }

    public int getOrder_ID() {
        return Order_ID;
    }

    public void setOrder_ID(int order_ID) {
        Order_ID = order_ID;
    }

    public int getProduct_ID() {
        return Product_ID;
    }

    public void setProduct_ID(int product_ID) {
        Product_ID = product_ID;
    }

    public String getProduct_Name() {
        return Product_Name;
    }

    public void setProduct_Name(String product_Name) {
        Product_Name = product_Name;
    }

    public int getProduct_Amount() {
        return Product_Amount;
    }

    public void setProduct_Amount(int product_Amount) {
        Product_Amount = product_Amount;
    }

    public String getProduct_Description() {
        return Product_Description;
    }

    public void setProduct_Description(String product_Description) {
        Product_Description = product_Description;
    }
}