package mk.finki.ukim.mk.lab.model;

public class Manufacturer {
    private Long id;
    private String name;
    private String country;
    private String address;

    public Manufacturer(Long i, String name1, String country1, String addr1) {
        this.id = i;
        this.name = name1;
        this.country = country1;
        this.address = addr1;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getAddress() {
        return address;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
