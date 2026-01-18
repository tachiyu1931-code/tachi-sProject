public class PracMenu{

    private boolean running = true;

    public void start(){

        while(running){
            showMenu();
            SelectMenu sMenu = new SelectMenu();
            running = sMenu.isRunning();
        }
    }
    
    public void showMenu(){
        //Show menu
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
