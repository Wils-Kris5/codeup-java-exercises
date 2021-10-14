public class HighLowExercise {
    private static MethodsMiniExercise MethodsExercises;

//# Game picks a random number between 1 and 100.
//                # Prompts user to guess the number.
//                # All user inputs are validated.
//# If user's guess is less than the number, it outputs "HIGHER".
//                # If user's guess is more than the number, it outputs "LOWER".
//                # If a user guesses the number, the game should declare "GOOD GUESS!"


 public static boolean gameResponseMessage(int userGuess, int oneToOneHundred) {
     boolean keepGuessing = true;
     if (userGuess == oneToOneHundred) {
         System.out.println("NICE TRY!");
         keepGuessing = false;
     } else if (userGuess < oneToOneHundred) {
         System.out.println("Higher!");
     } else {
         System.out.println("Lower!");
     }
     return keepGuessing;
 }

    public static void gamePromt(int randoNum) {
        System.out.println("guess a number between one and onehundred");
        int userGuess = MethodsExercises.getInteger(1, 100);
        if (gameResponseMessage(userGuess, randoNum)) {
            gamePromt(randoNum);
        }
    }
        public static void start() {
            System.out.println("Lets play, Hight-Low Game!");
            int oneToOneHundred = MethodsExercises.getRandomInt(1, 100);
            System.out.println(oneToOneHundred); // FOR DEBUGGING
            gamePromt(oneToOneHundred);
        }

        public static void main(String[] args) {
             start();
        }

    }



