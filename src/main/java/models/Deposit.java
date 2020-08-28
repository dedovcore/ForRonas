package models;


import javax.persistence.*;

@Entity
@Table(name = "deposits")
public class Deposit implements Model{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "dateOfOpen")
    private String dateOfOpen;
    @Column(name = "percent")
    private String percent;
    @Column(name = "termInMonths")
    private String termInMonths;
    @ManyToOne
    private Client client;




    public Deposit(String dateOfOpen, String percent, String termInMonths){
        this.dateOfOpen = dateOfOpen;
        this.percent = percent;
        this.termInMonths = termInMonths;
    }


    public Deposit(){}


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getDateOfOpen() {
        return dateOfOpen;
    }

    public void setDateOfOpen(String dateOfOpen) {
        this.dateOfOpen = dateOfOpen;
    }

    public String getPercent() {
        return percent;
    }

    public void setPercent(String percent) {
        percent = percent;
    }

    public String getTermInMonths() {
        return termInMonths;
    }

    public void setTermInMonths(String termInMonths) {
        this.termInMonths = termInMonths;
    }

}
