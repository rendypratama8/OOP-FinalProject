/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.buku;
import view.ViewBeranda;
import view.ViewEditAlatTulis;
import view.ViewEditBuku;
import view.ViewHapusAlatTulis;
import view.ViewHapusBuku;
import view.ViewLihatAlatTulis;
import view.ViewLihatBarang;
import view.ViewLihatBuku;
import view.ViewTambahAlatTulis;
import view.ViewTambahBuku;

/**
 *
 * @author Rendy
 */
public class ControllerTambahBuku {
    private ViewTambahBuku view;
    private buku model;

    ControllerBeranda cb = new ControllerBeranda(new ViewBeranda());
    
    public ControllerTambahBuku(ViewTambahBuku view) {
        this.view = view;
    }
    
    public void ShowView(){
        this.view.setLocationRelativeTo(null);
        this.view.show();
        
        this.view.setAddATEvent(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               toAddAT();
            }
        });
        
        this.view.setEditBukuEvent(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                toEditBuku();
            }
        });
        
        this.view.setEditATEvent(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                toEditAT();
            }
        });
        
        this.view.setDeleteBukuEvent(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                toDeleteBuku();
            }
        });
        
        this.view.setDeleteATEvent(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                toDeleteAT();
            }
        });
        
         this.view.setShowBukuEvent(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                toShowBuku();
            }
        });
        
        this.view.setShowATEvent(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                toShowAT();
            }
        });
        
        this.view.setShowAllEvent(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                toShowAll();
            }
        });
        this.view.setBerandaEvent(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                cb.toBeranda();
            }
        });
        this.view.setCariEvent(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cb.toCari();
            }
        });
        this.view.setLoginEvent(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                cb.toLogin();
            }
        });
    }
    
    public void toAddAT(){
        ControllerTambahAlatTulis tat = new ControllerTambahAlatTulis(new ViewTambahAlatTulis());
        tat.ShowView();
        this.view.dispose();
                
    }
    
    public void toEditBuku(){
        ControllerEditBuku eb = new ControllerEditBuku(new ViewEditBuku());
        eb.ShowView();
        this.view.dispose();
    }
    
    public void toEditAT(){
        ControllerEditAlatTulis eat = new ControllerEditAlatTulis(new ViewEditAlatTulis());
        eat.ShowView();
        this.view.dispose();
    }
    
    public void toDeleteBuku(){
        ControllerHapusBuku hb = new ControllerHapusBuku(new ViewHapusBuku());
        hb.ShowView();
        this.view.dispose();
    }
    
    public void toDeleteAT(){
        ControllerHapusAlatTulis hat = new ControllerHapusAlatTulis(new ViewHapusAlatTulis());
        hat.ShowView();
        this.view.dispose();
    }
     public void toShowBuku(){
        ControllerLihatBuku lb = new ControllerLihatBuku(new ViewLihatBuku());
        lb.ShowView();
        this.view.dispose();
    }
    
    public void toShowAT(){
        ControllerLihatAlatTulis lat = new ControllerLihatAlatTulis(new ViewLihatAlatTulis());
        lat.ShowView();
        this.view.dispose();
    }
    
    public void toShowAll(){
        ControllerLihatBarang bar = new ControllerLihatBarang(new ViewLihatBarang());
        bar.ShowView();
        this.view.dispose();
    }
    
}
