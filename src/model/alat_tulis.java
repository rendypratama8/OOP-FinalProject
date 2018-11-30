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
public class alat_tulis extends barang{
    private String detail;
    
    public alat_tulis(String id, String nama, int stok, int harga, String detail) {
        super(id, nama, stok, harga);
        this.detail = detail;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
    
}
