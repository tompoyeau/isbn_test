package org.example;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
public class BookTest {

    @Test
    public void CreateBookTest() {
        Integer isbn = 1122354;
        String titre = "Mon title";
        String auteur = "Mon auteur";
        String editeur = "Mon editeur";
        String format = "Poche";
        boolean disponible = true;

        Book aBook = new Book(isbn,titre, auteur, editeur, format, disponible);
        assertEquals(aBook.getIsbn(), isbn);
        assertEquals(aBook.getTitre(), titre);
        assertEquals(aBook.getAuteur(), auteur);
        assertEquals(aBook.getEditeur(), editeur);
        assertEquals(aBook.getFormat(), format);
        assertEquals(aBook.getDisponible(), disponible);
    }

}
