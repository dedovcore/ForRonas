package models;

import javax.persistence.*;

@Entity
@Table(name = "clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name = "name")
    private String name;
    @Column(name = "shortName")
    private String shortName;
    @Column(name ="address")
    private String address;
    @Column(name = "LLC")
    private String LLC;


    public Client(Long id, String name, String shortName, String address, String LLC){
        this.id = id;
        this.name = name;
        this.shortName = shortName;
        this.address = address;
        this.LLC = LLC;
    }



    public Client(){}



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLLC() {
        return LLC;
    }

    public void setLLC(String LLC) {
        this.LLC = LLC;
    }
}
