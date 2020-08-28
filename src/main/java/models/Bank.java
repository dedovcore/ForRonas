package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "banks")
public class Bank implements Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "BIK")
    private String BIK;
    @OneToMany
    private List<Client> clients;


    public Bank(String name, String BIK) {
        this.name = name;
        this.BIK = BIK;
        clients = new ArrayList<>();
    }

    public void addClient(Client client){
        client.setBank(this);
        clients.add(client);
    }



    public Bank() {
    }


    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
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

    public String getBIK() {
        return BIK;
    }

    public void setBIK(String BIK) {
        this.BIK = BIK;
    }
}
