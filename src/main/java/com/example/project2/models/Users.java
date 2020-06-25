package com.example.project2.models;
import javax.persistence.*;
import java.util.Set;


@Entity
public class Users {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idUsers;
    private String userName;
    private String firstName;
    private String lastName;

    @OneToMany(mappedBy="seller")
    private Set<Items> sellingItemsSet;

    @OneToMany(mappedBy="bidder")
    private Set<Bid> bidSet;

    @OneToMany(mappedBy="users")
    private Set<Address> addressSet;

    @OneToMany(mappedBy = "owner")
    private Set<BankAccount> bankAccountSet;
    @OneToMany(mappedBy = "owner")
    private Set<CreditCard> creditCardSet;

    protected Users(){};

    public Users(String userName, String firstName, String lastName) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
