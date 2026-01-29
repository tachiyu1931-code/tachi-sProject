package guitartrainer.menu;

public class PracticeLogMenu extends PracticeMenu {
    
    private boolean running = true;

    public PracticeLogMenu() {
        super();
    }

    @Override
    public void start(){

        while(running){
            super.showMenu();
        }
    }


}
