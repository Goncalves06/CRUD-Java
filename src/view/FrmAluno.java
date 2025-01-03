/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import javax.swing.JOptionPane; 
import controller.AlunoControl; 
import modelo.Aluno; 
import javax.swing.table.DefaultTableModel;
import view.FrmTurma;
import view.FrmTurmaAluno;



/**
 *
 * @author User
 */
public class FrmAluno extends javax.swing.JFrame {

    /**
     * Creates new form FrmAluno
     */
    public FrmAluno() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        btnpes = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btncad = new javax.swing.JButton();
        btnalt = new javax.swing.JButton();
        btnexcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblaluno = new javax.swing.JTable();
        txtnome = new javax.swing.JTextField();
        txtnasc = new javax.swing.JTextField();
        txtidade = new javax.swing.JTextField();
        txtrenda = new javax.swing.JTextField();
        btnGerTurma = new javax.swing.JButton();
        btnGerTurmaAluno = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Gerenciamento de Alunos");

        jLabel2.setText("id");

        btnpes.setText("Pesquisar");
        btnpes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesActionPerformed(evt);
            }
        });

        jLabel3.setText("Nome");

        jLabel4.setText("Data Nascimento");

        jLabel5.setText("Idade");

        jLabel6.setText("Renda");

        btncad.setText("Cadastrar");
        btncad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncadActionPerformed(evt);
            }
        });

        btnalt.setText("Alterar");
        btnalt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaltActionPerformed(evt);
            }
        });

        btnexcluir.setText("Excluir");
        btnexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexcluirActionPerformed(evt);
            }
        });

        tblaluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "Nome", "Nascimento", "Idade", "Renda"
            }
        ));
        tblaluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblalunoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblaluno);

        txtnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomeActionPerformed(evt);
            }
        });

        btnGerTurma.setText("Gerenciamento de turma");
        btnGerTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerTurmaActionPerformed(evt);
            }
        });

        btnGerTurmaAluno.setText("Gerenciamento Turma/aluno");
        btnGerTurmaAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerTurmaAlunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(15, 15, 15)
                                                .addComponent(jLabel4)
                                                .addGap(18, 18, 18))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(37, 37, 37)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel6)
                                                    .addComponent(jLabel5))
                                                .addGap(54, 54, 54)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtnasc)
                                            .addComponent(txtrenda, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                            .addComponent(txtidade, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btncad)
                                        .addGap(33, 33, 33)
                                        .addComponent(btnalt)))
                                .addGap(30, 30, 30)
                                .addComponent(btnexcluir))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel3)
                                .addGap(53, 53, 53)
                                .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel2)
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnpes)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 12, Short.MAX_VALUE)
                                .addComponent(btnGerTurma)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGerTurmaAluno)
                                .addGap(32, 32, 32)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGerTurma)
                    .addComponent(btnGerTurmaAluno))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnpes)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtrenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnexcluir)
                            .addComponent(btnalt)
                            .addComponent(btncad)))
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncadActionPerformed
        try {
    AlunoControl a = new AlunoControl();
    String nome = txtnome.getText();
    String data_nasc = txtnasc.getText();
    int idade = Integer.parseInt(txtidade.getText());
    double renda = Double.parseDouble(txtrenda.getText().replaceAll(",", "."));
    a.adicionar(nome, data_nasc, idade, renda);
    JOptionPane.showMessageDialog(null, "Gravado");
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, "Valores inválidos");
}

btnpesActionPerformed(null);

    }//GEN-LAST:event_btncadActionPerformed

    private void btnpesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesActionPerformed
        String query = "";
if (txtid.getText().equals("")) {
    query = "";
} else {
    query = "where id=" + txtid.getText();
}

AlunoControl a = new AlunoControl();
DefaultTableModel model = (DefaultTableModel) tblaluno.getModel();
model.setNumRows(0);

for (Aluno al : a.listar(query)) {
    model.addRow(new Object[] {
        al.getId(),
        al.getNome(),
        al.getData_nasc(),
        al.getIdade(),
        al.getRenda()
    });
}

    }//GEN-LAST:event_btnpesActionPerformed

    private void btnaltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaltActionPerformed
        try {
    AlunoControl a = new AlunoControl();
    int id = Integer.parseInt(txtid.getText());
    String nome = txtnome.getText();
    String data_nasc = txtnasc.getText();
    int idade = Integer.parseInt(txtidade.getText());
    double renda = Double.parseDouble(txtrenda.getText().replaceAll(",", "."));
    a.alterar(nome, data_nasc, idade, renda, id);
    JOptionPane.showMessageDialog(null, "Alterado");
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, "Valores inválidos");
}

btnpesActionPerformed(null);

    }//GEN-LAST:event_btnaltActionPerformed

    private void btnexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcluirActionPerformed
        try {
            AlunoControl a = new AlunoControl();
    int id = Integer.parseInt(txtid.getText());
    a.deletar(id);
    JOptionPane.showMessageDialog(null, "Deletado");
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, "Valores inválidos");
}

btnpesActionPerformed(null);

    }//GEN-LAST:event_btnexcluirActionPerformed

    private void txtnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomeActionPerformed

    private void tblalunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblalunoMouseClicked
        if (evt.getClickCount() == 1) {
    txtid.setText(tblaluno.getValueAt(tblaluno.getSelectedRow(), 0).toString());
    txtnome.setText(tblaluno.getValueAt(tblaluno.getSelectedRow(), 1).toString());
    txtnasc.setText(tblaluno.getValueAt(tblaluno.getSelectedRow(), 2).toString());
    txtidade.setText(tblaluno.getValueAt(tblaluno.getSelectedRow(), 3).toString());
    txtrenda.setText(tblaluno.getValueAt(tblaluno.getSelectedRow(), 4).toString());
}

    }//GEN-LAST:event_tblalunoMouseClicked

    private void btnGerTurmaAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerTurmaAlunoActionPerformed
    
    FrmTurmaAluno frmTurmaAluno = new FrmTurmaAluno();
    
    frmTurmaAluno.setVisible(true);
    
    this.dispose();
    }//GEN-LAST:event_btnGerTurmaAlunoActionPerformed

    private void btnGerTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerTurmaActionPerformed
    
    FrmTurma frmTurma = new FrmTurma();
    
    frmTurma.setVisible(true);
    
    this.dispose();
    }//GEN-LAST:event_btnGerTurmaActionPerformed

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
            java.util.logging.Logger.getLogger(FrmAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGerTurma;
    private javax.swing.JButton btnGerTurmaAluno;
    private javax.swing.JButton btnalt;
    private javax.swing.JButton btncad;
    private javax.swing.JButton btnexcluir;
    private javax.swing.JButton btnpes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblaluno;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtidade;
    private javax.swing.JTextField txtnasc;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtrenda;
    // End of variables declaration//GEN-END:variables
}
