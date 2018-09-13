package composite;

import java.util.ArrayList;
import java.util.List;

public class Team {
    List<FootBaller> listFootBaller = new ArrayList<>();
    void addFootBaller(FootBaller footBaller){
        listFootBaller.add(footBaller);
    }
    public void playFootball() throws InterruptedException {
        System.out.println("       <<<---Игра началась--->>>");
        for(FootBaller footBaller : listFootBaller){
            Thread.sleep(2000);
            footBaller.play();
        }
    }
}
