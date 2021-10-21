

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
 //https://commons.apache.org/proper/commons-lang/javadocs/api-2.6/src-html/org/apache/commons/lang/StringUtils.html#line.5259
    public static String swapCase(String str) {
                int strLen;
             if (str == null || (strLen = str.length()) == 0) {
                        return str;
                }
                   StrBuilder buffer = new StrBuilder(strLen);
        
                   char ch = 0;
                   for (int i = 0; i < strLen; i++) {
                          ch = str.charAt(i);
                          if (Character.isUpperCase(ch)) {
                                    ch = Character.toLowerCase(ch);
                                } else if (Character.isTitleCase(ch)) {
                                    ch = Character.toLowerCase(ch);
                                } else if (Character.isLowerCase(ch)) {
                                    ch = Character.toUpperCase(ch);
                                }
                         buffer.append(ch);
                     }
            return buffer.toString();
               }
    //In `codeup-java-exercises`, in`JavaDrills`, add the following:
    //Create a public static method, `flipInnerCase`, that takes in a string and returns the string
    //with the case of all letters reversed EXCEPT for the first and last letters. Assume the input will be three or more characters long.
    //Example inputs and expected outputs...
    //  System.out.println(flipInnerCase(“cat”)); // cAt
    //  System.out.println(flipInnerCase(“CaT”)); // CAT
    //  System.out.println(flipInnerCase(“caT”)); // cAT
    //  System.out.println(flipInnerCase(“codeup”)); // cODEUp
    //  System.out.println(flipInnerCase(“CoDeup”)); // COdEUp

    //working progress  https://stackoverflow.com/questions/1729778/how-can-i-invert-the-case-of-a-string-in-java
    public static void main(String[] args) {
        System.out.println(JavaDrills.flipOuterCase("cAt"));
        System.out.println(JavaDrills.flipOuterCase("Cat"));


    }

    private static class StrBuilder {
        public StrBuilder(int strLen) {
        }

        public void append(char ch) {
        }
    }
}
