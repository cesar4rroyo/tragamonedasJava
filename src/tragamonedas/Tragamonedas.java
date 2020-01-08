package tragamonedas;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.Arrays;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import tragamonedas.baraja;
import tragamonedas.condiciones;
import javax.swing.Timer;

/**
 *
 * @author Cesar
 */
public class Tragamonedas extends javax.swing.JFrame {

    //Declaracion de Variables
    public String nombreJugador;
    baraja carta;
    public String monedas;
    public int puntos;
    String ganador;
    String ruta = "E:\\tragamonedas\\src\\tragamonedas\\img\\baraja\\"; //Modificar ruta de acuerdo a la ubicacion del archivo
    int count = 1;
    int i = 1;
    private Timer t;
    private ActionListener ev;
    JFigura figura1 = new JFigura();
    JFigura figura2 = new JFigura();
    JFigura figura3 = new JFigura();

    //Constructor
    public Tragamonedas() {
        this.setTitle("UNPRG Slots");
        initComponents();
        this.setLocationRelativeTo(null);
        this.startGame();
        setIconImage(new ImageIcon(getClass().getResource("./img/bravo.jpg")).getImage());
        this.iniciarEstados();

    }

    //Construccion de Metodos 
    private void startGame() {
        carta = new baraja();
    }

    private void iniciarEstados() {
        this.jPane1.setVisible(false);
        this.jPane2.setVisible(false);
        this.jPane3.setVisible(false);
        this.labelMuestraPuntos.setVisible(false);
        this.sumaPuntos.setVisible(false);
    }

    private void cambiarEstados() {
        this.jPane1.setVisible(true);
        this.jPane2.setVisible(true);
        this.jPane3.setVisible(true);
    }

    private void agregarPanel() {
        jPane1.add(figura1);
        jPane2.add(figura2);
        jPane3.add(figura3);
        repaint();
    }

    private void mostrarImagenCarta(String carta, JLabel objeto) {
        ImageIcon image = new ImageIcon(ruta + carta + ".png");
        Icon fondo1 = new ImageIcon(image.getImage().getScaledInstance(objeto.getWidth(), objeto.getHeight(), Image.SCALE_DEFAULT));
        objeto.setIcon(fondo1);
        this.repaint();
    }

    private void girarCartas() {
        ev = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                i++;
                cambiarEstados();
                agregarPanel();
                girar girarCartas1 = new girar(figura1);
                girarCartas1.execute();

                girar girarCartas2 = new girar(figura2);
                girarCartas2.execute();

                girar girarCartas3 = new girar(figura3);
                girarCartas2.execute();

                if (i == 15) {
                    t.stop();
                    iniciarEstados();
                }
            }
        };
        t = new Timer(100, ev);
        t.start();
        i = 1;
    }

    private void darPremio(int premio) {
        this.puntos = this.puntos + premio;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        spinBoton = new javax.swing.JButton();
        jPane3 = new javax.swing.JPanel();
        jPane2 = new javax.swing.JPanel();
        jPane1 = new javax.swing.JPanel();
        labelBaraja1 = new javax.swing.JLabel();
        puntajeLabel = new javax.swing.JLabel();
        labelBaraja3 = new javax.swing.JLabel();
        labelBaraja2 = new javax.swing.JLabel();
        sumaPuntos = new javax.swing.JLabel();
        labelMuestraPuntos = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(768, 453));
        setResizable(false);
        setSize(new java.awt.Dimension(768, 453));
        getContentPane().setLayout(null);

        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(50, 360, 150, 50);

        spinBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tragamonedas/img/botonEncendido.png"))); // NOI18N
        spinBoton.setBorderPainted(false);
        spinBoton.setContentAreaFilled(false);
        spinBoton.setFocusable(false);
        spinBoton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/tragamonedas/img/botonApagado.png"))); // NOI18N
        spinBoton.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/tragamonedas/img/botonApagado.png"))); // NOI18N
        spinBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spinBotonActionPerformed(evt);
            }
        });
        getContentPane().add(spinBoton);
        spinBoton.setBounds(610, 280, 170, 180);

        jPane3.setOpaque(false);
        getContentPane().add(jPane3);
        jPane3.setBounds(480, 170, 140, 180);

        jPane2.setOpaque(false);
        getContentPane().add(jPane2);
        jPane2.setBounds(320, 170, 140, 180);

        jPane1.setOpaque(false);
        getContentPane().add(jPane1);
        jPane1.setBounds(170, 170, 140, 180);

        labelBaraja1.setBackground(new java.awt.Color(255, 204, 102));
        labelBaraja1.setForeground(new java.awt.Color(255, 51, 102));
        labelBaraja1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tragamonedas/img/back_card4.png"))); // NOI18N
        labelBaraja1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        labelBaraja1.setName(""); // NOI18N
        labelBaraja1.setPreferredSize(new java.awt.Dimension(50, 30));
        getContentPane().add(labelBaraja1);
        labelBaraja1.setBounds(170, 170, 140, 180);

        puntajeLabel.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        getContentPane().add(puntajeLabel);
        puntajeLabel.setBounds(340, 370, 150, 40);

        labelBaraja3.setBackground(new java.awt.Color(255, 204, 102));
        labelBaraja3.setForeground(new java.awt.Color(255, 51, 102));
        labelBaraja3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tragamonedas/img/back_card4.png"))); // NOI18N
        labelBaraja3.setPreferredSize(new java.awt.Dimension(50, 30));
        getContentPane().add(labelBaraja3);
        labelBaraja3.setBounds(480, 170, 140, 180);

        labelBaraja2.setBackground(new java.awt.Color(255, 204, 102));
        labelBaraja2.setForeground(new java.awt.Color(255, 51, 102));
        labelBaraja2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tragamonedas/img/back_card4.png"))); // NOI18N
        labelBaraja2.setPreferredSize(new java.awt.Dimension(50, 30));
        getContentPane().add(labelBaraja2);
        labelBaraja2.setBounds(320, 170, 150, 180);

        sumaPuntos.setBackground(new java.awt.Color(0, 0, 0));
        sumaPuntos.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        sumaPuntos.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(sumaPuntos);
        sumaPuntos.setBounds(540, 90, 110, 30);

        labelMuestraPuntos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tragamonedas/img/sumaPuntos.png"))); // NOI18N
        getContentPane().add(labelMuestraPuntos);
        labelMuestraPuntos.setBounds(510, 70, 180, 70);

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tragamonedas/img/fondo3.png"))); // NOI18N
        getContentPane().add(Fondo);
        Fondo.setBounds(0, -40, 770, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Acciones
    private void spinBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spinBotonActionPerformed
            
        this.girarCartas();
        condiciones juegoCartas = new condiciones();
        puntos = puntos - 1;
        this.puntajeLabel.setText(Integer.toString(puntos));
        String carta1 = this.carta.sacarCarta();
        String carta2 = this.carta.sacarCarta();
        String carta3 = this.carta.sacarCarta();
        this.mostrarImagenCarta(carta1, labelBaraja1);
        this.mostrarImagenCarta(carta2, labelBaraja2);
        this.mostrarImagenCarta(carta3, labelBaraja3);
        int cartas[] = {carta.extraerNumero(carta1), carta.extraerNumero(carta2), carta.extraerNumero(carta3)};
        //Condiciones de las cartas
        if (juegoCartas.condicion1(cartas[0], cartas[1], cartas[2])) {
            this.darPremio(5);
            this.puntajeLabel.setText(Integer.toString(puntos));
            labelMuestraPuntos.setVisible(true);
            sumaPuntos.setVisible(true);
            sumaPuntos.setText(" + 5");
        }
        if (juegoCartas.condicion4(cartas[0], cartas[1], cartas[2])) {
            this.darPremio(2);
            this.puntajeLabel.setText(Integer.toString(puntos));
            labelMuestraPuntos.setVisible(true);
            sumaPuntos.setVisible(true);
            sumaPuntos.setText(" + 2");

        }
        if (juegoCartas.condicion5(cartas[0], cartas[1], cartas[2])) {
            this.darPremio(2);
            this.puntajeLabel.setText(Integer.toString(puntos));
            labelMuestraPuntos.setVisible(true);
            sumaPuntos.setVisible(true);
            sumaPuntos.setText(" + 2");

        }
        //Ordenar Cartas de menor a mayor
        Arrays.sort(cartas);
        if (juegoCartas.condicion2_1(cartas[0], cartas[1], cartas[2])) {
            this.darPremio(4);
            this.puntajeLabel.setText(Integer.toString(puntos));
            labelMuestraPuntos.setVisible(true);
            sumaPuntos.setVisible(true);
            sumaPuntos.setText(" + 4");

        }
        if (juegoCartas.condicion2_2(cartas[0], cartas[1], cartas[2])) {
            this.darPremio(4);
            this.puntajeLabel.setText(Integer.toString(puntos));
            labelMuestraPuntos.setVisible(true);
            sumaPuntos.setVisible(true);
            sumaPuntos.setText(" + 4");

        }
        if (juegoCartas.condicion2_3(cartas[0], cartas[1], cartas[2])) {
            this.darPremio(4);
            this.puntajeLabel.setText(Integer.toString(puntos));
            labelMuestraPuntos.setVisible(true);
            sumaPuntos.setVisible(true);
            sumaPuntos.setText(" + 4");

        }
        if (juegoCartas.condicion3_1(cartas[0], cartas[1], cartas[2])) {
            this.darPremio(3);
            this.puntajeLabel.setText(Integer.toString(puntos));
            labelMuestraPuntos.setVisible(true);
            sumaPuntos.setVisible(true);
            sumaPuntos.setText(" + 3");

        }
        if (juegoCartas.condicion3_2(cartas[0], cartas[1], cartas[2])) {
            this.darPremio(3);
            this.puntajeLabel.setText(Integer.toString(puntos));
            labelMuestraPuntos.setVisible(true);
            sumaPuntos.setVisible(true);
            sumaPuntos.setText(" + 3");

        }
        if (juegoCartas.condicion3_3(cartas[0], cartas[1], cartas[2])) {
            this.darPremio(3);
            this.puntajeLabel.setText(Integer.toString(puntos));
            labelMuestraPuntos.setVisible(true);
            sumaPuntos.setVisible(true);
            sumaPuntos.setText(" + 3");

        }
        if (juegoCartas.condicion6(cartas[0], cartas[1], cartas[2])) {
            this.darPremio(1);
            this.puntajeLabel.setText(Integer.toString(puntos));
            labelMuestraPuntos.setVisible(true);
            sumaPuntos.setVisible(true);
            sumaPuntos.setText(" + 1");

        }
        if (juegoCartas.condicion7(cartas[0], cartas[1], cartas[2])) {
            this.darPremio(1);
            this.puntajeLabel.setText(Integer.toString(puntos));
            labelMuestraPuntos.setVisible(true);
            sumaPuntos.setVisible(true);
            sumaPuntos.setText(" + 1");

        }
        if (puntos == 0) {
            this.puntajeLabel.setText(Integer.toString(puntos));
            GameOver mensajePerdio = new GameOver();
            mensajePerdio.setVisible(true);
            this.setVisible(false);

        }


    }//GEN-LAST:event_spinBotonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (puntos >= Integer.parseInt(this.monedas)) {
            winVentana ventanaGano = new winVentana();
            ventanaGano.setVisible(true);
            ventanaGano.labelMonedas.setText("" + puntos);
            ventanaGano.laeblNombre.setText(nombreJugador);
            this.setVisible(false);
        } else {
            loseVentana ventanaPerdio = new loseVentana();
            ventanaPerdio.setVisible(true);
            ventanaPerdio.nombreLabel.setText(nombreJugador);
            ventanaPerdio.labelMonedas.setText("" + puntos);
            this.setVisible(false);
        }


    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Tragamonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tragamonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tragamonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tragamonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tragamonedas().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton jButton2;
    public javax.swing.JPanel jPane1;
    private javax.swing.JPanel jPane2;
    private javax.swing.JPanel jPane3;
    private javax.swing.JLabel labelBaraja1;
    private javax.swing.JLabel labelBaraja2;
    private javax.swing.JLabel labelBaraja3;
    private javax.swing.JLabel labelMuestraPuntos;
    public javax.swing.JLabel puntajeLabel;
    private javax.swing.JButton spinBoton;
    private javax.swing.JLabel sumaPuntos;
    // End of variables declaration//GEN-END:variables
}
