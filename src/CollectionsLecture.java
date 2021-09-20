

public class CollectionsLecture {


//# Java Collections Framework
//
//        The Java Collections Framework is a group of classes and interfaces that together enable usage of many specific collection types that are optimized for a variety of programming tasks. The files that make up the Java Collections Framework exist in the java.util package of Java SE.
//
//        ### Collections Framework General Implementations (Classes)
//
//        #### Implements List Interface - a collection of ordered elements
//
//        - **ArrayList** - dynamically add and remove elements
//        - **LinkedList** - elements refer to eachother
//
//        #### Implements Set Interface - a collection of only unique values
//
//        - **HashSet** - stores data as a hash table - each element is assigned a unique hash and is unordered
//        - **LinkedHashSet** - stores data as a hash table - each element is linked to another and maintains insertion order
//        - **TreeSet** - stores data in a tree and stores data in ascending order
//
//        #### Implements Queue or Deque Interface - a collection like a to-do list (items can only be added and checked off in a specific order)
//
//        - **PriorityQueue** - automatically sorts entered items into queue
//        - **ArrayDeque** - can add / view / check off items at either end of the queue
//
//        #### Implements Map Interface - a collection of named key and value pairs
//
//        - **HashMap** - allows one null key and unlimited null values
//        - **TreeMap** - sorts the key value pairs by key
//        - **LinkedHashMap** - preserves insertion order
//
//<div style="page-break-after: always;"></div>
//        ### Usage
//
//        Often, the declared type of one of the following collection classes may be of an interface it implements. For example...
//
//        ```
//        List<Integer> oneTwoThree = new ArrayList<>();
//        Map<String, String> names = new HashMap<>();
//        ```
//
//        Instead of...
//
//        ```
//        ArrayList<Integer> oneTwoThree = new ArrayList<>();
//        HashMap<String, String> names = new HashMap<>();
//        ```
//
//        This ensures that the specific implementation is flexible and left to be decided later by the programmer (e.g. will the program be more performant by using an ArrayList or LinkedList?).
//
//        Each collection type has a variety of methods to access and update the data held inside them, thus ensuring encapsulation. Consult the official Oracle Docs for more detail.
//
//        ### Generics
//
//        Since Java 5, the Java lanaguage supports the use of generics. Generics ensure type-safety at compile time and avoid explicit casting when retrieving elements from a collection. The "generics" part of a collection declration are the ``` <> ```.
//
//        The following...
//
//        ```
//        List<Integer> nums = new ArrayList<>();
//        nums.add(1);
//        nums.add(2);
//        int sum = nums.get(0) + nums.get(1) + nums.get(2);
//        System.out.println(sum); // prints 6
//        ```
//
//        .. without generics would need explicit casting to type int to get elements from the ArrayList of ints.
//
//        ```
//        List nums = new ArrayList();
//        nums.add(1);
//        nums.add(2);
//        int sum = (int) nums.get(0) + (int) nums.get(1) + (int) nums.get(2);
//        System.out.println(sum); // 6
//        ```
    //# ArrayList and Map Cheat Sheet
    //
    //### ArrayList
    //
    //To use...
    //
    //	1) import the java.util package
    //	2) ArrayList<Type> referenceName = new ArrayList<>();
    //
    //Common Methods...
    //
    //	ABOUT THE LIST
    //	.size() ------------ returns the number of elements in the list
    //	.isEmpty() --------- check if list is empty
    //	.contains(val) ----- returns boolean (does element exist in list?)
    //	.lastIndexOf(val) -- returns index or -1 if none
    //
    //	GETTING INFO
    //	.get(index) -------- returns the element at a given index
    //	.indexOf(val) ------ returns the first found index or -1 if none
    //
    //	SETTING VALUES
    //	.add(val[, index]) - add an element to the list (index optionally specified)
    //
    //	DELETING
    //	.remove(val) ------- removes the first occurrence of item or at an index
    //
    //
    //### HashMap
    //
    //To use...
    //
    //	1) import the java.util package
    //	2) HashMap<TypeOfKey, TypeOfValue> referenceName = new HashMap<>();
    //
    //
    //Common Methods...
    //
    //	ABOUT THE MAP
    //	.isEmpty() --------------- returns boolean (is the map empty?)
    //	.containsKey(key) -------- returns boolean (does key exist in map?)
    //	.containsValue(val) ------ returns boolean (does value exist in map?)
    //
    //	GETTING INFO
    //	.get(key) ---------------- return the value at a key
    //	.getOrDefault(key, dfal) - like get but may specify a default value
    //
    //	SETTING
    //	.put(key, val) ----------- added a key-value pair to the Map
    //	.putIfAbsent(key, val) --- only sets key-value if not present in Map
    //
    //	UPDATING
    //	.replace(key, val) ------- replace a value at a given key
    //
    //	DELETEING
    //	.remove(key) ------------- remove key value pair given a key
    //	.clear() ----------------- empty the map


    /////HASH MAPS ///////
//    A hash map is a data structure for key-value pairs, implemented with the HashMap class in Java. These are similar to objects in JavaScript. All the keys in the hash map must be of the same type, and all the values must be of the same type, but the keys and the values don't necessarily have to be the same type.
//
//    Here are some basic methods for working with hash maps:
//
//    Method	Description
//.put	set a key-value pair
//.get	return the value associated with the given key, or null
//  .getOrDefault	like .get, but with a defined value instead of null
// .containsKey	check if a key exists in the map
//.containsValue	check if a value exists in the map



// We'll start by defining a hash map
//    HashMap<String, String> usernames = new HashMap<>();

// and putting some data into it
//usernames.put("Ryan", "ryanorsinger");
//usernames.put("Zach", "zgulde");
//usernames.put("Fernando", "fmendozaro");
//usernames.put("Justin", "jreich5");
//
//System.out.println(usernames);
//// {Ryan=ryanorsinger, Zach=zgulde, Fernando=fmendozaro, Justin=jreich5}
//
//// obtaining values from the hash map by key
//usernames.get("Ryan"); // "ryanorsinger"
//usernames.get("Phillip"); // null
//usernames.getOrDefault("Jason", "gocodeup"); // "gocodeup"
//
//// checking if keys or values are present
//usernames.containsKey("Justin"); // true
//usernames.containsValue("fmendozaro"); // true


//    Map<Integer, String> testMap = new HashMap<>();
//    testMap.put(1, "hello");
//    testMap.put(10, "world");
    

}