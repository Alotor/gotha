/*
 * JFrPreferences.java
 */

package info.vannier.gotha;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;

/**
 *
 * @author Luc
 */
public class JFrPreferencesOptions extends javax.swing.JFrame {
    private static final long REFRESH_DELAY = 2000;

    /** Creates new form JFrPreferences */
    public JFrPreferencesOptions() {
        initComponents();
        customInitComponents();
        setupRefreshPreferencesTimer();
    }

    // This setupRefreshTimer is dedicated to refresh Preferences and not Tournament data
    private void setupRefreshPreferencesTimer() {
        ActionListener taskPerformer = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                updateAllViews();
            }
        };
        new javax.swing.Timer((int) REFRESH_DELAY, taskPerformer).start();
    
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpHelpLanguage = new javax.swing.ButtonGroup();
        pnlPref = new javax.swing.JPanel();
        btnQuit = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        pnlInternetAccess = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ckbJournaling = new javax.swing.JCheckBox();
        ckbRatingLists = new javax.swing.JCheckBox();
        ckbPhotos = new javax.swing.JCheckBox();
        btnHelp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Preferences");
        setResizable(false);
        getContentPane().setLayout(null);

        pnlPref.setLayout(null);

        btnQuit.setText("Close");
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });
        pnlPref.add(btnQuit);
        btnQuit.setBounds(150, 280, 250, 30);

        btnClear.setText("Clear OpenGotha Preferences");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        pnlPref.add(btnClear);
        btnClear.setBounds(20, 20, 380, 30);

        pnlInternetAccess.setBorder(javax.swing.BorderFactory.createTitledBorder("Internet access"));
        pnlInternetAccess.setLayout(null);

        jLabel1.setText("Enable Internet access for :");
        pnlInternetAccess.add(jLabel1);
        jLabel1.setBounds(10, 30, 220, 14);

        ckbJournaling.setSelected(true);
        ckbJournaling.setText("Journaling report");
        ckbJournaling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbJournalingActionPerformed(evt);
            }
        });
        pnlInternetAccess.add(ckbJournaling);
        ckbJournaling.setBounds(30, 110, 170, 23);

        ckbRatingLists.setSelected(true);
        ckbRatingLists.setText("Rating lists download");
        ckbRatingLists.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbRatingListsActionPerformed(evt);
            }
        });
        pnlInternetAccess.add(ckbRatingLists);
        ckbRatingLists.setBounds(30, 50, 170, 23);

        ckbPhotos.setSelected(true);
        ckbPhotos.setText("Photos download");
        ckbPhotos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbPhotosActionPerformed(evt);
            }
        });
        pnlInternetAccess.add(ckbPhotos);
        ckbPhotos.setBounds(30, 80, 170, 23);

        pnlPref.add(pnlInternetAccess);
        pnlInternetAccess.setBounds(10, 100, 390, 150);

        btnHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/info/vannier/gotha/gothalogo16.jpg"))); // NOI18N
        btnHelp.setText("help");
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });
        pnlPref.add(btnHelp);
        btnHelp.setBounds(20, 280, 120, 30);

        getContentPane().add(pnlPref);
        pnlPref.setBounds(0, 0, 410, 320);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
        dispose();
}//GEN-LAST:event_btnQuitActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        Preferences prefsRoot = Preferences.userRoot();
        Preferences gothaPrefs = prefsRoot.node(Gotha.strPreferences);
        try {
            gothaPrefs.clear();
        } catch (BackingStoreException ex) {
            Logger.getLogger(JFrPreferencesOptions.class.getName()).log(Level.SEVERE, null, ex);
        }
        Gotha.setRatingListsDownloadEnabled(true);
        Gotha.setPhotosDownloadEnabled(true);
        Gotha.setJournalingReportEnabled(true);

        updatePnlPref();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpActionPerformed
        Gotha.displayGothaHelp("Preferences frame");
}//GEN-LAST:event_btnHelpActionPerformed

    private void ckbJournalingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbJournalingActionPerformed
        Gotha.setJournalingReportEnabled(this.ckbJournaling.isSelected());
    }//GEN-LAST:event_ckbJournalingActionPerformed

    private void ckbPhotosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbPhotosActionPerformed
         Gotha.setPhotosDownloadEnabled(this.ckbPhotos.isSelected());
    }//GEN-LAST:event_ckbPhotosActionPerformed

    private void ckbRatingListsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbRatingListsActionPerformed
        Gotha.setRatingListsDownloadEnabled(this.ckbRatingLists.isSelected());
    }//GEN-LAST:event_ckbRatingListsActionPerformed

    private void customInitComponents(){
        int w = JFrGotha.MEDIUM_FRAME_WIDTH;
        int h = JFrGotha.MEDIUM_FRAME_HEIGHT;
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((dim.width - w)/2, (dim.height -h)/2, w, h);

        setIconImage(Gotha.getIconImage());
        this.updatePnlPref();
    }
    private void updateAllViews(){
        updatePnlPref();
    }
    private void updatePnlPref(){
        this.ckbRatingLists.setSelected(Gotha.isRatingListsDownloadEnabled());
        this.ckbPhotos.setSelected(Gotha.isPhotosDownloadEnabled());
        this.ckbJournaling.setSelected(Gotha.isJournalingReportEnabled());
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnQuit;
    private javax.swing.JCheckBox ckbJournaling;
    private javax.swing.JCheckBox ckbPhotos;
    private javax.swing.JCheckBox ckbRatingLists;
    private javax.swing.ButtonGroup grpHelpLanguage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel pnlInternetAccess;
    private javax.swing.JPanel pnlPref;
    // End of variables declaration//GEN-END:variables

}
