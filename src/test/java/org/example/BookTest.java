package org.example;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BookTest {
    BookService mockDbService;
    BookService mockWebService;
    BookManager manager;
    @BeforeEach
    public void initMocks() {
        mockDbService = mock(BookService.class);
        mockWebService = mock(BookService.class);
        manager = new BookManager();
        manager.setWebBookService(mockWebService);
        manager.setDatabaseBookService(mockDbService);
    }

    @Test
    public void CreateBookTest() {
        String isbn = "1122352";
        String titre = "Mon title";
        String auteur = "Mon auteur";
        String editeur = "Mon editeur";
        Format format = Format.POCHE;
        boolean disponible = true;

        Book aBook = new Book(isbn,titre, auteur, editeur, format, disponible);
        assertEquals(aBook.getIsbn(), isbn);
        assertEquals(aBook.getTitre(), titre);
        assertEquals(aBook.getAuteur(), auteur);
        assertEquals(aBook.getEditeur(), editeur);
        assertEquals(aBook.getFormat(), format);
        assertEquals(aBook.getDisponible(), disponible);
    }

    @Test
    public void GetBookTitleByISBNTest() {
        String isbn = "123456789";
        when(mockDbService.getBookData(isbn)).thenReturn(new Book(isbn,"Blanche Neige", "Filipe Canelas", "Disney",Format.GRAND_FORMAT,true));

        String expectedTitle = "Blanche Neige";
        String title = manager.getBookTitleByISBN(isbn);
        assertEquals(expectedTitle, title);
    }

    @Test
    public void throwExceptionWhenBookNotFound() {
        assertThrows(BookNotFoundException.class, () -> manager.getBookTitleByISBN("1225215"));
    }

}
