import java.util.Scanner;

public final class SelectMenu {

    private static Scanner sc = new Scanner(System.in);//import
    private int selectNumber;//selectnumber
    private boolean running = true;

    //select number in menu
    public SelectMenu(){
        System.out.println("***Select 0 or 1 or 2***");
        this.selectNumber = sc.nextInt();
        menuNumber(selectNumber);
    }

    //Process selected menu number
    public void menuNumber(int selectNumber){

        switch(selectNumber){
            case 1:
                //Call ChordView
                BaseView cView = new ChordView();
                cView.show();

                //Call ChordTrainer
                PracFeature trainer = new ChordTrainer();
                trainer.start();
                break;

            case 2:
                //Call PracLogView
                BaseView lView = new PracLogView();
                lView.show();
                //Call PracticeLog
                PracFeature log = new PracticeLog();
                log.start();
                break;

            case 0:
                //Finish training
                running = false;
                break;

            default:
                System.out.println("Please select '1' or '2'");
            
        }
    }

    //running or stopped?
    public boolean isRunning(){
        return running;
    }
}
