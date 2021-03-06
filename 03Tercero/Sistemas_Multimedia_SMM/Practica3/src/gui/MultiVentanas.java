package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import practica3.Lienzo;

/**
 *
 * @author Carlos de al Torre
 */
public class MultiVentanas extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public MultiVentanas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelToolBar = new JPanel();
        jPanelOptionBar = new JPanel();
        jToolBarHerramientas = new JToolBar();
        jPanelStatusBar = new JPanel();
        jLabelVerMensajes = new JLabel();
        jPanelCentral = new JPanel();
        jPanelEscritorio = new JDesktopPane();
        jPanelUtiles = new JPanel();
        filler2 = new Box.Filler(new Dimension(5, 0), new Dimension(5, 0), new Dimension(5, 32767));
        jButtonNegro = new JButton();
        filler3 = new Box.Filler(new Dimension(5, 0), new Dimension(5, 0), new Dimension(5, 32767));
        jButtonBlanco = new JButton();
        filler4 = new Box.Filler(new Dimension(5, 0), new Dimension(5, 0), new Dimension(5, 32767));
        jButtonRojo = new JButton();
        filler5 = new Box.Filler(new Dimension(5, 0), new Dimension(5, 0), new Dimension(5, 32767));
        jButtonVerde = new JButton();
        filler6 = new Box.Filler(new Dimension(5, 0), new Dimension(5, 0), new Dimension(5, 32767));
        jButtonAzul = new JButton();
        filler7 = new Box.Filler(new Dimension(5, 0), new Dimension(5, 0), new Dimension(5, 32767));
        jButtonAmarillo = new JButton();
        filler8 = new Box.Filler(new Dimension(30, 0), new Dimension(30, 0), new Dimension(30, 32767));
        jLabelGrosorEtiqueta = new JLabel();
        filler11 = new Box.Filler(new Dimension(5, 0), new Dimension(5, 0), new Dimension(5, 32767));
        jLabel1Grosor = new JLabel();
        filler10 = new Box.Filler(new Dimension(5, 0), new Dimension(5, 0), new Dimension(5, 32767));
        jSliderGrosor = new JSlider();
        filler12 = new Box.Filler(new Dimension(0, 0), new Dimension(0, 0), new Dimension(32767, 0));
        jCheckBoxRelleno = new JCheckBox();
        filler1 = new Box.Filler(new Dimension(10, 0), new Dimension(10, 0), new Dimension(10, 32767));
        jMenuBarra = new JMenuBar();
        jMenuArchivo = new JMenu();
        jMenuItemNuevo = new JMenuItem();
        jMenuItemAbrir = new JMenuItem();
        jMenuItemGuardar = new JMenuItem();
        jSeparator1MArchivo = new JPopupMenu.Separator();
        jMenuItemSalir = new JMenuItem();
        jMenuEditar = new JMenu();
        jMenuItemCortar = new JMenuItem();
        jMenuItemCopiar = new JMenuItem();
        jMenuItemPegar = new JMenuItem();
        jMenuVer = new JMenu();
        jCheckBoxMenuItemVerBarraMenu = new JCheckBoxMenuItem();
        jCheckBoxMenuItemVerBarraHerramientas = new JCheckBoxMenuItem();
        jCheckBoxMenuItemVerBarraEstado = new JCheckBoxMenuItem();

        FormListener formListener = new FormListener();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Entorno Escritorio/Ventanas");
        setMinimumSize(new Dimension(300, 300));

        jPanelToolBar.setLayout(null);
        getContentPane().add(jPanelToolBar, BorderLayout.LINE_START);

        jPanelOptionBar.setLayout(null);
        getContentPane().add(jPanelOptionBar, BorderLayout.LINE_END);

        jToolBarHerramientas.setRollover(true);
        jToolBarHerramientas.setToolTipText("Herramientas que puedes usar");
        jToolBarHerramientas.setMaximumSize(new Dimension(150, 32));
        jToolBarHerramientas.setMinimumSize(new Dimension(150, 32));
        jToolBarHerramientas.setName("Herramientas"); // NOI18N
        jToolBarHerramientas.setPreferredSize(new Dimension(150, 32));
        getContentPane().add(jToolBarHerramientas, BorderLayout.PAGE_START);

        jPanelStatusBar.setBorder(BorderFactory.createEtchedBorder());
        jPanelStatusBar.setLayout(new BoxLayout(jPanelStatusBar, BoxLayout.LINE_AXIS));

        jLabelVerMensajes.setText("Mensajes");
        jLabelVerMensajes.setMaximumSize(null);
        jLabelVerMensajes.setMinimumSize(new Dimension(50, 25));
        jLabelVerMensajes.setPreferredSize(new Dimension(50, 25));
        jPanelStatusBar.add(jLabelVerMensajes);

        getContentPane().add(jPanelStatusBar, BorderLayout.PAGE_END);

        jPanelCentral.setLayout(new BorderLayout());
        jPanelCentral.add(jPanelEscritorio, BorderLayout.CENTER);

        jPanelUtiles.setLayout(new BoxLayout(jPanelUtiles, BoxLayout.LINE_AXIS));
        jPanelUtiles.add(filler2);

        jButtonNegro.setBackground(new Color(0, 0, 0));
        jButtonNegro.setBorder(BorderFactory.createEtchedBorder());
        jButtonNegro.setBorderPainted(false);
        jButtonNegro.setMaximumSize(new Dimension(20, 20));
        jButtonNegro.setMinimumSize(new Dimension(20, 20));
        jButtonNegro.setPreferredSize(new Dimension(20, 20));
        jPanelUtiles.add(jButtonNegro);
        jPanelUtiles.add(filler3);

        jButtonBlanco.setBackground(new Color(255, 255, 255));
        jButtonBlanco.setBorder(BorderFactory.createEtchedBorder());
        jButtonBlanco.setBorderPainted(false);
        jButtonBlanco.setMaximumSize(new Dimension(20, 20));
        jButtonBlanco.setMinimumSize(new Dimension(20, 20));
        jButtonBlanco.setPreferredSize(new Dimension(20, 20));
        jPanelUtiles.add(jButtonBlanco);
        jPanelUtiles.add(filler4);

        jButtonRojo.setBackground(new Color(255, 0, 0));
        jButtonRojo.setBorder(BorderFactory.createEtchedBorder());
        jButtonRojo.setBorderPainted(false);
        jButtonRojo.setMaximumSize(new Dimension(20, 20));
        jButtonRojo.setMinimumSize(new Dimension(20, 20));
        jButtonRojo.setPreferredSize(new Dimension(20, 20));
        jPanelUtiles.add(jButtonRojo);
        jPanelUtiles.add(filler5);

        jButtonVerde.setBackground(new Color(0, 255, 0));
        jButtonVerde.setBorder(BorderFactory.createEtchedBorder());
        jButtonVerde.setBorderPainted(false);
        jButtonVerde.setMaximumSize(new Dimension(20, 20));
        jButtonVerde.setMinimumSize(new Dimension(20, 20));
        jButtonVerde.setPreferredSize(new Dimension(20, 20));
        jPanelUtiles.add(jButtonVerde);
        jPanelUtiles.add(filler6);

        jButtonAzul.setBackground(new Color(0, 0, 255));
        jButtonAzul.setBorder(BorderFactory.createEtchedBorder());
        jButtonAzul.setBorderPainted(false);
        jButtonAzul.setMaximumSize(new Dimension(20, 20));
        jButtonAzul.setMinimumSize(new Dimension(20, 20));
        jButtonAzul.setPreferredSize(new Dimension(20, 20));
        jPanelUtiles.add(jButtonAzul);
        jPanelUtiles.add(filler7);

        jButtonAmarillo.setBackground(new Color(255, 255, 0));
        jButtonAmarillo.setBorder(BorderFactory.createEtchedBorder());
        jButtonAmarillo.setBorderPainted(false);
        jButtonAmarillo.setMaximumSize(new Dimension(20, 20));
        jButtonAmarillo.setMinimumSize(new Dimension(20, 20));
        jButtonAmarillo.setPreferredSize(new Dimension(20, 20));
        jPanelUtiles.add(jButtonAmarillo);
        jPanelUtiles.add(filler8);

        jLabelGrosorEtiqueta.setFont(new Font("Dialog", 1, 14)); // NOI18N
        jLabelGrosorEtiqueta.setText("Grosor:");
        jPanelUtiles.add(jLabelGrosorEtiqueta);
        jPanelUtiles.add(filler11);

        jLabel1Grosor.setText("4");
        jLabel1Grosor.setMaximumSize(new Dimension(25, 15));
        jLabel1Grosor.setMinimumSize(new Dimension(25, 15));
        jLabel1Grosor.setPreferredSize(new Dimension(25, 15));
        jPanelUtiles.add(jLabel1Grosor);
        jPanelUtiles.add(filler10);

        jSliderGrosor.setMinimum(4);
        jSliderGrosor.setMinorTickSpacing(1);
        jSliderGrosor.setPaintLabels(true);
        jSliderGrosor.setToolTipText("Este es el grosor que tendra la linea de la herramienta");
        jSliderGrosor.setValue(4);
        jSliderGrosor.setMaximumSize(new Dimension(300, 16));
        jSliderGrosor.setMinimumSize(new Dimension(100, 16));
        jSliderGrosor.addChangeListener(formListener);
        jPanelUtiles.add(jSliderGrosor);
        jPanelUtiles.add(filler12);

        jCheckBoxRelleno.setFont(new Font("Dialog", 1, 14)); // NOI18N
        jCheckBoxRelleno.setText("Relleno");
        jPanelUtiles.add(jCheckBoxRelleno);
        jPanelUtiles.add(filler1);

        jPanelCentral.add(jPanelUtiles, BorderLayout.SOUTH);

        getContentPane().add(jPanelCentral, BorderLayout.CENTER);

        jMenuArchivo.setText("Archivo");

        jMenuItemNuevo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
        jMenuItemNuevo.setText("Nuevo");
        jMenuItemNuevo.setToolTipText("");
        jMenuItemNuevo.addActionListener(formListener);
        jMenuArchivo.add(jMenuItemNuevo);

        jMenuItemAbrir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
        jMenuItemAbrir.setText("Abrir...");
        jMenuItemAbrir.addActionListener(formListener);
        jMenuArchivo.add(jMenuItemAbrir);

        jMenuItemGuardar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
        jMenuItemGuardar.setText("Guardar...");
        jMenuItemGuardar.addActionListener(formListener);
        jMenuArchivo.add(jMenuItemGuardar);

        jSeparator1MArchivo.setMinimumSize(new Dimension(10, 10));
        jMenuArchivo.add(jSeparator1MArchivo);

        jMenuItemSalir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.CTRL_MASK));
        jMenuItemSalir.setText("Salir...");
        jMenuItemSalir.addActionListener(formListener);
        jMenuArchivo.add(jMenuItemSalir);

        jMenuBarra.add(jMenuArchivo);

        jMenuEditar.setText("Editar");

        jMenuItemCortar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_MASK));
        jMenuItemCortar.setText("Cortar");
        jMenuItemCortar.addActionListener(formListener);
        jMenuEditar.add(jMenuItemCortar);

        jMenuItemCopiar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_MASK));
        jMenuItemCopiar.setText("Copiar");
        jMenuItemCopiar.addActionListener(formListener);
        jMenuEditar.add(jMenuItemCopiar);

        jMenuItemPegar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_MASK));
        jMenuItemPegar.setText("Pegar");
        jMenuItemPegar.addActionListener(formListener);
        jMenuEditar.add(jMenuItemPegar);

        jMenuBarra.add(jMenuEditar);

        jMenuVer.setText("Ver");

        jCheckBoxMenuItemVerBarraMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, InputEvent.ALT_MASK | InputEvent.CTRL_MASK));
        jCheckBoxMenuItemVerBarraMenu.setSelected(true);
        jCheckBoxMenuItemVerBarraMenu.setText("Barra de Menus");
        jCheckBoxMenuItemVerBarraMenu.addActionListener(formListener);
        jMenuVer.add(jCheckBoxMenuItemVerBarraMenu);

        jCheckBoxMenuItemVerBarraHerramientas.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, InputEvent.ALT_MASK | InputEvent.CTRL_MASK));
        jCheckBoxMenuItemVerBarraHerramientas.setSelected(true);
        jCheckBoxMenuItemVerBarraHerramientas.setText("Barra de Herramientas");
        jCheckBoxMenuItemVerBarraHerramientas.addActionListener(formListener);
        jMenuVer.add(jCheckBoxMenuItemVerBarraHerramientas);

        jCheckBoxMenuItemVerBarraEstado.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.ALT_MASK | InputEvent.CTRL_MASK));
        jCheckBoxMenuItemVerBarraEstado.setSelected(true);
        jCheckBoxMenuItemVerBarraEstado.setText("Barra de Estado");
        jCheckBoxMenuItemVerBarraEstado.addActionListener(formListener);
        jMenuVer.add(jCheckBoxMenuItemVerBarraEstado);

        jMenuBarra.add(jMenuVer);

        setJMenuBar(jMenuBarra);

        pack();
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements ActionListener, ChangeListener {
        FormListener() {}
        public void actionPerformed(ActionEvent evt) {
            if (evt.getSource() == jMenuItemNuevo) {
                MultiVentanas.this.jMenuItemNuevoActionPerformed(evt);
            }
            else if (evt.getSource() == jMenuItemAbrir) {
                MultiVentanas.this.jMenuItemAbrirActionPerformed(evt);
            }
            else if (evt.getSource() == jMenuItemGuardar) {
                MultiVentanas.this.jMenuItemGuardarActionPerformed(evt);
            }
            else if (evt.getSource() == jMenuItemSalir) {
                MultiVentanas.this.jMenuItemSalirActionPerformed(evt);
            }
            else if (evt.getSource() == jMenuItemCortar) {
                MultiVentanas.this.jMenuItemCortarActionPerformed(evt);
            }
            else if (evt.getSource() == jMenuItemCopiar) {
                MultiVentanas.this.jMenuItemCopiarActionPerformed(evt);
            }
            else if (evt.getSource() == jMenuItemPegar) {
                MultiVentanas.this.jMenuItemPegarActionPerformed(evt);
            }
            else if (evt.getSource() == jCheckBoxMenuItemVerBarraMenu) {
                MultiVentanas.this.jCheckBoxMenuItemVerBarraMenuActionPerformed(evt);
            }
            else if (evt.getSource() == jCheckBoxMenuItemVerBarraHerramientas) {
                MultiVentanas.this.jCheckBoxMenuItemVerBarraHerramientasActionPerformed(evt);
            }
            else if (evt.getSource() == jCheckBoxMenuItemVerBarraEstado) {
                MultiVentanas.this.jCheckBoxMenuItemVerBarraEstadoActionPerformed(evt);
            }
        }

        public void stateChanged(ChangeEvent evt) {
            if (evt.getSource() == jSliderGrosor) {
                MultiVentanas.this.jSliderGrosorStateChanged(evt);
            }
        }
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemNuevoActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jMenuItemNuevoActionPerformed
        VentanaInterna vi = new VentanaInterna();
        jPanelEscritorio.add(vi);
        vi.setVisible(true);
    }//GEN-LAST:event_jMenuItemNuevoActionPerformed

    private void jMenuItemAbrirActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jMenuItemAbrirActionPerformed
        JFileChooser dlg = new JFileChooser();
        int resp = dlg.showOpenDialog(this);
        if (resp == JFileChooser.APPROVE_OPTION) {
            File f = dlg.getSelectedFile();
            //Código
        }
    }//GEN-LAST:event_jMenuItemAbrirActionPerformed

    private void jMenuItemGuardarActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jMenuItemGuardarActionPerformed
        JFileChooser dlg = new JFileChooser();
        int resp = dlg.showSaveDialog(this);
        if (resp == JFileChooser.APPROVE_OPTION) {
            File f = dlg.getSelectedFile();
            //Código
        }
    }//GEN-LAST:event_jMenuItemGuardarActionPerformed

    private void jMenuItemSalirActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    private void jMenuItemCortarActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jMenuItemCortarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemCortarActionPerformed

    private void jMenuItemCopiarActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jMenuItemCopiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemCopiarActionPerformed

    private void jMenuItemPegarActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jMenuItemPegarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemPegarActionPerformed

    private void jCheckBoxMenuItemVerBarraMenuActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItemVerBarraMenuActionPerformed
        this.jMenuBarra.setVisible(this.jCheckBoxMenuItemVerBarraMenu.isSelected());
    }//GEN-LAST:event_jCheckBoxMenuItemVerBarraMenuActionPerformed

    private void jCheckBoxMenuItemVerBarraHerramientasActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItemVerBarraHerramientasActionPerformed
        this.jToolBarHerramientas.setVisible(this.jCheckBoxMenuItemVerBarraHerramientas.isSelected());
    }//GEN-LAST:event_jCheckBoxMenuItemVerBarraHerramientasActionPerformed

    private void jCheckBoxMenuItemVerBarraEstadoActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItemVerBarraEstadoActionPerformed
        this.jPanelStatusBar.setVisible(this.jCheckBoxMenuItemVerBarraEstado.isSelected());
    }//GEN-LAST:event_jCheckBoxMenuItemVerBarraEstadoActionPerformed

    private void jSliderGrosorStateChanged(ChangeEvent evt) {//GEN-FIRST:event_jSliderGrosorStateChanged
        this.jLabel1Grosor.setText(""+this.jSliderGrosor.getValue());
    }//GEN-LAST:event_jSliderGrosorStateChanged
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Box.Filler filler1;
    private Box.Filler filler10;
    private Box.Filler filler11;
    private Box.Filler filler12;
    private Box.Filler filler2;
    private Box.Filler filler3;
    private Box.Filler filler4;
    private Box.Filler filler5;
    private Box.Filler filler6;
    private Box.Filler filler7;
    private Box.Filler filler8;
    private JButton jButtonAmarillo;
    private JButton jButtonAzul;
    private JButton jButtonBlanco;
    private JButton jButtonNegro;
    private JButton jButtonRojo;
    private JButton jButtonVerde;
    private JCheckBoxMenuItem jCheckBoxMenuItemVerBarraEstado;
    private JCheckBoxMenuItem jCheckBoxMenuItemVerBarraHerramientas;
    private JCheckBoxMenuItem jCheckBoxMenuItemVerBarraMenu;
    private JCheckBox jCheckBoxRelleno;
    private JLabel jLabel1Grosor;
    private JLabel jLabelGrosorEtiqueta;
    private JLabel jLabelVerMensajes;
    private JMenu jMenuArchivo;
    private JMenuBar jMenuBarra;
    private JMenu jMenuEditar;
    private JMenuItem jMenuItemAbrir;
    private JMenuItem jMenuItemCopiar;
    private JMenuItem jMenuItemCortar;
    private JMenuItem jMenuItemGuardar;
    private JMenuItem jMenuItemNuevo;
    private JMenuItem jMenuItemPegar;
    private JMenuItem jMenuItemSalir;
    private JMenu jMenuVer;
    private JPanel jPanelCentral;
    private JDesktopPane jPanelEscritorio;
    private JPanel jPanelOptionBar;
    private JPanel jPanelStatusBar;
    private JPanel jPanelToolBar;
    private JPanel jPanelUtiles;
    private JPopupMenu.Separator jSeparator1MArchivo;
    private JSlider jSliderGrosor;
    private JToolBar jToolBarHerramientas;
    // End of variables declaration//GEN-END:variables
}
