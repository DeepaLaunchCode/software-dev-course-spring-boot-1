package com.example.mycollections.controllers;

import com.example.mycollections.models.Music;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/albums")
public class MusicController {

    private final List<Music> music = new ArrayList<>() {{
       add(new Music("Hips Don't Lie", "Shakira", 2006, 4));
        add(new Music("On the Floor", "Jennifer Lopez", 2011, 3));
        add(new Music("Lose You to Love Me", "Selena Gomez", 2019, 2));

    }};

    @GetMapping("/json")
    public List<Music> getMusicJson() {
        return music;
    }

    @GetMapping("/html")
    public String getMusicHtml() {
        String musicList = "<ul>";
        for (Music song : music) {
            musicList += "<li>" + song.toString() + "</li>";
        }
        musicList += "</ul>";

        return """
                <html>
                    <body>
                        <h1>song</h1>
                        <ul>
                """ +
                musicList +
                """
                        </ul>
                    </body>
                """;
    }

}