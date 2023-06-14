package ru.pxlhack.geniustwin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SongController {
    @GetMapping("/")

    public String myPage(Model model) {
        model.addAttribute("pageTitle", "Song title");
        return "songs";
    }
}
