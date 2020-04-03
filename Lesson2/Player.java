import java.util.Scanner; //импорт сканера

public class Player {
    Scanner scanName = new Scanner(System.in);
    private  String name;
    private int number;

    public Player() {
        System.out.print("Введите имя игрока: ");
        this.name = scanName.nextLine();
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}