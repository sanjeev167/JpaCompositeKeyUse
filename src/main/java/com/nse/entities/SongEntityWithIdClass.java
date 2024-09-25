/*
 * Created on 2024-09-09 ( 23:41:47 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
 */
package com.nse.entities;


import java.io.Serializable;
import jakarta.persistence.*;

/**
 * JPA entity class for "Song"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="song", schema="public" )
@IdClass(SongIdAsIdClass.class)
public class SongEntityWithIdClass implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @Column(name="name", nullable=false, length=50)
    private String     name ;

    @Id
    @Column(name="album", nullable=false, length=50)
    private String     album ;

    @Id
    @Column(name="artist", nullable=false, length=50)
    private String     artist ;

    //--- ENTITY DATA FIELDS 
    @Column(name="rating", nullable=false, length=50)
    private String     rating ;

    @Column(name="genre", nullable=false, length=50)
    private String     genre ;


    //--- ENTITY LINKS ( RELATIONSHIP )

    /**
     * Constructor
     */
    public SongEntityWithIdClass() {
		super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setName( String name ) {
        this.name = name ;
    }
    public String getName() {
        return this.name;
    }

    public void setAlbum( String album ) {
        this.album = album ;
    }
    public String getAlbum() {
        return this.album;
    }

    public void setArtist( String artist ) {
        this.artist = artist ;
    }
    public String getArtist() {
        return this.artist;
    }

    public void setRating( String rating ) {
        this.rating = rating ;
    }
    public String getRating() {
        return this.rating;
    }

    public void setGenre( String genre ) {
        this.genre = genre ;
    }
    public String getGenre() {
        return this.genre;
    }

    //--- GETTERS FOR LINKS
    //--- toString specific method
	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(name);
        sb.append("|");
        sb.append(album);
        sb.append("|");
        sb.append(artist);
        sb.append("|");
        sb.append(rating);
        sb.append("|");
        sb.append(genre);
        return sb.toString(); 
    } 

}
