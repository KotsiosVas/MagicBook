package MagicBook;
import java.util.ArrayList;

public class Company_User {

    private int company_ID = 0;
    private String company_Name;
    private String username;
    private String email;
    private String address;
    private int phone_number;
    private String password;
    ArrayList<Company_User> companyUserList = new ArrayList<>();

    public Company_User() {}

    public Company_User(int company_ID, String company_Name, String username, String email, String address, int phone_number, String password) {
        this.company_ID = company_ID;
        this.company_Name = company_Name;
        this.username = username;
        this.email = email;
        this.address = address;
        this.phone_number = phone_number;
        this.password = password;
    }

    public int getCompany_ID() {
        return company_ID;
    }

    public void setCompany_ID(int company_ID) {
        this.company_ID = company_Name_ID;
    }

    public String getCompany_Name() {
        return company_Name;
    }

    public void setCompany_Name(String company_Name) {
        this.company_Name = company_Name;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}