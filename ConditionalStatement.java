public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 24;
        char sex = 'f';
        double height = 1.72;
        char firstletterofname  = 'M';

        if (age > 20) {
            System.out.println("Your age is: " + age);
        }

        if (sex == 'm') {
            System.out.println("Your sex is: male");
        }

        if (sex == 'f') {
            System.out.println("Your sex is: female");
        }

        if (height < 1.80) {
            System.out.println("Your height is less than 1.80");
        } else {
            System.out.println("Your height is more than 1.80");
        }

        if (firstletterofname == 'M') {
            System.out.println("Your first letter of your name is M");
        } else if (firstletterofname == 'I') {
            System.out.println("Your first letter of your name is I");
        } else {
            System.out.println("Your first letter of your name not M or I");
        }
    }
}