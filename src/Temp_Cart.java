package Magicbook;
public class Temp_Cart {
    double sum;
    Company_User cUser = new Company_User();
    Products products = new Products();

    public Temp_Cart() {}

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public Company_User getcUser() {
        return pUser;
    }

    public void setcUser(Company_User cUser) {
        this.pUser = pUser;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

}