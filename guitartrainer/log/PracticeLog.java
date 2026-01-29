package guitartrainer.log;

import guitartrainer.core.PracticeFeature;
import guitartrainer.menu.PracticeLogMenu;
import java.util.ArrayList;

public class PracticeLog implements PracticeFeature{

    private ArrayList<String> practiceLog;

    @Override
    public void start(){
        showTitle();
        showMenu();
    }

    
    private void showTitle(){
        System.out.println(getName());
    }


    private void showMenu(){
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
