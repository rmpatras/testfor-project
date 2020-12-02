package src;

import java.util.Random;

public class Round {
    private int round;
    Player player;

    public Round(){
        round=1;
        player=new Player();
    }

    public int getRound(){return round;}

    public void changeRound() {
        round+=1;
    }

    public int randomNumber(int size){
        Random num=new Random();
        int k=num.nextInt(size);
        return  k;
    }

    public int TypeOfRound(){
        int typeOfGame =randomNumber(2);

        System.out.printf("ΤΥΠΟΣ ΓΥΡΟΥ :");
        if (typeOfGame == 0) {
            System.out.printf("\tΓΡΗΓΟΡΗ ΑΠΑΝΤΗΣΗ!!!!%n");
        } else {
            System.out.printf("\tΠΟΝΤΑΡΙΣΜΑ!!!!%n");
        }
        System.out.println();
        return typeOfGame;

    }


    public boolean ValidBet(String playerBet){
        if (playerBet.equals("250") || playerBet.equals("500") || playerBet.equals("750") | playerBet.equals("1000")) {
            return true;
        }
        return false;
    }


    public boolean ValidAnswer(String playerAnswer){
        while ((!playerAnswer.equals("1") && !playerAnswer.equals("2") && !playerAnswer.equals("3") && !playerAnswer.equals("4"))) {
            System.out.println("Μη αποδεκτός αριθμός,πληκτρολόγησε ξανα ");
            return false;
        }
        return true;
    }

}
