package com.nest.library_backend.dao;

import com.nest.library_backend.model.Book;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookDao extends CrudRepository<Book, Integer> {

    @Query(value = "SELECT `id`, `author`, `distributor`, `image`, `language`, `price`, `publisher`, `released_year`, `title` FROM `books` WHERE `title` LIKE %:title%", nativeQuery = true)
    List<Book> SearchBook(@Param("title") String title);
}
