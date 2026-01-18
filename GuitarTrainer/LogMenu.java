public class LogMenu extends PracMenu {
    
    private boolean running = true;

    public LogMenu() {
        super();
    }

    public void start(){

        while(running){
            super.showMenu();
        }
    }


}
