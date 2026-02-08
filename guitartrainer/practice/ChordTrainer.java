package guitartrainer.practice;

import guitartrainer.core.PracticeFeature;
import java.util.Random;
import java.util.Scanner;

public class ChordTrainer implements PracticeFeature{

    private String[] chords ={
        "C","D","E","F","G","A","B",
        "Cm","Dm","Em","Fm","Am","Bm",
        "C7","D7","E7","F7","G7","A7","B7",
        "Csus4","Dsus4","Esus4","Fsus4","Gsus4","Asus4","Bsus4"

    };
    
    private Random rand = new Random();
    private Scanner sc = new Scanner(System.in);
    private boolean running = true;

    @Override
    public void start(){
        practiceChord();
    }

    

    public void practiceChord(){
        startPractice();
        practice();
    }

    protected void startPractice(){
        System.out.println("Start chord training");
        running = true;//when the CodeTrainer is running,assign true
    }

    protected void practice(){
        while(running){
            showChords();
            input();
        }
    }

    protected void showChords(){
        String chord = chords[rand.nextInt(chords.length)];
        System.out.println("Play this chord ->"+chord);//Show random chord
        System.out.println("Press Enter -> next");
        System.out.println("Press 0 -> Exit");
    }

    protected void input(){
        String input = sc.nextLine();
            if(input.equals("0")){
                stop();
            }
    }

    @Override
    public void stop(){
        running = false;
        System.out.println("Good job!");
    }

    @Override
    public String getName(){
        return "Chord trainer";
    }
}