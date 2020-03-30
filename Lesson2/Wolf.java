public class Wolf {
    private String sex = "male";
    private String name = "Bolt";
    private double weight = 20.5d;
    private int age = 5;
    private String color = "Grey";

    public String getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    void setSex(String sex) {
        this.sex = sex;
    }

    void setName(String name) {
        this.name = name;
    }

    void setWeight(double weight) {
        this.weight = weight;
    }

    void setAge(int age) {
        if(age > 8) {
            System.out.println("Вы ввели неправильный возраст");
        } else {
            this.age = age;
        }
    }

    void setColor(String color) {
        this.color = color;
    }

    public void walk() {
        System.out.println("GO!");
    }

    public void sit() {
        System.out.println("Sit!");
    }

    public void run() {
        System.out.println("Run!");
    }

    public void earn() {
        System.out.println("Earn!");
    }

    public void hunt() {
        System.out.println("Hunt!");
    }
}
