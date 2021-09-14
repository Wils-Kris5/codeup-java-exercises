

public class ArraysExercises {
//    public static Person[] addPerson(Person[] personArr, Person personToAdd) {
//        Person Arrays.copyOf(personArr, length)
//          return
//    }
    public static void main(String[] args) {
  /*
 What happens when you run the following code? Why is Arrays.toString necessary?
      */
//      int[] numbers = {1, 2, 3, 4, 5};
//    for(int n : numbers){
//        System.out.println(n);
//    }



// Create an array that holds 3 Person objects.
// Assign a new instance of the Person class to each element.
// Iterate through the array and print out the name of each person in the array.

        Person[] people = {
                new Person("Shelby"),
                new Person("Anthony"),
                new Person("Oj")
        };
           for(int i = 0; i < people.length; i++){
               System.out.println(people[i].getName());
           }



        //Create a static method named addPerson.
        // It should accept an array of Person objects,
             // as well as a single person object to add to the passed array.

        // It should return an array whose length is 1 greater than the passed array,
            // with the passed person object at the end of the array.

       //void method_name(int[] array);



  }
}
