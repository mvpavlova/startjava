public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 24;
        if (age > 20) {
            System.out.println("Your age is: " + age);
        }

        char sex = 'f';
        if (sex == 'm') {
            System.out.println("Your sex is: male");
        }

        if (sex == 'f') {
            System.out.println("Your sex is: female");
        }

        double height = 1.72;
        if (height < 1.80) {
            System.out.println("Your height is less than 1.80");
        } else {
            System.out.println("Your height is more than 1.80");
        }

        char firstLetterOfName  = 'M';
        if (firstLetterOfName == 'M') {
            System.out.println("Your first letter of your name is M");
        } else if (firstLetterOfName == 'I') {
            System.out.println("Your first letter of your name is I");
        } else {
            System.out.println("Your first letter of your name not M or I");
        }
    }
}