
//```
//        Output:
//```
//        Arata has 17 hit points and can do 14 damage
//```
//
//        But really, we want to keep this kind of code out of our class. Instead, we are going to create a test class.
//
//```
//        public class FighterTest {
//            public static void main(String[] args) {
//                Fighter arata = new Fighter();
//                arata.name = "Arata";
//                arata.hitPoints = 17;
//                arata.maxDamage = 14;
//                arata.printStats();
//            }
//        }
//```
//        Now, in this test class, we instantiate our fighter and we use dot notation to access its variables.
//
//        "group.B.A real Java application is nothing but objects talking to other objects. In this case, talking means objects calling methods on one another."
//                --Head First Java
