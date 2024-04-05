package com.example.musikdata.Service;


import com.example.musikdata.model.Artist;
import com.example.musikdata.repository.MusikRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Musikservice {

    @Autowired

    MusikRepository musikRepository;

    public List<Artist> fetchAll() {

        return musikRepository.getAll();
    }

    public void addArtist(Artist a) {

        musikRepository.addArtist(a);
    }
}
