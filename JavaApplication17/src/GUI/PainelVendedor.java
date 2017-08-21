/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Objetos.Cliente;
import Objetos.JNumberTextField;
import static Tools.AutoBuild.setIntegerComboBox;
import static Tools.AutoBuild.validaNums;
import Tools.Msgs;
import Tools.Validadores;
import java.awt.Toolkit;

/**
 *
 * @author informatica
 */
public class PainelVendedor extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public PainelVendedor() {
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

        tabsVendedor = new javax.swing.JTabbedPane();
        tabAddCliente = new javax.swing.JPanel();
        newClienteNomeLabel = new javax.swing.JLabel();
        newClienteNome = new javax.swing.JTextField();
        newClienteCPFLabel = new javax.swing.JLabel();
        newClienteCPF = new JNumberTextField(11);
        newClienteIdadeLabel = new javax.swing.JLabel();
        newClienteIdade = new JNumberTextField(3);
        newClienteSexoLabel = new javax.swing.JLabel();
        newClienteSexo = new javax.swing.JComboBox<>();
        newClienteEnderecoLabel = new javax.swing.JLabel();
        newClienteEndereco = new javax.swing.JTextField();
        newClienteBtnOK = new javax.swing.JButton();
        newClienteBtnClear = new javax.swing.JButton();
        tabRmvCliente = new javax.swing.JPanel();
        rmvClienteOptLabel = new javax.swing.JLabel();
        rmvClienteOpt = new javax.swing.JComboBox<>();
        rmvClienteBtnOK = new javax.swing.JButton();
        rmvClienteBtnClear = new javax.swing.JButton();
        tabVenda = new javax.swing.JPanel();
        vendaFilmeLabel = new javax.swing.JLabel();
        vendaFilme = new javax.swing.JComboBox<>();
        vendaSessaoLabel = new javax.swing.JLabel();
        vendaSessao = new javax.swing.JComboBox<>();
        vendaQuantIngressoLabel = new javax.swing.JLabel();
        vendaQuantIngresso = setIntegerComboBox(0, 10);
        vendaCPFClienteLabel = new javax.swing.JLabel();
        vendaCPFCliente = new JNumberTextField(11);
        vendaBtnOK = new javax.swing.JButton();
        vendaBtnClear = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        labelEstaLogado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
        setResizable(false);

        newClienteNomeLabel.setText("Nome:");

        newClienteNome.setNextFocusableComponent(newClienteCPF);
        newClienteNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newClienteNomeActionPerformed(evt);
            }
        });

        newClienteCPFLabel.setText("CPF (somente digitos):");

        newClienteCPF.setNextFocusableComponent(newClienteIdade);
        newClienteCPF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                newClienteCPFFocusGained(evt);
            }
        });
        newClienteCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newClienteCPFActionPerformed(evt);
            }
        });
        newClienteCPF.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                newClienteCPFPropertyChange(evt);
            }
        });

        newClienteIdadeLabel.setText("Idade:");

        newClienteIdade.setNextFocusableComponent(newClienteSexo);
        newClienteIdade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                newClienteIdadeFocusLost(evt);
            }
        });
        newClienteIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newClienteIdadeActionPerformed(evt);
            }
        });
        newClienteIdade.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                newClienteIdadePropertyChange(evt);
            }
        });
        newClienteIdade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                newClienteIdadeKeyTyped(evt);
            }
        });

        newClienteSexoLabel.setText("Sexo:");

        newClienteSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        newClienteSexo.setNextFocusableComponent(newClienteEndereco);
        newClienteSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newClienteSexoActionPerformed(evt);
            }
        });

        newClienteEnderecoLabel.setText("Endereço:");

        newClienteEndereco.setToolTipText("Digite o endereço do cliente a ser cadastrado.");
        newClienteEndereco.setNextFocusableComponent(newClienteBtnOK);

        newClienteBtnOK.setText("Confirmar");
        newClienteBtnOK.setNextFocusableComponent(newClienteBtnClear);
        newClienteBtnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newClienteBtnOKActionPerformed(evt);
            }
        });

        newClienteBtnClear.setText("Limpar Campos");
        newClienteBtnClear.setNextFocusableComponent(newClienteNome);
        newClienteBtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newClienteBtnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabAddClienteLayout = new javax.swing.GroupLayout(tabAddCliente);
        tabAddCliente.setLayout(tabAddClienteLayout);
        tabAddClienteLayout.setHorizontalGroup(
            tabAddClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabAddClienteLayout.createSequentialGroup()
                .addContainerGap(133, Short.MAX_VALUE)
                .addGroup(tabAddClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabAddClienteLayout.createSequentialGroup()
                        .addComponent(newClienteBtnOK)
                        .addGap(114, 114, 114)
                        .addComponent(newClienteBtnClear))
                    .addGroup(tabAddClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(newClienteEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                        .addComponent(newClienteEnderecoLabel)
                        .addComponent(newClienteSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(newClienteSexoLabel)
                        .addComponent(newClienteIdade)
                        .addComponent(newClienteIdadeLabel)
                        .addComponent(newClienteCPF)
                        .addComponent(newClienteCPFLabel)
                        .addComponent(newClienteNome)
                        .addComponent(newClienteNomeLabel)))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        tabAddClienteLayout.setVerticalGroup(
            tabAddClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabAddClienteLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(newClienteNomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(newClienteCPFLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newClienteCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newClienteIdadeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newClienteIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newClienteSexoLabel)
                .addGap(6, 6, 6)
                .addComponent(newClienteSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newClienteEnderecoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newClienteEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(tabAddClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newClienteBtnOK)
                    .addComponent(newClienteBtnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        tabsVendedor.addTab("Adicionar Cliente", tabAddCliente);

        rmvClienteOptLabel.setText("Selecione UM (1) cliente:");

        rmvClienteOpt.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        rmvClienteOpt.setNextFocusableComponent(rmvClienteBtnOK);

        rmvClienteBtnOK.setText("Confirmar");
        rmvClienteBtnOK.setNextFocusableComponent(rmvClienteBtnClear);

        rmvClienteBtnClear.setText("Limpar seleção");
        rmvClienteBtnClear.setMaximumSize(new java.awt.Dimension(79, 23));
        rmvClienteBtnClear.setMinimumSize(new java.awt.Dimension(79, 23));
        rmvClienteBtnClear.setNextFocusableComponent(rmvClienteOpt);
        rmvClienteBtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rmvClienteBtnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabRmvClienteLayout = new javax.swing.GroupLayout(tabRmvCliente);
        tabRmvCliente.setLayout(tabRmvClienteLayout);
        tabRmvClienteLayout.setHorizontalGroup(
            tabRmvClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabRmvClienteLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(tabRmvClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rmvClienteOptLabel)
                    .addGroup(tabRmvClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(tabRmvClienteLayout.createSequentialGroup()
                            .addComponent(rmvClienteBtnOK)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rmvClienteBtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(rmvClienteOpt, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        tabRmvClienteLayout.setVerticalGroup(
            tabRmvClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabRmvClienteLayout.createSequentialGroup()
                .addContainerGap(168, Short.MAX_VALUE)
                .addComponent(rmvClienteOptLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rmvClienteOpt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(tabRmvClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rmvClienteBtnOK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rmvClienteBtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(169, Short.MAX_VALUE))
        );

        tabsVendedor.addTab("Remover Cliente", tabRmvCliente);

        vendaFilmeLabel.setText("Filme:");

        vendaFilme.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        vendaFilme.setToolTipText("Seleção do filme, que o cliente deseja.");
        vendaFilme.setNextFocusableComponent(vendaSessao);
        vendaFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendaFilmeActionPerformed(evt);
            }
        });

        vendaSessaoLabel.setText("Sessão");

        vendaSessao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        vendaSessao.setToolTipText("Seleção da sessão que o cliente deseja.");
        vendaSessao.setNextFocusableComponent(vendaQuantIngresso);

        vendaQuantIngressoLabel.setText("Quantidade de ingressos:");

        vendaQuantIngresso.setNextFocusableComponent(vendaCPFCliente);

        vendaCPFClienteLabel.setText("CPF do Cliente (opcional):");

        vendaCPFCliente.setToolTipText("Cpf do cliente cadastrado.");
        vendaCPFCliente.setNextFocusableComponent(vendaBtnOK);
        vendaCPFCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendaCPFClienteActionPerformed(evt);
            }
        });

        vendaBtnOK.setText("Confirmar");
        vendaBtnOK.setNextFocusableComponent(vendaBtnClear);
        vendaBtnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendaBtnOKActionPerformed(evt);
            }
        });

        vendaBtnClear.setText("Limpar campos");
        vendaBtnClear.setNextFocusableComponent(vendaFilme);
        vendaBtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendaBtnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabVendaLayout = new javax.swing.GroupLayout(tabVenda);
        tabVenda.setLayout(tabVendaLayout);
        tabVendaLayout.setHorizontalGroup(
            tabVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabVendaLayout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addGroup(tabVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vendaQuantIngresso, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vendaQuantIngressoLabel)
                    .addGroup(tabVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(vendaCPFClienteLabel)
                        .addComponent(vendaSessaoLabel)
                        .addComponent(vendaFilmeLabel)
                        .addComponent(vendaSessao, 0, 374, Short.MAX_VALUE)
                        .addComponent(vendaFilme, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(tabVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tabVendaLayout.createSequentialGroup()
                            .addComponent(vendaBtnOK)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(vendaBtnClear))
                        .addComponent(vendaCPFCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        tabVendaLayout.setVerticalGroup(
            tabVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabVendaLayout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addComponent(vendaFilmeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vendaFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vendaSessaoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vendaSessao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vendaQuantIngressoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vendaQuantIngresso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(vendaCPFClienteLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vendaCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vendaBtnOK)
                    .addComponent(vendaBtnClear))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        tabsVendedor.addTab("Venda", tabVenda);

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        labelEstaLogado.setText("Você está logado como: *******");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabsVendedor)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelEstaLogado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabsVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogout)
                    .addComponent(labelEstaLogado))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vendaFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendaFilmeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vendaFilmeActionPerformed

    private void newClienteIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newClienteIdadeActionPerformed

    }//GEN-LAST:event_newClienteIdadeActionPerformed

    private void newClienteNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newClienteNomeActionPerformed

    }//GEN-LAST:event_newClienteNomeActionPerformed

    private void newClienteCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newClienteCPFActionPerformed

    }//GEN-LAST:event_newClienteCPFActionPerformed

    private void newClienteCPFPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_newClienteCPFPropertyChange
    }//GEN-LAST:event_newClienteCPFPropertyChange

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void newClienteBtnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newClienteBtnOKActionPerformed
        if (newClienteNome.getText().isEmpty()) {
            System.out.println("No name");
            newClienteNome.requestFocus();
            Msgs.displayErrorJOP("Erro! O nome não pode ser vazio.", this);
            return;
        }
        System.out.println(newClienteCPF.getText());
        if (newClienteCPF.getText().isEmpty()) {
            System.out.println("No CPF");
            Msgs.displayErrorJOP("Erro! O CPF não pode ser vazio.", this);
            newClienteCPF.requestFocus();
            return;
        } else if (newClienteCPF.getText().length() < 11) {
            System.out.println("CPF under 11.");
            Msgs.displayErrorJOP("Erro! O CPF não tem 11 caracteres.", this);
            newClienteCPF.requestFocus();
            return;
        }
        if (newClienteIdade.getText().isEmpty()) {
            System.out.println("No age");
            newClienteIdade.requestFocus();
            Msgs.displayErrorJOP("Erro! A idade não pode ser vazia.", this);
            return;
        }
        if (newClienteEndereco.getText().isEmpty()) {
            System.out.println("No address");
            newClienteEndereco.requestFocus();
            Msgs.displayErrorJOP("Erro! O endereço não pode ser vazio.", this);
        }
        Cliente cl = new Cliente(newClienteNome.getText(), newClienteEndereco.getText(), Integer.parseInt(newClienteIdade.getText()), (String) newClienteSexo.getSelectedItem(), newClienteCPF.getText());
        System.out.println(cl.getNome());
        System.out.println(cl.getEndereco());
        System.out.println(cl.getIdade());
        System.out.println(cl.getSexo());
        System.out.println(cl.getCPF());
        cl.sendToDB();
    }//GEN-LAST:event_newClienteBtnOKActionPerformed

    private void newClienteSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newClienteSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newClienteSexoActionPerformed

    private void newClienteBtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newClienteBtnClearActionPerformed
        newClienteCPF.setText("");
        newClienteEndereco.setText("");
        newClienteIdade.setText("");
        newClienteNome.setText("");
        newClienteSexo.setSelectedIndex(0);
    }//GEN-LAST:event_newClienteBtnClearActionPerformed

    private void newClienteIdadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newClienteIdadeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_newClienteIdadeKeyTyped

    private void newClienteIdadePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_newClienteIdadePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_newClienteIdadePropertyChange

    private void newClienteIdadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_newClienteIdadeFocusLost
        System.out.println(/*Integer.parseInt(*/newClienteIdade.getText()/*)*/);
        if (newClienteIdade.getText().isEmpty()) {
            System.out.println("Idade empty");
        } else if (Integer.parseInt(newClienteIdade.getText()) > 150) {
            newClienteIdade.setText("150");
        } else if (Integer.parseInt(newClienteIdade.getText()) < 18) {
            newClienteIdade.setText("18");
        }
    }//GEN-LAST:event_newClienteIdadeFocusLost

    private void newClienteCPFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_newClienteCPFFocusGained
        //newClienteCPF.setCaretPosition(0);
    }//GEN-LAST:event_newClienteCPFFocusGained

    private void rmvClienteBtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rmvClienteBtnClearActionPerformed
        rmvClienteOpt.setSelectedIndex(0);
    }//GEN-LAST:event_rmvClienteBtnClearActionPerformed

    private void vendaBtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendaBtnClearActionPerformed
        vendaCPFCliente.setText("");
        vendaFilme.setSelectedIndex(0);
        vendaQuantIngresso.setSelectedIndex(0);
        vendaSessao.setSelectedIndex(0);

    }//GEN-LAST:event_vendaBtnClearActionPerformed

    private void vendaCPFClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendaCPFClienteActionPerformed
        //vendaCPFCliente.setCaretPosition(0);
    }//GEN-LAST:event_vendaCPFClienteActionPerformed

    private void vendaBtnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendaBtnOKActionPerformed
        System.out.println(vendaCPFCliente.getText());
        if (vendaCPFCliente.getText().isEmpty()) {
            System.out.println("No CPF");
            Msgs.displayErrorJOP("Erro! O CPF não pode ser vazio.", this);
            vendaCPFCliente.requestFocus();
        } else if (vendaCPFCliente.getText().length() < 11) {
            System.out.println("CPF under 11.");
            Msgs.displayErrorJOP("Erro! O CPF não tem 11 caracteres.", this);
            vendaCPFCliente.requestFocus();
        }
    }//GEN-LAST:event_vendaBtnOKActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new PainelVendedor().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel labelEstaLogado;
    private javax.swing.JButton newClienteBtnClear;
    private javax.swing.JButton newClienteBtnOK;
    private javax.swing.JTextField newClienteCPF;
    private javax.swing.JLabel newClienteCPFLabel;
    private javax.swing.JTextField newClienteEndereco;
    private javax.swing.JLabel newClienteEnderecoLabel;
    private javax.swing.JTextField newClienteIdade;
    private javax.swing.JLabel newClienteIdadeLabel;
    private javax.swing.JTextField newClienteNome;
    private javax.swing.JLabel newClienteNomeLabel;
    private javax.swing.JComboBox<String> newClienteSexo;
    private javax.swing.JLabel newClienteSexoLabel;
    private javax.swing.JButton rmvClienteBtnClear;
    private javax.swing.JButton rmvClienteBtnOK;
    private javax.swing.JComboBox<String> rmvClienteOpt;
    private javax.swing.JLabel rmvClienteOptLabel;
    private javax.swing.JPanel tabAddCliente;
    private javax.swing.JPanel tabRmvCliente;
    private javax.swing.JPanel tabVenda;
    private javax.swing.JTabbedPane tabsVendedor;
    private javax.swing.JButton vendaBtnClear;
    private javax.swing.JButton vendaBtnOK;
    private javax.swing.JTextField vendaCPFCliente;
    private javax.swing.JLabel vendaCPFClienteLabel;
    private javax.swing.JComboBox<String> vendaFilme;
    private javax.swing.JLabel vendaFilmeLabel;
    private javax.swing.JComboBox<String> vendaQuantIngresso;
    private javax.swing.JLabel vendaQuantIngressoLabel;
    private javax.swing.JComboBox<String> vendaSessao;
    private javax.swing.JLabel vendaSessaoLabel;
    // End of variables declaration//GEN-END:variables
}
