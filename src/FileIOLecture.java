import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileIOLecture {
    public void readFileAndOutput (Path pathToFile){
        List<String> linesInTheFile = new ArrayList<>();
        try{
            linesInTheFile = Files.readAllLines(pathToFile);
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
        for(String line : linesInTheFile){
            System.out.println(line);
        }
    }
   // public static void main(String[] args) {
      //  Path path = Paths.get("src");
//        System.out.println(path);
//        System.out.println(path.toAbsolutePath());
 //    Path pathToThisLectureFile = Paths.get("src", "fileIOLecture.java");
 //       Path pathToOurDataDir = Paths.get("src/data");
//      try{
//          if(Files.notExists(pathToOurDataDir)) {
//              Files.createDirectories(pathToOurDataDir);
//          } else {
//              System.out.println("The " + pathToOurDataDir + " directory already exists!");
//          } catch(IOException ioe)) {
//              ioe.printStackTrace();
//          }
       //  Path pathToOurFile = Paths.get("src/data", "list.txt");
//        try{
//            if(Files.notExists(pathToOurFile)){
//                Files.createFile(pathToOurFile);
//            } else {
//                System.out.println("The " + pathToOurFile + " file already exists!");
//            }
//        } catch(IOException ioe) {
//            System.out.println("There is a problem!");
//                ioe.printStackTrace();
//            }
//        List<String> cartoons = Arrays.asList("Ed, Edd, Eddy" , "PowderPuff Girls", "SpongeBob");
//        try {
//            Files.write(pathToOurFile, cartoons);
//        } catch(IOException ioe){
//            ioe.printStackTrace();
//      }
//        List<String> currentList = new ArrayList<>();
//        try {
//            currentList = Files.readAllLines(pathToOurFile);
//        } catch(IOException ioe){
//            ioe.printStackTrace();
//        } for(String item : currentList){
//            System.out.println(item);
//        }
//    }
 //a file is a discrete container for data on a storage device
    //a path is the location of a file in a filesystem

     // checked exception = will not compile they will not work outside of the try catch 
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
