package GuitarTrainer.log;

import GuitarTrainer.core.BaseView;

public class PracticeLogView extends BaseView {
    
    public PracticeLogView(){
        start();
    }

    @Override
    public void start(){
        show();
    }

    @Override
    public void show(){
        System.out.println("******" + title + "******");
        

    }
}
