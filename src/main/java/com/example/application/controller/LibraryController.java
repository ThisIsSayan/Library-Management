package com.example.application.controller;

import com.example.application.model.BookDetails;
import com.example.application.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibraryController
{
    @Autowired
    private LibraryService libraryService;

    @PostMapping("/saveBook")
    public void addBook(@RequestBody BookDetails bookDetails)
    {
        libraryService.addBookService(bookDetails);
    }

    @PostMapping("/editBook")
    public void updateBook(@RequestBody BookDetails bookDetails)
    {
        libraryService.updateBookService(bookDetails);
    }

    @PostMapping("/deleteBook")
    public String deleteBook(@RequestParam String bookId)
    {
        if(libraryService.deleteBookService(bookId))
            return "Deleted Successfully";
        else
            return "Can't Delete";
    }

    @GetMapping("/getBooks")
    public List<BookDetails> getAllBooks()
    {
        return libraryService.getAllBooksService();
    }

    @PostMapping("/getByType")
    public List<BookDetails> getBooksByGerne(@RequestParam String id)
    {
        return libraryService.getBooksByGerneService(id);
    }
}