package com.example.project2.models;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
public abstract class BillingDetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idBillingDetails;

    @ManyToOne
    @JoinColumn(name="idUsers", nullable = false)
    private Users owner;

    public Users getOwner() {
        return owner;
    }

    public void setOwner(Users owner) {
        this.owner = owner;
    }
}
