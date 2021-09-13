public class Product {
    /*
 TODO: create a class called Product with two private properties of name and priceInCents//
    <Add a public static method called FindAveragePrice> takes in an array of products
           <returns> the average price of all products.
           Add a main method to the class to test some values.
         */
 private String name;
 private double PriceInCents;

        //Getter = accessors
 public String getName() {
     return name;
        }

 public double getPriceInCents(){
     return PriceInCents;
 }

        //Setter = mutators
 public void setName(String newName) {
       this.name = newName;
        }

  public void setPriceInCents(double newPriceInCents){

      this.PriceInCents =  newPriceInCents;
  }


  public static void main(String[] args) {

     Product AProduct = new Product();
     AProduct.name = "default";
      AProduct.PriceInCents = 2.2;

    }
}
