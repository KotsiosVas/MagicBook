 package MagicBook;
import java.util.Scanner;
import java.util.Random;

public class Menu {
    Eshop eshop;
    Company_User companyUser;
    Products product;
    Favorites favorites;
    User user;
    Reservation reservation;
    private int company_ID = 0, user_ID = 0, product_ID = 0;

    public void getUserInfo(String username,String password) {
        for (Company_User companyUser : eshop.companyUserList) {
            if (companyUser.getUsername().equals(username) && companyUser.getPassword().equals(password)) {
                int companyID = companyUser.getCompany_ID();
                String companyName = companyUser.getCompany_Name();
                String companyEmail = companyUser.getEmail();
                String companyAddress = companyUser.getAddress();
                int companyPhone = companyUser.getPhone_number();
                companyUser = new Company_User(companyID, companyName, username, companyEmail, companyAddress, companyPhone, password);
            }
        }

        for (User user : eshop.userList) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                int ID = user.getUser_ID();
                String name = user.getFullname();
                String email = user.getEmail();
                String address = user.getAddress();
                int phone = user.getPhone_number();
                boolean Premium = user.getPremium_user();
                user = new User(ID, name, username, email, password, phone, address,Premium);

            }
        }
    }

    public void newCompanyUserInfo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Creating your bookshop account...");
        System.out.println("Give your bookshop name:");
        String name = scan.nextLine();
        System.out.println("Give your email:");
        String email = scan.nextLine();
        System.out.println("Give your address");
        String address = scan.nextLine();
        System.out.println("Give your Phone Number:");
        int phone_number = scan.nextInt();
        scan.nextLine();
        System.out.println("Username:");
        String username = scan.nextLine();
        System.out.println("Password:");
        String password = scan.nextLine();
        companyUser = new Company_User(this.company_ID, name, username, email, address, phone_number, password);
        eshop.addCompanyUser(companyUser);
        this.company_ID++;
    }

    public void newUserInfo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Creating your account...");
        System.out.println("Give your full name:");
        String fullname = scan.nextLine();
        System.out.println("Give your email:");
        String email = scan.nextLine();
        System.out.println("Give your address");
        String address = scan.nextLine();
        System.out.println("Give your Phone Number:");
        int phone_number = scan.nextInt();
        scan.nextLine();
        System.out.println("Username:");
        String username = scan.nextLine();
        System.out.println("Password:");
        String password = scan.nextLine();
        System.out.println("You want to get premium?(true/false) :");
        boolean PremiumU = scan.nextBoolean();
        user = new User(this.user_ID, fullname, username, email, password, phone_number, address,PremiumU);
        eshop.addUser(user);
        this.user_ID++;
    }

    public Menu(Eshop eshop) {
        this.eshop = eshop;
    }

    public void newProducts() {
        Scanner scanner = new Scanner(System.in);
        int productCount;
        boolean flag = false;
        System.out.print("Enter the number of products you want to add: ");
        productCount = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < productCount; i++) {
            System.out.println("Enter details for the (" + (i+1) + ") product you want to add:");

            System.out.print("Product Name:");
            String productName = scanner.nextLine();

            System.out.print("Product Price:");
            double productPrice = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Product Amount:");
            int productAmount = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Product category:");
            String productCategory = scanner.nextLine();
            for (Products products : eshop.productsList) {
                if (productName.equals(products.getProduct_Name())) {
                    product = new Products(companyUser.getCompany_ID(), product.getProduct_id(), productName, productPrice, productAmount, productCategory);
                    flag = true;
                }
            }
            if (!flag) {
                product = new Products(companyUser.getCompany_ID(), this.product_ID, productName, productPrice, productAmount, productCategory);
                this.product_ID++;
            }
            eshop.addProducts(product);
            flag  = false;
        }
    }
    public void newReservation(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give number of people and time for the Reservation");
        reservation=new Reservation(arithmos_a,ora,pre);
        ora=scanner.nextint();
        if(ora<8 || ora>20){
            System.out.println("Invalid time.");
            return;
        }
        if(kratisi[ora-1]){
            System.out.println("Reservation was Successfull");
        }
        if(pre==true){
            System.out.println("Congratulations you have a free coffe with this code!")
            Random random=new Random();
            int x=random.nextInt();
            System.out.println(x);
        }
    }


    public void showMenu() {
        boolean flag = false, back = false;
        Scanner scan = new Scanner(System.in);
        int sign = 0;
        while (sign != 1 && sign != 2) {
            System.out.println("1 Sign in");
            System.out.println("2. Sign up");
            sign = scan.nextInt();
            scan.nextLine();
            if (sign != 1 && sign != 2)
                System.out.println("Choose a valid option");
        }
        int creatingAccount = 0;
        while (creatingAccount != 1 && creatingAccount != 2) {
            System.out.println("1. Create a company account.");
            System.out.println("2. Create a buyer account");
            creatingAccount = scan.nextInt();
            scan.nextLine();
            if (creatingAccount != 1 && creatingAccount != 2)
                System.out.println("Choose a valid option");
        }
        if (sign == 2 && creatingAccount == 1) {
            
            newCompanyUserInfo();
            while (flag == false) {
                System.out.println("Welcome " + companyUser.getCompany_Name() + " to Magic Book");
                System.out.println("-------------------------------");
                System.out.println("1.Search");
                System.out.println("2.Add product");
                System.out.println("3.Profile");
                System.out.println("4.Show history order");
                System.out.println("5.Exit");

                int insert;
                insert = scan.nextInt();
                switch (insert) {
                    case 1:
                        System.out.println("1. Search products");
                        System.out.println("Go back");
                        int search = scan.nextInt();
                        scan.nextLine();
                        if (search == 2)
                            break;
                        else {
                            while (back == false) {
                                eshop.showCategories();
                                eshop.showProducts();
                                System.out.println("1. Continue searching");
                                System.out.println("2. Go back");
                                int check = scan.nextInt();
                                scan.nextLine();
                                if (check == 2) {
                                    back = true;
                                }
                            }
                        }
                        break;

                    case 2:
                        back = false;
                        System.out.println("1. Add products");
                        System.out.println("2. Go back");
                        search = scan.nextInt();
                        scan.nextLine();
                        if (search == 2)
                            break;
                        else {
                            newProducts();
                            System.out.println();
                            System.out.println("Products added to your bookshop!");
                            System.out.println();
                            back = true;
                        }
                        break;


                    case 3:
                        back = false;
                        System.out.println("1. See profile");
                        System.out.println("2. Go back");
                        search = scan.nextInt();
                        scan.nextLine();
                        if (search == 2)
                            break;
                        else {
                            while (back == false) {
                                // getUserInfo(username,password);
                                System.out.println(companyUser.getCompany_ID());
                                System.out.println(companyUser.getCompany_Name());
                                System.out.println(companyUser.getAddress());
                                System.out.println(companyUser.getPhone_number());
                                System.out.println(companyUser.getEmail());
                                System.out.println(companyUser.getUsername());
                                System.out.println();
                                System.out.println("1. Go Back");
                                int check = scan.nextInt();
                                scan.nextLine();
                                if (check == 1) {
                                    back = true;
                                }
                            }
                        }
                        break;

                    case 4:
                        back = false;
                        System.out.println("1.Sales History");
                        System.out.println("2.Go back");
                        search = scan.nextInt();
                        scan.nextLine();
                        if (search == 2)
                            break;
                        else {
                            while (back == false) {
                                // getOrderHistory;
                                System.out.println();
                                System.out.println("1. Go Back");
                                int check = scan.nextInt();
                                scan.nextLine();
                                if (check == 1) {
                                    back = true;
                                }
                            }
                        }
                        break;

                  
                    case 5:
                        flag = true;
                        break;
                }


            }
        }
        if (sign == 2 && creatingAccount == 2) {
            //menu for the User
            newUserInfo();
            while (flag == false) {
                System.out.println("Welcome " + user.getFullname() + " to Magic Book");
                System.out.println("------------------------");
                System.out.println("1.Search ");
                System.out.println("2.Favorites");
                System.out.println("3.Products category");
                System.out.println("4.Profile");
                System.out.println("5.Exit");
                int eisodos;
                Scanner eis = new Scanner(System.in);
                eisodos = eis.nextInt();

                switch (eisodos) {
                    case 1:
                        back = false;
                        System.out.println("1. Search products");
                        System.out.println("Go back");
                        int search = scan.nextInt();
                        scan.nextLine();
                        if (search == 2)
                            break;
                        else {
                            while (back == false) {
                                eshop.showCategories();
                                eshop.showProducts();
                                System.out.println("1. Continue searching");
                                System.out.println("2. Go back");
                                int check = scan.nextInt();
                                scan.nextLine();
                                if (check == 2) {
                                    back = true;
                                }
                            }
                        }
                        break;


                    case 2:
                        back = false;

                        System.out.println("1. Favorite products");
                        System.out.println("Go back");
                        search = scan.nextInt();
                        scan.nextLine();

                        if (search == 2)
                            break;
                        else {
                            while (back == false) {

                               //Eshop.showFavorites();
                                //add Favorites()
                                System.out.println("1. Continue searching");
                                System.out.println("2. Go back");
                                int check = scan.nextInt();
                                scan.nextLine();
                                if (check == 2) {
                                    back = true;
                                }
                            }
                        }
                        break;


                    case 3:
                        back = false;
                        System.out.println("1. Show categories");
                        System.out.println("Go back");
                        search = scan.nextInt();
                        scan.nextLine();
                        if (search == 2)
                            break;
                        else {
                            while (back == false) {
                                eshop.showCategories();
                                System.out.println("2. Go back");
                                System.out.println("3.Go to check out ");
                                //add product
                                //ask if wants to go back or add another product
                                // go to check out (check if premium_user id true / false )
                                int check = scan.nextInt();
                                scan.nextLine();
                                if (check == 2) {
                                    back = true;
                                }
                            }
                        }
                        break;


                    case 4:
                        back = false;
                        System.out.println("1. See profile");
                        System.out.println("2. Go back");
                        search = scan.nextInt();
                        scan.nextLine();
                        if (search == 2)
                            break;
                        else {
                            while (back == false) {
                                // getUserInfo(username,password);
                                System.out.println(user.getUser_ID());
                                System.out.println(user.getFullname());
                                System.out.println(user.getAddress());
                                System.out.println(user.getPhone_number());
                                System.out.println(user.getEmail());
                                System.out.println(user.getUsername());
                                System.out.println();
                                System.out.println("1. Go Back");
                                int check = scan.nextInt();
                                scan.nextLine();
                                if (check == 1) {
                                    back = true;
                                }
                            }
                        }
                        break;


                    case 5:
                        flag = true;
                        break;
                }
            }
        }
    }



    }
