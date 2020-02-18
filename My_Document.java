/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import javax.swing.text.Document;


//Textpane'e her yerden ulaşabilmek için singleton pattern'ı ile dökümanımızı globalleştiriyoruz.
public class My_Document   { 
     private  static My_Document instance =new My_Document();
    public  Document document;
    
    public My_Document(){
    }
    
    public void setDocument(Document d){
        document=d;
    }
    public Document getDocument(){
        return document;
    }
     static My_Document getInstance(){
        if(instance != null)
            return instance;
        return new My_Document();
    }
}
