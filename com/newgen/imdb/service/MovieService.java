package com.newgen.imdb.service;

import com.newgen.imdb.model.Movie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieService {

    private Map<Long, Movie> movieMap;
    private long idCounter;

    public MovieService(){
        movieMap= new HashMap<>();
        idCounter = 1;
    }

    public Movie addMovie(String name, String genre,int year){

        Movie movie = new Movie(idCounter,name,genre,year);
        movieMap.put(idCounter,movie);
        idCounter++;
        return movie;
    }

    public Movie getMovieById(long id){
        return movieMap.get(id);
    }

    public List<Movie> getAllMovies(){
        //List<Movie> movies = new ArrayList<>(movieMap.values());
       // movieMap.forEach((k,v)->movies.add(v));
        return new ArrayList<>(movieMap.values());
    }


}
