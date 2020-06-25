package com.example.project2.models;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.util.Set;


@Entity
public class Category {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idCategory;
    private String categoryname;

    @OneToMany(mappedBy = "category")
    private Set<Items> items;

    @ManyToOne
    @JoinColumn(name="parentid")
    private Category parent;

    protected Category(){};

    public Category(String categoryname) {

        this.categoryname = categoryname;
    }

    public String getCategoryname() {

        return categoryname;
    }

    public void setCategoryname(String categoryname) {

        this.categoryname = categoryname;
    }
}
