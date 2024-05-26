package MagicBook;
import java.util.ArrayList;



public class Products {
        private int Company_ID;
        private int Product_id;
        private String Product_Name;
        private double Product_Price;
        private int Product_Amount;
        private String Product_category ;
         ArrayList<Products> productList = new ArrayList<>();
        public  Products() {};
        public Products(int Company_ID, int product_id, String product_Name, double product_Price, int product_Amount,String product_category) {
                this.Company_ID = Company_ID;
                this.Product_id = product_id;
                this.Product_Name = product_Name;
                this.Product_Price = product_Price;
                this.Product_Amount = product_Amount;
                this.Product_category = product_category;
        }

        public int getCompany_ID() {
                return Company_ID;
        }

        public void setCompany_ID(int company_ID) {
                Company_ID = company_ID;
        }

        public int getProduct_id() {
                return Product_id;
        }

        public void setProduct_id(int product_id) {
                this.Product_id = product_id;
        }