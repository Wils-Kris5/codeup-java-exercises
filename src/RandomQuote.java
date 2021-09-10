public class RandomQuote {
 //Create a Quote class with a RandomQuote method.
    // The method should generate a random number from 1 to 4.
 // Depending on the result, the method should return a different quote.
 // Now edit your animal class from the previous exercise so instead of an appropriate animal noise it makes a random quote.
    // Test your animal class and verify that it now emits a random quote instead of an animal-appropriate noise.
 public static String generateQuote() {
  int animalNum = (int) (Math.random() * 4) + 1;
  String randoQuoteOne = "Oh hi, Mark";
  String randoQuoteTwo = "bark, bark";
  String randoQuoteThree = "glub, glub";
  String randoQuoteFour = "meow, meow";
  if(animalNum == 1){
      return randoQuoteTwo;
  } else if (animalNum == 2){
   return randoQuoteFour;
  } else if(animalNum == 3){
   return randoQuoteOne;
  } else {
   return randoQuoteThree;
  }

 }












}
