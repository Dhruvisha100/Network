/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pkg1sockect;

import java.net.*;
import java.io.*;

public class Pro1Server {
 public static void main(String args[]){
     try{
         ServerSocket ss = new ServerSocket(6666);
         Socket s = ss.accept();
         DataInputStream dis = new DataInputStream(s.getInputStream());
         String str = (String) dis.readUTF();
         System.out.println("messge : "+ str);
         ss.close();
     }
     catch(Exception e){
         System.out.println(e);
     }
 }   
}
