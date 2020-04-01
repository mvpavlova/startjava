public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jagerOne = new Jaeger();
        Jaeger jagerTwo = new Jaeger();

        jagerOne.setModelName("Gipsy Danger");
        System.out.println(jagerOne.getModelName());

        jagerOne.setMark("Mark-3");
        jagerOne.setOrigin("USA");
        jagerOne.setHeight(79.25f);
        jagerOne.setWeight(1.980f);
        jagerOne.setSpeed(7);
        jagerOne.setStrenght(8);
        jagerOne.setArmor(0);

        System.out.println(jagerOne.getMark() + jagerOne.getOrigin());
        System.out.println(jagerOne.getHeight() + jagerOne.getWeight());

        jagerTwo.setModelName("Cherno Alpha");
        System.out.println(jagerTwo.getModelName());

        jagerTwo.setMark("Mark-1");
        jagerTwo.setOrigin("Russia");
        jagerTwo.setHeight(0f);
        jagerTwo.setWeight(2.412f);
        jagerTwo.setSpeed(3);
        jagerTwo.setStrenght(10);
        jagerTwo.setArmor(10);

        System.out.println(jagerTwo.getSpeed() + jagerTwo.getWeight());
        System.out.println(jagerTwo.getHeight() + jagerTwo.getWeight());

    }
}