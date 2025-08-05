package io.sibinix.repository;

import org.springframework.data.repository.CrudRepository;

import io.sibinix.model.Book;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {

    List<Book> findByName(String name);
}
