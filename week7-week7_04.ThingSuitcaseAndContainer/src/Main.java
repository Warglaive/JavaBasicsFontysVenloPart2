
public class Main {

    public static void main(String[] args) {
        // use this main class to test your program!
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    public static void addSuitcasesFullOfBricks(Container container) {
        // adding 100 suitcases with one brick in each

//        for (int i = 0; i < 100; i++) {
//            int brickWeigth = i;
//            Thing brick = new Thing("Brick", brickWeigth + 1);
//            Suitcase suitcase = new Suitcase(101);
//            suitcase.addThing(brick);
//            container.addSuitcase(suitcase);
//        }
        for (int i = 1; i <= 100; i++) {
            Thing brick = new Thing("Brick", i);
            Suitcase suitcase = new Suitcase(i + 1);

            suitcase.addThing(brick);
            container.addSuitcase(suitcase);

        }
    }
}
