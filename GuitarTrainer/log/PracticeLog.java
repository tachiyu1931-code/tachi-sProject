package GuitarTrainer.log;

import GuitarTrainer.core.PracFeature;
import GuitarTrainer.menu.LogMenu;
import java.util.ArrayList;
import java.util.Scanner;

public class PracticeLog implements PracFeature{
    
    private Scanner sc = new Scanner(System.in);
    private ArrayList<String> pracLog;

    @Override
    public void start(){
        System.out.println(getName());
        //
        LogMenu logmenu = new LogMenu();
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
