package menu.startmenu;

import guitartrainer.core.BaseMenu;

public final class StartMenuView extends BaseMenu{

    private String title;
    private boolean running = true;
    
    StartMenuView(){
        this.title = "";
        setTitle("Guitar Trainer");
    }

    public void setTitle(String title){
        this.title = title;

    }

    @Override
    public void start(){
        show();
    }

    @Override
    public void stop(){
        running = false;
    }

    @Override
    public boolean isRunning(){
        return running;
    }

    @Override
    public String getName(){
        return title;
    }
    
    public void show(){
        System.out.println("========"+getName()+"========");
        System.out.println("1. Practice Codes");
        System.out.println("2. EditLogs");
        System.out.println("0. Exit");
        System.out.println("=====Select menu number=====");
    }
    
}