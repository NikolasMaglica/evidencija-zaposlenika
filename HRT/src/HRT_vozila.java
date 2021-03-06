
import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.text.*;
import java.awt.print.*;
import java.util.Locale;
import javafx.print.Printer;
import javax.swing.JTextArea;



public class HRT_vozila extends javax.swing.JFrame {

     DefaultTableModel tab;

    
    public HRT_vozila() {
        initComponents();
        curDate();
                createColumns();

      
    }
    
        public void curDate(){
                DateTimeFormatter drf=DateTimeFormatter.ofPattern("dd. MM. yyy   |  HH: mm: ss");
            LocalDateTime now=LocalDateTime.now();
            datum_s.setText(drf.format(now));
        }
        private void createColumns(){
    tab=(DefaultTableModel) tablica.getModel();
    tab.addColumn("Naziv");
    tab.addColumn("Broj šasije");
        tab.addColumn("Godina proizvodnje");
    tab.addColumn("Kilometraža");
    tab.addColumn("Snaga (KS)");

      tab.addColumn("Gorivo");
      tab.addColumn("Rok registracije");

}
private void Populate(String name, String broj,String godina, String kilometri, String snaga, String combo, String datum){
    tab=(DefaultTableModel)tablica.getModel();
    
    String[] row={name,broj,godina,kilometri,snaga,combo,datum};
    tab.addRow(row);
}
       
        
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        naziv = new javax.swing.JTextField();
        broj = new javax.swing.JTextField();
        kilometri = new javax.swing.JTextField();
        snaga = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        print = new javax.swing.JScrollPane();
        tablica = new javax.swing.JTable();
        unos = new javax.swing.JButton();
        pretrazivanje = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        godina = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        uvoz = new javax.swing.JButton();
        izvoz = new javax.swing.JButton();
        brisi = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        datum_s = new javax.swing.JTextField();
        printanje = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        vrsta = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        datum = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        prema_combu = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        naziv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nazivActionPerformed(evt);
            }
        });
        naziv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nazivKeyTyped(evt);
            }
        });
        getContentPane().add(naziv, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 118, 150, 31));

        broj.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                brojKeyTyped(evt);
            }
        });
        getContentPane().add(broj, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 150, 31));

        kilometri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kilometriActionPerformed(evt);
            }
        });
        kilometri.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                kilometriKeyTyped(evt);
            }
        });
        getContentPane().add(kilometri, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 150, 31));

        snaga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                snagaKeyTyped(evt);
            }
        });
        getContentPane().add(snaga, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 150, 30));

        jLabel1.setText("Naziv vozila");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel2.setText("Broj šasije");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        jLabel3.setText("Godina proizvodnje");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        jLabel4.setText("Prijeđena kilometraža");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        jLabel5.setText("Snaga (KS)");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, -1));

        tablica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        print.setViewportView(tablica);

        getContentPane().add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 590, 680, 190));

        unos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        unos.setText("UNESI");
        unos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unosActionPerformed(evt);
            }
        });
        getContentPane().add(unos, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 544, 110, 40));

        pretrazivanje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pretrazivanjeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pretrazivanjeKeyReleased(evt);
            }
        });
        getContentPane().add(pretrazivanje, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 560, 140, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton2.setText("?");
        jButton2.setAlignmentY(0.0F);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel6.setText("PRETRAŽIVANJE");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 523, 90, -1));

        godina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                godinaActionPerformed(evt);
            }
        });
        godina.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                godinaKeyTyped(evt);
            }
        });
        getContentPane().add(godina, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 150, 32));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton3.setText("?");
        jButton3.setAlignmentY(0.0F);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, -1, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton4.setText("?");
        jButton4.setAlignmentY(0.0F);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, -1, -1));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton5.setText("?");
        jButton5.setAlignmentY(0.0F);
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, -1, -1));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton6.setText("?");
        jButton6.setAlignmentY(0.0F);
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, -1));

        uvoz.setText("UVOZ U DATOTEKU");
        uvoz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uvozActionPerformed(evt);
            }
        });
        getContentPane().add(uvoz, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 180, 50));

        izvoz.setText("IZVOZ IZ DATOTEKE");
        izvoz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izvozActionPerformed(evt);
            }
        });
        getContentPane().add(izvoz, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 710, 180, 50));

        brisi.setText("BRIŠI");
        brisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brisiActionPerformed(evt);
            }
        });
        getContentPane().add(brisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 540, 95, -1));

        jLabel7.setFont(new java.awt.Font("Wide Latin", 0, 18)); // NOI18N
        jLabel7.setText("EVIDENCIJA VOZILA");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 27, -1, -1));

        datum_s.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(datum_s, new org.netbeans.lib.awtextra.AbsoluteConstraints(675, 48, 210, 41));

        printanje.setText("ISPRINTAJ PODATKE IZ TABLICE");
        printanje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printanjeActionPerformed(evt);
            }
        });
        getContentPane().add(printanje, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 490, 239, 42));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "/", "Eurosuper 95", "Eurospuer 100", "Eurodiesel", "Eurodiesel plavi", "LPG" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 150, 40));

        vrsta.setText("Vrsta goriva");
        getContentPane().add(vrsta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, 190, 30));
        getContentPane().add(datum, new org.netbeans.lib.awtextra.AbsoluteConstraints(764, 360, -1, 0));

        jLabel8.setText("Registracija vrijedi do");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, -1, -1));

        prema_combu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "/", "Eurosuper 95", "Eurosuper 100", "Eurodiesel", "Eurodiesel plavi", "LPG" }));
        prema_combu.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                prema_combuItemStateChanged(evt);
            }
        });
        getContentPane().add(prema_combu, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 560, 100, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel9.setText("Prema vrsti goriva");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 560, 90, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel10.setText("Prema nazivu");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 560, 90, 20));

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Pictures\\hrt-logo-2C007CB497-seeklogo.com.png")); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 380, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void unosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unosActionPerformed
        try{
        SimpleDateFormat f=new SimpleDateFormat("dd-MM-yyyy",Locale.getDefault());
        String a=f.format(jDateChooser1.getDate());
        datum.setText(a);
        }
        catch(Exception e){
            System.out.println("Dogodila se greška");
        }
        if(naziv.getText().equals("")|| broj.getText().equals("")|| godina.getText().equals("")|| kilometri.getText().equals("") || snaga.getText().equals("") || jComboBox1.getSelectedItem().equals("/")|| datum.getText().equals(""))
        JOptionPane.showMessageDialog(this, "Sve vrijednosti moraju biti unesene");
        else
            Populate( naziv.getText(),broj.getText(),godina.getText(),kilometri.getText(),snaga.getText(),jComboBox1.getSelectedItem().toString(),datum.getText());
        
        
    }//GEN-LAST:event_unosActionPerformed

    private void pretrazivanjeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pretrazivanjeKeyPressed
        // TODO add your handling code here:
        try{
        DefaultTableModel model=(DefaultTableModel)tablica.getModel();
        TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(model);
        tablica.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(pretrazivanje.getText().trim()));
        }
        catch(Exception e){
            System.out.println("Dogodila se greška");
        }
    }//GEN-LAST:event_pretrazivanjeKeyPressed

    private void pretrazivanjeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pretrazivanjeKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_pretrazivanjeKeyReleased

    private void godinaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_godinaKeyTyped
        char c=evt.getKeyChar();
        if((!Character.isDigit(c)))
       
                 evt.consume();
        
    }//GEN-LAST:event_godinaKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JOptionPane.showMessageDialog(this, "Unos smije sadržavati samo velika slova i brojeve");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
                                          
        JOptionPane.showMessageDialog(this, "Možete unijeti samo brojeve i razmake");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
                                              
        JOptionPane.showMessageDialog(this, "Možete unijeti samo brojeve");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void kilometriKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kilometriKeyTyped
         char c=evt.getKeyChar();
        if((!Character.isDigit(c)) && (!(c>31 && c<33)))
            evt.consume();
        
    }//GEN-LAST:event_kilometriKeyTyped

    private void snagaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_snagaKeyTyped
       char c=evt.getKeyChar();
        if(!Character.isDigit(c))
            
            evt.consume();
            
        
    }//GEN-LAST:event_snagaKeyTyped

    private void kilometriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kilometriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kilometriActionPerformed

    private void brojKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_brojKeyTyped
       
             char c=evt.getKeyChar();
        if((!(c>64 && c<91))&&(!(c>47 && c<58))){
            evt.consume();
        
        }
            
             
    }//GEN-LAST:event_brojKeyTyped

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        JOptionPane.showMessageDialog(this, "Možete unijeti samo brojeve");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void nazivKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nazivKeyTyped
        char c=evt.getKeyChar();
        if((!(c>64 && c<91))&&(!(c>96 && c<123)))
            if((!(c>47 && c<58))&&(!(c>31 && c<33)))
            evt.consume();
        
        
    }//GEN-LAST:event_nazivKeyTyped

    private void nazivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nazivActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nazivActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       JOptionPane.showMessageDialog(this, "Možete unijeti velika slova, mala slova, brojeve i razmake");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void godinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_godinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_godinaActionPerformed

    private void uvozActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uvozActionPerformed
                    
  
        try{
            
          FileWriter datot=new FileWriter("Vozila_HRT.txt");
          BufferedWriter bw=new BufferedWriter(datot);
          for(int i=0;i<tablica.getRowCount();i++){
             for(int j=0;j<tablica.getColumnCount();j++){
                 bw.write(tablica.getValueAt(i, j).toString()+",");
             }
             bw.newLine();
          }
          bw.close();
          datot.close();
          JOptionPane.showMessageDialog(this, "Unos je uspio");
        }
           catch(Exception e){
               JOptionPane.showMessageDialog(this, "Dogodila se greška");
           }
    }//GEN-LAST:event_uvozActionPerformed

    private void izvozActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izvozActionPerformed
      try{
        File fil=new File("Vozila_HRT.txt");
        FileReader fr=new FileReader(fil);
        BufferedReader br=new BufferedReader(fr);
        DefaultTableModel model=(DefaultTableModel)tablica.getModel();
        Object[] lines=br.lines().toArray();
        for(int i=0;i<lines.length;i++){
            String [] row=lines[i].toString().split(",");
            model.addRow(row);
        }
      }
      catch(Exception e){
          System.out.println("Greska");
      }
    }//GEN-LAST:event_izvozActionPerformed

    private void brisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brisiActionPerformed
        DefaultTableModel table=(DefaultTableModel)tablica.getModel();
        
        if(tablica.getSelectedRowCount()>=1){
            table.removeRow(tablica.getSelectedRow());
        }
        else if(tablica.getRowCount()==0){
            JOptionPane.showMessageDialog(this, "Tablica je prazna.");   
        }
        else{
            JOptionPane.showMessageDialog(this, "Izaberite vozilo koju želite obrisati.");
        }
    }//GEN-LAST:event_brisiActionPerformed

    private void printanjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printanjeActionPerformed
        // TODO add your handling code here:
        try{
            tablica.print();
        }
        catch(java.awt.print.PrinterException e){
            System.out.println("Pojavila se greška");
        }
    }//GEN-LAST:event_printanjeActionPerformed

    private void prema_combuItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_prema_combuItemStateChanged
String query=prema_combu.getSelectedItem().toString();
filter(query);
    }//GEN-LAST:event_prema_combuItemStateChanged
private void filter(String query){
DefaultTableModel table=(DefaultTableModel)tablica.getModel();
        TableRowSorter<DefaultTableModel> model=new TableRowSorter<DefaultTableModel>(table);
        tablica.setRowSorter(model);
        
        if(query!="/")
        {
            model.setRowFilter(RowFilter.regexFilter(query));
        }
        else{
            tablica.setRowSorter(model);
        }
}

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HRT_vozila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HRT_vozila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HRT_vozila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HRT_vozila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HRT_vozila().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brisi;
    private javax.swing.JTextField broj;
    private javax.swing.JTextField datum;
    private javax.swing.JTextField datum_s;
    private javax.swing.JTextField godina;
    private javax.swing.JButton izvoz;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField kilometri;
    private javax.swing.JTextField naziv;
    private javax.swing.JComboBox<String> prema_combu;
    private javax.swing.JTextField pretrazivanje;
    private javax.swing.JScrollPane print;
    private javax.swing.JButton printanje;
    private javax.swing.JTextField snaga;
    private javax.swing.JTable tablica;
    private javax.swing.JButton unos;
    private javax.swing.JButton uvoz;
    private javax.swing.JLabel vrsta;
    // End of variables declaration//GEN-END:variables

    private void createColuns() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
