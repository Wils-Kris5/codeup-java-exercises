public class ExceptionsLectureTest {

    public static void main(String[] args) {
  //this is instanciation VVV

         try{
             ExceptionsLecture el = new ExceptionsLecture();
             System.out.println(Integer.parseInt(el.noIntAtAll));

         }  catch (NumberFormatException nfx) {
             System.out.println("HallPass: " + nfx);
         }



    }
}
