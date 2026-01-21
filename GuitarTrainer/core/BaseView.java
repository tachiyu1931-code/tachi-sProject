package GuitarTrainer.core;

public abstract class BaseView {

    protected String title;
    
    public BaseView(String title){
        this.title = title;
    }

    public abstract void show();
    
}
