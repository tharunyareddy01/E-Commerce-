import java.util.ArrayList;
class Product{
    int id;
    String name;
    double price;
    Product(int id,String name,double price){
       this.id=id;
       this.name=name;
       this.price=price;
    }
    void display(){
        System.out.println("ID of product "+id);
        System.out.println("Name of product "+name);
        System.out.println("Price of product "+price);
        System.out.println("----------------------");
    }  
}

class Cart{
      ArrayList<Product> cartItems=new ArrayList<>();
      void addProduct(Product p){
        cartItems.add(p);
        System.out.println("Item added to cart :"+p.name);
      }
      void removeProduct(Product p){
        cartItems.remove(p);
        System.out.println("item removed from te cart +p.name");
      }
      void showCart(){
        double total=0.0;
        System.out.println("Cart Items :");
        for(Product p :cartItems){
            p.display();
            total+=p.price;
        }
        
        System.out.println("total amount of cart is "+total);
      }
}
class User{
    String username;
    String password;
    User(String username,String password){
        this.username=username;
        this.password=password;
    }
    boolean login(String u,String p){
        return username.equals(u)&&password.equals(p);
    }
}
public class EcommerceEx{
    public static void main(String args[]){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        User ur=new User("adminme","admin123");
        System.out.println("enter username");
        String name=sc.next();
        System.out.println(" enter password");
        String pass=sc.next();
        if(ur.login(name,pass)){
            Product p1=new Product(101,"toys",170);
            Product p2=new Product(102,"laptop",30000);
            Product p3=new Product(103,"phone",15000);
            Product p4=new Product(104,"dress",1000);
            Product p5=new Product(105,"charger",700);
            Product p6=new Product(106,"Bag",300);
            Cart cart=new Cart();
            int choice;
            do{
        System.out.println("ECOMMERCE SITE");
        System.out.println("-------------------");
        System.out.println("1.View products");
        System.out.println("2.Add product to cart");
        System.out.println("3.Remove product to cart");
        System.out.println("4.View cart");
        System.out.println("5.exit");
         System.out.println("------------------");

        choice =sc.nextInt();
        switch(choice){
            case 1:
                p1.display();
                p2.display();
                p3.display();
                p4.display();
                p5.display();
                p6.display();
            break;
            case 2:
                System.out.println("Enter id  of the product to add to the cart");
                int id=sc.nextInt();
                if(id==101)
                    cart.addProduct(p1);
                else if(id==102)
                    cart.addProduct(p2);
                else if(id==103)
                    cart.addProduct(p3);
                else if(id==104)
                    cart.addProduct(p4);
                else if(id==105)
                    cart.addProduct(p5);
                else if(id==106)
                    cart.addProduct(p6);
                else{
                System.out.println("invalid");
                }
                break;
            case 3:
                System.out.println("Enter id  of the product to remove from the cart");
                int id_=sc.nextInt();
                if(id_==101)
                    cart.removeProduct(p1);
                else if(id_==102)
                    cart.removeProduct(p2);
                else if(id_==103)
                    cart.removeProduct(p3);
                else if(id_==104)
                    cart.removeProduct(p4);
                else if(id_==105)
                    cart.removeProduct(p5);
                else if(id_==106)
                    cart.removeProduct(p6);
                else{
                System.out.println("invalid");
                }
                break;
            case 4:
                cart.showCart();
                break;
            case 5:
                System.out.println("THANK YOU");  
                break;
            default:
                System.out.println("invalid");          

        }


            }while(choice!=5);
        }
        else{
            System.out.println("Invalid username and password");
        }

        sc.close();
    }
}