package com.example.project2.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Entity
public class Items {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idItems;
    private String name;
    private BigDecimal initialPrice;
    private Date auctionEnd;

    @ManyToOne
    @JoinColumn(name="idCategory",nullable=false)
    private Category category;

    @OneToMany(mappedBy="items")
    private Set<Image> imageSet;

    @OneToMany(mappedBy="items")
    private Set<Bid> bidSet;

    @ManyToOne
    @JoinColumn(name="idSeller", nullable = false)
    private Users seller;

    protected Items(){};

    public Items(String name, BigDecimal initialPrice, Date auctionEnd) {
        this.name = name;
        this.initialPrice = initialPrice;
        this.auctionEnd = auctionEnd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getInitialPrice() {
        return initialPrice;
    }

    public void setInitialPrice(BigDecimal initialPrice) {
        this.initialPrice = initialPrice;
    }

    public Date getAuctionEnd() {
        return auctionEnd;
    }

    public void setAuctionEnd(Date auctionEnd) {
        this.auctionEnd = auctionEnd;
    }
}
