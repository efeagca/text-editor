/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import javax.swing.text.AttributeSet;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

/**
 *
 * @author Gökçin W
 */
public class Italic extends Command_TextEditor{

   
      int selectionstart=0; //Textpane'de seçilen kısmın başlangıcı default olarak en baştan
    int selectionend=My_Document.getInstance().getDocument().getLength(); //Textpane'de seçilen kısmın sonu default olarak en son
    public Italic(int selecStart,int selecEnd){
        selectionstart=selecStart;
        selectionend=selecEnd;
    }
    
    
    @Override
    public Document execute() { // seçilen texti italic yapar
        My_Document myDoc=My_Document.getInstance();
        StyledDocument doc = (StyledDocument) myDoc.getDocument();    
        Element element= doc.getCharacterElement(selectionstart);
        
        AttributeSet as = element.getAttributes();
        
    MutableAttributeSet asNew = new SimpleAttributeSet(as.copyAttributes());
    
    StyleConstants.setItalic(asNew, !StyleConstants.isItalic(as));
    doc.setCharacterAttributes(selectionstart,selectionend, asNew, true);
    return (Document)doc;
    }


}
