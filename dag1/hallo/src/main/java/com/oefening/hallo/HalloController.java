package com.oefening.hallo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class HalloController {

    @GetMapping("/lijst")
    public ArrayList<String> getLijst() {
        ArrayList<String> l = new ArrayList<>();
        l.add("Yes!");
        return l;
    }

    @GetMapping("/hallo")
    public String halloWereld() {
        return "Hallo, wereld!";
    }

    @GetMapping("/welkom")
    public String welkom() {
        return "<h1>Welkom bij deze mooie webserver!</h1>";
    }
}
