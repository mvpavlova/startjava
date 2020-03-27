public class Cycle {
    public static void main(String[] args) {

        int cycleFor = 0;
        int resultFor = 0;
        for(int i = 0; i <= 20; i++){
            cycleFor = resultFor+i;
            System.out.println(cycleFor);
        }

        int resultWhile = -6;
        int iWhile = 0;
        int cycleWhile = 0;
        while(cycleWhile <= 4){
            cycleWhile = resultWhile + iWhile;
            System.out.println(cycleWhile);
            iWhile = iWhile + 2;
        }

        int iDoWhile = 10;
        int resultDoWhile = 0;
        do{
            if(iDoWhile % 2 ==0){
            } else{
                resultDoWhile= resultDoWhile + iDoWhile;
            }
            iDoWhile++;
        }while(iDoWhile <= 19);
        System.out.println(resultDoWhile);
    }
}