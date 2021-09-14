 import java.util.Arrays;

 public class ArraysExercises {
 // int[] numbers = {1, 2, 3, 4, 5};
 //for (int n : numbers) {
 //    System.out.println(Arrays.toString(numbers));
 //}
    public static Person[] addPerson(Person[] personArr, Person personToAdd) {
        Person[] copyPerson = Arrays.copyOf(personArr, personArr.length+1);
          copyPerson[copyPerson.length - 1] = personToAdd;
        return copyPerson;
    }
    public static void main(String[] args) {
  //Create an array that holds 3 Person objects.
// Assign a new instance of the Person class to each element.
// Iterate through the array and print out the name of each person in the array.
      Person kris = new Person("Kris");
        Person[] people = {
                new Person("Shelby"),
                new Person("Anthony"),
                new Person("Oj")
        };
//           for(int i = 0; i < people.length; i++){
//               System.out.println(people[i].getName());
           
         addPerson(people, kris);
         for(Person person : addPerson(people, kris)) {
             System.out.println(person.getName());
         }

        //Create a static method named addPerson.
        // It should accept an array of Person objects,
             // as well as a single person object to add to the passed array.

        // It should return an array whose length is 1 greater than the passed array,
            // with the passed person object at the end of the array.





  }
}
