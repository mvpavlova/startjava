public class Unicode {
    public static void main(String[] args) {
        char unicode = 33;
        do {
            System.out.println(unicode);
            if(unicode <= 126) {
                unicode++;
            }
        }while (unicode <= 126);
    }
}