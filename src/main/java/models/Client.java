package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "clients")
public class Client implements Model{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name = "name", unique = true)
    private String name;
    @Column (name = "password", unique = true)
    private String password;
    @Column(name = "shortName")
    private String shortName;
    @Column(name ="address")
    private String address;
    @Column(name = "LLC")
    private String LLC;
    @ManyToOne
    private Bank bank;
    @OneToMany
    private List<Deposit> deposits;





    public Client(String name, String password, String shortName, String address, String LLC){
        this.name = name;
        this.password = password;
        this.shortName = shortName;
        this.address = address;
        this.LLC = LLC;
        deposits = new ArrayList<>();
    }



    public void addDeposit(Deposit deposit){
        deposit.setClient(this);
        deposits.add(deposit);
    }




    public Client(){}

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Deposit> getDeposits() {
        return deposits;
    }

    public void setDeposits(List<Deposit> deposits) {
        this.deposits = deposits;
    }

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



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(name, client.name) &&
                Objects.equals(password, client.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, password);
    }


}

