public abstract class BaseView {

    String title;
    
    public BaseView(String title){
        this.title = title;
    }

    public abstract void show();
    
}
