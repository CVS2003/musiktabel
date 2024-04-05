package com.example.musikdata.repository;

import java.util.*;


import com.example.musikdata.model.Artist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class MusikRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Artist> getAll() {

        final String sql = "SELECT * FROM artists";
            List<Artist> artists = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Artist.class));

            return artists;
    }

    public void addArtist(Artist a) {

        final String sql = "INSERT INTO artists (artist_name, artist_origin, artist_gender, artist_age, company_address, company_phone, artist_genre) VALUES (?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, a.getArtist(), a.getOrigin(), a.getGender(), a.getAge(), a.getCompanyAddress(), a.getCompanyPhone(), a.getGender());

    }

    public void update(Artist artist) {

        final String sql = "UPDATE artists SET artist_name = ?, artist_origin = ?, artist_gender = ?, artist_age = ?, company_address = ?, company_phone = ?, artist_genre = ? WHERE artist_id=?";
        jdbcTemplate.update(sql, artist.getArtist(), artist.getOrigin(), artist.getGender(), artist.getAge(), artist.getCompanyAddress(), artist.getCompanyPhone(), artist.getGenre(), artist.getId());
    }

    public void delete(int id) {

        final String deleteStatement = "DELETE FROM artists WHERE artist_id = ?";
        jdbcTemplate.update(deleteStatement, id);
    }

    public Artist findById(int id) {

        final String sql = "SELECT * FROM artists WHERE artist_id = ?";
        RowMapper<Artist> rowMapper = new BeanPropertyRowMapper<>(Artist.class);
        return jdbcTemplate.queryForObject(sql, rowMapper, id);
    }



    //static List<Artist> music = new ArrayList<>();

    /*
    public List<MusikData> musikdata() {

        // Ghost - Meliora
        music.add(new MusikData("Ghost", "Meliora", "Rock", "10", "45:32", "2015"));

        //Slipknot - We are not your kind
        music.add(new MusikData("Slipknot", "We are not your kind", "Metal", "14", "63:49", "2019"));

        //Twenty One Pilots - Blurryface
        music.add(new MusikData("Twenty One Pilots", "Blurryface", "Alternative", "14", "52:53", "2015"));

        // Sleep Token - Sundowning
        music.add(new MusikData("Sleep Token", "Sundowning", "Experimental", "10", "48:59", "2019"));

        // Ghost - Prequelle
        music.add(new MusikData("Ghost", "Prequelle", "Rock", "10", "41:53", "2018"));

        // Ghost - Infestissumam
        music.add(new MusikData("Ghost", "Infestissumam", "Rock", "10", "47:07", "2013"));

        // Ghost - Opus Eponymous
        music.add(new MusikData("Ghost", "Opus Eponymous", "Rock", "9", "33:36", "2010"));

        // Ghost - If You Have Ghost
        music.add(new MusikData("Ghost", "If You Have Ghost", "Rock", "5", "17:34", "2013"));

        //Ghost - Impera
        music.add(new MusikData("Ghost", "Impera", "Metal", "12", "46:25", "2022"));

        return music;

    }

     */
}
