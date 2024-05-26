package MagicBook;
public class Order_History extends Order {

    private String Email;

    public Order_History(int Company_ID, int User_ID, String Email)  {
        super(Company_ID,User_ID);
        this.Email = Email;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}