package mk.finki.ukim.mk.lab.repository;

import mk.finki.ukim.mk.lab.model.Manufacturer;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
@Repository
public class ManufacturerRepository {

    private final List<Manufacturer> manufacturers = new ArrayList<>();

    @PostConstruct
    void init(){
        Manufacturer m = new Manufacturer(1L, "name1", "country1", "addr1");
        Manufacturer m2 = new Manufacturer(2L, "name2", "country2", "addr2");
        Manufacturer m3 = new Manufacturer(3L, "name3", "country3", "addr3");
        Manufacturer m4 = new Manufacturer(4L, "name4", "country4", "addr4");
        Manufacturer m5 = new Manufacturer(5L, "name5", "country5", "addr5");
        manufacturers.add(m);
        manufacturers.add(m2);
        manufacturers.add(m3);
        manufacturers.add(m4);
        manufacturers.add(m5);
    }

    public List<Manufacturer> getManufacturers() {
        return manufacturers;
    }
}
