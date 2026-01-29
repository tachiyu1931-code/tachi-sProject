package guitartrainer.log;

import guitartrainer.core.BaseView;

public class PracticeLogView extends BaseView {

    @Override
    public void start(){
        show();
    }

    @Override
    public void show(){
        System.out.println("******" + title + "******");
        

    }
}
