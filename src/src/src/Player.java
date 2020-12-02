package src;

import java.util.Scanner;

public class Player {

    private Scanner reader;
    private int totalPoints;


    public Player(){
        reader=new Scanner(System.in);
        totalPoints=0;
    }

    public String getAnswer(){
        String answer;
        answer=reader.nextLine();
        return answer;
    }


    public int getTotalPoints(){
        return totalPoints;
    }

    public int ChangeTotalPoints(int points){
        totalPoints+=points;
        return getTotalPoints();
    }

}
