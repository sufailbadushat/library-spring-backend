package com.nest.library_backend.dao;

import com.nest.library_backend.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookDao extends CrudRepository<Book, Integer> {

}
