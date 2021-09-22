public class ExceptionsLectureTest {

    public static void main(String[] args) {
        ExceptionsLecture el = new ExceptionsLecture();
        el.askForAnInteger();
        el.aMoreComplexAskForInteger();
        el.subListMaker("Hey lets see what this does ha ha ");

        try {
            el.echoWord();
        } catch (IllegalArgumentException iae) {
            System.out.println();
        }

//        try{
//        ExceptionsLecture el = new ExceptionsLecture();
//             el.subListMaker("45");
//             System.out.println(Integer.parseInt(el.noIntAtAll));
//
//         }  catch (NumberFormatException nfx) {
//             System.out.println("HallPass: " + nfx);
//             System.out.println(nfx.getMessage());
//             nfx.printStackTrace();
//         }
        Lizard lizard = new Lizard("lizard");
        System.out.println(lizard.name);
        
       Lizard illgalLizard = new Lizard(null);
    }


 //javiers mini ex:
 //Parameters:
        //fromIndex - low endpoint (inclusive) of the subList
        //toIndex - high endpoint (exclusive) of the subList
        //Returns:
        //a view of the specified range within this list
        //Throws:
        //IndexOutOfBoundsException - if an endpoint index value is out of range (fromIndex < 0 || toIndex > size)
        //IllegalArgumentException - if the endpoint indices are out of order (fromIndex > toIndex)

// This is instantiation:  ExceptionsLecture el = new ExceptionsLecture();
// example                   Integer.parseInt(el.noIntAtALl));
//



    }

