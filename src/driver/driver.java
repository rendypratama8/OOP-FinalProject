/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;



/**
 *
 * @author Asus
 */

import controller.ControllerBeranda;
import view.ViewBeranda;


public class driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ControllerBeranda beranda = new ControllerBeranda(new ViewBeranda());
        beranda.showView();
        
    }
    
}
