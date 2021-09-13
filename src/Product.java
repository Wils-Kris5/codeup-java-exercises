

public class Product {

    /*
 TODO: create a class called Product with two private properties of name and priceInCents//
    <Add a public static method called findAveragePrice> takes in an array of products
           <returns> the average price of all products.
           Add a main method to the class to test some values.
         */
 /// youll get a list of private varaiables
    private String name;
 private int PriceInCents;


 //constructors
// pub stat void main


public Product (String name, int PriceInCents) {
    this.name = name;
    this.PriceInCents = PriceInCents;
}

 //instance methods
// public void printDetails() {
//     System.out.println("Product name is: %s%nThe price is: $%s%n "  +
//     this.name = name,
//     this.PriceInCents = PriceInCents / 100.0);
// }


// staticMethods
public static double getAverageProductPrice(Product[] products) {
        int total = 0;
        for(Product product : products) {
           total += product.getPriceInCents();
        }
        return total / products.length;
     }

 //getters & setters
        //Getter = accessors

 public String getName() {
     return name;
        }

public int getPriceInCents(){
    return PriceInCents;
}

        //Setter = mutators
 public void setName(String name) {
       this.name = name;
        }

 public void setPriceInCents(int PriceInCents) {
    this.PriceInCents = PriceInCents;
 }

 public static void main(String[] args) {
   Product[] products = {
           new Product("Hammer", 2300),
     new Product("Screwdriver", 300)

   };
  double average = Product.getAverageProductPrice(products);
     System.out.println(average);


    }
}
