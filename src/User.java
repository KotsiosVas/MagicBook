package MagicBook;
import java.util.ArrayList;

public class User {
    private int user_ID = 0;
    private String fullname;
    private String username,email,password,address  ;
    private int esy_code = 0, phone_number;
    private boolean premium_user = false;

    ArrayList<User> userList = new ArrayList<>();

    public User(){};

    public User(int user_ID, String fullname, String username, String email, String password, int phone_number, String address,boolean premium_user) {
        this.user_ID = user_ID;
        this.fullname = fullname;
        this.username = username;
        this.email = email;
        this.password = password;
        this.phone_number = phone_number;
        this.address = address;
        this.premium_user = premium_user;
    }

    public int getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(int user_ID) {
        this.user_ID = user_ID;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getEsy_code() {
        return esy_code;
    }

    public void setEsy_code(int esy_code) {
        this.esy_code = esy_code;
    }

    public boolean getPremium_user() {
        return premium_user;
    }

    public void setPremium_user(boolean premium_user) {
        this.premium_user = premium_user;
    }

}