public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();

        wolfOne.setSex("female");
        wolfOne.setName("Nina");
        wolfOne.setWeight(15.5d);
        wolfOne.setAge(9);
        wolfOne.setColor("Brown");

        System.out.println("Sex of wolf is " + wolfOne.getSex());
        System.out.println("Name of wolf is " + wolfOne.getName());
        System.out.println("Weight of wolf is " + wolfOne.getWeight());
        System.out.println("Age of wolf is " + wolfOne.getAge());
        System.out.println("Color of wolf is " + wolfOne.getColor());
    }
}