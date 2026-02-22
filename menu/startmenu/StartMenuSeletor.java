package menu.startmenu;

import guitartrainer.core.BaseMenu;
import guitartrainer.core.InputReception;
import guitartrainer.practice.ChordTrainer;

public class StartMenuSeletor extends BaseMenu{

    private final StartMenuView view = new StartMenuView();
    private final ChordTrainer logic = new ChordTrainer();

    public StartMenuSeletor(){
        this.title = "Guitar Trainer";
    }

    @Override
    public void start(){
        view.start();
        selectMenu();
    }

    public void selectMenu(){
        while(view.isRunning()){
            int selection = InputReception.nextInt();
            switch(selection){
                case 1:
                    logic.start();
                    break;
                case 2:
                    //edit logs function
                    break;
                case 0:
                    view.stop();
                    break;
                default:
                    System.out.println("Invalid selection. Please try again.");
            }
            if(view.isRunning()){
                view.show();
            }
        }
    }

    @Override
    public void stop(){
        view.stop();
        logic.stop();
    }

    @Override
    public String getName(){
        return title;
    }

}
