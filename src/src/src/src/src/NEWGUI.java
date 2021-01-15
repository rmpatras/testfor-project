package src.src.src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class NEWGUI extends JFrame {

    private JMenuBar menu;
    private JMenu file;
    private JMenu help;
    private JButton newgame;
    private JPanel panel;
    private String name1;
    private String name2;

    public NEWGUI(){
        setTitle("BUZZMENO QUIZZ");
        setSize(1280, 720);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);

        menu=new JMenuBar();
        panel=new JPanel();



        makeFile();
        makeNewGame();
        makeHelp();

        setJMenuBar(menu);
        add(panel);
        setVisible(true);


    }

    public void makeFile(){
        file = new JMenu("Αρχείο");
        menu.add(file);
        JLabel label=new JLabel(" ");
        add(label);
        JMenuItem menuFileOpen = new JMenuItem("Άνοιγμα");
        menuFileOpen.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Έκανες κλικ στο άνοιγμα");
                label.setBounds(500,500,label.getPreferredSize().width,label.getPreferredSize().height);
            }
        });
        file.add(menuFileOpen);

        JMenuItem menuFileQuit = new JMenuItem("Έξοδος από το πρόγραμμα");
        menuFileQuit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                //
            }
        });
        file.add(menuFileQuit);
    }

    public void makeNewGame(){
        newgame=new JButton("Νεο παιχνιδι");
        menu.add(newgame);
        JButton pl1=new JButton(" ");
        JButton pl2=new JButton(" ");
        newgame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pl1.setVisible(true);
                pl1.setText("1 ΠΑΙΚΤΗΣ");
                pl1.setBounds(400,200,400,100);

            }
        });
        add(pl1);
        pl1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pl1.setVisible(false);
                pl2.setVisible(false);
                JLabel l=new JLabel("Πληκτρολογησε ονομα παικτη 1");
                add(l);
                l.setBounds(300,400,200,100);
                JTextField nam1=new JTextField(" ");
                add(nam1);
                nam1.setBounds(500,425,200,50);
                nam1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        name1=nam1.getText();
                        System.out.println(name1);
                        System.out.println("1os"+name1);
                        nam1.setVisible(false);
                        l.setVisible(false);
                        startgame(1);
                    }
                });


            }
        });

        newgame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pl2.setVisible(true);
                pl2.setText("2 ΠΑΙΚΤΕΣ");
                pl2.setBounds(400,300,400,100);
            }
        });
        add(pl2);
        pl2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pl1.setVisible(false);
                pl2.setVisible(false);
                JLabel l=new JLabel("Πληκτρολογησε ονομα παικτη 1");
                add(l);
                l.setBounds(300,400,200,100);
                JTextField nam1=new JTextField(" ");
                add(nam1);
                nam1.setBounds(500,425,200,50);
                nam1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        name1=nam1.getText();
                        System.out.println(name1);
                        nam1.setVisible(false);
                        l.setVisible(false);
                        JLabel l2=new JLabel("Πληκτρολογησε ονομα παικτη 2");
                        add(l2);
                        l2.setBounds(300,400,200,100);
                        JTextField nam2=new JTextField(" ");
                        add(nam2);
                        nam2.setBounds(500,425,200,50);
                        nam2.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                name2=nam2.getText();
                                System.out.println(name2);
                                nam2.setVisible(false);
                                l2.setVisible(false);
                            }
                        });
                    }
                });
            }
        });

        System.out.println("111os"+name1);
        System.out.println("2os"+name2);


    }

    public void startgame(int i){
        Player play1=new Player();
        Player play2=new Player();
        Round round=new Round();
        Category categ=new Category();
        ArrayList<String> AllQuestions= categ.getQuestions();
        ArrayList<String> AllAnswers=categ.getAnswers();

        boolean EndOfGame=false;
        int CurrentRound=round.getRound();
        int TP=play1.getTotalPoints();
        int TP2;
        if(i==2){
            TP2=play2.getTotalPoints();
        }
        //while (!EndOfGame) {
        for(int o=0;o<6;o++){
            int sumOfAns1,sumOfAns2;
            int round1=round.randomNumber(5);

            for (int numOfQuest = 0; numOfQuest <1; numOfQuest++) {

                int k = round.randomNumber(categ.QuestionsSize(AllQuestions));

                System.out.println();
                System.out.println("hello mothafka prinnnnnnnnnnnn");

                JLabel tOfCat=new JLabel("doimritmiotoe");
                add(tOfCat);
                tOfCat.setText(categ.TypeOfCategory(k));
                tOfCat.setBounds(550,25,400,100);
                tOfCat.setFont(Font.decode("Verdana-bold-20"));
                System.out.println();

                System.out.println("hello mothafka1111");


                String playerBet ="0";

                JLabel tOfRound=new JLabel(" ");
                add(tOfRound);
                tOfRound.setBounds(400,5,600,25);
                tOfRound.setFont(Font.decode("Verdana-bold-20"));
                int bet=0;
                if(round1==0){
                    tOfRound.setText("ΤΥΠΟΣ ΓΥΡΟΥ :  ΣΩΣΤΗ ΑΠΑΝΤΗΣΗ!!!!");
                }
                else if (round1== 1) {
                    tOfRound.setText("ΤΥΠΟΣ ΓΥΡΟΥ :  ΠΟΝΤΑΡΙΣΜΑ!!!!");
                    System.out.println("Πόνταρε 250,500,750 ή 1000");
/*
                    playerBet = play1.getAnswer();

                    while (!round.ValidBet(playerBet)) {
                        playerBet = play1.getAnswer();
                    }

                    bet = Integer.parseInt(playerBet);*/
                }
                else if(round1==2){
                    tOfRound.setText("ΤΥΠΟΣ ΓΥΡΟΥ :  ΣΤΑΜΑΤΗΣΕ ΤΟ ΧΡΟΝΟΜΕΤΡΟ!!!!");
                    sumOfAns1=0;
                    sumOfAns2=0;
                }
                else if(round1==3){
                    tOfRound.setText("ΤΥΠΟΣ ΓΥΡΟΥ :  ΓΡΗΓΟΡΗ ΑΠΑΝΤΗΣΗ!!!!");
                }
                else{
                    tOfRound.setText("ΤΥΠΟΣ ΓΥΡΟΥ :  ΘΕΡΜΟΜΕΤΡΟ!!!!");
                }
                JLabel question=new JLabel(" ");
                add(question);
                question.setBounds(100,350,1000,100);
                question.setFont(Font.decode("Verdana-bold-15"));
                question.setText(categ.getQuestion(k));
                System.out.println(categ.getQuestion(k));


                String[] curAnsw=categ.curansers(k);
                JButton answ1=new JButton(" ");
                JButton answ2=new JButton(" ");
                JButton answ3=new JButton(" ");
                JButton answ4=new JButton(" ");
                add(answ1);
                add(answ2);
                add(answ3);
                add(answ4);

                answ1.setText(curAnsw[0]);
                answ1.setBounds(150,450,500,100);
                answ1.setBackground(Color.white);
                answ2.setText(curAnsw[1]);
                answ2.setBounds(650,450,500,100);
                answ3.setText(curAnsw[2]);
                answ3.setBounds(150,550,500,100);
                answ4.setText(curAnsw[3]);
                answ4.setBounds(650,550,500,100);


                boolean CorrectAnswer=categ.TemporaryAnswers(k,curAnsw,1);
                if(CorrectAnswer){
                    System.out.println("yessssssssssss");
                }
                else {
                    System.out.println("nooooooooooooooo");
                }
                System.out.println("edw 1");
                answ1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        boolean CorrectAnswer=categ.TemporaryAnswers(k,curAnsw,0);

                        if(CorrectAnswer){
                            System.out.println("yessssssssssss");
                            answ1.setOpaque(false);
                            answ1.setBackground(Color.GREEN);
                        }
                        else {
                            System.out.println("nooooooooooooooo");
                            answ1.setOpaque(false);
                            answ1.setBackground(Color.RED);
                        }
                    }
                });
                answ2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                    }
                });
              // boolean CorrectAnswer=categ.TemporaryAnswers(k,curans);
             ///   GUI graphs=new GUI(pl);

                //graphs.makenewgame(pl,k,curans, categ.getQuestion(k));
/*
                if (CorrectAnswer && (round1== 0)) {
                    TP=play1.ChangeTotalPoints(1000);
                } else if (CorrectAnswer && (round1== 1)) {
                    TP=play1.ChangeTotalPoints(bet);
                } else if (!CorrectAnswer && (round1== 1)) {
                    TP=play1.ChangeTotalPoints(-bet);
                }
                else if (CorrectAnswer && (round1==4)){
                    play1.

                }


                categ.RemoveAnswers(AllAnswers,k);

                System.out.println();

                categ.RemoveQuestion(AllQuestions,k);


                System.out.println();
                System.out.println();
                System.out.println();

 */

            }

            //round.changeRound();
            CurrentRound=round.getRound();
            //EndOfGame=FinishGame(CurrentRound);

        }


        System.out.printf("%s Score: %d %n",name1,TP);
      //  System.out.println("Thanks for playing.Hope see you again");

    }

    public boolean FinishGame(int round){
        if(round>=7){
            return true;
        }
        return false;
    }

    public void Menu(){
        System.out.println("Welcome to the BUZZ QUIZZ!!!");
        System.out.println("If you want to play a new game press '1' ");
        System.out.println("If you want to see the Scoreboard press '2'");
    }

    public void  makeHelp(){
        help=new JMenu("Βοήθεια");
        menu.add(help);
        JLabel lab=new JLabel(" ");
        add(lab);
        JMenuItem instru=new JMenuItem("Οδηγιες παιχνιδιου");
        instru.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lab.setText("odhgies ");
                lab.setBounds(500,500,lab.getPreferredSize().width,lab.getPreferredSize().height);
            }
        });
        help.add(instru);

    }

    public static void main(String[] args){
        NEWGUI g=new NEWGUI();
    }

}
