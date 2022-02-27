public class PhraseOMatic {
    public static void main(String[] args){
        //make three sets of words to choose from
        String[] wordListOne = {"24/7", "multi-Tier", "30,000 foot", "A-to-A", "win-win", "lose-lose", "front-end", "web-based", "pervasive", "dynamic"

        };
        String[] wordListTwo = {
                "empowered", "value-added", "oriented", "centric", "focused", "leveraged", "positive", "networked", "critical-path", "determined"
        };
        String[] wordListThree = {
                "process", "tipping-point", "architecture", "core competency", "stratedy", "mindshare", "portal", "space", "vision", "paradigm", "mission"
        };
        //find out how many words are in each list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        //generate the random numbers
        int rando1 = (int) (Math.random() * oneLength);
        int rando2 = (int) (Math.random() * twoLength);
        int rando3 = (int) (Math.random() * threeLength);

        //now build a phrase
        String phrase = wordListOne[rando1] + " " + wordListTwo[rando2] + " " + wordListThree[rando3];

        //print out phrase
        System.out.println("What we need is a " + phrase);
    }
}
