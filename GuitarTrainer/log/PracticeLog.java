package GuitarTrainer.log;

import GuitarTrainer.core.PracticeFeature;
import GuitarTrainer.menu.PracticeLogMenu;
import java.util.ArrayList;

public class PracticeLog implements PracticeFeature{

    private ArrayList<String> practiceLog;

    @Override
    public void start(){
        showTitle();
        showMenu();
    }

    
    public void showTitle(){
        System.out.println(getName());
    }


    public void showMenu(){
        PracticeLogMenu logmenu = new PracticeLogMenu();
        logmenu.showMenu();
    }

    @Override
    public void stop(){

    }

    @Override
    public String getName(){
        return "Keep a practice log";
    }


    
}
