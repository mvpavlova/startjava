public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();

        System.out.println("Sex of wolf is " + wolfOne.sex);
        System.out.println("Name of wolf is " + wolfOne.name);
        System.out.println("Weight of wolf is " + wolfOne.weight);
        System.out.println("Age of wolf is " + wolfOne.age);
        System.out.println("Color of wolf is " + wolfOne.color);

        wolfOne.walk();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.earn();
        wolfOne.hunt();
    }
}