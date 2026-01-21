package GuitarTrainer.menu;

import GuitarTrainer.core.BaseView;
import GuitarTrainer.core.ChordPracticeView;
import GuitarTrainer.core.PracticeFeature;
import GuitarTrainer.log.PracticeLog;
import GuitarTrainer.log.PracticeLogView;
import GuitarTrainer.practice.ChordTrainer;
import java.util.Scanner;

public final class MenuSelector {

    private static Scanner sc = new Scanner(System.in);//import
    private int selectNumber;//selectnumber
    private boolean running = true;

    //select number in menu
    public MenuSelector(){
        System.out.println("***Select 0 or 1 or 2***");
        this.selectNumber = sc.nextInt();
        menuNumber(selectNumber);
    }

    //Process selected menu number
    public void menuNumber(int selectNumber){

        switch(selectNumber){
            case 1:
                //Call ChordView
                BaseView cView = new ChordPracticeView();
                cView.show();

                //Call ChordTrainer
                PracticeFeature trainer = new ChordTrainer();
                trainer.start();
                break;

            case 2:
                //Call PracLogView
                BaseView lView = new PracticeLogView();
                lView.show();
                //Call PracticeLog
                PracticeFeature log = new PracticeLog();
                log.start();
                break;

            case 0:
                //Finish training
                running = false;
                break;

            default:
                System.out.println("Please select '1' or '2'");
            
        }
    }

    //running or stopped?
    public boolean isRunning(){
        return running;
    }
}
