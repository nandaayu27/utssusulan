/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Dimas
 */
@Entity
@Table(name= "cinema")
public class Cinema {
    
    @Id
    @Column(name= "movieid")
    
    private String movieId;
    
    @Column(name= "title")
    private String title;
    
    @Column(name= "genre")
    private String genre;
    
    @Column(name= "duration")
    private String duration;
    
    @Column(name= "actors")
    private String actors;

    public Cinema() {
    }

    public Cinema(String movieId, String title, String genre, String duration, String actors) {
        this.movieId = movieId;
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.actors = actors;
    }

    public void setmovieid(String moV001) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setactors(String tom_holland) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void settitle(String avengers_start_game) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setgenre(String scient_fiction) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setduration(String _minutes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getmovieid() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String gettitle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
