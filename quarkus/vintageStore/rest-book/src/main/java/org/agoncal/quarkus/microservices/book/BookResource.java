package org.agoncal.quarkus.microservices.book;

import java.time.Instant;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.Produces;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.logging.Logger;

@Path("/api/books")
@Tag(name = "Book REST Endpoint")
public class BookResource {

    @RestClient
    NumberProxy proxy;

    @Inject
    Logger logger;


    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response createABook(@FormParam("title") String title, @FormParam("author") String author,
            @FormParam("year") int yearOfPublication, @FormParam("genre") String genre) {
        Book book = new Book();
        book.isbn13 = proxy.generateIsbnNumber().isbn13;
        book.title = title;
        book.author = author;
        book.yearOfPublication = yearOfPublication;
        book.genre = genre;
        book.creationDate = Instant.now();
        logger.info("Book created : " + book);
        return Response.status(201).entity(book).build();
    }
}