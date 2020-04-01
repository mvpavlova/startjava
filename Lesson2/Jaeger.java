public class Jaeger {

    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strenght;
    private int armor;

    public Jaeger(String a, String b, String c, float d, float e, int f, int g, int h) {
        modelName = a;
        if(modelName == "") {
            System.out.println("Пустая строка");
        }
        mark = b;
        origin = c;
        height = d;
        if (height <= 0) {
            System.out.println("height - Неверное значение");
        }
        weight = e;
        if (weight <= 0) {
            System.out.println("weight - Неверное значение");
        }
        speed = f;
        if (speed < 0) {
            System.out.println("speed - Неверное значение");
        }
        strenght = g;
        if (strenght <= 0) {
            System.out.println("strenght - Неверное значение");
        }
        armor = h;
        if (armor <= 0) {
            System.out.println("armor - Неверное значение");
        }
    }
    public String getModelName() {
        return modelName;
    }

    public String getMark() {
        return mark;
    }

    public String getOrigin() {
        return origin;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public int getSpeed() {
        return speed;
    }

    public int getStrenght() {
        return strenght;
    }

    public int getArmor() {
        return armor;
    }

    public boolean drift() {
        System.out.println("Вы вошли в дрифт");
        return true;
    }

    public void move() {
        System.out.println("Вы прошли 5 шагов");
    }

    public void armor() {

    }

    public void powerMove() {

    }
}