package guitartrainer.core;

public abstract class BaseMenu implements PracticeFeature{

    protected String title;
    boolean running = true;
    
    @Override
    public void start(){
    }

    public boolean isRunning(){
        return running;

    }

    @Override
    public void stop(){
        running = false;
    }

    @Override
    public String getName(){
        return title;
    }
    
}
