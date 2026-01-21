package GuitarTrainer.core;

public class ChordView extends BaseView{

    public ChordView() {
        super("Chord trainer");
    }

    @Override
    public void show() {
        System.out.println("******"+title+"******");
        System.out.println("Let's enjoy! practicing!");
        System.out.println();
    }
    
}