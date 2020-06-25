package com.example.project2.models;

import javax.persistence.*;

@Entity
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idImage;
    private String title;
    private String filename;

    @ManyToOne
    @JoinColumn(name = "idItem", nullable = false)
    private Items items;

    protected Image(){};

    public Image(String title, String filename) {
        this.title = title;
        this.filename = filename;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public String getFilename() {

        return filename;
    }

    public void setFilename(String filename) {

        this.filename = filename;
    }
}
