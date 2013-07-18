/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JFrExperimentalTools.java
 */
package info.vannier.gotha;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Luc
 */
public class JFrExperimentalTools extends javax.swing.JFrame {
    private static final long REFRESH_DELAY = 2000;
    private long lastComponentsUpdateTime = 0;
    
    private TournamentInterface tournament;

    /** Creates new form JFrVariousTools */
    public JFrExperimentalTools(TournamentInterface tournament) throws RemoteException{
        this.tournament = tournament;
                
        initComponents();
        customInitComponents();
        setupRefreshTimer();
    }    
    
    private void setupRefreshTimer() {
        ActionListener taskPerformer = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                try {
                    if (tournament.getLastTournamentModificationTime() > lastComponentsUpdateTime) {
                        updateAllViews();
                    }
                } catch (RemoteException ex) {
                    Logger.getLogger(JFrExperimentalTools.class.getName()).log(Level.SEVERE, null, ex);
                }
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

        btnShiftRatings = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnShiftNONEGFRatings = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        pnlForceASCII = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txfOrıgınal = new javax.swing.JTextField();
        btnTestconversıon = new javax.swing.JButton();
        txfConverted = new javax.swing.JTextField();
        btnForceConversion = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        pnlImportGrades = new javax.swing.JPanel();
        btnImportGrades = new javax.swing.JButton();
        pnlForceParticipation = new javax.swing.JPanel();
        btnForceParticipation = new javax.swing.JButton();
        pnlForceCase = new javax.swing.JPanel();
        btnForceCaseCountry = new javax.swing.JButton();
        btnForceCaseClub = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pnlDiscardGames = new javax.swing.JPanel();
        btnDiscardR6 = new javax.swing.JButton();
        btnDiscardR15 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        btnShiftRatings.setText("Shift ratings by +2050");
        btnShiftRatings.setEnabled(false);
        btnShiftRatings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShiftRatingsActionPerformed(evt);
            }
        });
        getContentPane().add(btnShiftRatings);
        btnShiftRatings.setBounds(10, 560, 330, 23);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Experimental tools");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 30, 320, 17);

        btnShiftNONEGFRatings.setText("Shift non-EGF ratings by +2050");
        btnShiftNONEGFRatings.setEnabled(false);
        btnShiftNONEGFRatings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShiftNONEGFRatingsActionPerformed(evt);
            }
        });
        getContentPane().add(btnShiftNONEGFRatings);
        btnShiftNONEGFRatings.setBounds(10, 590, 330, 23);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("Be cautious for use in actual tournaments");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 50, 320, 17);

        pnlForceASCII.setBorder(javax.swing.BorderFactory.createTitledBorder("Force ASCII conversion"));
        pnlForceASCII.setLayout(null);

        jLabel3.setText("This converts Latin 9  and Turkish characters");
        pnlForceASCII.add(jLabel3);
        jLabel3.setBounds(10, 30, 290, 14);

        txfOrıgınal.setText("IĞÜŞİÖÇ ığüşiöç ");
        pnlForceASCII.add(txfOrıgınal);
        txfOrıgınal.setBounds(10, 80, 290, 20);

        btnTestconversıon.setText("Test conversıon");
        btnTestconversıon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestconversıonActionPerformed(evt);
            }
        });
        pnlForceASCII.add(btnTestconversıon);
        btnTestconversıon.setBounds(10, 110, 290, 23);

        txfConverted.setBackground(new java.awt.Color(204, 255, 255));
        pnlForceASCII.add(txfConverted);
        txfConverted.setBounds(10, 140, 290, 20);

        btnForceConversion.setText("Force ASCII conversion for all players");
        btnForceConversion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForceConversionActionPerformed(evt);
            }
        });
        pnlForceASCII.add(btnForceConversion);
        btnForceConversion.setBounds(10, 190, 290, 23);

        jLabel4.setText(" into theır usual ASCII equivalent");
        pnlForceASCII.add(jLabel4);
        jLabel4.setBounds(10, 50, 290, 14);

        getContentPane().add(pnlForceASCII);
        pnlForceASCII.setBounds(360, 40, 320, 230);

        pnlImportGrades.setBorder(javax.swing.BorderFactory.createTitledBorder("Import grades"));
        pnlImportGrades.setLayout(null);

        btnImportGrades.setText("Import grades from EGF Rating list");
        btnImportGrades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportGradesActionPerformed(evt);
            }
        });
        pnlImportGrades.add(btnImportGrades);
        btnImportGrades.setBounds(10, 30, 290, 23);

        getContentPane().add(pnlImportGrades);
        pnlImportGrades.setBounds(20, 90, 320, 80);

        pnlForceParticipation.setBorder(javax.swing.BorderFactory.createTitledBorder("Force participation"));
        pnlForceParticipation.setLayout(null);

        btnForceParticipation.setText("Force participation  for all players");
        btnForceParticipation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForceParticipationActionPerformed(evt);
            }
        });
        pnlForceParticipation.add(btnForceParticipation);
        btnForceParticipation.setBounds(10, 30, 290, 23);

        getContentPane().add(pnlForceParticipation);
        pnlForceParticipation.setBounds(20, 190, 320, 80);

        pnlForceCase.setBorder(javax.swing.BorderFactory.createTitledBorder("Force case"));
        pnlForceCase.setLayout(null);

        btnForceCaseCountry.setText("Force case in country names");
        btnForceCaseCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForceCaseCountryActionPerformed(evt);
            }
        });
        pnlForceCase.add(btnForceCaseCountry);
        btnForceCaseCountry.setBounds(10, 30, 230, 23);

        btnForceCaseClub.setText("Force case in club names");
        btnForceCaseClub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForceCaseClubActionPerformed(evt);
            }
        });
        pnlForceCase.add(btnForceCaseClub);
        btnForceCaseClub.setBounds(10, 60, 230, 23);

        jLabel5.setText("Club names will be forced to \"Club\" (eg : Wars, Camb)");
        pnlForceCase.add(jLabel5);
        jLabel5.setBounds(250, 60, 350, 14);

        jLabel6.setText("Country names will be forced to Uppercase (eg : FR, DE)");
        pnlForceCase.add(jLabel6);
        jLabel6.setBounds(250, 30, 350, 14);

        getContentPane().add(pnlForceCase);
        pnlForceCase.setBounds(20, 280, 660, 100);

        pnlDiscardGames.setBorder(javax.swing.BorderFactory.createTitledBorder("Discard games"));
        pnlDiscardGames.setLayout(null);

        btnDiscardR6.setText("Discard rounds 6-...");
        btnDiscardR6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiscardR6ActionPerformed(evt);
            }
        });
        pnlDiscardGames.add(btnDiscardR6);
        btnDiscardR6.setBounds(10, 30, 230, 23);

        btnDiscardR15.setText("Discard rounds 1-5");
        btnDiscardR15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiscardR15ActionPerformed(evt);
            }
        });
        pnlDiscardGames.add(btnDiscardR15);
        btnDiscardR15.setBounds(10, 60, 230, 23);

        jLabel7.setText("Use this button to generate a \"second week\" tournament");
        pnlDiscardGames.add(jLabel7);
        jLabel7.setBounds(250, 60, 350, 14);

        jLabel8.setText("Use this button to generate a \"first week\" tournament");
        pnlDiscardGames.add(jLabel8);
        jLabel8.setBounds(250, 30, 350, 14);

        getContentPane().add(pnlDiscardGames);
        pnlDiscardGames.setBounds(20, 400, 660, 100);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnShiftRatingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShiftRatingsActionPerformed
        ArrayList<Player> alPlayers = null;
        try {
            alPlayers = tournament.playersList();
        } catch (RemoteException ex) {
            Logger.getLogger(JFrExperimentalTools.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(Player p : alPlayers){
            p.setRating(p.getRating() + 2050);
            try {
                tournament.modifyPlayer(p, p);
            } catch (TournamentException ex) {
                Logger.getLogger(JFrExperimentalTools.class.getName()).log(Level.SEVERE, null, ex);
            } catch (RemoteException ex) {
                Logger.getLogger(JFrExperimentalTools.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        tournamentChanged();
    }//GEN-LAST:event_btnShiftRatingsActionPerformed

    private void btnShiftNONEGFRatingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShiftNONEGFRatingsActionPerformed
                ArrayList<Player> alPlayers = null;
        try {
            alPlayers = tournament.playersList();
        } catch (RemoteException ex) {
            Logger.getLogger(JFrExperimentalTools.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(Player p : alPlayers){
            if (p.getRatingOrigin().equals("EGF")) continue;
            p.setRating(p.getRating() + 2050);
            try {
                tournament.modifyPlayer(p, p);
            } catch (TournamentException ex) {
                Logger.getLogger(JFrExperimentalTools.class.getName()).log(Level.SEVERE, null, ex);
            } catch (RemoteException ex) {
                Logger.getLogger(JFrExperimentalTools.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        tournamentChanged();
    }//GEN-LAST:event_btnShiftNONEGFRatingsActionPerformed

    private void btnTestconversıonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestconversıonActionPerformed
        String strOrıgınal = this.txfOrıgınal.getText();
        String strConverted = Gotha.forceToASCII(strOrıgınal);
        this.txfConverted.setText(strConverted);
    }//GEN-LAST:event_btnTestconversıonActionPerformed

    private void btnForceConversionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForceConversionActionPerformed
        ArrayList<Player> alPlayers = null;
        try {
            alPlayers = tournament.playersList();
        } catch (RemoteException ex) {
            Logger.getLogger(JFrPlayersMMG.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }
        int nbModifiedPlayers = 0;
        for (Player p : alPlayers){
            String newName = Gotha.forceToASCII(p.getName());
            String newFirstName = Gotha.forceToASCII(p.getFirstName());
            if (!newName.equals(p.getName()) || !newFirstName.equals(p.getFirstName())){
                Player newPlayer = new Player(p);
                newPlayer.setName(newName);
                newPlayer.setFirstName(newFirstName);
                try {
                    tournament.modifyPlayer(p, newPlayer);
                } catch (RemoteException ex) {
                    Logger.getLogger(JFrPlayersMMG.class.getName()).log(Level.SEVERE, null, ex);
                    continue;
                } catch (TournamentException ex) {
                    Logger.getLogger(JFrPlayersMMG.class.getName()).log(Level.SEVERE, null, ex);
                    continue;
                }
                nbModifiedPlayers++;
            }
        }
        
        String strMessage = " players have been modified";
        if (nbModifiedPlayers <= 1) strMessage = " player has been modified";
        JOptionPane.showMessageDialog(this, "" + nbModifiedPlayers + strMessage, "Message", JOptionPane.INFORMATION_MESSAGE);

        this.tournamentChanged();        
        
    }//GEN-LAST:event_btnForceConversionActionPerformed

    private void btnImportGradesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportGradesActionPerformed
        ArrayList<Player> alPlayers = null;
        try {
            alPlayers = tournament.playersList();
        } catch (RemoteException ex) {
            Logger.getLogger(JFrExperimentalTools.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        RatingList ratingList = new RatingList(RatingList.TYPE_EGF, new File(Gotha.runningDirectory, "ratinglists/egf_db.txt"));
        ArrayList<RatedPlayer> alRP = ratingList.getALRatedPlayers();
        
        int nbGradesSetOrChanged = 0;
        int nbPlayersNotFound = 0;
        
        
        for (Player  p: alPlayers){
            String strName = p.getName();
            String strFirstName = p.getFirstName();
            
            boolean bFound = false;
            for (RatedPlayer rp:alRP){
                if(!strName.equals(rp.getName())) continue;
                if(!strFirstName.equals(rp.getFirstName())) continue;
                bFound = true;
                int oldGrade = p.getGrade();
                int newGrade = rp.getGrade();
                p.setGrade(newGrade);
                if (newGrade != RatedPlayer.GRADE_NOT_RELEVANT && newGrade != oldGrade){
                    try {
                        tournament.modifyPlayer(p, p);
                    } catch (TournamentException ex) {
                        Logger.getLogger(JFrExperimentalTools.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (RemoteException ex) {
                        Logger.getLogger(JFrExperimentalTools.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    nbGradesSetOrChanged++;
                }
                
                break;             
            }
            if (!bFound){
//                System.out.println(strName + " " + strFirstName +" not found");
                nbPlayersNotFound++;
            }
            
        }
        
        tournamentChanged();
        
        String str ="" + nbGradesSetOrChanged + " grades have been set or changed";
        if (nbPlayersNotFound != 0){
            str += "\n\n" + nbPlayersNotFound + " players have not been found in the rating list";
            JOptionPane.showMessageDialog(this, str);
        }
        
 
    }//GEN-LAST:event_btnImportGradesActionPerformed

    private void btnForceParticipationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForceParticipationActionPerformed
        ArrayList<Player> alPlayers = null;
        try {
            alPlayers = tournament.playersList();
        } catch (RemoteException ex) {
            Logger.getLogger(JFrExperimentalTools.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        boolean[] bPart = new boolean[Gotha.MAX_NUMBER_OF_ROUNDS];
            for (int i = 0; i < Gotha.MAX_NUMBER_OF_ROUNDS; i++) {
                bPart[i] = true;
            }

        for (Player  p: alPlayers){
            p.setParticipating(bPart);
            try {
                tournament.modifyPlayer(p, p);
            } catch (TournamentException ex) {
                Logger.getLogger(JFrExperimentalTools.class.getName()).log(Level.SEVERE, null, ex);
            } catch (RemoteException ex) {
                Logger.getLogger(JFrExperimentalTools.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            
        
        tournamentChanged();            
        
    }//GEN-LAST:event_btnForceParticipationActionPerformed

    private void btnForceCaseCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForceCaseCountryActionPerformed
        ArrayList<Player> alPlayers = null;
        try {
            alPlayers = tournament.playersList();
        } catch (RemoteException ex) {
            Logger.getLogger(JFrExperimentalTools.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for (Player  p: alPlayers){
            String strCountry = p.getCountry();
            strCountry = strCountry.toUpperCase();
            p.setCountry(strCountry);
            try {
                tournament.modifyPlayer(p, p);
            } catch (TournamentException ex) {
                Logger.getLogger(JFrExperimentalTools.class.getName()).log(Level.SEVERE, null, ex);
            } catch (RemoteException ex) {
                Logger.getLogger(JFrExperimentalTools.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            
        tournamentChanged();            
    }//GEN-LAST:event_btnForceCaseCountryActionPerformed

    private void btnForceCaseClubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForceCaseClubActionPerformed
        ArrayList<Player> alPlayers = null;
        try {
            alPlayers = tournament.playersList();
        } catch (RemoteException ex) {
            Logger.getLogger(JFrExperimentalTools.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for (Player  p: alPlayers){
            String strClub = p.getClub();
            if (strClub.length() < 1) continue;
            String strClub1 = strClub.substring(0,1).toUpperCase();
            String strClub2 = "";
            if (strClub.length() > 1) strClub2 = strClub.substring(1).toLowerCase();
            strClub = strClub1 + strClub2;
            p.setClub(strClub);
            try {
                tournament.modifyPlayer(p, p);
            } catch (TournamentException ex) {
                Logger.getLogger(JFrExperimentalTools.class.getName()).log(Level.SEVERE, null, ex);
            } catch (RemoteException ex) {
                Logger.getLogger(JFrExperimentalTools.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        tournamentChanged();      
    }//GEN-LAST:event_btnForceCaseClubActionPerformed

    private void btnDiscardR6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiscardR6ActionPerformed
        ArrayList<Game> alGames = null;
        try {
            alGames = tournament.gamesList();
        } catch (RemoteException ex) {
            Logger.getLogger(JFrExperimentalTools.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        int nbDiscardedGames = 0;
        for (Game g : alGames){
            int r = g.getRoundNumber();
            if (r > 4) try {
                tournament.removeGame(g);
                nbDiscardedGames++;
            } catch (TournamentException ex) {
                Logger.getLogger(JFrExperimentalTools.class.getName()).log(Level.SEVERE, null, ex);
            } catch (RemoteException ex) {
                Logger.getLogger(JFrExperimentalTools.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        tournamentChanged();
        JOptionPane.showMessageDialog(this, "" + nbDiscardedGames + " games have been discarded");
        
        
    }//GEN-LAST:event_btnDiscardR6ActionPerformed

    private void btnDiscardR15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiscardR15ActionPerformed
        ArrayList<Game> alGames = null;
        try {
            alGames = tournament.gamesList();
        } catch (RemoteException ex) {
            Logger.getLogger(JFrExperimentalTools.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        int nbDiscardedGames = 0;
        for (Game g : alGames){
            int r = g.getRoundNumber();
            if (r < 5) try {
                tournament.removeGame(g);
                nbDiscardedGames++;
            } catch (TournamentException ex) {
                Logger.getLogger(JFrExperimentalTools.class.getName()).log(Level.SEVERE, null, ex);
            } catch (RemoteException ex) {
                Logger.getLogger(JFrExperimentalTools.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         
        // And now shift games of rounds 5-...
        try {
            alGames = tournament.gamesList();
        } catch (RemoteException ex) {
            Logger.getLogger(JFrExperimentalTools.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for (Game g : alGames){
            int r = g.getRoundNumber();
            try {
                tournament.removeGame(g);
                g.setRoundNumber(r - 5);
                tournament.addGame(g);
            } catch (TournamentException ex) {
                Logger.getLogger(JFrExperimentalTools.class.getName()).log(Level.SEVERE, null, ex);
            } catch (RemoteException ex) {
                Logger.getLogger(JFrExperimentalTools.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                
        tournamentChanged();
        JOptionPane.showMessageDialog(this, "" + nbDiscardedGames + " games have been discarded");
    }//GEN-LAST:event_btnDiscardR15ActionPerformed

        /** This method is called from within the constructor to
     * initialize the form.
     * Unlike initComponents, customInitComponents is editable
     */
    private void customInitComponents() throws RemoteException {
        int w = JFrGotha.MEDIUM_FRAME_WIDTH;
        int h = JFrGotha.MEDIUM_FRAME_HEIGHT;
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((dim.width - w) / 2, (dim.height - h) / 2, w, h);

        setIconImage(Gotha.getIconImage());
 
        updateComponents();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDiscardR15;
    private javax.swing.JButton btnDiscardR6;
    private javax.swing.JButton btnForceCaseClub;
    private javax.swing.JButton btnForceCaseCountry;
    private javax.swing.JButton btnForceConversion;
    private javax.swing.JButton btnForceParticipation;
    private javax.swing.JButton btnImportGrades;
    private javax.swing.JButton btnShiftNONEGFRatings;
    private javax.swing.JButton btnShiftRatings;
    private javax.swing.JButton btnTestconversıon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel pnlDiscardGames;
    private javax.swing.JPanel pnlForceASCII;
    private javax.swing.JPanel pnlForceCase;
    private javax.swing.JPanel pnlForceParticipation;
    private javax.swing.JPanel pnlImportGrades;
    private javax.swing.JTextField txfConverted;
    private javax.swing.JTextField txfOrıgınal;
    // End of variables declaration//GEN-END:variables


    private void updateAllViews() {
        try {
            if (!tournament.isOpen()) dispose();
            this.lastComponentsUpdateTime = tournament.getCurrentTournamentTime();
            setTitle("Experimental tools");
        } catch (RemoteException ex) {
            Logger.getLogger(JFrExperimentalTools.class.getName()).log(Level.SEVERE, null, ex);
        }
        updateComponents();
    }
    
    private void updateComponents(){

    }
    
    private void tournamentChanged(){
        try {
            tournament.setLastTournamentModificationTime(tournament.getCurrentTournamentTime());
        } catch (RemoteException ex) {
            ex.printStackTrace();
        }
//        updateAllViews();
    }

}
