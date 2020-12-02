import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Game {

    private ArrayList<String> allQuestions;
    private ArrayList<String> allAnswers;
    Player play1;
    History Hist1;
    Technology Tech1;
    Sports Spor1;
    Food Food1;
    Language Lang1;


    public Game(String name){
        play1=new Player(name);
        Hist1=new History();
        Tech1=new Technology();
        Spor1=new Sports();
        Food1=new Food();
        Lang1=new Language();
        allQuestions=new ArrayList<>();
        allAnswers=new ArrayList<>();
    }


    public ArrayList<String> getAllQuestions(){
        return  allQuestions;
    }

    public ArrayList<String> getAllAnswers(){
        return allAnswers;
    }

    public int randomNumber(int size){
        Random num=new Random();
        int k=num.nextInt(size);
        return  k;
    }



    public static void main(String[] args) {


        Scanner nam1 = new Scanner(System.in);
        System.out.println("Δώσε όνομα: ");
        String name = nam1.nextLine();

        Game player1 = new Game(name);
        System.out.println();

        int totalPointInGame=player1.play1.getTotalPoints();

        for (int i=0;i<player1.Hist1.getHistQSize();i++){
            player1.allQuestions.add(player1.Hist1.getHistQ(i));
        }
        for (int i=0;i<player1.Hist1.getHistASize();i++){
            player1.allAnswers.add(player1.Hist1.getHistA(i));
        }

        int sizOfHistory = player1.allQuestions.size();


        for (int i=0;i<player1.Tech1.getTechQSize();i++){
            player1.allQuestions.add(player1.Tech1.getTechQ(i));
        }
        for (int i=0;i<player1.Tech1.getTechASize();i++){
            player1.allAnswers.add(player1.Tech1.getTechA(i));
        }
        int sizOfTechnology = player1.allQuestions.size()-sizOfHistory;


        for (int i=0;i<player1.Spor1.getSportQSize();i++){
            player1.allQuestions.add(player1.Spor1.getSportQ(i));
        }
        for (int i=0;i<player1.Spor1.getSportASize();i++){
            player1.allAnswers.add(player1.Spor1.getSportA(i));
        }
        int sizOfSport= player1.allQuestions.size()-sizOfHistory-sizOfTechnology;


        for (int i=0;i<player1.Food1.getFoodQSize();i++){
            player1.allQuestions.add(player1.Food1.getFoodQ(i));
        }
        for (int i=0;i<player1.Food1.getFoodASize();i++){
            player1.allAnswers.add(player1.Food1.getFoodA(i));
        }
        int sizOfFood= player1.allQuestions.size()-sizOfHistory-sizOfTechnology-sizOfSport;


        for (int i=0;i<player1.Lang1.getLangQSize();i++){
            player1.allAnswers.add(player1.Lang1.getLangQ(i));
        }
        for (int i=0;i<player1.Lang1.getLangASize();i++){
            player1.allAnswers.add(player1.Lang1.getLangA(i));
        }
        int sizOfLanguage= player1.allQuestions.size()-sizOfHistory-sizOfTechnology-sizOfSport-sizOfFood;




        for (int rounds = 0; rounds < 2; rounds++) {
            System.out.println("ΕΝΑΡΞΗ ΝΕΟΥ ΓΥΡΟΥ!!!!!");
            System.out.println();
            System.out.println();
            int typeOfGame= player1.randomNumber(1);
            System.out.printf("ΤΥΠΟΣ ΓΥΡΟΥ :");
            if(typeOfGame==0){
                System.out.printf("\tΓΡΗΓΟΡΗ ΑΠΑΝΤΗΣΗ!!!!%n");
            }
            else {
                System.out.printf("\tΠΟΝΤΑΡΙΣΜΑ!!!!%n");
            }

            for(int numOfQuest=0;numOfQuest<35;numOfQuest++) {

                int k = player1.randomNumber(player1.getAllQuestions().size());

                System.out.println();
                System.out.println();

                if (k < sizOfHistory && sizOfHistory != 0) {
                    System.out.println("ΚΑΤΗΓΟΡΙΑ: ΙΣΤΟΡΙΑ ");
                    sizOfHistory--;
                } else if (k > sizOfHistory && k < (sizOfHistory + sizOfTechnology) && sizOfTechnology > 0 ){
                    System.out.println("ΚΑΤΗΓΟΡΙΑ: ΤΕΧΝΟΛΟΓΙΑ");
                    sizOfTechnology--;
                } else if (k > sizOfTechnology && k < (sizOfHistory + sizOfTechnology + sizOfSport) && sizOfSport > 0 ){
                    System.out.println("ΚΑΤΗΓΟΡΙΑ: ΑΘΛΗΤΙΚΑ");
                    sizOfSport--;
                } else if (k > sizOfSport && k < (sizOfHistory + sizOfTechnology + sizOfSport + sizOfFood) && sizOfFood > 0 ){
                    System.out.println("ΚΑΤΗΓΟΡΙΑ: ΦΑΓΗΤΟ-ΠΟΤΟ");
                    sizOfFood--;
                } else {
                    System.out.println("ΚΑΤΗΓΟΡΙΑ: ΓΛΩΣΣΑ");
                    sizOfLanguage--;
                }

                System.out.println();
                String playerBet="";
                if(typeOfGame==1) {
                    System.out.println("Πόνταρε 250,500,750 ή 1000");
                    playerBet=nam1.nextLine();
                    while (!playerBet.equals("250") && !playerBet.equals("500") && !playerBet.equals("750") && !playerBet.equals("1000")) {
                        System.out.println("Πόνταρε 250,500,750 ή 1000");
                        playerBet = nam1.nextLine();
                    }
                }
                int bet=0;
                if(playerBet.equals("250")||playerBet.equals("500")||playerBet.equals("750")|playerBet.equals("1000")){
                    bet = Integer.parseInt(playerBet);
                }
                System.out.println(player1.allQuestions.get(k));


                ArrayList<String> play1ans=new ArrayList<>();
                ArrayList<String> currentAns = new ArrayList<>();
                for (int j = k * 4; j < (k * 4) + 4; j++) {
                    currentAns.add(player1.allAnswers.get(j));
                }
                for (int j = 0; j < 4; j++) {
                    int m = player1.randomNumber(currentAns.size());
                    System.out.printf("%d: \t %s %n", j + 1, currentAns.get(m));
                    play1ans.add(currentAns.get(m));
                    currentAns.remove(m);
                }
                System.out.println();
                String playAnswer = nam1.nextLine();
                while((!playAnswer.equals("1")&& !playAnswer.equals("2")&& !playAnswer.equals("3")&& !playAnswer.equals("4"))){
                    System.out.println("Μη αποδεκτός αριθμός,πληκτρολόγησε ξανα ");
                    playAnswer = nam1.nextLine();
                }
                int playersAnswer = Integer.parseInt(playAnswer);

                System.out.println();
                boolean corrAnswer=false;
                if (play1ans.get(playersAnswer-1).equals(player1.allAnswers.get(k*4))){
                    System.out.printf("\tΣΩΣΤΑ!!!!! %n");
                    corrAnswer=true;
                }
                else{
                    System.out.printf("Η ΣΩΣΤΗ ΑΠΑΝΤΗΣΗ ΗΤΑΝ Η : %s",player1.allAnswers.get(k*4));
                }

                if (corrAnswer&&(typeOfGame==0)){
                    totalPointInGame+=1000;
                }
                else if(corrAnswer&&(typeOfGame==1)){
                    totalPointInGame+=bet;
                }
                else if(corrAnswer==false&&(typeOfGame==1)){
                    totalPointInGame-=bet;
                }
                for(int j=0;j<4;j++){
                    play1ans.remove(0);
                }
                for (int j = k * 4, ind = 0; j < (k * 4) + 4; j++, ind++) {
                    player1.allAnswers.remove(j - ind);
                }


                System.out.println();
                System.out.println();
                System.out.println();
                player1.allQuestions.remove(k);
                System.out.println("Round's Score: " + totalPointInGame);
                System.out.println();
            }

        }

        System.out.printf(" %s Score:  %d",player1.play1.getName(),totalPointInGame);

        while (player1.allQuestions.size() > 0) {
            player1.allQuestions.remove(0);

            while (player1.allAnswers.size() > 0) {
                player1.allAnswers.remove(0);
            }
        }


    }

}
