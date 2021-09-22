import java.nio.file.Path;
import java.nio.file.Paths;

public class FileIOLecture {
    public static void main(String[] args) {
//        Path path = Paths.get("src");
//        System.out.println(path);
//        System.out.println(path.toAbsolutePath());
     Path pathToThisLectureFile = Paths.get("src", "fileIOLecture.java");
     Path someOtherPath = Paths.get("~", "Library", "Java");
        System.out.println(someOtherPath);
        System.out.println(someOtherPath.toAbsolutePath());
        System.out.println(pathToThisLectureFile);
    }
 //a file is a discrete container for data on a storage device
    //a path is the location of a file in a filesystem


    //Cross Platform Paths
    //
    //file paths as they relate to Unix/Linux operating systems.
 // Paths are a little different in Windows, but the classes and methods provided by Java allow us
       // to abstract away the difference between operating systems.

/*
/  : when a path starts with /,
 it refers to the filesystem root, otherwise it is used to separate directories in a path
    .   current directory
   ..    parent directory


There are two types of paths:
   - absolute paths: specified from the filesystem root
   - relative paths: relative to the current working directory
*/

}
