package mk.finki.ukim.mk.lab.repository;

import mk.finki.ukim.mk.lab.model.Balloon;
import mk.finki.ukim.mk.lab.service.BalloonService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository

public class BalloonRepository {

    private List<Balloon> balloons = new ArrayList<>(20);

    public BalloonRepository() {
        for (int i = 0; i < 10; i++){
            this.balloons.add(new Balloon("name", "description"));
        }
    }

    public List<Balloon> findAllBalloons(){
        return this.balloons;
    }

    public List<Balloon> findAllByNameOrDescription(String text){
        List<Balloon> balloonsByName = new ArrayList<>();
        for (Balloon balloon: this.balloons) {
            if(balloon.getName().contains(text) || balloon.getDescription().contains(text)){
                balloonsByName.add(balloon);
            }
        }
        return balloonsByName;
    }

    public Balloon save(Balloon b){
        balloons.add(b);
        return b;
    }
}
