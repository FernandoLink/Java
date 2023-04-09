package br.com.link.screen.match.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public record TitleOmdb(String title, String year, String rated, String released, String runtime, String genre,
		String director, String writer, String actors, String plot, String language, String country, String awards,
		String poster, List<Ratings> ratings, String metascore, String imdbRating, String imdbVotes, String imdbID,
		String type, String totalSeasons, @SerializedName("DVD") String dvd, String boxOffice, String production,
		String website, boolean response) {
}

// 