package com.example.jpaspringdemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jpaspringdemo.Model.Book;

@Repository
public interface BookRepository  extends JpaRepository<Book,Integer> {

}