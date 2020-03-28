public class Unicode {
    public static void main(String[] args) {
        char unicode = '\u0033';
        do {
            System.out.println(unicode);
            if(unicode <= 0126) {
                unicode++;
            }
        }while (unicode <= 0126);
    }
}