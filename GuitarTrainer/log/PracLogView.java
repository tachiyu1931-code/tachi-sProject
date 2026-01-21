package GuitarTrainer.log;

import GuitarTrainer.core.BaseView;

public class PracLogView extends BaseView {
    
    public PracLogView(){
        super("Keep a practice log");
    }

    @Override
    public void show(){
        System.out.println("******" + title + "******");
        

    }
}
