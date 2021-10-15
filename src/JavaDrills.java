

public class JavaDrills {

    public static String flipOuterCase(String text) {
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                chars[i] = Character.toUpperCase(c);
            }
        }
        return new String(chars);

    }

    //    Create a static method, returnTotalDifference, that takes in two lists of integers and returns the difference between the sum of all integers in the first list minus the sum of all integers in the second list.
//            returnTotalDifference(Arrays.asList(10, 2, 3), Arrays.asList(1, 2, 3)); // returns 9
//    returnTotalDifference(Arrays.asList(10, 1), Arrays.asList(1, 7)); // returns 3
//    returnTotalDifference(Arrays.asList(10, 1), Arrays.asList(1, 7, 1)); // returns 2
    //resource: https://introcs.cs.princeton.edu/java/21function/
  //  https://www.baeldung.com/java-array-sum-average
    public static int avg(int[] array) {
        int total = 0;
        for (int value : array){
            total += value;
    }
      return total;
}


    //working progress  https://stackoverflow.com/questions/1729778/how-can-i-invert-the-case-of-a-string-in-java
    public static void main(String[] args) {
        System.out.println(JavaDrills.flipOuterCase("cAt"));
        System.out.println(JavaDrills.flipOuterCase("Cat"));


    }
}
