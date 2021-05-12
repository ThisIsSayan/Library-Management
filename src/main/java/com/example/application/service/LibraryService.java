package com.example.application.service;

import com.example.application.model.BookDetails;

import java.util.List;

public interface LibraryService
{
    public void addBookService(BookDetails bookDetails);
    public void updateBookService(BookDetails bookDetails);
    public boolean deleteBookService(String bookId);
    public List<BookDetails> getAllBooksService();
    public List<BookDetails> getBooksByGerneService(String gerne);
}
