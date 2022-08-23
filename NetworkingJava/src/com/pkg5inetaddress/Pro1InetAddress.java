/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pkg5inetaddress;

import java.io.*;
import java.net.*;

public class Pro1InetAddress {

    public static void main(String[] args) {
        try {

            InetAddress ip = InetAddress.getByName("www.javatpoint.com");
            System.out.println("Host Name: " + ip.getHostName());
            System.out.println("IP Address: " + ip.getHostAddress());
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
