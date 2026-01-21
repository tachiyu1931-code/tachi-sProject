package GuitarTrainer.log;

import GuitarTrainer.core.PracticeFeature;
import GuitarTrainer.menu.PracticeLogMenu;
import java.util.ArrayList;
import java.util.Scanner;

public class PracticeLog implements PracticeFeature{
    
    private Scanner sc = new Scanner(System.in);
    private ArrayList<String> practiceLog;

    @Override
    public void start(){
        System.out.println(getName());
        //
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
