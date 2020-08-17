package models;


import javax.persistence.*;

@Entity
@Table(name = "deposits")
public class Deposit {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
@OneToOne(mappedBy = "Client")
@JoinColumn(name = "id")
    private Client client;
@OneToOne(mappedBy = "Bank")
@JoinColumn(name = "id")
    private Bank bank;
    private String dateOfOpen;
    private int percent;
    private int termInMonths;


    public Deposit(Long id, Client client, Bank bank, String dateOfOpen, int percent, int termInMonths){
        this.id = id;
        this.client = client;
        this.bank = bank;
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

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public String getDateOfOpen() {
        return dateOfOpen;
    }

    public void setDateOfOpen(String dateOfOpen) {
        this.dateOfOpen = dateOfOpen;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        percent = percent;
    }

    public int getTermInMonths() {
        return termInMonths;
    }

    public void setTermInMonths(int termInMonths) {
        this.termInMonths = termInMonths;
    }
}
