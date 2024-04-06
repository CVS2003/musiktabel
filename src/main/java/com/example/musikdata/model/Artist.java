package com.example.musikdata.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;



@Entity
public class Artist {

    @Id
    private int id;
    private String artist_name;
    private String artist_origin;
    private String artist_gender;
    private int artist_age;
    private String company_address;
    private String company_phone;
    private String artist_genre;


    public Artist() {

    }

    /*
    Artist
     */
    public Artist(int id, String artist_name, String artist_origin, String artist_gender, int artist_age, String company_address,
                  String company_phone, String artist_genre) {

        this.id = id;
        this.artist_name = artist_name;
        this.artist_origin = artist_origin;
        this.artist_gender = artist_gender;
        this.artist_age = artist_age;
        this.company_address = company_address;
        this.company_phone = company_phone;
        this.artist_genre = artist_genre;

    }

    public Artist(String artist_name, String artist_origin, String artist_gender, int artist_age, String company_address, String company_phone, String artist_genre) {
        this.artist_name = artist_name;
        this.artist_origin = artist_origin;
        this.artist_gender = artist_gender;
        this.artist_age = artist_age;
        this.company_address = company_address;
        this.company_phone = company_phone;
        this.artist_genre = artist_genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArtist() {
        return artist_name;
    }

    public void setArtist(String artist_name) {
        this.artist_name = artist_name;
    }

    public String getOrigin() {
        return artist_origin;
    }

    public void setOrigin(String artist_origin) {
        this.artist_origin = artist_origin;
    }

    public String getGender() {
        return artist_gender;
    }

    public void setGender(String artist_gender) {
        this.artist_gender = artist_gender;
    }

    public int getAge() {
        return artist_age;
    }

    public void setAge(int artist_age) {
        this.artist_age = artist_age;
    }

    public String getCompanyAddress() {
        return company_address;
    }

    public void setCompanyAddress(String company_address) {
        this.company_address = company_address;
    }

    public String getCompanyPhone() {
        return company_phone;
    }

    public void setCompanyPhone(String company_phone) {
        this.company_phone = company_phone;
    }

    public String getGenre() {
        return artist_genre;
    }

    public void setGenre(String artist_genre) {
        this.artist_genre = artist_genre;
    }

    /*
    public Artist(String artist, String origin, String gender, int age, String companyAddress, String companyPhone, String genre) {
        this.artist = artist;
        this.origin = origin;
        this.gender = gender;
        this.age = age;
        this.companyAddress = companyAddress;
        this.companyPhone = companyPhone;
        this.genre = genre;
    }

     */


    /*
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
     */

    @Override
    public String toString() {

        return artist_name+" "+artist_origin+" "+artist_gender+" "+artist_age+" "+company_address+" "+company_phone+" "+artist_genre;
    }


}
