/**
 * TER Lego 2015 - Université Paul Sabatier
 * @author LACHERAY Benjamin, ANTOINE Kevin, MOUGEOT Matteo
 * 
 */

package bluetoothMapperView;

/**
 * Permet de dessiner l'interface ainsi que de gérer 
 * les événements associer aux boutons.
 * Généré en parti avec Netbeans, code pas très lisible...
 * 
 */
@SuppressWarnings("serial")
public class Window extends javax.swing.JFrame {

    private int lastHeight = 0;
    private int lastWidth = 0;
    private NxtConnexion nxt;
    private boolean microMode = false;
    
    /**
     * Creates new form NewJFrame
     */
    public Window(NxtConnexion nxt) {
    	this.nxt = nxt;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane = new javax.swing.JTabbedPane();
        jPanelMapView = new javax.swing.JPanel();
        LabyrintheEtAffichage = new bluetoothMapperView.LabyrintheEtAffichage();
        jPanelInfos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        phase = new javax.swing.JLabel();
        jPanelBackdoor = new javax.swing.JPanel();
        jButtonAvancer = new javax.swing.JButton();
        jButtonGauche = new javax.swing.JButton();
        jButtonDroite = new javax.swing.JButton();
        jButtonDemiTour = new javax.swing.JButton();
        jButtonParler = new javax.swing.JButton();
        jToggleButtonMicro = new javax.swing.JToggleButton();
        jButtonReculer = new javax.swing.JButton();
        jToggleButtonControl = new javax.swing.JToggleButton();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuFichier = new javax.swing.JMenu();
        jMenuItemConnexion = new javax.swing.JMenuItem();
        jMenuItemDeconnexion = new javax.swing.JMenuItem();
        jMenuItemQuitter = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bluetooth Mapper View");
        setMinimumSize(new java.awt.Dimension(200, 200));

        jTabbedPane.setMinimumSize(new java.awt.Dimension(0, 0));

        jPanelMapView.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelMapViewComponentShown(evt);
            }
        });

        LabyrintheEtAffichage.setMinimumSize(new java.awt.Dimension(0, 0));
        LabyrintheEtAffichage.setPreferredSize(new java.awt.Dimension(0, 0));

        javax.swing.GroupLayout jPanelLabyrintheLayout = new javax.swing.GroupLayout(LabyrintheEtAffichage);
        LabyrintheEtAffichage.setLayout(jPanelLabyrintheLayout);
        jPanelLabyrintheLayout.setHorizontalGroup(
            jPanelLabyrintheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelLabyrintheLayout.setVerticalGroup(
            jPanelLabyrintheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 338, Short.MAX_VALUE)
        );

        jLabel1.setText("Phase : ");

        phase.setText("1");

        javax.swing.GroupLayout jPanelInfosLayout = new javax.swing.GroupLayout(jPanelInfos);
        jPanelInfos.setLayout(jPanelInfosLayout);
        jPanelInfosLayout.setHorizontalGroup(
            jPanelInfosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phase)
                .addContainerGap(680, Short.MAX_VALUE))
        );
        jPanelInfosLayout.setVerticalGroup(
            jPanelInfosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelInfosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(phase))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelMapViewLayout = new javax.swing.GroupLayout(jPanelMapView);
        jPanelMapView.setLayout(jPanelMapViewLayout);
        jPanelMapViewLayout.setHorizontalGroup(
            jPanelMapViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelInfos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LabyrintheEtAffichage, javax.swing.GroupLayout.DEFAULT_SIZE, 823, Short.MAX_VALUE)
        );
        jPanelMapViewLayout.setVerticalGroup(
            jPanelMapViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMapViewLayout.createSequentialGroup()
                .addComponent(LabyrintheEtAffichage, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelInfos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane.addTab("Map view", jPanelMapView);

        jPanelBackdoor.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelBackdoorComponentShown(evt);
            }
        });

        jButtonAvancer.setText("Avancer");
        jButtonAvancer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAvancerActionPerformed(evt);
            }
        });

        jButtonGauche.setText("Gauche");
        jButtonGauche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGaucheActionPerformed(evt);
            }
        });

        jButtonDroite.setText("Droite");
        jButtonDroite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDroiteActionPerformed(evt);
            }
        });

        jButtonDemiTour.setText("Demi tour");
        jButtonDemiTour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDemiTourActionPerformed(evt);
            }
        });

        jButtonParler.setText("Parler");
        jButtonParler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonParlerActionPerformed(evt);
            }
        });

        jToggleButtonMicro.setText("Micro mode");
        jToggleButtonMicro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonMicroActionPerformed(evt);
            }
        });

        jButtonReculer.setText("Reculer");
        jButtonReculer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReculerActionPerformed(evt);
            }
        });

        jToggleButtonControl.setText("Prendre le controle");
        jToggleButtonControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonControlActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBackdoorLayout = new javax.swing.GroupLayout(jPanelBackdoor);
        jPanelBackdoor.setLayout(jPanelBackdoorLayout);
        jPanelBackdoorLayout.setHorizontalGroup(
            jPanelBackdoorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackdoorLayout.createSequentialGroup()
                .addGroup(jPanelBackdoorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBackdoorLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanelBackdoorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonGauche, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonParler, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(169, 169, 169)
                        .addGroup(jPanelBackdoorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonDroite, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonDemiTour, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelBackdoorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelBackdoorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jToggleButtonMicro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButtonControl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(71, 71, 71)
                        .addGroup(jPanelBackdoorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonReculer, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAvancer, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(309, Short.MAX_VALUE))
        );

        jPanelBackdoorLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonAvancer, jButtonDemiTour, jButtonDroite, jButtonGauche, jButtonParler, jButtonReculer});

        jPanelBackdoorLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jToggleButtonControl, jToggleButtonMicro});

        jPanelBackdoorLayout.setVerticalGroup(
            jPanelBackdoorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackdoorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToggleButtonControl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanelBackdoorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAvancer)
                    .addComponent(jToggleButtonMicro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanelBackdoorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGauche)
                    .addComponent(jButtonDroite))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonReculer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelBackdoorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDemiTour)
                    .addComponent(jButtonParler))
                .addContainerGap(223, Short.MAX_VALUE))
        );

        jPanelBackdoorLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonAvancer, jButtonDemiTour, jButtonDroite, jButtonGauche, jButtonParler, jButtonReculer, jToggleButtonControl, jToggleButtonMicro});

        jTabbedPane.addTab("Backdoor", jPanelBackdoor);

        jMenuFichier.setText("Fichier");

        jMenuItemConnexion.setText("Connexion");
        jMenuItemConnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConnexionActionPerformed(evt);
            }
        });
        jMenuFichier.add(jMenuItemConnexion);

        jMenuItemDeconnexion.setText("Déconnexion");
        jMenuItemDeconnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDeconnexionActionPerformed(evt);
            }
        });
        jMenuFichier.add(jMenuItemDeconnexion);

        jMenuItemQuitter.setText("Quitter");
        jMenuItemQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemQuitterActionPerformed(evt);
            }
        });
        jMenuFichier.add(jMenuItemQuitter);

        jMenuBar.add(jMenuFichier);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelMapViewComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelMapViewComponentShown
        this.setResizable(true);
        if (lastHeight != 0) {
            this.setSize(lastWidth, lastHeight);
        }
    }

    private void jPanelBackdoorComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelBackdoorComponentShown
        lastHeight = this.getHeight();
        lastWidth = this.getWidth();
        this.setResizable(false);
        this.setSize(575, 320);
    }

    private void jMenuItemConnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConnexionActionPerformed
        nxt.connexion();
    }

    private void jMenuItemDeconnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDeconnexionActionPerformed
    	nxt.deconnexion();
    }

    private void jMenuItemQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemQuitterActionPerformed
        dispose();
    }

    private void jToggleButtonControlActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        nxt.send(7);
    }                                                    

    private void jToggleButtonMicroActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        microMode = !microMode;
    }                                                  

    private void jButtonAvancerActionPerformed(java.awt.event.ActionEvent evt) {                                               
        nxt.send(1);
    }                                              

    private void jButtonDroiteActionPerformed(java.awt.event.ActionEvent evt) {                                              
    	nxt.send(2);
    }                                             

    private void jButtonGaucheActionPerformed(java.awt.event.ActionEvent evt) {                                              
    	nxt.send(3);
    }                                             

    private void jButtonReculerActionPerformed(java.awt.event.ActionEvent evt) {                                               
    	nxt.send(4);
    }                                              

    private void jButtonParlerActionPerformed(java.awt.event.ActionEvent evt) {                                              
    	nxt.send(5);
    }                                             

    private void jButtonDemiTourActionPerformed(java.awt.event.ActionEvent evt) {                                                
    	nxt.send(6);
    }                      

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAvancer;
    private javax.swing.JButton jButtonDemiTour;
    private javax.swing.JButton jButtonDroite;
    private javax.swing.JButton jButtonGauche;
    private javax.swing.JButton jButtonParler;
    private javax.swing.JButton jButtonReculer;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel phase;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuFichier;
    private javax.swing.JMenuItem jMenuItemConnexion;
    private javax.swing.JMenuItem jMenuItemDeconnexion;
    private javax.swing.JMenuItem jMenuItemQuitter;
    private javax.swing.JPanel jPanelBackdoor;
    private javax.swing.JPanel jPanelInfos;
    public bluetoothMapperView.LabyrintheEtAffichage LabyrintheEtAffichage;
    private javax.swing.JPanel jPanelMapView;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JToggleButton jToggleButtonControl;
    private javax.swing.JToggleButton jToggleButtonMicro;
    // End of variables declaration//GEN-END:variables
}
