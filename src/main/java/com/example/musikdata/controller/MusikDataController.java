package com.example.musikdata.controller;


import com.example.musikdata.Service.Musikservice;
import com.example.musikdata.model.Artist;
import com.example.musikdata.repository.MusikRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
I tilfælde af hibernate exception indsæt nedenstående i application properties
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQLDialect

 */

import java.util.List;

@Controller
public class MusikDataController {

    @Autowired
    Musikservice musikservice;

    @Autowired
    MusikRepository musikRepository;


    @GetMapping("/")
    public String index() {

        return "redirect:/musikdata";
    }

    @GetMapping("/musikdata")
    public String musik(Model model) {

        /*
        Model gør at man kan overføre data til view.
         */

        List<Artist> list = musikservice.fetchAll();

        model.addAttribute("data", list);
        /*
        Fra video om Spring:
        model.addAttribute("data", musikservice.fetchAll())
         */


        return "index";
    }

    @PostMapping("/create")
    public String createArtist(@RequestParam("id") int id,
                               @RequestParam("artist_name") String artist,
                               @RequestParam("artist_origin") String origin,
                               @RequestParam("artist_gender") String gender,
                               @RequestParam("artist_age") int age,
                               @RequestParam("company_address") String address,
                               @RequestParam("company_phone") String phone,
                               @RequestParam("artist_genre") String genre) {

        Artist art = new Artist(artist, origin, gender, age, address, phone, genre);

        musikRepository.update(art);

        return "redirect:/";

    }

    @GetMapping("/create")
    public String create() {

        return "create";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") int deleteid) {

        musikRepository.delete(deleteid);
        return "redirect:/";
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable("id") int updateid, Model model) {

        Artist art = musikRepository.findById(updateid);

        return "update";
    }

    @PostMapping("/update")
    public String updateArtist(@RequestParam("id") int id,
                               @RequestParam("artist_name") String name,
                               @RequestParam("artist_origin") String origin,
                               @RequestParam("artist_gender") String gender,
                               @RequestParam("artist_age") int age,
                               @RequestParam("company_address") String address,
                               @RequestParam("company_phone") String phone,
                               @RequestParam("artist_genre") String genre) {

        Artist art = new Artist(id, name, origin, gender, age, address, phone, genre);
        musikRepository.update(art);
        return "redirect:/";

    }



}
