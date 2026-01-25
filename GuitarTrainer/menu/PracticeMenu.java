package GuitarTrainer.menu;


public class PracticeMenu{
    private boolean running = true;


    public void start(){
        startPractice();
    }

    public void startPractice(){
        while(running){
            showMenu();
            MenuSelector sMenu = new MenuSelector();
            running = sMenu.isRunning();
        }
    }
    
    public void showMenu(){
        System.out.println("******Guitar trainer******");
        System.out.println();
        System.out.println("1,Chord trainer");
        System.out.println("2,Practice log");
        System.out.println("0.Exit");
        System.out.println();
        
    }

    public boolean isRunning(){
        return running;
    }


}
