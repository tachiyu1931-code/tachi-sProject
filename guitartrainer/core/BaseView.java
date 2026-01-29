package guitartrainer.core;

public abstract class BaseView {

    protected String title;
    
    public void start(){
        show();
    }

    public abstract void show();
    
}
