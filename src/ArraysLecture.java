


public class ArraysLecture {
    public static void printNums(int[] nums) {
        for (int num : nums) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {

        //-- Java Array Pre-Lecture Questions
        //How do you declare an array in Java?
        // An array type is defined by suffixing an existing type with square brackets

        
        //How are arrays different in Java than in JavaScript?
        // Java arrays have a fixed length (accessed with the .length property) that must be defined when they are created


        //What is an array initializer?
//An array's size and and elements can both be defined when it is created with array initializer syntax.


        //Can an array hold primitive types?
   // it doesn't matter whether it contains primitive data types or Strings

        //Can an array hold reference types?
    //array types in Java are reference types because Java treats arrays as objects. The two main characteristics of objects in Java are that: Objects are always dynamically allocated.

        //Can an array hold custom reference types?
   // Yes.

        //What happens when you try to access an element at an index larger than the defined array size?
//If you try to access the array position (index) greater than its size, the program gets compiled successfully but,
// at the time of execution it generates an ArrayIndexOutOfBoundsException exception

        //What happens when you try to access an index within the array but with no assigned element value?
     //elements that have not been initalized will be that type's DEFAULT value

        //What is an enhanced for loop?
    // introduced in Java 5 as a simpler way to iterate through all the elements of a Collection
        // Enhanced for loops are simple but inflexible.

        //What is the Arrays class?
   //public class Arrays
        //extends Object
        //This class contains various methods for manipulating arrays (such as sorting and searching). This class also contains a static factory that allows arrays to be viewed as lists.
        //The methods in this class all throw a NullPointerException, if the specified array reference is null, except where noted.


        //What is a two-dimensional array?
  //array elements can be any type, and this includes arrays; meaning we can define an array whose elements are themselves arrays. This is called a two-dimensional array, or a matrix.
        // You can think of a two-dimensional array like a grid, with rows and columns.


        // ====================== ARRAY BASICS ===================
        // Arrays can only hold elements of the same type!!!!!
        // Arrays have a fixed size when initialized!!!!!
   // so you can change the values but never the number of elements in the array
 // there is a copyof method that takes the copy of the old array that has the same values but be larger than before so the original had 4 you can make yours to hold 5
  
        //**** CREATING AN ARRAY ********

        // int[] nums = new int[3]; // the length must be specified
        // nums[0] = 7; // values can be assigned using the index operator
        // nums[0] = 9; // values can be reassigned

        // System.out.println(nums[0]); // can be accessed with index operator

        // nums[2] = 12; // valid index slots can be assigned in any order

        // nums[3] = 5; // accessing an index out of bounds throws a runtime exception

        // System.out.println(nums[1]); // accessing unassigned elements gives a default value

        // nums[1] = 3;

        // int arrayLength = nums.length; // array length accessed through length property
        // System.out.println(arrayLength);

        //****** ARRAY INITIALIZER - both initialize and assign element values *******
 // (declaring an array of string types)
        // String[] pets = {"Bubbles", "Bowser", "Snickers", "Sparky"};
        // System.out.println(pets[0]);
        /* The elements of an array are refrenced by their index
           - starts at 0
           elements that have not been initalized will be that type's DEFAULT value
         */
       /* String[] pets = {"Bubbles", "Bowser", "Snickers", "Sparky"};
         System.out.println(pets[0]);
         */

        // ====================== ARRAY ITERATION ==============

        // a loop may be used to iterate through array values
        // for (int i = 0; i < pets.length; i++) {
        //    System.out.println(pets[i]);
        // }

        // an enhanced for loop can be used for iterating over an entire array
        // for (String pet : pets) {
        //     System.out.println(pet);
        // }

        /* TODO: create an array of doubles called numbers and assign five different values (try with and without an initializer).
            Find the sum of all five double values using an enhanced for loop.
         */
//       double[] numbers = new double[5];
//       numbers[0] = 1.5;
//       numbers[1] = 2.5;
//       numbers[3] = 3.5;
//       numbers[4] = 4.5;
//        System.out.println(numbers);
//
//        double total = 0;
//        double i;
//        for(i = 0; i < numbers.length; i++){
//             total += numbers[i] + numbers[i];

//           int sum = 0;
//        for(int number : numbers){
//            sum = numbers+numbers;
//        }


        // ANONYMOUS ARRAYS

        // printNums(new int[] {5, 4, 3, 2, 1});

        // ====================== OTHER REFERENCE TYPE ARRAYS

        // arrays may contain a list of custom reference types
        //
//         Person p1 = new Person("Fred", 99);
//         Person p2 = new Person("Sally", 45);
//         Person p3 = new Person("Billy", 30);
//
//         Person[] people = new Person[4];
//        //
//         people[0] = p1;
//         people[1] = p2;
//         people[2] = p3;
//        //
//        // for (int i = 0; i < people.length; i += 1) {
//        //    System.out.println(people[i].getName());
//        // }
//
//        // using an array initializer...
//
//            Person.printOutAgesOfPeople(people);
//            Person.progressOneYear(people);
//            Person.printOutAgesOfPeople(people);
//    }
        // Person[] people = {
        //     new Person("Fred", 99),
        //     new Person("Sally", 45),
        //     new Person("Billy", 30)
        // };

        // using a method that take in an array as an argument
        // Person.printOutAgesOfPeople(people);


        /* TODO: create a class called Product with two private properties of name and priceInCents.
            Add a public static method called, find average price that takes in an array of products
            and finds the average price of all products. Add a main method to the class to test some
            values.
         */




        // ====================== ARRAYS CLASS - must be imported

        // ---- Arrays.fill(SOME_ARRAY, SOME_VALUE)

        // String[] testArray = new String[4];
        // // - fills all or a range of elements with a given value
        // Arrays.fill(testArray, "Badgers");
        // for (String element : testArray) {
        //    System.out.println(element);
        // }


        // ---- Arrays.toString(SOME_ARRAY)

        // Arrays.toString(testArray); // - prints out a copy of the array contents
        // String arrayAsAString = Arrays.toString(testArray);
        // System.out.println(arrayAsAString);


        // ---- Arrays.equals(ARRAY_1, ARRAY_2)

        // Arrays.equals(array1, array2) - returns true if two array elements are equal and in the same order
        //
        // String[] words = {"Mushroom", "Mushroom"};
        // String[] words2 = {"Mushroom", "mushroom"};
        // System.out.println(Arrays.equals(words, words2));


        // ---- Arrays.copyOf(array, length) - returns a copy array of a given array of a given length

        // String[] testArray = new String[4];
        // String[] testArray2 = Arrays.copyOf(testArray, testArray.length);
        // System.out.println(Arrays.toString(testArray));
        // System.out.println(Arrays.toString(testArray2));
        // System.out.println(testArray == testArray2);

        // Arrays.fill(testArray, "Badgers");
        // String[] twoBadgers = Arrays.copyOf(testArray, 2);
        // System.out.println(Arrays.toString(twoBadgers));

        // System.out.println(twoBadgers);


        // ---- Arrays.sort(SOME_ARRAY, START_INDEX, END_INDEX) - sorts array elements alphabetically/numerically 2nd and 3rd arguments are optional.

        // String[] meme = {"Badgers", "Mushroom", "Badgers", "Snake"};
        // System.out.println(Arrays.toString(meme));
        // String[] memeCopy = Arrays.copyOf(meme, meme.length);
        // Arrays.sort(memeCopy);
        // System.out.println(Arrays.toString(memeCopy));
        // System.out.println(Arrays.toString(meme));

        // meme = Arrays.copyOf(meme, meme.length - 1); // can copy a smaller portion
        // meme = Arrays.copyOf(meme, meme.length + 3); // or make it larger
        //
        // System.out.println(Arrays.toString(meme));




        // ---- Arrays.binarySearch(SOME_ARRAY, SOME_VALUE)

        // Arrays.binarySearch(array, value) - returns the index of a value if in the array or -1 if not found
        // Array MUST be sorted before using binarySearch() to return a valid index.

        // String[] meme = {"Mushroom", "Badgers", "Badgers", "Snake"};
        // Arrays.sort(meme);
        //
        // System.out.println(Arrays.binarySearch(meme,"fox"));
        // System.out.println(Arrays.binarySearch(meme, "Mushroom"));


        // ====================== MULTI-DIMENSIONAL ARRAYS

        // int[][] matrix = {
        //        {1, 2, 3},
        //        {4, 5, 6},
        //        {7, 8, 9}
        // };
        //
        // System.out.println(matrix[2][0]);
        //
        //
        // for (int[] row : matrix) {
        //    System.out.println("+---+---+---+");
        //    System.out.print("| ");
        //    for (int n : row) {
        //        System.out.print(n + " | ");
        //    }
        //    System.out.println();
        // }
        // System.out.println("+---+---+---+");



    }

}
