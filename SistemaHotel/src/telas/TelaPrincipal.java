/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import java.util.Calendar;
import static java.util.Calendar.DATE;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;
import java.util.GregorianCalendar;



/**
 *
 * @author Lucas
 */
public class TelaPrincipal extends javax.swing.JFrame {

    
    /**
     * Creates new form TelaPrincipal
     */
    
    
    public TelaPrincipal() {
        initComponents();
        colocarData();
       
       // setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        lblTipoUser = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        lblFecha = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuReservas = new javax.swing.JMenu();
        menuCadReserva = new javax.swing.JMenuItem();
        manuConReserva = new javax.swing.JMenuItem();
        menuFinReserva = new javax.swing.JMenuItem();
        MenuConsumo = new javax.swing.JMenu();
        menuVenProduto = new javax.swing.JMenuItem();
        menuVenServicos = new javax.swing.JMenuItem();
        jmenu1 = new javax.swing.JMenu();
        jmenu = new javax.swing.JMenu();
        menuCadFuncionario = new javax.swing.JMenuItem();
        menuConFuncionarios = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        menuConFornecedor = new javax.swing.JMenuItem();
        menuCadFornecedor = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        manuCadProduto = new javax.swing.JMenuItem();
        menuConProduto = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        manuCadServico = new javax.swing.JMenuItem();
        menuConServico = new javax.swing.JMenuItem();
        MenuRelatorios = new javax.swing.JMenu();
        Financeiro = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        MenuFinanceiro = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        menuCadPagar = new javax.swing.JMenuItem();
        menuConPagar = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        menuCadReceber = new javax.swing.JMenuItem();
        menuConReceber = new javax.swing.JMenuItem();
        menuFinBalanco = new javax.swing.JMenuItem();
        MenuFerramentas = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        MenuFerraments = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/1666647919423.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel1.setText("Sistema Hotel Projeto Integrador - Sistema desevolvido por Lucas Almeida e Tobias Alvarez");
        jPanel1.add(jLabel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/GzaW3YMjL3RBvN2b.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 90, -1));

        jLabel4.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel4.setText("Host Manager");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, 20));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 250, 10));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 610, 270, 10));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, 250, 10));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 350, 250, 10));

        jLabel5.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        jLabel5.setText("Horario do sistema");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 250, 10));

        jLabel6.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        jLabel6.setText("Grau de acesso:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        lblTipoUser.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        lblTipoUser.setText("Texto");
        jPanel2.add(lblTipoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        jLabel9.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        jLabel9.setText("Usuario:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        lblUsuario.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        lblUsuario.setText("Nome");
        jPanel2.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 220, 250, 10));

        jButton1.setText("Desconectar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, 30));
        jPanel2.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 70, 30));
        jPanel2.add(lblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 70, 30));

        jButton2.setText("SAIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        MenuReservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/hotel_bell_doorbell_hotel_reception_icon_196778.png"))); // NOI18N
        MenuReservas.setText("Reservas    |      ");
        MenuReservas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        menuCadReserva.setText("Cadastrar Reserva");
        menuCadReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuCadReservaMouseClicked(evt);
            }
        });
        menuCadReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadReservaActionPerformed(evt);
            }
        });
        MenuReservas.add(menuCadReserva);

        manuConReserva.setText("Consultar Reserva");
        manuConReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manuConReservaActionPerformed(evt);
            }
        });
        MenuReservas.add(manuConReserva);

        menuFinReserva.setText("Finalizar Reserva");
        menuFinReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFinReservaActionPerformed(evt);
            }
        });
        MenuReservas.add(menuFinReserva);

        jMenuBar1.add(MenuReservas);

        MenuConsumo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cashier_machine_cash_register_pos_icon_225201.png"))); // NOI18N
        MenuConsumo.setText("Vendas    |      ");
        MenuConsumo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        menuVenProduto.setText("Produtos");
        menuVenProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVenProdutoActionPerformed(evt);
            }
        });
        MenuConsumo.add(menuVenProduto);

        menuVenServicos.setText("Servicos");
        menuVenServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVenServicosActionPerformed(evt);
            }
        });
        MenuConsumo.add(menuVenServicos);

        jMenuBar1.add(MenuConsumo);

        jmenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/signupsign_inscribirs_2798.png"))); // NOI18N
        jmenu1.setText("Cadastros    |      ");
        jmenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jmenu.setText("Funcionarios");

        menuCadFuncionario.setText("Cadastrar");
        menuCadFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadFuncionarioActionPerformed(evt);
            }
        });
        jmenu.add(menuCadFuncionario);

        menuConFuncionarios.setText("Consultar");
        menuConFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConFuncionariosActionPerformed(evt);
            }
        });
        jmenu.add(menuConFuncionarios);

        jmenu1.add(jmenu);

        jMenu1.setText("Fornecedores");

        menuConFornecedor.setText("Consultar");
        menuConFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConFornecedorActionPerformed(evt);
            }
        });
        jMenu1.add(menuConFornecedor);

        menuCadFornecedor.setText("Cadastrar");
        menuCadFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadFornecedorActionPerformed(evt);
            }
        });
        jMenu1.add(menuCadFornecedor);

        jmenu1.add(jMenu1);

        jMenu2.setText("Produtos");

        manuCadProduto.setText("Cadastrar");
        jMenu2.add(manuCadProduto);

        menuConProduto.setText("Consultar");
        jMenu2.add(menuConProduto);

        jmenu1.add(jMenu2);

        jMenu3.setText("Servicos");

        manuCadServico.setText("Cadastrar");
        manuCadServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manuCadServicoActionPerformed(evt);
            }
        });
        jMenu3.add(manuCadServico);

        menuConServico.setText("Consultar");
        menuConServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConServicoActionPerformed(evt);
            }
        });
        jMenu3.add(menuConServico);

        jmenu1.add(jMenu3);

        jMenuBar1.add(jmenu1);

        MenuRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/5_icon-icons.com_68890.png"))); // NOI18N
        MenuRelatorios.setText("Relatorios    |      ");
        MenuRelatorios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Financeiro.setText("Financeiro");

        jMenuItem4.setText("Contas a Pagar");
        Financeiro.add(jMenuItem4);

        jMenuItem5.setText("Contas a Receber");
        Financeiro.add(jMenuItem5);

        jMenuItem6.setText("Balanco");
        Financeiro.add(jMenuItem6);

        MenuRelatorios.add(Financeiro);

        jMenu7.setText("Reservas");

        jMenuItem7.setText("Quartos Disponiveis");
        jMenu7.add(jMenuItem7);

        jMenuItem8.setText("Quartos Ocupados");
        jMenu7.add(jMenuItem8);

        jMenuItem9.setText("Reservas Futuras");
        jMenu7.add(jMenuItem9);

        MenuRelatorios.add(jMenu7);

        jMenu8.setText("Vendas");
        MenuRelatorios.add(jMenu8);

        jMenuItem1.setText("Hospedes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        MenuRelatorios.add(jMenuItem1);

        jMenuItem2.setText("Funcionarios");
        MenuRelatorios.add(jMenuItem2);

        jMenuItem3.setText("Fornecedores");
        MenuRelatorios.add(jMenuItem3);

        jMenuBar1.add(MenuRelatorios);

        MenuFinanceiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coin_money_icon-icons.com_51091.png"))); // NOI18N
        MenuFinanceiro.setText("Financeiro    |      ");
        MenuFinanceiro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenu4.setText("Contas a Pagar");

        menuCadPagar.setText("Cadastrar");
        jMenu4.add(menuCadPagar);

        menuConPagar.setText("Consultar");
        jMenu4.add(menuConPagar);

        MenuFinanceiro.add(jMenu4);

        jMenu5.setText("Contas a Receber");

        menuCadReceber.setText("Cadastrar");
        jMenu5.add(menuCadReceber);

        menuConReceber.setText("Consultar");
        jMenu5.add(menuConReceber);

        MenuFinanceiro.add(jMenu5);

        menuFinBalanco.setText("Balanço");
        MenuFinanceiro.add(menuFinBalanco);

        jMenuBar1.add(MenuFinanceiro);

        MenuFerramentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/3668850-insurance-protection-safety-shield_108037.png"))); // NOI18N
        MenuFerramentas.setText("Seguranca    |      ");
        MenuFerramentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem11.setText("Fazer Backup");
        MenuFerramentas.add(jMenuItem11);

        jMenuItem12.setText("Restaurar Backup");
        MenuFerramentas.add(jMenuItem12);

        jMenuBar1.add(MenuFerramentas);

        MenuFerraments.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/3592847-general-office-repair-repair-tool-screwdriver-tools-wrench_107766.png"))); // NOI18N
        MenuFerraments.setText("Ferramentas    |      ");
        MenuFerraments.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem13.setText("Sobre o Sistema");
        MenuFerraments.add(jMenuItem13);

        jMenu6.setText("Tela de Fundo");

        jMenuItem10.setText("Add Imagem");
        jMenu6.add(jMenuItem10);

        jMenuItem14.setText("Remover Imagem");
        jMenu6.add(jMenuItem14);

        jMenuItem15.setText("Restaurar Padrao");
        jMenu6.add(jMenuItem15);

        MenuFerraments.add(jMenu6);

        jMenuBar1.add(MenuFerraments);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void colocarData(){
        Calendar fecha = new GregorianCalendar();
    
        String anho = Integer.toString(fecha.get(YEAR));
        String mes = Integer.toString(fecha.get(MONTH));
        String dia = Integer.toString(fecha.get(DATE));

        String dataCompleta = dia+"-"+mes+"-"+anho;

        String hora = Integer.toString(fecha.get(Calendar.HOUR_OF_DAY));
        String minuto = Integer.toString(fecha.get(Calendar.MINUTE));

        String horaCompleta = hora+":"+minuto;
        lblHora.setText(horaCompleta);
        lblFecha.setText(dataCompleta);
    }
    

    public void setUsuarioLogado(String usuario) {
        lblUsuario.setText(usuario);
    }
    
    public void setTipoUserLogado(String tipoUser){
        lblTipoUser.setText(tipoUser);
    }


    
    private void menuCadFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadFuncionarioActionPerformed
        FuncionariosTela tela = new FuncionariosTela();
        tela.setVisible(true);
    }//GEN-LAST:event_menuCadFuncionarioActionPerformed

    private void menuConFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConFuncionariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuConFuncionariosActionPerformed

    private void menuConServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConServicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuConServicoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        this.dispose();
       
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void menuFinReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFinReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuFinReservaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void menuCadReservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCadReservaMouseClicked
        TelaCadReserva tela = new TelaCadReserva();
        tela.setVisible(true);
    }//GEN-LAST:event_menuCadReservaMouseClicked

    private void menuCadReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadReservaActionPerformed
        TelaCadReserva tela = new TelaCadReserva();
        tela.setVisible(true);
    }//GEN-LAST:event_menuCadReservaActionPerformed

    private void manuConReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manuConReservaActionPerformed
        TelaConReserva tela = new TelaConReserva();
        tela.setVisible(true);
    }//GEN-LAST:event_manuConReservaActionPerformed

    private void menuVenProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVenProdutoActionPerformed
        VendaProdutos tela = new VendaProdutos();
        tela.setVisible(true);
    }//GEN-LAST:event_menuVenProdutoActionPerformed

    private void menuVenServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVenServicosActionPerformed
        VendaServicos tela = new VendaServicos();
        tela.setVisible(true);
    }//GEN-LAST:event_menuVenServicosActionPerformed

    private void manuCadServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manuCadServicoActionPerformed
        CadastroServico tela = new CadastroServico();
        tela.setVisible(true);
    }//GEN-LAST:event_manuCadServicoActionPerformed

    private void menuCadFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadFornecedorActionPerformed
        // TODO add your handling code here:
        CadastroFornecedor tela = new CadastroFornecedor();
        tela.setVisible(true);
                
    }//GEN-LAST:event_menuCadFornecedorActionPerformed

    private void menuConFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuConFornecedorActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Financeiro;
    private javax.swing.JMenu MenuConsumo;
    private javax.swing.JMenu MenuFerramentas;
    private javax.swing.JMenu MenuFerraments;
    private javax.swing.JMenu MenuFinanceiro;
    private javax.swing.JMenu MenuRelatorios;
    private javax.swing.JMenu MenuReservas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JMenu jmenu;
    private javax.swing.JMenu jmenu1;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblTipoUser;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JMenuItem manuCadProduto;
    private javax.swing.JMenuItem manuCadServico;
    private javax.swing.JMenuItem manuConReserva;
    private javax.swing.JMenuItem menuCadFornecedor;
    private javax.swing.JMenuItem menuCadFuncionario;
    private javax.swing.JMenuItem menuCadPagar;
    private javax.swing.JMenuItem menuCadReceber;
    private javax.swing.JMenuItem menuCadReserva;
    private javax.swing.JMenuItem menuConFornecedor;
    private javax.swing.JMenuItem menuConFuncionarios;
    private javax.swing.JMenuItem menuConPagar;
    private javax.swing.JMenuItem menuConProduto;
    private javax.swing.JMenuItem menuConReceber;
    private javax.swing.JMenuItem menuConServico;
    private javax.swing.JMenuItem menuFinBalanco;
    private javax.swing.JMenuItem menuFinReserva;
    private javax.swing.JMenuItem menuVenProduto;
    private javax.swing.JMenuItem menuVenServicos;
    // End of variables declaration//GEN-END:variables
}
