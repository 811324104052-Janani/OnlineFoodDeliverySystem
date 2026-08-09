import java.util.*;

class Food1 {

    String name;
    int price;

    Food1(String name,int price){
        this.name=name;
        this.price=price;
    }

    void display(){
        System.out.println(name+" - Rs."+price);
    }
}



class Restaurant1{

    int id;
    String name;
    String location;

    ArrayList<Food1> menu=new ArrayList<>();

    Restaurant1(int id,String name,String location){

        this.id=id;
        this.name=name;
        this.location=location;
    }


    void addFood(String name,int price){

        menu.add(new Food1(name,price));

    }


    void displayMenu(){

        System.out.println("\nRestaurant ID : "+id);
        System.out.println("Restaurant : "+name);
        System.out.println("Location : "+location);


        System.out.println("\n------ MENU ------");


        for(int i=0;i<menu.size();i++){

            System.out.print((i+1)+". ");
            menu.get(i).display();

        }

    }
}

class User1 {

    String name;
    String Email_Id;
    String password;


    Scanner sc=new Scanner(System.in);



    void register(){

        System.out.println("------ Registration ------");


        System.out.print("Name : ");
        name=sc.nextLine();
         
        while(true){

        System.out.print("Email Id : ");
        Email_Id=sc.nextLine();


        if(validateEmail(Email_Id)){
            break;
        }
        else{
            System.out.println("Invalid Email! Enter again");
        }

    }


    System.out.print("Password : ");
    password=sc.nextLine();


    System.out.println("Registration Successful");



    

    }




    void login(){
         boolean flag=true;

        while(flag){

            System.out.println("\n------ Login ------");


            System.out.print("Email Id: ");
            String u=sc.nextLine();
            

            System.out.print("Password : ");
            String p=sc.nextLine();



            if(Email_Id.equals(u) && password.equals(p)){


                System.out.println("Login Successful");
                break;
            }


            else{

                System.out.println("Invalid Login");
                login();
            }
            flag=false;
        }
    }
    boolean validateEmail(String email) {

    String pattern ="^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";


    return email.matches(pattern);
}

} 





class Cart1{


    ArrayList<Food1> foodList=new ArrayList<>();

    ArrayList<Integer> qtyList=new ArrayList<>();



    void addToCart(Food1 f,int qty){


        foodList.add(f);

        qtyList.add(qty);


        System.out.println(
        "Food Added To Cart");

    }



    int total(){


        int sum=0;


        for(int i=0;i<foodList.size();i++){


            sum += foodList.get(i).price * qtyList.get(i);

        }

        return sum;
    }




    void displayCart(){


        System.out.println("\n------ CART ------");


        for(int i=0;i<foodList.size();i++){


            System.out.println(
            foodList.get(i).name+
            " Qty:"+qtyList.get(i)+
            " Price:"+foodList.get(i).price*
            qtyList.get(i));

        }


        System.out.println(
        "Total Amount : Rs."+total());

         System.out.println("Your Order is Processing........");
    }
   
}




class Order1 {


    void placeOrder(Cart1 cart){


        cart.displayCart();

        try{
         Thread.sleep(3000);
       }
      catch(InterruptedException e){
          System.out.println(e);
        }


        System.out.println(
        "\nOrder Placed Successfully");

        System.out.println("\n----------Payment Details-------");
       

        System.out.println("\nPayment Mode : Cash On Delivery");
         

        System.out.println("\nYour order will be delivered soon.........");


    }

}





class Rating1{


    Scanner sc=new Scanner(System.in);


    void giveRating(){


        System.out.print("\nRate Food Out of 5 : ");


        int r=sc.nextInt();

        System.out.println("\n-----------Ratings------------");

        if(r>=1 && r<=5){

            System.out.println(
            "Thank you for rating "+r+"/5");

        }

        else{

            System.out.println("Invalid Rating");

        }

    }

}






public class OnlineFoodDeliverySystem {



public static void main(String args[]){


//Scanner sc=new Scanner(System.in);



// USER MODULE


User1 user=new User1();

user.register();

user.login();




// RESTAURANT MODULE


ArrayList<Restaurant1> restaurants=new ArrayList<>();



Restaurant1 r1=new Restaurant1(101,"Spice Hub","Ammapettai");


r1.addFood("Chicken Biryani",100);
r1.addFood("Mutton Biryani",180);
r1.addFood("Chicken Rice",120);
r1.addFood("Fried Rice",150);
r1.addFood("Chicken 65",120);
r1.addFood("Parotta Set",40);
r1.addFood("Non Veg Meals",200);
r1.addFood("Egg Biriyani",80);





Restaurant1 r2=new Restaurant1(102,"Food Palace","Srirangam");


r2.addFood("Pizza",250);
r2.addFood("Burger",130);
r2.addFood("French Fries",90);
r2.addFood("Shawarma",150);
r2.addFood("Chicken Popcorn",90);
r2.addFood("Athow",80);
r2.addFood("Chicken Nuggets",90);
r2.addFood("Chicken Lollipop",100);





Restaurant1 r3=new Restaurant1(103,"Tasty Treats","Thillai Nagar");


r3.addFood("Dosa",60);
r3.addFood("Veg Meals",275);
r3.addFood("Noodles",140);
r3.addFood("Fried Rice",180);
r3.addFood("Chicken 65",120);
r3.addFood("Parotta",75);
r3.addFood("Non Veg Meals",310);
r3.addFood("Egg Biriyani",120);





Restaurant1 r4=new Restaurant1(104,"KFC","Mannarpuram");


r4.addFood("Chicken Roll",180);
r4.addFood("Zinger Burger",200);
r4.addFood("Chicken Combo",275);
r4.addFood("Hot Chicken",150);
r4.addFood("Bucket Chicken",380);
r4.addFood("Chicken Mojito Combo",380);
r4.addFood("Double Down Combo",350);
r4.addFood("Spicy Chicken",400);






Restaurant1 r5=new Restaurant1(105,"Vanga Sapdalam","Manapparai");


r5.addFood("Chindhamani Chicken",250);
r5.addFood("Mutton Chukka",470);
r5.addFood("Naatukozhi Rasam",140);
r5.addFood("Pallipalayam Chicken",220);
r5.addFood("Fish Fry",280);
r5.addFood("Meen Varuval",250);
r5.addFood("Mutton Biriyani",380);
r5.addFood("Kothu Parotta",240);







Restaurant1 r6=new Restaurant1(106,"BlueBerry","Puthur");


r6.addFood("Brownie",130);
r6.addFood("Chocolate Biscuit",300);
r6.addFood("Mousse Cake",900);
r6.addFood("Croissant",250);
r6.addFood("Chocolate Jar",160);
r6.addFood("Cheese Sandwich",120);
r6.addFood("Dense Loaf",300);
r6.addFood("Mango Yogurt",150);




restaurants.add(r1);
restaurants.add(r2);
restaurants.add(r3);
restaurants.add(r4);
restaurants.add(r5);
restaurants.add(r6);





// DISPLAY RESTAURANTS
char continueShopping;
do{
    
Scanner sc=new Scanner(System.in);

System.out.println("\nAvailable Restaurants");


for(int i=0;i<restaurants.size();i++){

System.out.println((i+1)+". "+restaurants.get(i).name);

}




System.out.print("\nSelect Restaurant : ");

int rc=sc.nextInt();



Restaurant1 selected=restaurants.get(rc-1);



selected.displayMenu();




Cart1 cart=new Cart1();



char choice;



do{


System.out.print("\nSelect Food : ");

int fc=sc.nextInt();



System.out.print("Quantity : ");

int q=sc.nextInt();



Food1 f=selected.menu.get(fc-1);



cart.addToCart(f,q);




System.out.print("Add more food(y/n): ");

choice=sc.next().charAt(0);



}while(choice=='y');






// ORDER MODULE


Order1 order=new Order1();

order.placeOrder(cart);

try{
         Thread.sleep(5000);
       }
      catch(InterruptedException e){
          System.out.println(e);
        }


// DELIVERY + RATING


System.out.println(
"\nFood Delivered Successfully");



Rating1 rating=new Rating1();

rating.giveRating();

System.out.println("\nDo you want to Continue Shopping(y/n):");
continueShopping=sc.next().charAt(0);

}while(continueShopping=='y');

System.out.println("\nThank You For Using Our App");


}

}