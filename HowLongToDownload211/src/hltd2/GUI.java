package hltd2;

import javax.swing.JOptionPane;

/**
 * @version 2.1
 * @author AKNW_HWK
 */
public class GUI extends javax.swing.JFrame 
{

    public GUI() 
    {
        initComponents();
        
        btgroup.add(btGerman);
        btgroup.add(btEnglish);
        btgroup.add(btFrench);
        btgroup.add(btItalian);
        btgroup.add(btMandarin);
        btgroup.add(btRussian);
        btgroup.add(btSpanish);
        btgroup.add(btTurkish);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgroup = new javax.swing.ButtonGroup();
        lbBroadwidth = new javax.swing.JLabel();
        lbFilesize1 = new javax.swing.JLabel();
        lbDuration = new javax.swing.JLabel();
        cbFilesize = new javax.swing.JComboBox();
        cbBroadwidth = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfBroadwidth = new javax.swing.JTextField();
        tfFilesize = new javax.swing.JTextField();
        btCalculateDownloadDuration = new javax.swing.JButton();
        tfCompleteInSeconds = new javax.swing.JTextField();
        tfCompleteInMinutes = new javax.swing.JTextField();
        tfCompleteInHours = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        tfCompleteInDays = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        btGerman = new javax.swing.JRadioButtonMenuItem();
        btEnglish = new javax.swing.JRadioButtonMenuItem();
        btFrench = new javax.swing.JRadioButtonMenuItem();
        btItalian = new javax.swing.JRadioButtonMenuItem();
        btRussian = new javax.swing.JRadioButtonMenuItem();
        btMandarin = new javax.swing.JRadioButtonMenuItem();
        btSpanish = new javax.swing.JRadioButtonMenuItem();
        btTurkish = new javax.swing.JRadioButtonMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("How Long To Download 2.1 (Release)");
        setResizable(false);

        lbBroadwidth.setText("Broadwidth in");

        lbFilesize1.setText("Filesize in");

        lbDuration.setText("Transfer completed in");

        cbFilesize.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "KByte", "MByte", "GByte", "TByte" }));

        cbBroadwidth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "kbit/s", "mbit/s", "gbit/s" }));

        jLabel1.setText(":");

        jLabel2.setText(":");

        btCalculateDownloadDuration.setText("Calculate Download Duration");
        btCalculateDownloadDuration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onCalculateDownloadDuration(evt);
            }
        });

        tfCompleteInSeconds.setEditable(false);
        tfCompleteInSeconds.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        tfCompleteInMinutes.setEditable(false);
        tfCompleteInMinutes.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        tfCompleteInHours.setEditable(false);
        tfCompleteInHours.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel3.setText(":");

        tfCompleteInDays.setEditable(false);
        tfCompleteInDays.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jMenu3.setText("Language");

        btGerman.setText("German");
        btGerman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onGerman(evt);
            }
        });
        jMenu3.add(btGerman);

        btEnglish.setSelected(true);
        btEnglish.setText("English");
        btEnglish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onEnglish(evt);
            }
        });
        jMenu3.add(btEnglish);

        btFrench.setSelected(true);
        btFrench.setText("French");
        btFrench.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onFrench(evt);
            }
        });
        jMenu3.add(btFrench);

        btItalian.setSelected(true);
        btItalian.setText("Italian");
        btItalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onItalian(evt);
            }
        });
        jMenu3.add(btItalian);

        btRussian.setSelected(true);
        btRussian.setText("Russian");
        btRussian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onRussian(evt);
            }
        });
        jMenu3.add(btRussian);

        btMandarin.setSelected(true);
        btMandarin.setText("Mandarin");
        btMandarin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onMandarin(evt);
            }
        });
        jMenu3.add(btMandarin);

        btSpanish.setSelected(true);
        btSpanish.setText("Spanish");
        btSpanish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onSpanish(evt);
            }
        });
        jMenu3.add(btSpanish);

        btTurkish.setSelected(true);
        btTurkish.setText("Turkish");
        btTurkish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onTurkish(evt);
            }
        });
        jMenu3.add(btTurkish);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Credits");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onRollCredits(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbBroadwidth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbFilesize1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbBroadwidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfBroadwidth))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbFilesize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btCalculateDownloadDuration, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                                    .addComponent(tfFilesize)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(tfCompleteInMinutes))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCompleteInDays, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfCompleteInHours)
                            .addComponent(tfCompleteInSeconds))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbBroadwidth)
                    .addComponent(cbBroadwidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(tfBroadwidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFilesize1)
                    .addComponent(cbFilesize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(tfFilesize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCalculateDownloadDuration)
                .addGap(15, 15, 15)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDuration)
                    .addComponent(tfCompleteInSeconds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfCompleteInMinutes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfCompleteInHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfCompleteInDays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onRollCredits(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onRollCredits
        Credits cd = new Credits(this, true);
        cd.setLocationRelativeTo(this);
        cd.setVisible(true);
    }//GEN-LAST:event_onRollCredits

    private void onCalculateDownloadDuration(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onCalculateDownloadDuration
        /*
        /   1) Bandbreite und Filesize einlesen
        /   2) Eineiten einlesen
        /   3) Umrechnen
        /   4) Ausrechnen
        /   5) Ausgeben
        */
        
        tfCompleteInSeconds.setText("");
        tfCompleteInMinutes.setText("");
        tfCompleteInHours.setText("");
        tfCompleteInDays.setText("");
        
        double broadwidth = 0, filesize = 0;
        
        try
        {
            broadwidth = Double.parseDouble(tfBroadwidth.getText());
            filesize = Double.parseDouble(tfFilesize.getText());
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Error: \n" + ex.getMessage());
            
        }
        
        System.out.println(cbBroadwidth.getSelectedIndex());
        switch(cbBroadwidth.getSelectedIndex())
        {
            case 0:{break;} // kbit/s, nix tun
            case 1:{broadwidth*=1000; break;} // mbit/s, mal 1000
            case 2:{broadwidth*=1000000; break;} // gbit/s, mal 1.000.000
        }
        
        //<editor-fold defaultstate="collapsed" desc=" Valuecheck ">
        System.out.println("Broadwidth = " + broadwidth);
        System.out.println("Filesize = " + filesize + "\n\n");
        //</editor-fold>
        
        switch(cbFilesize.getSelectedIndex())
        {
            case 0:{break;} // KByte, nix tun
            case 1:{filesize*=1000; break;} // MByte, mal 1000
            case 2:{filesize*=1000000; break;} // GByte, mal 1.000.000
            case 3:{filesize*=1000000000; break;} // TByte, mal 1.000.000.000
        }
        
        //<editor-fold defaultstate="collapsed" desc=" Valuecheck ">
        System.out.println("Broadwidth = " + broadwidth);
        System.out.println("Filesize = " + filesize + "\n\n");
        //</editor-fold>
        
        // Wie lange dauert es?
        /*
        /   filesize / broadwidth = Sekunden
        */
        
        String secondtext = "";
        double seconds = (filesize*8)/broadwidth;
        if(seconds < 0.1)
        {
            secondtext = "<0 Seconds";
        }
        else
        {
            secondtext = String.format("%.2f Seconds", seconds);
        }
        tfCompleteInSeconds.setText(secondtext);
        
        String minutetext = "";
        double minutes = ((filesize*8)/broadwidth)/60;
        if(minutes < 0.01)
        {
            minutetext = "<0 Minutes";
        }
        else
        {
            minutetext = String.format("%.2f Minutes", minutes);
        }
        tfCompleteInMinutes.setText(minutetext);
        
        String hourtext = "";
        double hours = (((filesize*8)/broadwidth)/60)/60;
        if(hours < 0.001)
        {
            hourtext = "<0 Hours";
        }
        else
        {
            hourtext = String.format("%.3f Hours", hours);
        }
        tfCompleteInHours.setText(hourtext);
        
        String daytext = "";
        double days = ((((filesize*8)/broadwidth)/60)/60)/24;
        if(days < 0.001)
        {
            daytext = "<0 Days";
        }
        else
        {
            daytext = String.format("%.4f Days", days);
        }
        tfCompleteInDays.setText(daytext);
        
        //<editor-fold defaultstate="collapsed" desc=" Valuecheck ">
        System.out.println("Broadwidth = " + broadwidth);
        System.out.println("Filesize = " + filesize);
        System.out.println("Seconds = " + seconds);
        System.out.println("Minutes = " + minutes);
        System.out.println("Hours = " + hours);
        System.out.println("Days = " + days + "\n\n");
        //</editor-fold>
    }//GEN-LAST:event_onCalculateDownloadDuration

    private void onGerman(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onGerman
        lbBroadwidth.setText("Bandbreite in");
        lbFilesize1.setText("Dateigröße in");
        lbDuration.setText("Transfer endet in");
        btCalculateDownloadDuration.setText("Berechne Downloadzeit");
    }//GEN-LAST:event_onGerman

    private void onEnglish(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onEnglish
        lbBroadwidth.setText("Broadwidth in");
        lbFilesize1.setText("Filesize in");
        lbDuration.setText("Transfer completed in");
        btCalculateDownloadDuration.setText("Calculate Download Duration");
    }//GEN-LAST:event_onEnglish

    private void onFrench(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onFrench
        lbBroadwidth.setText("Bande passante");
        lbFilesize1.setText("Taille du fichier dans");
        lbDuration.setText("Transfert achevé en");
        btCalculateDownloadDuration.setText("Calculer Télécharger Durée");
    }//GEN-LAST:event_onFrench

    private void onItalian(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onItalian
        lbBroadwidth.setText("Larghezza di banda");
        lbFilesize1.setText("Dimensioni della cartella");
        lbDuration.setText("Trasferimento finisce in");
        btCalculateDownloadDuration.setText("Calcola il tempo di download");
    }//GEN-LAST:event_onItalian

    private void onRussian(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onRussian
        lbBroadwidth.setText("ширина полосы");
        lbFilesize1.setText("Размер файла");
        lbDuration.setText("Передача заканчивается");
        btCalculateDownloadDuration.setText("Рассчитать время загрузки");
    }//GEN-LAST:event_onRussian

    private void onMandarin(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onMandarin
        lbBroadwidth.setText("帶寬");
        lbFilesize1.setText("文件大小");
        lbDuration.setText("轉讓結束");
        btCalculateDownloadDuration.setText("計算下載時間");
    }//GEN-LAST:event_onMandarin

    private void onSpanish(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onSpanish
        lbBroadwidth.setText("Ancho de banda");
        lbFilesize1.setText("Tamaño del archivo");
        lbDuration.setText("Transferencia termina en");
        btCalculateDownloadDuration.setText("Calcular el tiempo de descarga");
    }//GEN-LAST:event_onSpanish

    private void onTurkish(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onTurkish
        lbBroadwidth.setText("Bant genişliği");
        lbFilesize1.setText("Dosya boyutu");
        lbDuration.setText("Transferi biter");
        btCalculateDownloadDuration.setText("Indirme süresini hesaplayın");
    }//GEN-LAST:event_onTurkish

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCalculateDownloadDuration;
    private javax.swing.JRadioButtonMenuItem btEnglish;
    private javax.swing.JRadioButtonMenuItem btFrench;
    private javax.swing.JRadioButtonMenuItem btGerman;
    private javax.swing.JRadioButtonMenuItem btItalian;
    private javax.swing.JRadioButtonMenuItem btMandarin;
    private javax.swing.JRadioButtonMenuItem btRussian;
    private javax.swing.JRadioButtonMenuItem btSpanish;
    private javax.swing.JRadioButtonMenuItem btTurkish;
    private javax.swing.ButtonGroup btgroup;
    private javax.swing.JComboBox cbBroadwidth;
    private javax.swing.JComboBox cbFilesize;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbBroadwidth;
    private javax.swing.JLabel lbDuration;
    private javax.swing.JLabel lbFilesize1;
    private javax.swing.JTextField tfBroadwidth;
    private javax.swing.JTextField tfCompleteInDays;
    private javax.swing.JTextField tfCompleteInHours;
    private javax.swing.JTextField tfCompleteInMinutes;
    private javax.swing.JTextField tfCompleteInSeconds;
    private javax.swing.JTextField tfFilesize;
    // End of variables declaration//GEN-END:variables
}
