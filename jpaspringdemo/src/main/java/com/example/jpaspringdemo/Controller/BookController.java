package com.example.jpaspringdemo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpaspringdemo.Model.Book;
import com.example.jpaspringdemo.Service.BookService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/MyBookStore")
public class BookController {
  @Autowired
  private BookService bs;

  @GetMapping("MyStore")
  public List<Book> getBooks() {
      return bs.getAllBooks();
  }

  @PostMapping("AddBook")
  public String createBook(@RequestBody Book b) {

      return bs.createBook(b);
  }
  
  

}
