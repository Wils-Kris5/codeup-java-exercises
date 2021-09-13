public class Person {
 //The class should have a constructor that accepts a `String` value and sets
 //the person's name to the passed string.
 //
 //Create a `main` method on the class that creates a new `Person` object and
 //tests the above methods.
    private String name;
        public Person(String name){
            this.name = name;
        }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
//        public String firstName;
//        public String lastName;

        public String sayHello() {
            return String.format("%s says hello!", this.name);
        }

       public static void main(String[] args) {
      Person kris = new Person("Kris");
            // Fighter arata = new Fighter("Arata", 17, 14);
//            Person.kris = new util.Person();
//            kris.firstName = "Kris";
//            kris.lastName = "Wilson";
            System.out.println(kris.sayHello());
            // prints Kris says hello!
//            // prints "Hello from Kris Wilson!"
           
        }
    }

