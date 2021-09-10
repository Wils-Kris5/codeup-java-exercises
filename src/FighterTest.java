public class FighterTest {
    public static void main(String[] args) {
        // we instantiate a fighter object

        Fighter arata = new Fighter("Arata", 17, 14);
//        arata.name = "Arata";
//        arata.hitPoints = 17;
//        arata.maxDamage = 14;
//        arata.printStats();
        arata.battleRoar();


        Fighter sozalix = new Fighter("Sozalix", 24, 16);
//        sozalix.name = "Sozalix";
        sozalix.battleRoar();
//        sozalix.printStats();
        System.out.println("Sozalix attacks and rolls a " + sozalix.attackRoll());


//        System.out.println(Club.maxDamage);
//        System.out.println(Integer.MAX_VALUE);
    }
}