package mypackage;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.EditorKit;
import javax.swing.text.Element;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class TextEditor extends javax.swing.JFrame {

    My_Iterator<String> iterator = new My_Iterator<>(); //text pane'in dökümanını tutucak koleksiyonumuz
    private File current_file = null;  // üstüne yazılan şu anki dosya

    public TextEditor() {

        initComponents();
       
        FindPanel.setVisible(false); 
        iterator.add(my_text.getText());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        BoldButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        my_text = new javax.swing.JTextPane();
        ItalicButton = new javax.swing.JButton();
        FindPanel = new javax.swing.JPanel();
        FindTextField = new javax.swing.JTextField();
        FindButton = new javax.swing.JButton();
        ReplaceTextField = new javax.swing.JTextField();
        ReplaceButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        SolaYatirmaButton = new javax.swing.JButton();
        SagaYatirButton = new javax.swing.JButton();
        JusticeButton = new javax.swing.JButton();
        UndoButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        NewMenuItem = new javax.swing.JMenuItem();
        OpenMenuItem = new javax.swing.JMenuItem();
        SaveMenuItem = new javax.swing.JMenuItem();
        SaveAsMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        ExitMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        UndoMenuItem = new javax.swing.JMenuItem();
        FindMenuItem = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        InfoMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BoldButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BoldButton.setText("Bold");
        BoldButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoldButtonActionPerformed(evt);
            }
        });

        my_text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                my_textKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(my_text);

        ItalicButton.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        ItalicButton.setText("Italic");
        ItalicButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItalicButtonActionPerformed(evt);
            }
        });

        FindButton.setText("Find All");
        FindButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindButtonActionPerformed(evt);
            }
        });

        ReplaceButton.setText("Replace All");
        ReplaceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReplaceButtonActionPerformed(evt);
            }
        });

        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Find     :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Replace:");

        javax.swing.GroupLayout FindPanelLayout = new javax.swing.GroupLayout(FindPanel);
        FindPanel.setLayout(FindPanelLayout);
        FindPanelLayout.setHorizontalGroup(
            FindPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FindPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FindPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(FindPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FindTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FindPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ReplaceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(FindPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ReplaceButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FindButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FindPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        FindPanelLayout.setVerticalGroup(
            FindPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FindPanelLayout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(FindPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FindTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FindButton)
                    .addComponent(jLabel1))
                .addGap(19, 19, 19)
                .addGroup(FindPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FindPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ReplaceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(ReplaceButton)))
        );

        SolaYatirmaButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\gokci\\OneDrive\\Masaüstü\\solayatir.png")); // NOI18N
        SolaYatirmaButton.setPreferredSize(new java.awt.Dimension(40, 40));
        SolaYatirmaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SolaYatirmaButtonActionPerformed(evt);
            }
        });

        SagaYatirButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\gokci\\OneDrive\\Masaüstü\\sagayatir.png")); // NOI18N
        SagaYatirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SagaYatirButtonActionPerformed(evt);
            }
        });

        JusticeButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\gokci\\OneDrive\\Masaüstü\\2yana.png")); // NOI18N
        JusticeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JusticeButtonActionPerformed(evt);
            }
        });

        UndoButton.setText("Undo");
        UndoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UndoButtonActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        NewMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        NewMenuItem.setText("New                           ");
        NewMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(NewMenuItem);

        OpenMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        OpenMenuItem.setText("Open");
        OpenMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(OpenMenuItem);

        SaveMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        SaveMenuItem.setText("Save");
        SaveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(SaveMenuItem);

        SaveAsMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        SaveAsMenuItem.setText("Save As");
        SaveAsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveAsMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(SaveAsMenuItem);
        jMenu1.add(jSeparator1);

        ExitMenuItem.setText("Exit");
        jMenu1.add(ExitMenuItem);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        UndoMenuItem.setText("Undo");
        UndoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UndoMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(UndoMenuItem);

        FindMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        FindMenuItem.setText("Find");
        FindMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(FindMenuItem);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("About");

        InfoMenuItem.setText("Info");
        InfoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoMenuItemActionPerformed(evt);
            }
        });
        jMenu3.add(InfoMenuItem);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(BoldButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ItalicButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SolaYatirmaButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SagaYatirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JusticeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(UndoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(FindPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FindPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(UndoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SagaYatirButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BoldButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SolaYatirmaButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ItalicButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JusticeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //DOSYA KAYDETME İŞLEMİ
    private void SaveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveMenuItemActionPerformed
        Document doc = my_text.getStyledDocument();
        EditorKit kit = my_text.getEditorKit();
        try {
            if (current_file == null) { //dosya ilk defa çağırılıyorsa saveAs metodunu çağırıyor
                saveAs();
                return;
            }
            kit.write(new FileOutputStream(current_file), doc, 0, doc.getLength());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Dosya kaydedilirken hata oluştu.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_SaveMenuItemActionPerformed

//YENİ SAYFA AÇMA İŞLEMİ
    private void NewMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewMenuItemActionPerformed
        my_text.setText("");
        my_text.setFont(new Font("Tahoma", 0, 11));
        current_file = null;
        this.iterator = new My_Iterator();
    }//GEN-LAST:event_NewMenuItemActionPerformed

    //UNDO İŞLEMİ
    private void UndoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UndoMenuItemActionPerformed
        if ((!iterator.isEmpty()) & (iterator.getLength()!= 0)) { // 10 defa undo yapıldığında daha undo yapılamaz
            my_text.setText((String) iterator.previous());
        }


    }//GEN-LAST:event_UndoMenuItemActionPerformed

    // BOLD YAPMA İŞLEMİ
    private void BoldButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoldButtonActionPerformed

        CommandManager manager = CommandManager.getInstance();  //Invoker oluşturuyoruz
        List<Command_TextEditor> commandList = new ArrayList<>();
        My_Document myDoc = My_Document.getInstance();
        myDoc.setDocument(my_text.getDocument());
        if (my_text.getSelectedText() == null) { //text hiç seçilmemişse komple işlemi yapsın
            commandList.add(new Bold(0, my_text.getDocument().getLength()));
        } else {
            commandList.add(new Bold(my_text.getSelectionStart(), my_text.getSelectedText().length()));// seçilen textin başlangıç indexini ve bitiş indexini yolluyor
        }
        manager.execute(commandList);

    }//GEN-LAST:event_BoldButtonActionPerformed

    //ITALIC YAPMA İŞLEMİ
    private void ItalicButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItalicButtonActionPerformed
        // TODO add your handling code here:
        CommandManager manager = CommandManager.getInstance();  //Invoker oluşturuyoruz
        List<Command_TextEditor> commandList = new ArrayList<>();
        My_Document myDoc = My_Document.getInstance();
        myDoc.setDocument(my_text.getDocument());
        if (my_text.getSelectedText() == null) { //text hiç seçilmemişse komple işlemi yapsın
            commandList.add(new Italic(0, my_text.getDocument().getLength()));
        } else {
            commandList.add(new Italic(my_text.getSelectionStart(), my_text.getSelectedText().length()));// seçilen textin başlangıç indexini ve bitiş indexini yolluyor
        }
        manager.execute(commandList);


    }//GEN-LAST:event_ItalicButtonActionPerformed

    // DOSYA AÇMA İŞLEMİ
    private void OpenMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenMenuItemActionPerformed
        
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(null);

        EditorKit kit = my_text.getEditorKit(); // Bu sınıf kaydedilmiş olan dökümanın style'lar ile birlikte açmamızı sağlıyor
        Document doc = kit.createDefaultDocument();

        try {
            File file = fc.getSelectedFile();
            current_file = file; // şu an ki dosyamızı değiştiriyoruz
            BufferedReader br = new BufferedReader(new FileReader(file));

            kit.read(br, doc, 0);
            my_text.setDocument(doc);

        } catch (IOException | BadLocationException e) {
            JOptionPane.showMessageDialog(null, "Dosya açılırken hata oluştu.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_OpenMenuItemActionPerformed

    // SAVE AS İŞLEMİ
    private void SaveAsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveAsMenuItemActionPerformed
        // TODO add your handling code here:
        saveAs();
    }//GEN-LAST:event_SaveAsMenuItemActionPerformed

    // FIND  panelinin açılmasını sağlayan işlem
    private void FindMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindMenuItemActionPerformed
        // TODO add your handling code here:
        FindPanel.setVisible(true);


    }//GEN-LAST:event_FindMenuItemActionPerformed

    //tüm dökümanın background'unu beyaz yapmak için
    private void RemoveFoundBackground() {

        Element element = my_text.getStyledDocument().getCharacterElement(0);
        AttributeSet as = element.getAttributes();

        MutableAttributeSet asNew = new SimpleAttributeSet(as.copyAttributes());

        StyleConstants.setBackground(asNew, Color.white);
        my_text.getStyledDocument().setCharacterAttributes(0, my_text.getDocument().getLength(), asNew, true);
    }  
    
   //verilen kelimenin backgroundunu boyama işlemi
    private void ColorBackground(Color color, String word) {
        Document tempDoc = my_text.getDocument();
        StyledDocument tempStyledDoc = my_text.getStyledDocument();

        int index = 0;

        try {
            while (index < tempDoc.getLength()) {
                index = tempDoc.getText(0, tempDoc.getLength()).indexOf(word, index);
                if ((word.isEmpty()) | (index == -1)) {
                    break;
                }
                Element element = tempStyledDoc.getCharacterElement(index);
                AttributeSet as = element.getAttributes();

                MutableAttributeSet asNew = new SimpleAttributeSet(as.copyAttributes());

                StyleConstants.setBackground(asNew, color);

                tempStyledDoc.setCharacterAttributes(index, word.length(), asNew, true);

                index = index + word.length();
            }
            my_text.setDocument(tempDoc);
        } catch (BadLocationException e) {
            JOptionPane.showMessageDialog(null, "ERROR", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }
    
 
    private void FindButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindButtonActionPerformed

        RemoveFoundBackground();
        // önceden aranmış olan kelimenin background'unu temizlemek için her seferinde temizleyip ondan sonra aranılan kelimenin arkasını boyuyoruz.
        ColorBackground(Color.yellow, FindTextField.getText());


    }//GEN-LAST:event_FindButtonActionPerformed

    private void ReplaceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReplaceButtonActionPerformed

        my_text.setText(my_text.getText().replaceAll(FindTextField.getText(), ReplaceTextField.getText()));
        iterator.add(my_text.getText());


    }//GEN-LAST:event_ReplaceButtonActionPerformed

    private void SolaYatirmaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SolaYatirmaButtonActionPerformed

      SimpleAttributeSet attribs = new SimpleAttributeSet();
        StyleConstants.setAlignment(attribs, StyleConstants.ALIGN_LEFT);
        my_text.setParagraphAttributes(attribs, true);

    }//GEN-LAST:event_SolaYatirmaButtonActionPerformed

    private void SagaYatirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SagaYatirButtonActionPerformed

        
 SimpleAttributeSet attribs = new SimpleAttributeSet();
        StyleConstants.setAlignment(attribs, StyleConstants.ALIGN_RIGHT);
        my_text.setParagraphAttributes(attribs, true);
    }//GEN-LAST:event_SagaYatirButtonActionPerformed

    private void JusticeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JusticeButtonActionPerformed
        SimpleAttributeSet attribs = new SimpleAttributeSet();
        StyleConstants.setAlignment(attribs, StyleConstants.ALIGN_JUSTIFIED);
        my_text.setParagraphAttributes(attribs, true);


    }//GEN-LAST:event_JusticeButtonActionPerformed

    private void InfoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoMenuItemActionPerformed

        JOptionPane.showMessageDialog(null, "Nesneye Dayalı Programlama Projesi", "INFO", JOptionPane.INFORMATION_MESSAGE);


    }//GEN-LAST:event_InfoMenuItemActionPerformed

// Find ekranından çıkmak için
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FindPanel.setVisible(false);
        FindTextField.setText("");
        ReplaceTextField.setText("");
        RemoveFoundBackground();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void my_textKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_my_textKeyTyped

        //Her karakter girildiğinde textimizi iteratorumuza kaydediyoruz
        iterator.add(my_text.getText()); 


    }//GEN-LAST:event_my_textKeyTyped

    private void UndoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UndoButtonActionPerformed

        if ((!iterator.isEmpty()) & (iterator.getLength()!= 0)) {
            my_text.setText((String) iterator.previous());
        }

    }//GEN-LAST:event_UndoButtonActionPerformed

    private void saveAs() {
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(null);
        Document doc = my_text.getStyledDocument();
        EditorKit kit = my_text.getEditorKit();
        try {
            File file = fc.getSelectedFile();
            current_file = file;
            kit.write(new FileOutputStream(file), doc, 0, doc.getLength());

        } catch (IOException | BadLocationException e) {
            JOptionPane.showMessageDialog(null, "Dosya kaydedilirken hata oluştu.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new TextEditor().setVisible(true);
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BoldButton;
    private javax.swing.JMenuItem ExitMenuItem;
    private javax.swing.JButton FindButton;
    private javax.swing.JMenuItem FindMenuItem;
    private javax.swing.JPanel FindPanel;
    private javax.swing.JTextField FindTextField;
    private javax.swing.JMenuItem InfoMenuItem;
    private javax.swing.JButton ItalicButton;
    private javax.swing.JButton JusticeButton;
    private javax.swing.JMenuItem NewMenuItem;
    private javax.swing.JMenuItem OpenMenuItem;
    private javax.swing.JButton ReplaceButton;
    private javax.swing.JTextField ReplaceTextField;
    private javax.swing.JButton SagaYatirButton;
    private javax.swing.JMenuItem SaveAsMenuItem;
    private javax.swing.JMenuItem SaveMenuItem;
    private javax.swing.JButton SolaYatirmaButton;
    private javax.swing.JButton UndoButton;
    private javax.swing.JMenuItem UndoMenuItem;
    private javax.swing.JButton jButton1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextPane my_text;
    // End of variables declaration//GEN-END:variables
}
