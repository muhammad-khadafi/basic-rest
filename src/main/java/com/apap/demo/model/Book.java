package com.apap.demo.model;

public class Book {

    private String kodeBuku;
    private String judulBuku;
    private String penulis;
    private String genre;
    private Integer harga;

    public Book(String kodeBuku, String judulBuku, String penulis, String genre, Integer harga) {
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.penulis = penulis;
        this.genre = genre;
        this.harga = harga;
    }

    public String getKodeBuku() {
        return kodeBuku;
    }

    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getHarga() {
        return harga;
    }

    public void setHarga(Integer harga) {
        this.harga = harga;
    }
}