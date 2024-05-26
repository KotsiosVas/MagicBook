package Magicbook;
import java.util.ArrayList;

public class Eshop {
    String name = "Magicbook bookshop ";
    User user;
    Company_User companyUser;
    Products products;
    Favorites favorites;
    Products Favorites;
    ArrayList<User> userList = new ArrayList<>();
    ArrayList<Company_User> compnayList = new ArrayList<>();
    ArrayList<Products> productsList = new ArrayList<>();
    ArrayList<String> categories = new ArrayList<>();
    ArrayList<Favorites> FavoritesList = new ArrayList<>();

    public void addCompanyUser(Company_User companypUser) {
        try {
            if (companyUserList.contains(companyUser))
                throw new IllegalArgumentException("Company user already exists");
            else
                companyUserList.add(companyUser);
        } catch (Exception e) {
            System.out.println("The Company user already exists in the list");
        }
    }

    public void addUser(User user) {
        try {
            if (userList.contains(user))
                throw new IllegalArgumentException("User already exists");
            else
                userList.add(user);
        } catch (Exception e) {
            System.out.println("The user already exists in the list");
        }
    }

    
    public void addFavorites(Favorites favorites){
        try{
            if(FavoritesList.contains(favorites))
                throw new IllegalArgumentException("Product already exists");
            else
                FavoritesList.add(favorites);
        }catch (Exception e){
            System.out.println("product already in fav List ");
        }}

   
    public  void showFavorites(){
            int j =1 ;
            System.out.println("Favorites: ");
            for(int i=0;i<FavoritesList.size();i++){
                System.out.println(FavoritesList.get(i));
                }
            }
    
    public void addProducts(Products product) {
        try {
            if (productsList.contains(product))
                throw new IllegalArgumentException("Product already exists");
            else
                productsList.add(product);
        } catch (Exception e) {
            System.out.println("The product already exists in the list111111");
        }
    }

    public void showCategories() {
        int i=1;
        System.out.println("Categories:");
        for (Products product : productsList){
            String category = product.getProduct_category();
            if (!(categories.contains(category)))
                categories.add(category);
        }
        for (String c : categories){
            System.out.println(i + ": " + c);
            i++;
        }
    }

      public void showProducts() {
        System.out.println("Product List:");
        for (Products product : productsList) {
            System.out.print("Product ID: " + product.getProduct_id()+ "  ");
            System.out.print("Product Name: " + product.getProduct_Name() + "  ");
            System.out.print("Product Price: " + product.getProduct_Price() + "  ");
            System.out.print("Product Amount: " + product.getProduct_Amount() + "  ");
            System.out.println("Product Category:" + product.getProduct_category());
            System.out.println();
        }
    }

       public void showCompanyUserInfo(String username) {
        System.out.println("Company Info:");
        System.out.println();
        for (Company_User companyUser : companyUserList) {
            if (companyUser.getUsername().equals(username)) {
                System.out.print("Company ID: " + companyUser.getCompany_ID() + "  ");
                System.out.print("Company Name: " + companyUser.getCompany_Name() + "  ");
                System.out.print("Company Email: " + companyUser.getEmail() + "  ");
                System.out.print("Company Address: " + companyUser.getAddress() + "  ");
                System.out.print("Company Phone: " + companyUser.getPhone_number() + "  ");
                System.out.println();
            }
        }
    }
}

