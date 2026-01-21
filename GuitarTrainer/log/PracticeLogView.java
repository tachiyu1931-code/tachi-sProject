package GuitarTrainer.log;

import GuitarTrainer.core.BaseView;

public class PracticeLogView extends BaseView {
    
    public PracticeLogView(){
        super("Keep a practice log");
    }

    @Override
    public void show(){
        System.out.println("******" + title + "******");
        

    }
}
