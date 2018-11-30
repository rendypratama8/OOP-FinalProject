/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Asus
 */
public class buku extends barang{
    private String kategori;
    private String jumHalaman;
    private penerbit penerbit;
    private pengarang pengarang;
    
    public buku(String id, String nama, int stok, int harga, penerbit penerbit, pengarang pengarang) {
        super(id, nama, stok, harga);
        this.kategori = kategori;
        this.jumHalaman = jumHalaman;
        this.penerbit = penerbit;
        this.pengarang = pengarang;
        
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getJumHalaman() {
        return jumHalaman;
    }

    public void setJumHalaman(String jumHalaman) {
        this.jumHalaman = jumHalaman;
    }
    
    
}
