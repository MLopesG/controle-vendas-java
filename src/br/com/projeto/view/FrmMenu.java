/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.view;

import java.awt.Graphics;
import java.awt.Image;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcos Lopes G
 */
public class FrmMenu extends javax.swing.JFrame {

    
     public String usuarioLogado = null;
    
    /**
     * Creates new form FrmMenu
     */
    public FrmMenu() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);   
    }
    
    public String getDatetime(){ 
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon= new ImageIcon(getClass().getResource("/imagens/fundo_1.jpg"));
        Image image = icon.getImage();
        painel_desktop = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(), getHeight(), this);
            };
        }
        ;
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LT_usuario = new javax.swing.JLabel();
        horarioLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuClientes = new javax.swing.JMenu();
        menuFuncionarios = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        menuTrocarusuario = new javax.swing.JMenu();
        menuExit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Painel");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 253));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Tela.png"))); // NOI18N
        jLabel1.setText("Usuário Logado: ");

        LT_usuario.setBackground(new java.awt.Color(0, 51, 153));
        LT_usuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LT_usuario.setForeground(new java.awt.Color(0, 51, 153));
        LT_usuario.setText("Marcos Lopes");

        horarioLabel.setText("Horário: 18/05/2020");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LT_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(horarioLabel)
                .addGap(135, 135, 135))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LT_usuario)
                    .addComponent(horarioLabel))
                .addContainerGap())
        );

        painel_desktop.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout painel_desktopLayout = new javax.swing.GroupLayout(painel_desktop);
        painel_desktop.setLayout(painel_desktopLayout);
        painel_desktopLayout.setHorizontalGroup(
            painel_desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_desktopLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 527, Short.MAX_VALUE))
        );
        painel_desktopLayout.setVerticalGroup(
            painel_desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_desktopLayout.createSequentialGroup()
                .addGap(0, 434, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 51, 153));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(873, 70));

        menuClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/clientes.png"))); // NOI18N
        menuClientes.setText("Clientes");
        menuClientes.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        menuClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuClientesMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuClientes);

        menuFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/funcionarios.png"))); // NOI18N
        menuFuncionarios.setText("Funcionários");
        menuFuncionarios.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        menuFuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuFuncionariosMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuFuncionarios);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fornecedor.png"))); // NOI18N
        jMenu3.setText("Fornecedores");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N

        jMenuItem2.setText("Controle Fornecedores");
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produtos.png"))); // NOI18N
        jMenu4.setText("Produtos");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N

        jMenuItem4.setText("Controle de Estoque");
        jMenu4.add(jMenuItem4);

        jMenuItem5.setText("Consulta Produtos");
        jMenu4.add(jMenuItem5);

        jMenuBar1.add(jMenu4);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vendas.png"))); // NOI18N
        jMenu7.setText("Vendas");
        jMenu7.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N

        jMenuItem7.setText("Abrir PDV");
        jMenu7.add(jMenuItem7);

        jMenuItem8.setText("Posição do dia");
        jMenu7.add(jMenuItem8);

        jMenuItem9.setText("Histórico de Vendas");
        jMenu7.add(jMenuItem9);

        jMenuBar1.add(jMenu7);

        menuTrocarusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/configuracoes.png"))); // NOI18N
        menuTrocarusuario.setText("Configurações");
        menuTrocarusuario.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        menuTrocarusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuTrocarusuarioMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuTrocarusuario);

        menuExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair.png"))); // NOI18N
        menuExit.setText("Sair");
        menuExit.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        menuExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuExitMouseClicked(evt);
            }
        });
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });
        jMenuBar1.add(menuExit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_desktop, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_desktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        LT_usuario.setText(usuarioLogado);
        horarioLabel.setText(getDatetime());
    }//GEN-LAST:event_formWindowActivated

    private void menuClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuClientesMouseClicked
        // TODO add your handling code here:
         new FrmCliente().setVisible(true);
    }//GEN-LAST:event_menuClientesMouseClicked

    private void menuFuncionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuFuncionariosMouseClicked
        // TODO add your handling code here:
         new FrmFuncionarios().setVisible(true);
    }//GEN-LAST:event_menuFuncionariosMouseClicked

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuExitActionPerformed

    private void menuExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuExitMouseClicked
        // TODO add your handling code here:
        int op = JOptionPane.showConfirmDialog(null, "Deseja sair do sistema ?");
        
        if(op == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_menuExitMouseClicked

    private void menuTrocarusuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuTrocarusuarioMouseClicked
        // TODO add your handling code here:
        new FrmLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuTrocarusuarioMouseClicked

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LT_usuario;
    private javax.swing.JLabel horarioLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menuClientes;
    private javax.swing.JMenu menuExit;
    private javax.swing.JMenu menuFuncionarios;
    private javax.swing.JMenu menuTrocarusuario;
    private javax.swing.JDesktopPane painel_desktop;
    // End of variables declaration//GEN-END:variables
}