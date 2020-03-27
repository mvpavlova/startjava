public class Cycle {
    public static void main(String[] args) {
        for(int i = 0; i <= 20; i++){
            System.out.println(i);
        }

        int counter = -6;
        while(counter <= 6){
            System.out.println(counter);
            counter = counter + 2;
        }

        int iDoWhile = 10;
        int resultDoWhile = 0;
        do{
            if(iDoWhile % 2 == 0) {
                resultDoWhile = resultDoWhile;
            } else{
                resultDoWhile= resultDoWhile + iDoWhile;
            }
            iDoWhile++;
        } while(iDoWhile <= 20);
        System.out.println(resultDoWhile);
    }
}