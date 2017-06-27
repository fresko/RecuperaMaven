/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usb.ir.main;

import com.usb.ir.client.ClientApiMaven;

/**
 *
 * @author SONY
 */
public class GetStart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClientApiMaven cm = new ClientApiMaven();
        System.out.println( cm.findApiMaven("g:com.google.inject", "20", "json"));
        cm.close();
    }
    
}
