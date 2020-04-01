public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jagerOne = new Jaeger("", "Mark-3", "USA", 79.25f, 1.980f, 7, 8, 0);

        System.out.println(jagerOne.getModelName());
        System.out.println(jagerOne.getMark());
        System.out.println(jagerOne.getOrigin());
        System.out.println(jagerOne.getHeight());
        System.out.println(jagerOne.getWeight());

        Jaeger jagerTwo = new Jaeger("Cherno Alpha","Mark-1", "Russia", 0f, 2.412f, 3, 10, 10);
        System.out.println(jagerTwo.getModelName());
        System.out.println(jagerTwo.getMark());
        System.out.println(jagerTwo.getOrigin());
        System.out.println(jagerTwo.getHeight());
        System.out.println(jagerTwo.getWeight());
    }
}