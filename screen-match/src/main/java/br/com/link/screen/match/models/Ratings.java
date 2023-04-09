package br.com.link.screen.match.models;

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
public class Ratings {
	@SerializedName("Source")
	private String source;
	@SerializedName("Value")
	private String value;
}
