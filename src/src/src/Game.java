package src;

import java.util.ArrayList;


public class Game {

    Player play1;

    public Game(){
        play1=new Player();
    }


    public void Play(){
        System.out.println("Δώσε όνομα: ");
        String name= play1.getName();
        System.out.println();

         Round round=new Round();
         Category categ=new Category();
         ArrayList<String> AllQuestions= categ.getQuestions();
         ArrayList<String> AllAnswers=categ.getAnswers();




        boolean EndOfGame=false;
        int CurrentRound=round.getRound();
        int TP=play1.getTotalPoints();
        while (!EndOfGame) {
            int round1=round.TypeOfRound();


            for (int numOfQuest = 0; numOfQuest <6; numOfQuest++) {

                int k = round.randomNumber(categ.QuestionsSize(AllQuestions));

                System.out.println();
                categ.TypeOfCategory(k);
                System.out.println();

                String playerBet ="0";

                int bet=0;
                if (round1== 1) {
                    System.out.println("Πόνταρε 250,500,750 ή 1000");

                    playerBet = play1.getAnswer();

                    while (!round.ValidBet(playerBet)) {
                        System.out.println("Πόνταρε 250,500,750 ή 1000");
                        playerBet = play1.getAnswer();
                    }

                    bet = Integer.parseInt(playerBet);
                }
                System.out.println(categ.getQuestion(k));

                boolean CorrectAnswer=categ.TemporaryAnswers(k);

                if (CorrectAnswer && (round1== 0)) {
                    TP=play1.ChangeTotalPoints(1000);
                } else if (CorrectAnswer && (round1== 1)) {
                    TP=play1.ChangeTotalPoints(bet);
                } else if (!CorrectAnswer && (round1== 1)) {
                    TP=play1.ChangeTotalPoints(-bet);
                }
                categ.RemoveAnswers(AllAnswers,k);

                System.out.println();

               categ.RemoveQuestion(AllQuestions,k);


                    System.out.println();
                    System.out.println();
                    System.out.println();
                }

                round.changeRound();
                CurrentRound=round.getRound();
                EndOfGame=FinishGame(CurrentRound);
            }

        System.out.printf("%s Score: %d %n",name,TP);
        System.out.println("Thanks for playing.Hope see you again");
    }


    public boolean FinishGame(int round){
        if(round>=3){
            return true;
        }
        return false;
    }

}
