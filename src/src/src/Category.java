package src;

import java.util.ArrayList;

public class Category {
    private ArrayList<String> Questions;
    private ArrayList<String> Answers;

    History hist;
    Technology tech;
    Food food;
    Sports sports;
    Language lang;

    Round m;
    Player player;


    private int maxH;
    private int maxT;
    private int maxF;
    private int maxS;
    private int maxL;

    private int hQremov;
    private int tQremov;
    private int fQremov;
    private int sQremov;
    private int lQremov;


    public Category(){
        Questions=new ArrayList<>();
        Answers=new ArrayList<>();

        hist=new History();
        tech=new Technology();
        food=new Food();
        sports=new Sports();
        lang=new Language();

        setQuestions();
        setAnswers();

        m=new Round();
        player=new Player();


        maxH=15;
        maxT=30;
        maxF=45;
        maxS=60;
        maxL=75;

        hQremov=0;
        tQremov=0;
        fQremov=0;
        sQremov=0;
        lQremov=0;

    }


    public void setQuestions() {

        for (int i = 0; i < hist.getHistQSize(); i++) {
            Questions.add(hist.getHistQ(i));
        }

        for (int i=0;i< tech.getTechQSize();i++){
            Questions.add(tech.getTechQ(i));
        }
        for (int i = 0; i < food.getFoodQSize(); i++) {
            Questions.add(food.getFoodQ(i));
        }

        for (int i=0;i< sports.getSportQSize();i++){
            Questions.add(sports.getSportQ(i));
        }
        for(int i=0;i< lang.getLangQSize();i++){
            Questions.add(lang.getLangQ(i));
        }
       // sizeQ+= Questions.size();
    }

    public void setAnswers() {
        for(int i=0;i< hist.getHistASize();i++) {
            Answers.add(hist.getHistA(i));
        }

        for(int i =0;i< tech.getTechASize();i++){
            Answers.add(tech.getTechA(i));
        }

        for (int i = 0; i < food.getFoodASize(); i++) {
           Answers.add(food.getFoodA(i));
        }

        for (int i=0;i< sports.getSportASize();i++){
            Answers.add(sports.getSportA(i));
        }
        for(int i=0;i< lang.getLangASize();i++){
            Answers.add(lang.getLangA(i));
        }
        //sizeA+=Answers.size();
    }


    public ArrayList<String> getQuestions(){return Questions;}
    public ArrayList<String> getAnswers(){return  Answers;}

    public String getQuestion(int position) { return Questions.get(position); }

    public String getAnswer(int position){ return Answers.get(position); }

    public int QuestionsSize(ArrayList<String> quest){ return quest.size(); }

    public int AnswersSize(ArrayList<String> answer){ return answer.size(); }





    public void changeMax(int k){
        if(k<maxH) {
            maxH--;
            maxT--;
            maxF--;
            maxS--;
            maxL--;
        }
        else if(k<maxT){
            maxT--;
            maxF--;
            maxS--;
            maxL--;
        }
        else if(k<maxF){
            maxF--;
            maxS--;
            maxL--;
        }
        else if(k<maxS){
            maxS--;
            maxL--;
        }

    }


    public void TypeOfCategory(int k){


        if (k <this.maxH && hQremov <15) {
            System.out.printf("\tΚΑΤΗΓΟΡΙΑ: ΙΣΤΟΡΙΑ%n");
            hQremov+=1;
        } else if (k <maxT && tQremov <15) {
            System.out.printf("\tΚΑΤΗΓΟΡΙΑ: ΤΕΧΝΟΛΟΓΙΑ%n");
            tQremov+=1;
        } else if (k <maxF && fQremov <15){
            System.out.println("ΚΑΤΗΓΟΡΙΑ: ΦΑΓΗΤΟ-ΠΟΤΟ");
            fQremov+=1;
        } else if (k <maxS && sQremov <15){
            System.out.println("ΚΑΤΗΓΟΡΙΑ:  ΑΘΛΗΤΙΚΑ");
            sQremov+=1;
        } else if (k <maxL && lQremov <15){
            System.out.println("ΚΑΤΗΓΟΡΙΑ: ΓΛΩΣΣΑ");
            maxL--;
            lQremov+=1;
        }
        else
        {
            System.out.println("No more available questions");
        }

        System.out.println();

        changeMax(k);

        System.out.println();
    }



    public boolean TemporaryAnswers(int k){
        ArrayList<String> play1ans = new ArrayList<>();
        ArrayList<String> currentAns = new ArrayList<>();
        for (int j = k * 4; j < (k * 4) + 4; j++) {
            currentAns.add(getAnswer(j));
        }

        for (int j = 0; j < 4; j++) {
            int l=m.randomNumber(currentAns.size());
            System.out.printf("%d: \t %s %n", j + 1, currentAns.get(l));
            play1ans.add(currentAns.get(l));
            currentAns.remove(l);
        }
        System.out.println();

        String playAnswer =player.getAnswer();
        while (!m.ValidAnswer(playAnswer)) {
            playAnswer =player.getAnswer();
        }
        int playersAnswer = Integer.parseInt(playAnswer);

        System.out.println();
        boolean corrAnswer = false;
        if (play1ans.get(playersAnswer - 1).equals(getAnswer((k * 4)))) {
            System.out.printf("\tΣΩΣΤΑ!!!!! %n");
            corrAnswer = true;
        } else {
            System.out.printf("Η ΣΩΣΤΗ ΑΠΑΝΤΗΣΗ ΗΤΑΝ Η : %s %n ", getAnswer((k * 4)));
        }


        return corrAnswer;

    }

    public ArrayList<String> RemoveQuestion(ArrayList<String> quest,int position){
        quest.remove(position);
        return quest;
    }

    public ArrayList<String> RemoveAnswers(ArrayList<String> answ,int position){

        for (int j = position * 4, ind = 0; j < (position * 4) + 4; j++, ind++) {
            answ.remove(j - ind);
        }
        return answ;

    }
}
