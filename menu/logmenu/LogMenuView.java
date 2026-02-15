package menu.logmenu;
import guitartrainer.core.BaseView;

public class LogMenuView extends BaseView{

    public LogMenuView(){
        title = "Log Menu";
    }

    @Override
    public void displayMenuOptions(){
        System.out.println("=== " + title + " ===");
        System.out.println("1. View Logs");
        System.out.println("2. Export Logs");
        System.out.println("3. Clear Logs");
        System.out.println("0. Back to Main Menu");
        System.out.print("Select an option: ");
    }
    
}
