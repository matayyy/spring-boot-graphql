package com.matay.springbootgraphql;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Book(Integer id,
                   String name,
                   Integer pageCount,
                   Integer authorId) {

    public static List<Book> books = Arrays.asList(
            new Book(1, "Harry Potter y la piedra filosofal", 264, 1),
            new Book(2, "Harry Potter y la cámara secreta", 296, 1),
            new Book(3, "Harry Potter y el prisionero de Azkaban", 360, 2),
            new Book(4, "Harry Potter y el cáliz de fuego", 672, 2),
            new Book(5, "Harry Potter y la Orden del Fénix", 928, 3),
            new Book(6, "Harry Potter y el misterio del príncipe", 576, 3),
            new Book(7, "Harry Potter y las Relíquias de la Muerte", 704, 1)
    );

    public static Optional<Book> getBookById(Integer id) {
        return books.stream()
                .filter(book -> book.id.equals(id))
                .findFirst();
    }
}
