package com.example.jpaspringdemo.Service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jpaspringdemo.Model.Book;
import com.example.jpaspringdemo.Repository.BookRepository;


@Service
public class BookService {
  @Autowired
 private BookRepository br;

 public List<Book> getAllBooks(){
      return br.findAll();

 }

 public String createBook(Book b){
    br.save(b);
    return "Book added Successfully";
 }
}
