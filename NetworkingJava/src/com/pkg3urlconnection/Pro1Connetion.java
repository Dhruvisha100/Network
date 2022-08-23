/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pkg3urlconnection;

import java.io.*;
import java.net.*;

public class Pro1Connetion {

    public static void main(String[] args) {
        try {
            URL url=new URL("http://www.javatpoint.com/java-tutorial");    
            URLConnection urlCon = url.openConnection();
            InputStream strem = urlCon.getInputStream();
            int i;
            while((i = strem.read())!= -1){
                System.out.print((char)i);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
