package org.example;

public class Book {
    private Integer Isbn;
    private String titre;
    private String auteur;
    private String editeur;
    private String format;
    private Boolean disponible;

    public Book(Integer isbn, String titre, String auteur, String editeur, String format, Boolean disponible) {
        Isbn = isbn;
        this.titre = titre;
        this.auteur = auteur;
        this.editeur = editeur;
        this.format = format;
        this.disponible = disponible;
    }

    public Integer getIsbn() {
        return Isbn;
    }

    public void setIsbn(Integer isbn) {
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

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }
}
