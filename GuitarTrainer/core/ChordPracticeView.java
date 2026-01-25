package GuitarTrainer.core;

public class ChordPracticeView extends BaseView{

    private final String title = "Chord Trainer";

    public ChordPracticeView() {
        super();
    }
    public String getTitle(){
        return title;
    }

    @Override
    public void show() {
        System.out.println("******"+getTitle()+"******");
        System.out.println("Let's enjoy! practicing!");
        System.out.println();
    }
    
}