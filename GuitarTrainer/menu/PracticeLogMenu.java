package GuitarTrainer.menu;

public class PracticeLogMenu extends PracticeMenu {
    
    private boolean running = true;

    public PracticeLogMenu() {
        super();
    }


    public void start(){

        while(running){
            super.showMenu();
        }
    }


}
