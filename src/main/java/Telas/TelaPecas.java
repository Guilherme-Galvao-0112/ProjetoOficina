/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Telas;

/**
 *
 * @author lucas
 */
public class TelaPecas extends javax.swing.JPanel {

    /**
     * Creates new form TelaPecas
     */
    public TelaPecas() {
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

        JPanePrincipal = new javax.swing.JPanel();
        JTNome = new javax.swing.JTextField();
        JLNome = new javax.swing.JLabel();
        JTEndereco = new javax.swing.JTextField();
        JLEndereco = new javax.swing.JLabel();
        JLEmail = new javax.swing.JLabel();
        JTEmail = new javax.swing.JTextField();
        JLTelefone = new javax.swing.JLabel();
        JLCPF = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        JLCPF1 = new javax.swing.JLabel();
        JLCPF2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jTextField8 = new javax.swing.JTextField();
        BTSalvar1 = new javax.swing.JButton();
        BTAlterar1 = new javax.swing.JButton();
        BTExcluir1 = new javax.swing.JButton();
        BTExcluir2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        BTSalvar = new javax.swing.JButton();
        BTAlterar = new javax.swing.JButton();
        BTExcluir = new javax.swing.JButton();

        JLNome.setText("Nome");

        JLEndereco.setText("Referência");

        JLEmail.setText("Marca");

        JLTelefone.setText("Aplicação");

        JLCPF.setText("Valor de compra ");

        JLCPF1.setText("Valor de Venda ");

        JLCPF2.setText("Quantidade");

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("PEÇAS");
        jScrollPane2.setViewportView(jTextArea2);

        BTSalvar1.setText("Salvar");
        BTSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTSalvar1ActionPerformed(evt);
            }
        });

        BTAlterar1.setText("Alterar");
        BTAlterar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTAlterar1ActionPerformed(evt);
            }
        });

        BTExcluir1.setText("Excluir");
        BTExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTExcluir1ActionPerformed(evt);
            }
        });

        BTExcluir2.setText("Buscar");
        BTExcluir2.setActionCommand("Buscar");
        BTExcluir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTExcluir2ActionPerformed(evt);
            }
        });

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(Tabela);

        javax.swing.GroupLayout JPanePrincipalLayout = new javax.swing.GroupLayout(JPanePrincipal);
        JPanePrincipal.setLayout(JPanePrincipalLayout);
        JPanePrincipalLayout.setHorizontalGroup(
            JPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanePrincipalLayout.createSequentialGroup()
                .addGroup(JPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLEndereco)
                    .addGroup(JPanePrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(JPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLTelefone)
                            .addComponent(JLCPF)
                            .addComponent(JLEmail)
                            .addComponent(JLNome)
                            .addComponent(JLCPF1)
                            .addComponent(JLCPF2))))
                .addGap(12, 12, 12)
                .addGroup(JPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanePrincipalLayout.createSequentialGroup()
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(JPanePrincipalLayout.createSequentialGroup()
                        .addGroup(JPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(JTEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTEndereco, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTNome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanePrincipalLayout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41))
                            .addComponent(jTextField8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
            .addGroup(JPanePrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BTSalvar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTAlterar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTExcluir1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTExcluir2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPanePrincipalLayout.setVerticalGroup(
            JPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanePrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(JPanePrincipalLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLNome)
                            .addComponent(JTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(JPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLEndereco)
                            .addComponent(JTEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(JPanePrincipalLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(16, 16, 16)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanePrincipalLayout.createSequentialGroup()
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLCPF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLCPF1)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(JLTelefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLCPF2)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTSalvar1)
                    .addComponent(BTAlterar1)
                    .addComponent(BTExcluir1)
                    .addComponent(BTExcluir2))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("PEÇAS ");
        jScrollPane1.setViewportView(jTextArea1);

        BTSalvar.setText("Salvar");
        BTSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTSalvarActionPerformed(evt);
            }
        });

        BTAlterar.setText("Alterar");
        BTAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTAlterarActionPerformed(evt);
            }
        });

        BTExcluir.setText("Excluir");
        BTExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPanePrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 164, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BTSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTExcluir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JPanePrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTSalvar)
                    .addComponent(BTAlterar)
                    .addComponent(BTExcluir))
                .addContainerGap(111, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BTSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTSalvarActionPerformed
        if (evt.getSource().equals(BTSalvar)) {
            Cliente cliente = new Cliente();
            cliente.setName(JTNome.getText());
            cliente.setEndereco(JTEndereco.getText());
            cliente.setEmail(JTNome.getText());
            cliente.setTelefone(JTNome.getText());
            cliente.setCPF(JTNome.getText());
            BancoJPA banco = new BancoJPA();
            banco.inserir(cliente);
            atualiza();
            JOptionPane.showMessageDialog(rootPane, "Cliente Adicionado");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Erro ao Salvar");
        }

    }//GEN-LAST:event_BTSalvarActionPerformed

    private void BTAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTAlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTAlterarActionPerformed

    private void BTExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTExcluirActionPerformed
        // TODO add your handling code here:
        Cliente cliente = new Cliente();
        cliente.setName(JTNome.getText());
        cliente.setEndereco(JTEndereco.getText());
        cliente.setEmail(JTNome.getText());
        cliente.setTelefone(JTNome.getText());
        cliente.setCPF(JTNome.getText());
        BancoJPA banco = new BancoJPA();
        banco.excluir(cliente);
    }//GEN-LAST:event_BTExcluirActionPerformed

    private void BTSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTSalvar1ActionPerformed
        if (evt.getSource().equals(BTSalvar)) {
            Cliente cliente = new Cliente();
            cliente.setName(JTNome.getText());
            cliente.setEndereco(JTEndereco.getText());
            cliente.setEmail(JTNome.getText());
            cliente.setTelefone(JTNome.getText());
            cliente.setCPF(JTNome.getText());
            BancoJPA banco = new BancoJPA();
            banco.inserir(cliente);
            atualiza();
            JOptionPane.showMessageDialog(rootPane, "Cliente Adicionado");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Erro ao Salvar");
        }

    }//GEN-LAST:event_BTSalvar1ActionPerformed

    private void BTAlterar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTAlterar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTAlterar1ActionPerformed

    private void BTExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTExcluir1ActionPerformed
        // TODO add your handling code here:
        Cliente cliente = new Cliente();
        cliente.setName(JTNome.getText());
        cliente.setEndereco(JTEndereco.getText());
        cliente.setEmail(JTNome.getText());
        cliente.setTelefone(JTNome.getText());
        cliente.setCPF(JTNome.getText());
        BancoJPA banco = new BancoJPA();
        banco.excluir(cliente);
    }//GEN-LAST:event_BTExcluir1ActionPerformed

    private void BTExcluir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTExcluir2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTExcluir2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTAlterar;
    private javax.swing.JButton BTAlterar1;
    private javax.swing.JButton BTExcluir;
    private javax.swing.JButton BTExcluir1;
    private javax.swing.JButton BTExcluir2;
    private javax.swing.JButton BTSalvar;
    private javax.swing.JButton BTSalvar1;
    private javax.swing.JLabel JLCPF;
    private javax.swing.JLabel JLCPF1;
    private javax.swing.JLabel JLCPF2;
    private javax.swing.JLabel JLEmail;
    private javax.swing.JLabel JLEndereco;
    private javax.swing.JLabel JLNome;
    private javax.swing.JLabel JLTelefone;
    private javax.swing.JPanel JPanePrincipal;
    private javax.swing.JTextField JTEmail;
    private javax.swing.JTextField JTEndereco;
    private javax.swing.JTextField JTNome;
    private javax.swing.JTable Tabela;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
