package com.matay.springbootgraphql;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Author(Integer id,
                     String name) {

    public static List<Author> authors = Arrays.asList(
            new Author(1, "J.K. Rowling"),
            new Author(2, "Stephenie Meyer"),
            new Author(3, "Andrzej Sapkowski")
    );

    public static Optional<Author> getAuthorById(Integer id) {
        return authors.stream()
                .filter(author -> author.id.equals(id))
                .findFirst();
    }
}
