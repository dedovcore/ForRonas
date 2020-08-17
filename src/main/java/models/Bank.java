package models;

import javax.persistence.*;

@Entity
@Table(name = "banks")
public class Bank {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
@Column(name="name")
    private String name;
@Column(name = "BIK")
    private String BIK;


    public Bank(Long id, String name, String BIK){
        this.id = id;
        this.name = name;
        this.BIK = BIK;
    }


    public Bank(){}


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

    public String getBIK() {
        return BIK;
    }

    public void setBIK(String BIK) {
        this.BIK = BIK;
    }
}
