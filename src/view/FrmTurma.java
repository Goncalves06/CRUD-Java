/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import javax.swing.table.DefaultTableModel; // Para manipular o modelo da tabela
import javax.swing.JOptionPane;            // Para exibir mensagens ao usuário
import java.util.List;                     // Para trabalhar com listas
import modelo.Turma;                       // Classe Turma (modelo)
import controller.TurmaControl;            // Classe de controle das turmas



/**
 *
 * @author User
 */
public class FrmTurma extends javax.swing.JFrame {

    private final TurmaControl turmaControl = new TurmaControl();
    /**
     * Creates new form FrmTurma
     */
    public FrmTurma() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtdescricao = new javax.swing.JTextField();
        btnadc = new javax.swing.JButton();
        btnalt = new javax.swing.JButton();
        btndel = new javax.swing.JButton();
        btnlis = new javax.swing.JButton();
        JScrollPane1 = new javax.swing.JScrollPane();
        tblturma = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Gereciamento de Turmas");

        jLabel3.setText("id");

        jLabel4.setText("Descricao");

        txtdescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdescricaoActionPerformed(evt);
            }
        });

        btnadc.setText("Adcionar");
        btnadc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadcActionPerformed(evt);
            }
        });

        btnalt.setText("Alterar");
        btnalt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaltActionPerformed(evt);
            }
        });

        btndel.setText("Deletar");
        btndel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelActionPerformed(evt);
            }
        });

        btnlis.setText("Listar");
        btnlis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlisActionPerformed(evt);
            }
        });

        JScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JScrollPane1MouseClicked(evt);
            }
        });

        tblturma.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "id", "descricao"
            }
        ));
        JScrollPane1.setViewportView(tblturma);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(77, 77, 77)
                .addComponent(jLabel1)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel4)))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnadc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnalt)
                        .addGap(12, 12, 12)
                        .addComponent(btndel)
                        .addGap(18, 18, 18)
                        .addComponent(btnlis)))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnadc)
                    .addComponent(btnalt)
                    .addComponent(btndel)
                    .addComponent(btnlis))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtdescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdescricaoActionPerformed

    private void btnadcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadcActionPerformed
    String descricao = txtdescricao.getText();
    if (!descricao.isEmpty()) {
        turmaControl.adicionar(descricao);
        JOptionPane.showMessageDialog(this, "Turma adicionada com sucesso!");
        tblturma(); // Atualiza a tabela
        txtdescricao.setText(""); // Limpa o campo
    } else {
        JOptionPane.showMessageDialog(this, "O campo descrição não pode estar vazio!");
    }

    }//GEN-LAST:event_btnadcActionPerformed

    private void btnaltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaltActionPerformed
        String descricao = txtdescricao.getText();
    try {
        int id = Integer.parseInt(txtid.getText());
        if (!descricao.isEmpty()) {
            turmaControl.alterar(descricao, id);
            JOptionPane.showMessageDialog(this, "Turma alterada com sucesso!");
            tblturma(); // Atualiza a tabela
            txtdescricao.setText(""); // Limpa os campos
            txtid.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "O campo descrição não pode estar vazio!");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "ID inválido! Insira um número válido.");
    }
    }//GEN-LAST:event_btnaltActionPerformed

    private void btndelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelActionPerformed
        try {
        int id = Integer.parseInt(txtid.getText());
        turmaControl.deletar(id);
        JOptionPane.showMessageDialog(this, "Turma deletada com sucesso!");
        tblturma(); // Atualiza a tabela
        txtid.setText(""); // Limpa o campo
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "ID inválido! Insira um número válido.");
    }
    }//GEN-LAST:event_btndelActionPerformed

    private void btnlisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlisActionPerformed
         tblturma();
    }//GEN-LAST:event_btnlisActionPerformed

    private void JScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JScrollPane1MouseClicked

    List<Turma> turmas = turmaControl.listar(""); // Obtém a lista de turmas
    DefaultTableModel model = (DefaultTableModel) tblturma.getModel(); // Obtém o modelo da tabela
    model.setRowCount(0); // Limpa as linhas existentes na tabela

    // Adiciona as turmas na tabela
    for (Turma t : turmas) {
        model.addRow(new Object[]{t.getId(), t.getDescricao()});
    }

    }//GEN-LAST:event_JScrollPane1MouseClicked

    private void tblturma() {
    List<Turma> turmas = turmaControl.listar(""); // Obtém a lista de turmas

    // Atualiza a tabela diretamente
    DefaultTableModel model = (DefaultTableModel) tblturma.getModel(); 
    model.setRowCount(0); // Limpa as linhas existentes na tabela

    for (Turma t : turmas) {
        model.addRow(new Object[]{t.getId(), t.getDescricao()}); // Adiciona os dados
    }
}

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
            java.util.logging.Logger.getLogger(FrmTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTurma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane JScrollPane1;
    private javax.swing.JButton btnadc;
    private javax.swing.JButton btnalt;
    private javax.swing.JButton btndel;
    private javax.swing.JButton btnlis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTable tblturma;
    private javax.swing.JTextField txtdescricao;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
}
