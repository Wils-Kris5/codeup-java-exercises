

public class JavaDrills {

    public static String flipOuterCase(String text) {
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            char c = chars[i];
            if (Character.isUpperCase(c))
            {
                chars[i] = Character.toLowerCase(c);
            }
            else if (Character.isLowerCase(c))
            {
                chars[i] = Character.toUpperCase(c);
            }
        }
        return new String(chars);

    }
//working progress
    public static void main(String[] args) {
        sout flipOuterCase("Cat");
    }
}

