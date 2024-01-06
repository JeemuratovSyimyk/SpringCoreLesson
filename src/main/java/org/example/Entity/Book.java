package org.example.Entity;

import org.example.Service.Library;

public class Book {
 private Library library;

    public Book(Library library) {
        this.library = library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }
}


