/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package songplaylistca.Classes;

import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class PlaylistGUI extends javax.swing.JFrame {
    private PlaylistQueue playlist;
    private boolean repeatGo = true;

    /**
     * Creates new form PlaylistGUI
     */
    public PlaylistGUI() {
        initComponents();
        //manages playlist
        playlist = new PlaylistQueue(area);
        // Sets background color to purple
        getContentPane().setBackground(new java.awt.Color(51, 0, 51)); 
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        addBtn = new javax.swing.JButton();
        addTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        viewBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        moveBtn = new javax.swing.JButton();
        genreBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        sizeBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        exitBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        searchBtn = new javax.swing.JButton();
        repeat = new javax.swing.JRadioButton();

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addBtn.setBackground(new java.awt.Color(102, 0, 102));
        addBtn.setForeground(new java.awt.Color(255, 255, 255));
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        getContentPane().add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 60, -1));

        addTF.setBackground(new java.awt.Color(255, 255, 204));
        getContentPane().add(addTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 150, 30));

        jLabel1.setBackground(new java.awt.Color(0, 0, 204));
        jLabel1.setFont(new java.awt.Font("Agency FB", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add Song Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 120, -1));

        viewBtn.setBackground(new java.awt.Color(102, 0, 102));
        viewBtn.setForeground(new java.awt.Color(255, 255, 255));
        viewBtn.setText("View");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });
        getContentPane().add(viewBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        deleteBtn.setBackground(new java.awt.Color(102, 0, 102));
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        getContentPane().add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 90, -1));

        moveBtn.setBackground(new java.awt.Color(102, 0, 102));
        moveBtn.setForeground(new java.awt.Color(255, 255, 255));
        moveBtn.setText("Move to Genre");
        moveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveBtnActionPerformed(evt);
            }
        });
        getContentPane().add(moveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, -1, -1));

        genreBox.setBackground(new java.awt.Color(0, 0, 51));
        genreBox.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        genreBox.setForeground(new java.awt.Color(255, 255, 255));
        genreBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pop", "Rock" }));
        getContentPane().add(genreBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        jLabel2.setFont(new java.awt.Font("Agency FB", 2, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Select Genre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 110, -1));

        sizeBtn.setBackground(new java.awt.Color(102, 0, 102));
        sizeBtn.setForeground(new java.awt.Color(255, 255, 255));
        sizeBtn.setText("Size of Licked List");
        sizeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sizeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(sizeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/songplaylistca/pp.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 20, 396, 120));

        area.setBackground(new java.awt.Color(255, 204, 204));
        area.setColumns(20);
        area.setRows(5);
        jScrollPane4.setViewportView(area);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 340, 250));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/songplaylistca/musicnote.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, -30, 250, 180));

        exitBtn.setBackground(new java.awt.Color(102, 0, 102));
        exitBtn.setForeground(new java.awt.Color(255, 255, 255));
        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 480, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/songplaylistca/banner.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, 0, 1120, 200));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 550, -1, -1));

        searchBtn.setBackground(new java.awt.Color(102, 0, 102));
        searchBtn.setForeground(new java.awt.Color(255, 255, 255));
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        getContentPane().add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, -1));

        repeat.setBackground(new java.awt.Color(102, 0, 102));
        repeat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        repeat.setForeground(new java.awt.Color(255, 255, 255));
        repeat.setText("repeat");
        repeat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repeatActionPerformed(evt);
            }
        });
        getContentPane().add(repeat, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //Action listerners for the buttons
    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        
        //gets the textfield and selection box 
        String songName = addTF.getText();
        String genre = genreBox.getSelectedItem().toString();
        
        //checks if empty
        if(songName.isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter a song name.");
            //if song is the same this appears
        } else if (playlist.hasSong(songName)) {
            JOptionPane.showMessageDialog(null, "That song already exists in the playlist enter another song");
        } else {
            SongsClass song = new SongsClass(songName, genre);
            //adds song
            playlist.enqueue(song);
            JOptionPane.showMessageDialog(null, "Song added successfully.");
        }
      
    }//GEN-LAST:event_addBtnActionPerformed

    private void moveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveBtnActionPerformed
        // TODO add your handling code here:
        
        //if genre selected it moves to new list depending on genre
        String selectedGenre = genreBox.getSelectedItem().toString();
        playlist.moveSong(selectedGenre);
        JOptionPane.showMessageDialog(null, "Songs moved to " + selectedGenre + " genre.");
        
        
    }//GEN-LAST:event_moveBtnActionPerformed

    private void sizeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sizeBtnActionPerformed
        // TODO add your handling code here:
        
        //gives you size of main list
        int size = playlist.listsize();
        JOptionPane.showMessageDialog(this, "Number of songs in the liked list: " + size);
        
    }//GEN-LAST:event_sizeBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        
        //if empty then enter name
        if (!playlist.isEmpty()) {
            JOptionPane.showInputDialog(null, "Enter name of Song");
            //removes from list using dequeue
            SongsClass deleteSong = (SongsClass) playlist.dequeue();
            JOptionPane.showMessageDialog(null, "Removed: " + deleteSong.toString());
        }else  {
            JOptionPane.showMessageDialog(null, "No songs in the queue.");
        }

    }//GEN-LAST:event_deleteBtnActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        // TODO add your handling code here:
        
        //Clears the playlist content
        area.setText("");
        //then displays by using playlist class method display
        area.setText(playlist.display());

    }//GEN-LAST:event_viewBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        String songName = JOptionPane.showInputDialog(null, "Enter the song name to search:");

        //Check if the search is empty
        if (songName != null && !songName.isEmpty()) {
            
            //Performs the search linked method from playlist class
            String searchResult = playlist.search(songName);

            // Displays search result
            if (searchResult != null) {
                JOptionPane.showMessageDialog(null, "Song found:\n" + searchResult);
            }else {
                JOptionPane.showMessageDialog(null, "Song not found.");
            }
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
        
        //systems exists while saying goodbye
        JOptionPane.showMessageDialog(null, "Good Bye");
        System.exit(0);
        
    }//GEN-LAST:event_exitBtnActionPerformed

    private void repeatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repeatActionPerformed
        // TODO add your handling code here:
        repeatGo = repeat.isSelected();
   
    }//GEN-LAST:event_repeatActionPerformed

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
            java.util.logging.Logger.getLogger(PlaylistGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlaylistGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlaylistGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlaylistGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlaylistGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField addTF;
    private javax.swing.JTextArea area;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JComboBox<String> genreBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JButton moveBtn;
    private javax.swing.JRadioButton repeat;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton sizeBtn;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}
