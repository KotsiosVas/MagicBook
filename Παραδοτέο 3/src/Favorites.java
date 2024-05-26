package MagicBook;

import java.util.ArrayList;

public class Favorites extends Products {
    private String Product_Name;
    private String Product_Descreption;
    private double Product_Price;
    private int Product_ID;
    private int User_ID;
    private int Company_ID;
    ArrayList<Favorites> FavoritesList = new ArrayList<>();


    public Favorites(){};
    public Favorites(String Product_Name , String Product_Descreption ,double Product_Price , int Product_ID , int User_ID , int Company_ID_ID) {
            this.Product_Name = Product_Name;
            this.Product_Descreption = Product_Descreption;
            this.Product_Price = Product_Price;
            this.Product_ID = Product_ID;
            this.User_ID = User_ID;
            this.Company_ID = Company_ID;
    }
}
