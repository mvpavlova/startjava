public class Wolf {
    private String sex = "male";
    private String name = "Bolt";
    private double weight = 20.5d;
    private int age = 5;
    private String color = "Grey";

    public String getSex() {
        return sex;
    }

    void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    void setAge(int age) {
        if(age > 8) {
            System.out.println("Вы ввели неправильный возраст");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
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
