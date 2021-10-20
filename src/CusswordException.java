

public class CusswordException extends Exception {
    CusswordException () {}

    CusswordException(String word) {
        super(word);
    }
}
