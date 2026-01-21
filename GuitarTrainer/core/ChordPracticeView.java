package GuitarTrainer.core;

public class ChordPracticeView extends BaseView{

    public ChordPracticeView() {
        super("Chord trainer");
    }

    @Override
    public void show() {
        System.out.println("******"+title+"******");
        System.out.println("Let's enjoy! practicing!");
        System.out.println();
    }
    
}