package com.example.mycollections.controllers;

import com.example.mycollections.models.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController

@RequestMapping("/movies")
public class MovieController {
    private final List<Movie> movies = new ArrayList<>() {{
        add(new Movie("Inception", "Christopher Nolan", 2010, 148.0));
        add(new Movie("The Godfather", "Francis Ford Coppola", 1972, 175.0));
        add(new Movie("La La Land", "Damien Chazelle", 2016, 128.0));
    }};

    @GetMapping("/json")
    public List<Movie> getMoviesJson() {
        return movies;
    }

    @GetMapping("/html")
    public String getMoviesHtml() {
        String movieList = "<ul>";
        for (Movie movie : movies) {
            movieList += "<li>" + movie.toString() + "</li>";
        }
        movieList += "</ul>";

        return """
                <html>
                    <body>
                        <h1>Movies</h1>
                        <ul>
                """ +
                movieList +
                """
                        </ul>
                    </body>
                </html>
                """;
    }
}