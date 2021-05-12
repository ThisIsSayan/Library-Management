package com.example.application.service;
import com.example.application.dao.LibraryDao;
import com.example.application.model.BookDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LibraryServiceImpl implements LibraryService
{
    @Autowired
    private LibraryDao libraryDao;

    @Override
    public void addBookService(BookDetails bookDetails) {
        libraryDao.save(bookDetails);
    }

    @Override
    public void updateBookService(BookDetails bookDetails) {
        libraryDao.save(bookDetails);
    }

    @Override
    public boolean deleteBookService(String bookId) {
        try {
            libraryDao.deleteById(bookId);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public List<BookDetails> getAllBooksService() {
        return libraryDao.findAll();
    }

    @Override
    public List<BookDetails> getBooksByGerneService(String gerne) {
        List<BookDetails> allBooks = libraryDao.findAll();
        List<BookDetails> retBooks = new ArrayList<>();
        for (BookDetails bd : allBooks)
        {
            if(bd.getGerne().equals(gerne))
            {
                retBooks.add(bd);
            }
        }
        return retBooks;
    }
}
