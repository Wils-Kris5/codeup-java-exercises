import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassCollectionsLecture {

        public static void main(String[] args) {

            // ----------------------------- Array Lists

            // creating ArrayLists

            // ArrayList<Integer> numbers = new ArrayList<>();
            // numbers.add(1);
            // numbers.add(2);
            // numbers.add(3);
            //
            // System.out.println(numbers);

            // List<String> names = new ArrayList<>(Arrays.asList(
            //         "Fred",
            //         "Sally",
            //         "Cindy"
            // ));
//
//
//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
////
//        int number = numbers.get(0);
//
//        System.out.println(number);


            // peeking into list

//        System.out.println(numbers);


            // get elements

//        System.out.println(numbers.get(2));


            // adding elements

//        numbers.add(20);
//
//        numbers.add(0, 21);
//

            // editing elements

//        numbers.set(0, 100);
//
//        System.out.println(numbers);



            // removing elements

//        System.out.println(names);
//        names.remove(0);
//        names.remove("Cindy");
//        System.out.println(names);


//        numbers.add(0,3);
//        numbers.remove(Integer.valueOf(3));
//        System.out.println(numbers);




            // reordering list
//            Collections.sort(numbers);
//            Collections.reverse(numbers);
//            System.out.println(numbers);


            // info about list and getting elements
//            System.out.println(numbers.size());
//            System.out.println(numbers.indexOf(3));
//            System.out.println(numbers);
//            System.out.println(numbers.indexOf(105));

//            ArrayList<String> roasts = new ArrayList<>();
//            roasts.add("medium");
//            roasts.add("light");
//            roasts.add("medium");
//            roasts.add("dark");
//            System.out.println(roasts);
//            System.out.println(roasts.contains("dark"));
//            System.out.println(roasts.contains("espresso"));
//            System.out.println(roasts.lastIndexOf("medium"));
//            System.out.println(roasts.isEmpty());
//
//            ArrayList<String> roast = roasts;
//            System.out.println(roast == roasts);

        /*
            TODO: create a static method, omit2s, that takes in an array list of integers.
              The method should return an arraylist of integers with the same values as the
              input arraylist but without 2s.
         */


            // ----------------------------- Hash Maps


            // creating hash maps
//            HashMap<String, String> usernames = new HashMap<>();
//            usernames.put("Ryan", "ryanorsinger");
//            usernames.put("Luis", "MontealegreLuis");
//            usernames.put("Zach", "zgulde");
//            usernames.put("Fernando", "fmendozaro");
//            usernames.put("Justin", "jreich5");

            // getting values from and info about hash map
//            System.out.println(usernames);
//            System.out.println(usernames.get("Justin"));
//            System.out.println(usernames.get("Phillip"));
//            System.out.println(usernames.get("Justin"));
//            System.out.println(usernames.getOrDefault("Fred", "gocodeup"));
//            System.out.println(usernames.containsKey("Luis"));

            // updating hash maps

//            usernames.put("Ryan", "rorsinger");
//            System.out.println(usernames);
//            usernames.put("Ryan", "Test");

//            usernames.putIfAbsent("Zach", "coderdude24");
//            usernames.putIfAbsent("Zach", "zgulde");
//            usernames.replace("Ryan", "torvalds"); // same as put
//            System.out.println(usernames);

            // removing pairs from hash map

//        System.out.println(usernames.remove("Zach"));
//        System.out.println(usernames.remove("Zach"));
//            System.out.println(usernames);
//            System.out.println(usernames);
//            usernames.clear();
//            System.out.println(usernames);
//            System.out.println(usernames.isEmpty());
        /*
            TODO: create a static method, createMap, that takes in two arraylists. The method should
              return a hashmap where the keys are the elements of the first passed arraylist and are
              connected to values of the second arraylist. Assume both input arraylists are lists of
              strings. Assume the lengths of both input arraylists are the same

              EXAMPLE:

                List<String> keys = new ArrayList<>(Arrays.asList(
                    "first key",
                    "second key",
                    "third key",
                    "fourth key"
                ));

                List<String> values = new ArrayList<>(Arrays.asList(
                    "first value",
                    "second value",
                    "third value",
                    "fourth value"
                ));


         */
        List<String> createMap = new ArrayList<>(Arrays.asList(
                "First Key",
                "Second Key",
                "Third Key",
                "Fourth Key"
        ));
            System.out.println(createMap);
            System.out.println(createMap.get(Integer.parseInt("First Key")));
        List<String> values = new ArrayList<>(Arrays.asList(
                "First Value",
                "Second Value",
                "Third Value",
                "Fourth Value"

        ));
            System.out.println(values);
            System.out.println(values.get(Integer.parseInt("First Value")));

  //ArrayList is a class that represents an array that can change it's size.
//All elements in an ArrayList must be objects, and they must have the same type.
// Recall that arrays in Java have a fixed length; once they are created they cannot change their length.
// In order to "add" an item to an array, you must make a copy of the array with a length bigger than the original.
// You can think of an ArrayList as a wrapper around
// the native Java array that handles the details of resizing the array to add elements for you.
  //ArrayLists are used a little differently than arrays are; they have methods that handle common array operations, as opposed to using the Arrays helper class and passing in the instance.
            //
            //Here are some of the most common methods used when working with ArrayLists:
            //
            //Method	Description
            //.size	returns the number of elements in the array
            //.add	add an element to the collection (optionally) at a specified index
            //.get	return the element at the specified index
            //.indexOf	return the first found index of the given item, or -1 if not found
//Let's take a look at how we would use this class:
//
//
//ArrayList<Integer> numbers = new ArrayList<>();
//numbers.add(20);    // adding an element
//numbers.add(0, 21); // specifying an index
//numbers.add(22);
//
//System.out.println(numbers); // [21, 20, 22]
//
//numbers.size(); // 3
//numbers.get(2); // 22
//
//numbers.indexOf(20);    // 1
//numbers.indexOf("cat"); // -1
            //We specify the type of each element in the collection with angle brackets, (<>).1
            //Because ArrayLists must contain objects, we specify Integer instead of int.2
            //The add method is overloaded; we can specify either an element to add, or an element to add, and the index of where to add it.
            //ArrayLists don't have a length property, instead we use the size method to find out how many elements are in the collection.
            //Unlike native Java arrays, we can use System.out.println to show the contents of the array.
            // Java collections all have toString methods on them that allow us to easily inspect their contents.

        }

    }

