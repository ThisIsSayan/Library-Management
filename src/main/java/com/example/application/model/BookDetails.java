package com.example.application.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BookDetails
{
    @Id
    private String bookId;
    private int quantity;
    private String bookName;
    private String gerne;

    public BookDetails() {
        super();
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getGerne() {
        return gerne;
    }

    public void setGerne(String gerne) {
        this.gerne = gerne;
    }

    @Override
    public String toString() {
        return "BookDetails{" +
                "bookId='" + bookId + '\'' +
                ", quantity=" + quantity +
                ", bookName='" + bookName + '\'' +
                ", gerne='" + gerne + '\'' +
                '}';
    }
}
