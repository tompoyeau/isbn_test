package org.example;

public class Book {
    private String Isbn;
    private String titre;
    private String auteur;
    private String editeur;
    private Format format;
    private Boolean disponible;

    public Book(String isbn, String titre, String auteur, String editeur, Format format, Boolean disponible) {
        Isbn = isbn;
        this.titre = titre;
        this.auteur = auteur;
        this.editeur = editeur;
        this.format = format;
        this.disponible = disponible;
    }

    public String getIsbn() {
        return Isbn;
    }

    public void setIsbn(String isbn) {
        Isbn = isbn;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    public Format getFormat() {
        return format;
    }

    public void setFormat(Format format) {
        this.format = format;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }
}
