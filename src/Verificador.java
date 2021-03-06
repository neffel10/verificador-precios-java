
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.beans.Statement;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JUANN
 */
public class Verificador extends javax.swing.JFrame {

    /**
     * Creates new form Verificador
     */
    private Dimension size;
    private String codigo = "";
    private int width, height;

    public Verificador() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.getContentPane().setBackground(Color.decode("#556B2F"));
        size = Toolkit.getDefaultToolkit().getScreenSize();

        width = Toolkit.getDefaultToolkit().getScreenSize().width;
        height = Toolkit.getDefaultToolkit().getScreenSize().height;

        this.setSize(Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit().getScreenSize().height);

        this.setLayout(null);

        ImageIcon icon = new ImageIcon((getClass().getResource("/img/logo.png")));
        Icon img = new ImageIcon(icon.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        jLabel6.setIcon(img);
        jLabel7.setIcon(img);
        jLabel8.setIcon(img);
        jLabel9.setIcon(img);
        jLabel6.setLocation(0, 0);
        jLabel7.setLocation(this.getWidth() - jLabel7.getWidth(), 0);
        jLabel8.setLocation(0, this.getHeight() - jLabel8.getHeight());
        jLabel9.setLocation(this.getWidth() - jLabel9.getWidth(), this.getHeight() - jLabel9.getHeight());

        jLabel1.setLocation(this.getWidth() / 2 - jLabel1.getWidth() / 2, this.getHeight() / 3 - jLabel1.getWidth() / 2 - 30);

        jLabel3.setLocation(this.getWidth() / 2 - jLabel2.getWidth() / 2, jLabel1.getLocation().y + jLabel1.getHeight());

        jLabel3.setLocation(this.getWidth() / 2 - jLabel3.getWidth() / 2, jLabel2.getLocation().y + jLabel2.getHeight() + 10);

        //jLabel2.setText("<html><img src='file:C:\\Users\\Soqui\\Documents\\2021-2\\Ing Soft 3\\VerificadorDePrecios-master\\VerificadorDePrecios\\src\\main\\java\\barcode-scan.gif' width='120' height='120'>");
        jLabel2.setVisible(false);
        jLabel2.setLocation(this.getWidth() / 2 - jLabel4.getWidth(), this.getHeight() / 2 - jLabel4.getHeight() / 2);
        jLabel5.setLocation(jLabel4.getLocation().x + jLabel4.getHeight() + 15, jLabel4.getLocation().y);
        jLabel4.setLocation(jLabel4.getLocation().x + jLabel4.getHeight() + 15, jLabel5.getLocation().y + jLabel5.getHeight() + 8);
        jLabel5.setText("");
        jLabel4.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(52, 186, 40));
        setUndecorated(true);
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setAlignmentY(0.2F);
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setPreferredSize(new java.awt.Dimension(325, 325));
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 325, 325));
        jLabel1.getAccessibleContext().setAccessibleDescription("");

        jLabel2.setMinimumSize(new java.awt.Dimension(200, 200));
        jLabel2.setName(""); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 200, 200));

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Por favor, pase el codigo de barras por debajo del escaner...");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 0));
        jLabel4.setText("jLabel4");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel4.setMaximumSize(new java.awt.Dimension(350, 220));
        jLabel4.setMinimumSize(new java.awt.Dimension(350, 220));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 350, 220));

        jLabel5.setFont(new java.awt.Font("Palatino Linotype", 3, 28)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(187, 89, 17));
        jLabel5.setText("jLabel5");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel5.setAutoscrolls(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 750, 40));

        jLabel6.setText("jLabel6");
        jLabel6.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel6.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel6.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 50, 50));

        jLabel7.setText("jLabel6");
        jLabel7.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel7.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel7.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 50, 50));

        jLabel8.setText("jLabel6");
        jLabel8.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel8.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel8.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 50, 50));

        jLabel9.setText("jLabel6");
        jLabel9.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel9.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel9.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 50, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() != 10) {
            codigo += evt.getKeyChar();
        } else {
            //JOptionPane.showMessageDialog(null, "El codigo presionado es " + codigo);
            try {
                Connection con = null;
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/productos", "root", "");
                PreparedStatement pstm = con.prepareStatement("SELECT producto_nombre, producto_precio, producto_stock, producto_imagen FROM productos WHERE producto_codigo = " + codigo);
                ResultSet rs = pstm.executeQuery();

                //Aqu?? los ??ndices empiezan en 1
                if (rs.next()) {

                    VerProducto v = new VerProducto(codigo, rs);
                    v.setVisible(true);

//                    this.getContentPane().setBackground(Color.decode("#FFFFFF"));
//                    jLabel2.setVisible(true);
//                    jLabel2.setSize(200, 200);
//                    jLabel1.setVisible(false);
//                    jLabel3.setVisible(false);
//
//
//                    jLabel5.setText("Nombre: " + rs.getString(1));
//                    jLabel4.setText("<html>Precio: " + rs.getString(2) + "<br>Cantidad en almac??n: " + rs.getString(3));
//                    String ruta = rs.getString(4);
//                    ImageIcon icon = new ImageIcon(new URL(ruta));
//                    Icon img = new ImageIcon(icon.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
//                    jLabel2.setIcon(img);
                    //PantallaPrincipal();
                } else {
                    JOptionPane.showMessageDialog(null, "Producto no encontrado, llame a personal autorizado");
                }

                //JOptionPane.showMessageDialog(null, "SELECT * FROM productos WHERE producto_codigo = "+codigo);
            } catch (ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error.");
                System.out.println(e.toString());
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error" + e.toString());

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
            }
            codigo = "";
        }
    }//GEN-LAST:event_formKeyPressed

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
            java.util.logging.Logger.getLogger(Verificador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Verificador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Verificador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Verificador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Verificador().setVisible(true);
            }
        });
    }

    void PantallaPrincipal() throws InterruptedException {
        Thread.sleep(5000);
        jLabel1.setVisible(true);
        jLabel3.setVisible(true);
        jLabel2.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        this.getContentPane().setBackground(Color.decode("#34BA28"));

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
