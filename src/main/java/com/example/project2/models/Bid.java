package com.example.project2.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Bid {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idBid;
    private BigDecimal amount;
    private Date createdOn;

    @ManyToOne
    @JoinColumn(name="idItem", nullable = false)
    private Items items;

    @ManyToOne
    @JoinColumn(name="idBidder", nullable = false)
    private Users bidder;

    protected Bid(){};

    public Bid(BigDecimal amount, Date createdOn) {
        this.amount = amount;
        this.createdOn = createdOn;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
}
