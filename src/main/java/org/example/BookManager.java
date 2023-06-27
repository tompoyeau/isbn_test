package org.example;

public class BookManager {

    private BookService databaseBookService;
    private BookService webBookService;
    public BookService getWebBookService() {
        return webBookService;
    }

    public void setWebBookService(BookService webBookService) {
        this.webBookService = webBookService;
    }

    public BookService getDatabaseBookService() {
        return databaseBookService;
    }

    public void setDatabaseBookService(BookService databaseBookService) {
        this.databaseBookService = databaseBookService;
    }

    public String getBookTitleByISBN(String isbn) {
        Book newBook = databaseBookService.getBookData(isbn);
        if (newBook == null) {
            newBook = webBookService.getBookData(isbn);
        }
        if (newBook == null) throw new BookNotFoundException();
        return newBook.getTitre();
    }
}
