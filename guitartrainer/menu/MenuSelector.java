package guitartrainer.menu;

import guitartrainer.core.BaseView;
import guitartrainer.core.ChordPracticeView;
import guitartrainer.core.PracticeFeature;
import guitartrainer.log.PracticeLog;
import guitartrainer.log.PracticeLogView;
import guitartrainer.practice.ChordTrainer;
import java.util.Scanner;

public final class MenuSelector {
    Scanner sc = new Scanner(System.in);
    private int selectNumber;
    private boolean running = true;

    //select number in menu
    public MenuSelector(){
        selectMenu();
    }

    public void selectMenu(){
        System.out.println("***Select 0 or 1 or 2***");
        this.selectNumber = sc.nextInt();
        menuNumber(selectNumber);
    }


    //Process selected menu number
    public void menuNumber(int selectNumber){

        switch(selectNumber){
            case 1:
                callChord();
                break;

            case 2:
                callPractice();
                break;

            case 0:
                //Finish training
                running = finishTraining();
                break;

            default:
                System.out.println("Please select '1' or '2'");
            
        }
    }

    private void callChord(){
        //Call ChordView
        BaseView cView = new ChordPracticeView();
        cView.show();

        //Call ChordTrainer
        PracticeFeature trainer = new ChordTrainer();
        trainer.start();
    }

    private void callPractice(){
        //Call PracticeLogView
        BaseView lView = new PracticeLogView();
        lView.show();

        //Call PracticeLog
        PracticeFeature log = new PracticeLog();
        log.start();
    }

    private boolean finishTraining(){
        return false;
    }


    //running or stopped?
    public boolean isRunning(){
        return running;
    }
}
