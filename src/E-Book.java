package MagicBook;
public class E-book {
    private boolean eb;
    class Premium_User pu;
    
    public boolean getEb() {
        return eb;
    }
    public Premium_User (boolean premimum){
        return premimum;
    }
    public void setEb(){
        this.eb=eb;
    }
    

    public E-book(boolean eb,Premium_User pu) {
        this.eb = eb;
        this.pu=pu;
        if (eb == true && pu=true)
            System.out.println("Here is the E-book version of your order ");
        
    }

}