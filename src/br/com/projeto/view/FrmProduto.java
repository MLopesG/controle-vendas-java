/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.view;

import br.com.projeto.dao.FornecedorDao;
import br.com.projeto.dao.ProdutoDao;
import br.com.projeto.model.Fornecedor;
import br.com.projeto.model.Produto;
import br.com.projeto.model.Utilitarios;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Marcos
 */
public class FrmProduto extends javax.swing.JFrame {

    /**
     * Creates new form FrmProduto
     */
    public FrmProduto() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        
        Utilitarios util = new Utilitarios();
        util.InserirIcone(this);
        
        //Color Btns
        util.btnColor(btnSalvar);
        util.btnColor(btnEditar);
        util.btnColor(btnDeletar);
        util.btnColor(btnLimpar);
        
        // Header Tabela tamanho da fonte
        util.StyleHeaderTable(tableProdutos);
    }
    
    private void resetCampos() {
        // Limpar campos
        new Utilitarios().LimparTela(tabProduto);
        new Utilitarios().LimparTela(tabConsulta);
        // tabConsultas.setSelectedIndex(0);
    }
    
    private void buscarProdutoDescricao(String desc) {
        ProdutoDao dao = new ProdutoDao();
        List<Produto> lista = dao.buscaProdutoPorDescricao(desc);

        DefaultTableModel dados = (DefaultTableModel) tableProdutos.getModel();
        dados.setNumRows(0);

        for (Produto p : lista) {
            dados.addRow(new Object[]{
                p.getId(),
                p.getDescricao(),
                p.getPreco(),
                p.getQtd_estoque(),
                p.getFornecedor().getNome()
            });
        }
    }
    
    public void listar() {
        ProdutoDao dao = new ProdutoDao();
        List<Produto> lista = dao.listarProdutos();

        DefaultTableModel dados = (DefaultTableModel) tableProdutos.getModel();
        dados.setNumRows(0);

        for (Produto p : lista) {
            dados.addRow(new Object[]{
                p.getId(),
                p.getDescricao(),
                p.getPreco(),
                p.getQtd_estoque(),
                p.getFornecedor().getNome()
            });
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabDados2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        produto = new javax.swing.JTabbedPane();
        tabProduto = new javax.swing.JPanel();
        txtcodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtdesc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnpesquisarProduto = new javax.swing.JButton();
        txtpreco = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtQtd = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbFornecedor = new javax.swing.JComboBox();
        tabConsulta = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtPesquisaTable = new javax.swing.JTextField();
        btnpesquisaConsulta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProdutos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Produtos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tabDados2.setBackground(new java.awt.Color(38, 54, 127));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 21)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Produtos");

        javax.swing.GroupLayout tabDados2Layout = new javax.swing.GroupLayout(tabDados2);
        tabDados2.setLayout(tabDados2Layout);
        tabDados2Layout.setHorizontalGroup(
            tabDados2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabDados2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tabDados2Layout.setVerticalGroup(
            tabDados2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabDados2Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(25, 25, 25))
        );

        btnEditar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Check_16x16.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnDeletar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Delete_16x16.png"))); // NOI18N
        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cancel_16x16.png"))); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Save_16x16.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        produto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        produto.setInheritsPopupMenu(true);

        tabProduto.setBackground(new java.awt.Color(255, 255, 255));

        txtcodigo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtcodigo.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Código:");

        txtdesc.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Descrição:");

        btnpesquisarProduto.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnpesquisarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Search_16x16.png"))); // NOI18N
        btnpesquisarProduto.setText("Pesquisar");
        btnpesquisarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesquisarProdutoActionPerformed(evt);
            }
        });

        txtpreco.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Preço:");

        txtQtd.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Quantidade Estoque:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("Fornecedor:");

        cbFornecedor.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        cbFornecedor.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                cbFornecedorAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout tabProdutoLayout = new javax.swing.GroupLayout(tabProduto);
        tabProduto.setLayout(tabProdutoLayout);
        tabProdutoLayout.setHorizontalGroup(
            tabProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabProdutoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(tabProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabProdutoLayout.createSequentialGroup()
                        .addGroup(tabProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtcodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(tabProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(tabProdutoLayout.createSequentialGroup()
                                .addComponent(txtdesc, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnpesquisarProduto)))
                        .addGap(197, 197, 197))
                    .addGroup(tabProdutoLayout.createSequentialGroup()
                        .addGroup(tabProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabProdutoLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(288, 288, 288))
                            .addComponent(txtpreco))
                        .addGap(18, 18, 18)
                        .addGroup(tabProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbFornecedor, 0, 278, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(tabProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(tabProdutoLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(170, 170, 170)))
                        .addGap(90, 90, 90))))
        );
        tabProdutoLayout.setVerticalGroup(
            tabProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tabProdutoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(42, 42, 42))
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tabProdutoLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tabProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnpesquisarProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdesc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tabProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tabProdutoLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtpreco, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabProdutoLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabProdutoLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(252, Short.MAX_VALUE))
        );

        produto.addTab("Produto", new javax.swing.ImageIcon(getClass().getResource("/imagens/Information_16x16.png")), tabProduto); // NOI18N

        tabConsulta.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("Descrição:");

        txtPesquisaTable.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtPesquisaTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesquisaTableKeyPressed(evt);
            }
        });

        btnpesquisaConsulta.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnpesquisaConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Search_16x16.png"))); // NOI18N
        btnpesquisaConsulta.setText("Pesquisar");
        btnpesquisaConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesquisaConsultaActionPerformed(evt);
            }
        });

        tableProdutos.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        tableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Preço", "Quantidade estoque", "Fornecedor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableProdutos.setRowHeight(30);
        tableProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableProdutos);
        if (tableProdutos.getColumnModel().getColumnCount() > 0) {
            tableProdutos.getColumnModel().getColumn(0).setResizable(false);
            tableProdutos.getColumnModel().getColumn(1).setResizable(false);
            tableProdutos.getColumnModel().getColumn(2).setResizable(false);
            tableProdutos.getColumnModel().getColumn(3).setResizable(false);
            tableProdutos.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout tabConsultaLayout = new javax.swing.GroupLayout(tabConsulta);
        tabConsulta.setLayout(tabConsultaLayout);
        tabConsultaLayout.setHorizontalGroup(
            tabConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(tabConsultaLayout.createSequentialGroup()
                        .addGroup(tabConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(tabConsultaLayout.createSequentialGroup()
                                .addComponent(txtPesquisaTable, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnpesquisaConsulta)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        tabConsultaLayout.setVerticalGroup(
            tabConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisaTable, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnpesquisaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );

        produto.addTab("Consultar", new javax.swing.ImageIcon(getClass().getResource("/imagens/Search_16x16.png")), tabConsulta); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabDados2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(368, 368, 368)
                .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(417, 417, 417))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(produto)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabDados2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(produto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        Utilitarios util = new Utilitarios();
        
        if(txtQtd.getText().isEmpty() ||
           txtdesc.getText().isEmpty() ||
           txtpreco.getText().isEmpty()
        ){
            util.alert("Sistema de controle PDV - Atenção",  "Preencha do(s) campo(s) corretamente!");
        }else{
            Produto obj = new Produto();
            obj.setDescricao(txtdesc.getText());
            obj.setPreco(Double.parseDouble(txtpreco.getText()));
            obj.setQtd_estoque(Integer.parseInt(txtQtd.getText()));

            Fornecedor f = new Fornecedor();
            f = (Fornecedor) cbFornecedor.getSelectedItem();
            obj.setFornecedor(f);

            ProdutoDao dao = new ProdutoDao();
            dao.save(obj);

            resetCampos();
            produto.setSelectedIndex(1);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        Utilitarios util = new Utilitarios();
        
        if(txtQtd.getText().isEmpty() ||
           txtdesc.getText().isEmpty() ||
           txtpreco.getText().isEmpty()
        ){
            util.alert("Sistema de controle PDV - Atenção",  "Preencha do(s) campo(s) corretamente!");
        }else{
            Produto obj = new Produto();
            obj.setId(Integer.parseInt(txtcodigo.getText()));
            obj.setDescricao(txtdesc.getText());
            obj.setPreco(Double.parseDouble(txtpreco.getText()));
            obj.setQtd_estoque(Integer.parseInt(txtQtd.getText()));

            Fornecedor f = new Fornecedor();
            f = (Fornecedor) cbFornecedor.getSelectedItem();
            obj.setFornecedor(f);

            ProdutoDao dao = new ProdutoDao();
            dao.edit(obj);

            resetCampos();
            produto.setSelectedIndex(1);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        listar();
        
    }//GEN-LAST:event_formWindowActivated

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        // TODO add your handling code here:
        Utilitarios util = new Utilitarios();
        if (txtcodigo.getText().isEmpty()) {
           util.alert("Sistema de controle PDV - Atenção",  "Identificação do produto não encontrado ! ");
        } else {
            Produto obj = new Produto();
            obj.setId(Integer.parseInt(txtcodigo.getText()));

            ProdutoDao dao = new ProdutoDao();
            dao.delete(obj);
            
            produto.setSelectedIndex(1);

            resetCampos();
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
        resetCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void tableProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProdutosMouseClicked
        // TODO add your handling code here:
        produto.setSelectedIndex(0);
        txtcodigo.setText(tableProdutos.getValueAt(tableProdutos.getSelectedRow(), 0).toString());
        txtdesc.setText(tableProdutos.getValueAt(tableProdutos.getSelectedRow(), 1).toString());
        txtpreco.setText(tableProdutos.getValueAt(tableProdutos.getSelectedRow(), 2).toString());
        txtQtd.setText(tableProdutos.getValueAt(tableProdutos.getSelectedRow(), 3).toString());
        cbFornecedor.setSelectedItem(tableProdutos.getValueAt(tableProdutos.getSelectedRow(), 4).toString());
    }//GEN-LAST:event_tableProdutosMouseClicked

    private void txtPesquisaTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaTableKeyPressed
        // TODO add your handling code here:
        String descricao = "%" + txtPesquisaTable.getText() + "%";
        buscarProdutoDescricao(descricao);
    }//GEN-LAST:event_txtPesquisaTableKeyPressed

    private void btnpesquisaConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesquisaConsultaActionPerformed
        // TODO add your handling code here:
        String descricao = "%" + txtPesquisaTable.getText() + "%";
        buscarProdutoDescricao(descricao);
    }//GEN-LAST:event_btnpesquisaConsultaActionPerformed

    private void cbFornecedorAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_cbFornecedorAncestorAdded
        // TODO add your handling code here:

        FornecedorDao dao = new FornecedorDao();
        List<Fornecedor> getAll = dao.listarFornecedores();
        cbFornecedor.removeAll();

        getAll.forEach((f) -> {
            cbFornecedor.addItem(f);
        });
    }//GEN-LAST:event_cbFornecedorAncestorAdded

    private void btnpesquisarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesquisarProdutoActionPerformed
        // buscar por descrição - produto

        Utilitarios util = new Utilitarios(); try{
            if (txtdesc.getText().isEmpty()) {
                util.alert("Sistema de controle PDV - Atenção",  "Informe identificação do produto, para realizar pesquisa ! ");
            } else {
                String descricao = "%" + txtdesc.getText() + "%";
                Produto obj = new Produto();
                ProdutoDao dao = new ProdutoDao();

                obj = dao.consultarPorDescricao(descricao);

                txtcodigo.setText(String.valueOf(obj.getId()));

                txtcodigo.setText(String.valueOf(obj.getId()));
                txtdesc.setText(obj.getDescricao());
                txtpreco.setText(String.valueOf(obj.getPreco()));
                txtQtd.setText(String.valueOf(obj.getQtd_estoque()));

                Fornecedor f = new Fornecedor();
                FornecedorDao fdao = new FornecedorDao();

                f = fdao.consultaPorNome(obj.getFornecedor().getNome());
                cbFornecedor.getModel().setSelectedItem(f);
            }
        } catch (Exception e) {
            util.alert("Sistema de controle PDV - Atenção",  "Produto não encontrado ! ");
        }
    }//GEN-LAST:event_btnpesquisarProdutoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        Utilitarios util = new Utilitarios(); try{
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnpesquisaConsulta;
    private javax.swing.JButton btnpesquisarProduto;
    private javax.swing.JComboBox cbFornecedor;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane produto;
    private javax.swing.JPanel tabConsulta;
    private javax.swing.JPanel tabDados2;
    private javax.swing.JPanel tabProduto;
    private javax.swing.JTable tableProdutos;
    private javax.swing.JTextField txtPesquisaTable;
    private javax.swing.JTextField txtQtd;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtdesc;
    private javax.swing.JTextField txtpreco;
    // End of variables declaration//GEN-END:variables
}
