public class Jaeger {

    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strenght;
    private int armor;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        if(modelName == ""){
            System.out.println("Пустая строка");
        } else {
            this.modelName = modelName;
        }
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        if (height <= 0) {
            System.out.println("height - Неверное значение");
        } else {
            this.height = height;
        }
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if (weight <= 0) {
            System.out.println("weight - Неверное значение");
        } else {
            this.weight = weight;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            System.out.println("speed - Неверное значение");
        } else {
            this.speed = speed;
        }
    }

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        if (strenght <= 0) {
            System.out.println("strenght - Неверное значение");
        } else {
            this.strenght = strenght;
        }
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        if (armor <= 0) {
            System.out.println("armor - Неверное значение");
        } else {
            this.armor = armor;
        }
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