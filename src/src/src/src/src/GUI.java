package src.src.src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame{

    private JLabel label;
    private JMenuBar menu;
    private JMenu menuFile;
    private JButton newgame;
    private JMenu help;
    private JButton pl1;
    private JButton pl2;
    private JPanel panel;
    private JTextField n1;
    private JTextField n2;
    private JLabel name;

    public GUI(int players) {
        setTitle("BUZZMENO QUIZZ");
        setSize(1280, 720);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        setLayout(null);

        label = new JLabel(" ");
        add(label);
        panel=new JPanel();
        pl1=new JButton(" ");
        pl2=new JButton(" ");
        n1=new JTextField(" ");
        n2=new JTextField(" ");
        name=new JLabel(" ");




        makeMenu();
        makeHelp();
        //makenewgame();
        setJMenuBar(menu);


        panel.add(pl1);
        panel.add(pl2);
        panel.add(n1);
        add(panel);



        setVisible(true);
    }

    public void makeHelp(){
        help=new JMenu("Βοήθεια");
        menu.add(help);

        JMenuItem menuFileQuit1 = new JMenuItem("Έξοδος από το πρόγραμμα1");
        menuFileQuit1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                //System.exit(0);
            }
        });



    }

    public void makeMenu(){
        menu = new JMenuBar();

        menuFile = new JMenu("Αρχείο");
        menu.add(menuFile);
        JMenuItem menuFileOpen = new JMenuItem("Άνοιγμα");
        menuFileOpen.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Έκανες κλικ στο άνοιγμα");
                label.setBounds(500,500,label.getPreferredSize().width,label.getPreferredSize().height);
                // add(label);
            }
        });
        menuFile.add(menuFileOpen);

        JMenuItem menuFileQuit = new JMenuItem("Έξοδος από το πρόγραμμα");
        menuFileQuit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                //
            }
        });
        menuFile.add(menuFileQuit);
    }

    public void makenewgame(int players, int randNumb,String[] curAns,String quest){
        newgame = new JButton("Νεο παιχνιδι");
        newgame.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                pl1.setVisible(true);
                pl2.setVisible(true);
                pl1.setText("1 ΠΑΙΚΤΗΣ");
                pl1.setBounds(400,200,400,100);
                pl1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        name.setText("Ονομα παικτη 1: ");
                        name.setBounds(300,200,200,100);
                        add(name);
                        n1.setBounds(400,230,200,50);
                        n1.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                System.out.println("hello"+"riahs");
                            }
                        });
                        add(n1);
                        startgame(players,randNumb,curAns,quest);
                    }
                });
                add(pl1);
                pl2.setText("2 ΠΑΙΚΤΕΣ ");
                pl2.setBounds(400,300,400,100);
                pl2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        pl1.setVisible(false);
                        pl2.setVisible(false);
                    }
                });
                add(pl2);
            }
        });
        // newgame.add(newgam1);
        menu.add(newgame);

    }

    public void startgame(int i,int rn,String[] curAnsw,String quest){
        Category cat=new Category();
        String category= cat.TypeOfCategory(rn);
        pl1.setVisible(false);
        pl2.setVisible(false);

        JLabel typeOfRound=new JLabel(" ");
        add(typeOfRound);
        typeOfRound.setText("ΤΥΠΟΣ ΓΥΡΟΥ:"+ category );
        typeOfRound.setBounds(500,10,300,100);
        JLabel question=new JLabel(" ");
        add(question);

        question.setText(quest+"?");
        question.setFont(Font.decode("Verdana-bold-20"));
        question.setBounds(150,350,900,100);
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
        answ2.setText(curAnsw[1]);
        answ2.setBounds(650,450,500,100);
        answ3.setText(curAnsw[2]);
        answ3.setBounds(150,550,500,100);
        answ4.setText(curAnsw[3]);
        answ4.setBounds(650,550,500,100);

    }
/*
    public static void main(String[] args) {
        GUI frame = new GUI();
    }*/
}
