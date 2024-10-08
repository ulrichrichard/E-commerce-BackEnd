package com.dailycodework.dream_shops.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Blob;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//Anotation of entity or tables in the database
@Entity
public class Image {
    //Primary key of the table
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fileName;
    private String fileType;

    @Lob
    private Blob image;
    private String downloadUrl;


    @ManyToOne
    //Set the name of column we want to join
    @JoinColumn(name = "product_id")
    private Product product;
}
