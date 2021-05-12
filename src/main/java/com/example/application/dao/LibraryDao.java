package com.example.application.dao;

import com.example.application.model.BookDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryDao extends JpaRepository<BookDetails, String>
{
}
