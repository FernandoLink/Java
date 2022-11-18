package org.agoncal.quarkus.microservices.book;

import java.time.Instant;

import javax.json.bind.annotation.JsonbDateFormat;
import javax.json.bind.annotation.JsonbProperty;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Schema(description = "A Book")
public class Book {

    @Schema(required = true)
    @JsonbProperty("isbn_13")
    public String isbn13;
    @Schema(required = true)
    public String title;
    public String author;
    @JsonbProperty("year_of_publication")
    public int yearOfPublication;
    public String genre;
    @Schema(implementation = String.class, format = "date")
    @JsonbDateFormat("yyyy/MM/dd")
    @JsonbProperty("creation_date")
    public Instant creationDate;

    @Override
    public String toString() {
        return "Book [isbn13=" + isbn13 + ", title=" + title + ", author=" + author + ", yearOfPublication="
                + yearOfPublication + ", genre=" + genre + ", creationDate=" + creationDate + "]";
    }
}