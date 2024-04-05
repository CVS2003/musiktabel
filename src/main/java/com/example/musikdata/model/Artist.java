package com.example.musikdata.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;



@Entity
public class Artist {

    @Id
    private int id;
    private String artist;
    private String origin;
    private String gender;
    private int age;
    private String companyAddress;
    private String companyPhone;
    private String genre;


    public Artist() {

    }

    /*
    Artist
     */
    public Artist(int id, String artist, String origin, String gender, int age, String companyAddress,
                  String companyPhone, String genre) {

        this.id = id;
        this.artist = artist;
        this.origin = origin;
        this.gender = gender;
        this.age = age;
        this.companyAddress = companyAddress;
        this.companyPhone = companyPhone;
        this.genre = genre;

    }

    public Artist(String artist, String origin, String gender, int age, String companyAddress, String companyPhone, String genre) {
        this.artist = artist;
        this.origin = origin;
        this.gender = gender;
        this.age = age;
        this.companyAddress = companyAddress;
        this.companyPhone = companyPhone;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {

        return artist+" "+origin+" "+gender+" "+age+" "+companyAddress+" "+companyPhone+" "+genre;
    }


}
