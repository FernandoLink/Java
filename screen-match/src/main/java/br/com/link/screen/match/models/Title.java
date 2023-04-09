package br.com.link.screen.match.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Title {
	@SerializedName("Title")
	private String title;
	@SerializedName("Year")
	private String year;
	@SerializedName("Rated")
	private String rated;
	@SerializedName("Released")
	private String released;
	@SerializedName("Runtime")
	private String runtime;
	@SerializedName("Genre")
	private String genre;
	@SerializedName("Director")
	private String director;
	@SerializedName("Writer")
	private String writer;
	@SerializedName("Actors")
	private String actors;
	@SerializedName("Plot")
	private String plot;
	@SerializedName("Language")
	private String language;
	@SerializedName("Country")
	private String country;
	@SerializedName("Awards")
	private String awards;
	@SerializedName("Poster")
	private String poster;
	@SerializedName("Ratings")
	private List<Ratings> ratings;
	@SerializedName("Metascore")
	private String metascore;
	private String imdbRating;
	private String imdbVotes;
	private String imdbID;
	@SerializedName("Type")
	private String type;
	private String totalSeasons;
	@SerializedName("DVD")
	private String dvd;
	@SerializedName("BoxOffice")
	private String boxOffice;
	@SerializedName("Production")
	private String production;
	@SerializedName("Website")
	private String website;
	@SerializedName("Response")
	private boolean response;
}
