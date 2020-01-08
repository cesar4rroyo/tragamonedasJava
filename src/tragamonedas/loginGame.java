/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tragamonedas;

import com.sun.awt.AWTUtilities;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author User
 */
public class loginGame extends javax.swing.JFrame {

    /**
     * Creates new form loginGame
     */
    private Timer t;
    private ActionListener ev;
    int x = 0;

    public loginGame() {
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        AWTUtilities.setWindowOpaque(this, false);
        this.inicarEstados();
        setIconImage(new ImageIcon(getClass().getResource("./img/bravo.jpg")).getImage());

    }

    public void inicarEstados() {
        this.cargarBarra.setVisible(false);
        this.ingreseMonedas.setVisible(false);
        this.ingreseNombre.setVisible(false);
        this.cargandoLabel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cargandoLabel = new javax.swing.JLabel();
        ingreseNombre = new javax.swing.JLabel();
        ingreseMonedas = new javax.swing.JLabel();
        nombreField = new javax.swing.JTextField();
        cargarBarra = new javax.swing.JProgressBar();
        monedasField = new javax.swing.JTextField();
        empezarBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(714, 350));
        setSize(new java.awt.Dimension(714, 350));
        getContentPane().setLayout(null);

        cargandoLabel.setBackground(new java.awt.Color(255, 255, 255));
        cargandoLabel.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        cargandoLabel.setForeground(new java.awt.Color(255, 255, 255));
        cargandoLabel.setText("Loading ...");
        getContentPane().add(cargandoLabel);
        cargandoLabel.setBounds(10, 310, 270, 19);

        ingreseNombre.setBackground(new java.awt.Color(255, 255, 255));
        ingreseNombre.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        ingreseNombre.setForeground(new java.awt.Color(255, 255, 255));
        ingreseNombre.setText("Ingrese Nombre");
        getContentPane().add(ingreseNombre);
        ingreseNombre.setBounds(450, 110, 160, 17);

        ingreseMonedas.setBackground(new java.awt.Color(255, 255, 255));
        ingreseMonedas.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        ingreseMonedas.setForeground(new java.awt.Color(255, 255, 255));
        ingreseMonedas.setText("Ingrese Monedas");
        getContentPane().add(ingreseMonedas);
        ingreseMonedas.setBounds(450, 230, 170, 17);

        nombreField.setBackground(new java.awt.Color(255, 255, 255));
        nombreField.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        nombreField.setForeground(new java.awt.Color(51, 51, 51));
        nombreField.setBorder(null);
        nombreField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreFieldActionPerformed(evt);
            }
        });
        nombreField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreFieldKeyTyped(evt);
            }
        });
        getContentPane().add(nombreField);
        nombreField.setBounds(450, 70, 200, 30);

        cargarBarra.setMaximum(50);
        getContentPane().add(cargarBarra);
        cargarBarra.setBounds(0, 330, 390, 12);

        monedasField.setBackground(new java.awt.Color(255, 255, 255));
        monedasField.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        monedasField.setForeground(new java.awt.Color(51, 51, 51));
        monedasField.setBorder(null);
        monedasField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                monedasFieldKeyTyped(evt);
            }
        });
        getContentPane().add(monedasField);
        monedasField.setBounds(450, 190, 200, 30);

        empezarBtn.setBorder(null);
        empezarBtn.setBorderPainted(false);
        empezarBtn.setContentAreaFilled(false);
        empezarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empezarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(empezarBtn);
        empezarBtn.setBounds(470, 270, 170, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tragamonedas/img/login2.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 714, 345);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void monedasFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_monedasFieldKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_monedasFieldKeyTyped

    private void empezarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empezarBtnActionPerformed
        // TODO add your handling code here:
        if (this.nombreField.getText().isEmpty()) {
            this.setVisible(true);
            this.ingreseNombre.setVisible(true);
        }
        else if (this.monedasField.getText().isEmpty() || Integer.parseInt(this.monedasField.getText()) == 0) {
            this.setVisible(true);
            this.ingreseMonedas.setVisible(true);
        } else {
            
            this.cargarBarra.setVisible(true);
            cargandoLabel.setVisible(true);
            ev = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    x = x + 1;
                    cargarBarra.setValue(x);
                    
                    if (cargarBarra.getValue()==15) {
                        cargandoLabel.setText("Cargando Componentes ... ");
                    }
                    if (cargarBarra.getValue()==25) {
                        cargandoLabel.setText("Cargando Cartas ...");
                    }
                    if (cargarBarra.getValue()==45) {
                        cargandoLabel.setText("Loading ... ");
                    }
                    
                    if (cargarBarra.getValue() == 50) {
                        dispose();
                        Tragamonedas iniciarJuego = new Tragamonedas();
                        iniciarJuego.nombreJugador=nombreField.getText();
                        iniciarJuego.monedas=monedasField.getText();
                        iniciarJuego.puntos=Integer.parseInt(iniciarJuego.monedas);                       
                        iniciarJuego.setVisible(true);
                        iniciarJuego.puntajeLabel.setText(iniciarJuego.monedas);
                        
                        t.stop();
                    }

                }
            };
            t = new Timer(100, ev);
            t.start();
        }

    }//GEN-LAST:event_empezarBtnActionPerformed

    private void nombreFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreFieldActionPerformed

    private void nombreFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreFieldKeyTyped
        // TODO add your handling code here:
        if (nombreField.getText().length()>4) {
            evt.consume();
                   
        }
    }//GEN-LAST:event_nombreFieldKeyTyped

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
            java.util.logging.Logger.getLogger(loginGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cargandoLabel;
    private javax.swing.JProgressBar cargarBarra;
    private javax.swing.JButton empezarBtn;
    private javax.swing.JLabel ingreseMonedas;
    private javax.swing.JLabel ingreseNombre;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JTextField monedasField;
    public javax.swing.JTextField nombreField;
    // End of variables declaration//GEN-END:variables
}