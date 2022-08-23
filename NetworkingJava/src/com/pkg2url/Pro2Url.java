/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pkg2url;

import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Pro2Url {

    public static void main(String[] args) {

        URL url = null;
        try {
            url = new URL("https://www.google.com/search?q=javatpoint&oq=javatpoint&sourceid=chrome&ie=UTF-8");
        } catch (MalformedURLException ex) {
            Logger.getLogger(Pro2Url.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Protocol: " + url.getProtocol());
        System.out.println("Host Name: " + url.getHost());
        System.out.println("Port Number: " + url.getPort());
        System.out.println("Default Port Number: " + url.getDefaultPort());
        System.out.println("Query String: " + url.getQuery());
        System.out.println("Path: " + url.getPath());
        System.out.println("File: " + url.getFile());
    }
}
