public class Jaeger {

    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strenght;
    private int armor;

    public Jaeger(String modelName, String mark,int armor) {
        if(modelName == "") {
            System.out.println("Пустая строка");
        } else {
            this.modelName = modelName;
        }
        this.mark = mark;
        if (armor <= 0) {
            System.out.println("armor - Неверное значение");
        } else {
            this.armor = armor;
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