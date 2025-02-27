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
public class SongEntityWithEmbeddedCompositeKey implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY as a composite key
    @EmbeddedId private SongIdAsCompositeKey songIdAsCompositeKey;

    //--- ENTITY DATA FIELDS 
    @Column(name="rating", nullable=false, length=50)
    private String     rating ;

    @Column(name="genre", nullable=false, length=50)
    private String     genre ;


    //--- ENTITY LINKS ( RELATIONSHIP )

    /**
     * Constructor
     */
    public SongEntityWithEmbeddedCompositeKey() {
		super();
    }
    
    public SongEntityWithEmbeddedCompositeKey(SongIdAsCompositeKey songIdAsCompositeKey, String genre, String rating) {
        this.songIdAsCompositeKey = songIdAsCompositeKey;        
        this.genre = genre;        
        this.rating = rating;        
    }
    
    
    
    //--- GETTERS & SETTERS FOR FIELDS
    public SongIdAsCompositeKey getSongIdAsCompositeKey() {
		return songIdAsCompositeKey;
	}

	public void setSongId(SongIdAsCompositeKey songIdAsCompositeKey) {
		this.songIdAsCompositeKey = songIdAsCompositeKey;
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
        sb.append(songIdAsCompositeKey);
        sb.append("|");
        sb.append(rating);
        sb.append("|");
        sb.append(genre);
        return sb.toString(); 
    } 

}
