
package ExamenGato2;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class GatoApp extends javax.swing.JFrame {

    private int turn=2;
    private int usarboton[]={0,0,0,0,0,0,0,0,0};
    private int jugador1gano[]={0,0,0,0,0,0,0,0,0};
    private int jugador2gano[]={0,0,0,0,0,0,0,0,0};
    private static int puntosJugador1=0;
    private static int puntosJugador2=0;
    private static String puntaje1="0";
    private static String puntaje2="0";
    private Usuario usuario;
    private Usuario usuario2;
    
    
    
    //ENLACE GITHUB
    //https://github.com/Gervasio-Flores-Isaac-Antonio/Gervasio_Flores_Isaac_3IV9_ExamenFinal_Gato.git
    //ENLACE GITHUB
    
    
    
    public int jugador1gano(){
        if(jugador1gano[0]==1 && jugador1gano[1]==1 && jugador1gano[2]==1){
            return 1;
        }
         if(jugador1gano[3]==1 && jugador1gano[4]==1 && jugador1gano[5]==1){
            return 1;
        }
          if(jugador1gano[6]==1 && jugador1gano[7]==1 && jugador1gano[8]==1){
            return 1;
        }
           if(jugador1gano[0]==1 && jugador1gano[3]==1 && jugador1gano[6]==1){
            return 1;
        }
           if(jugador1gano[1]==1 && jugador1gano[4]==1 && jugador1gano[7]==1){
            return 1;
        }
            if(jugador1gano[2]==1 && jugador1gano[5]==1 && jugador1gano[8]==1){
            return 1;
        }
             if(jugador1gano[2]==1 && jugador1gano[4]==1 && jugador1gano[6]==1){
            return 1;
        }
              if(jugador1gano[0]==1 && jugador1gano[4]==1 && jugador1gano[8]==1){
            return 1;
        }
            
                return 0;
    }
    public int jugador2gano(){
        if(jugador2gano[0]==1 && jugador2gano[1]==1 && jugador2gano[2]==1){
            return 1;
        }
         if(jugador2gano[3]==1 && jugador2gano[4]==1 && jugador2gano[5]==1){
            return 1;
        }
          if(jugador2gano[6]==1 && jugador2gano[7]==1 && jugador2gano[8]==1){
            return 1;
        }
           if(jugador2gano[0]==1 && jugador2gano[3]==1 && jugador2gano[6]==1){
            return 1;
        }
           if(jugador2gano[1]==1 && jugador2gano[4]==1 && jugador2gano[7]==1){
            return 1;
        }
            if(jugador2gano[2]==1 && jugador2gano[5]==1 && jugador2gano[8]==1){
            return 1;
        }
             if(jugador2gano[2]==1 && jugador2gano[4]==1 && jugador2gano[6]==1){
            return 1;
        }
              if(jugador2gano[0]==1 && jugador2gano[4]==1 && jugador2gano[8]==1){
            return 1;
        }
            
                return 0;
    }
    
    public GatoApp() {
         initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        Boton1 = new javax.swing.JButton();
        Boton3 = new javax.swing.JButton();
        Boton2 = new javax.swing.JButton();
        Boton4 = new javax.swing.JButton();
        Boton5 = new javax.swing.JButton();
        Boton7 = new javax.swing.JButton();
        Boton6 = new javax.swing.JButton();
        Boton8 = new javax.swing.JButton();
        Boton9 = new javax.swing.JButton();
        resetear = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        jLabel9.setText("Edad:");

        jLabel21.setText("jLabel21");

        jButton6.setText("jButton6");

        jButton7.setText("jButton7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Juego de Gato Clasico Isaac Gervasio 3IV9");
        setMinimumSize(new java.awt.Dimension(900, 745));
        setSize(new java.awt.Dimension(900, 745));
        getContentPane().setLayout(null);

        Boton1.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        Boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton1ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton1);
        Boton1.setBounds(20, 27, 166, 130);

        Boton3.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        Boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton3ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton3);
        Boton3.setBounds(430, 30, 166, 130);

        Boton2.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        Boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton2ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton2);
        Boton2.setBounds(226, 30, 170, 130);

        Boton4.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        Boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton4ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton4);
        Boton4.setBounds(20, 200, 166, 130);

        Boton5.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        Boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton5ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton5);
        Boton5.setBounds(226, 200, 170, 130);

        Boton7.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        Boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton7ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton7);
        Boton7.setBounds(20, 370, 166, 130);

        Boton6.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        Boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton6ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton6);
        Boton6.setBounds(430, 200, 166, 130);

        Boton8.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        Boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton8ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton8);
        Boton8.setBounds(226, 370, 170, 130);

        Boton9.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        Boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton9ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton9);
        Boton9.setBounds(430, 370, 166, 130);

        resetear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        resetear.setText("Reiniciar");
        resetear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetearActionPerformed(evt);
            }
        });
        getContentPane().add(resetear);
        resetear.setBounds(230, 680, 136, 47);

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(610, 400, 79, 25);

        jButton2.setText("Abrir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(700, 400, 90, 25);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(622, 375, 0, 0);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(622, 437, 0, 0);

        jPanel1.setOpaque(false);

        jLabel8.setText("Nombre:");

        jLabel10.setText("Edad:");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton3.setText("crear usuario");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("crear usuario 2");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1)
                    .addComponent(jTextField2))
                .addGap(12, 12, 12))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(650, 30, 220, 140);
        getContentPane().add(jLabel13);
        jLabel13.setBounds(610, 501, 0, 0);
        getContentPane().add(jLabel14);
        jLabel14.setBounds(610, 543, 0, 0);

        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\Principal\\Pictures\\b2.png")); // NOI18N
        jLabel16.setText("jLabel16");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(30, 340, 550, 16);

        jLabel17.setIcon(new javax.swing.ImageIcon("C:\\Users\\Principal\\Pictures\\b2.png")); // NOI18N
        jLabel17.setText("jLabel16");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(40, 170, 550, 16);

        jLabel18.setIcon(new javax.swing.ImageIcon("C:\\Users\\Principal\\Pictures\\b.png")); // NOI18N
        jLabel18.setText("jLabel18");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(400, 40, 20, 450);

        jButton8.setText("Borrar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(800, 400, 80, 25);

        jLabel19.setIcon(new javax.swing.ImageIcon("C:\\Users\\Principal\\Pictures\\b.png")); // NOI18N
        jLabel19.setText("jLabel18");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(200, 40, 20, 450);

        jLabel20.setIcon(new javax.swing.ImageIcon("C:\\Users\\Principal\\Pictures\\cat.png")); // NOI18N
        jLabel20.setText("jLabel20");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(20, 530, 550, 200);

        jPanel2.setOpaque(false);

        jLabel4.setText("Usuario 1");

        jLabel5.setText("Edad");

        jLabel11.setText("Usuario 2");

        jLabel12.setText("Edad");

        jLabel1.setText("score");

        jLabel2.setText("0");

        jLabel15.setText("score 2");

        jLabel3.setText("0");

        jLabel22.setText("---");

        jLabel23.setText("0");

        jLabel24.setText("---");

        jLabel25.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12)
                                .addGap(29, 29, 29))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(15, 15, 15))))
                    .addComponent(jSeparator1))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(660, 170, 200, 220);

        jLabel26.setIcon(new javax.swing.ImageIcon("C:\\Users\\Principal\\Pictures\\cecyt-9-logo-1F6A5DDBFF-seeklogo.com (1).png")); // NOI18N
        jLabel26.setText("jLabel26");
        getContentPane().add(jLabel26);
        jLabel26.setBounds(590, 420, 290, 320);

        jLabel27.setIcon(new javax.swing.ImageIcon("C:\\Users\\Principal\\Pictures\\grad.png")); // NOI18N
        jLabel27.setText("jLabel27");
        getContentPane().add(jLabel27);
        jLabel27.setBounds(0, 0, 900, 750);

        jButton5.setText("Guardar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(650, 400, 79, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton1ActionPerformed
       if(usarboton[0]==0){
            if(turn%2==0){
            turn++;
            Boton1.setText("X");
            usarboton[0]=1;
            jugador1gano[0]=1;
            
            revisa();

        }else{
            turn++;
            Boton1.setText("O");
            usarboton[0]=1;
            jugador2gano[0]=1;
            
            revisa();

            
        }
       }else{
           JOptionPane.showMessageDialog(rootPane, "Boton Usado");
       }
       
    }//GEN-LAST:event_Boton1ActionPerformed

    private void Boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton2ActionPerformed
        
         if(usarboton[1]==0){
            if(turn%2==0){
            turn++;
            Boton2.setText("X");
             usarboton[1]=1;
            jugador1gano[1]=1;
            
            revisa();

            
        }else{
            turn++;
            Boton2.setText("O");
            usarboton[1]=1;
            jugador2gano[1]=1;
            
            revisa();

        }
            
       }else{
           JOptionPane.showMessageDialog(rootPane, "Boton Usado");
       }
    }//GEN-LAST:event_Boton2ActionPerformed

    private void Boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton3ActionPerformed
        
          if(usarboton[2]==0){
            if(turn%2==0){
            turn++;
            Boton3.setText("X");
            usarboton[2]=1;
            jugador1gano[2]=1;
            
            revisa();

        }else{
            turn++;
            Boton3.setText("O");
            usarboton[2]=1;
            jugador2gano[2]=1;
            
            revisa();

        }
       }else{
           JOptionPane.showMessageDialog(rootPane, "Boton Usado");
       }
        
    }//GEN-LAST:event_Boton3ActionPerformed

    private void Boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton4ActionPerformed
       
          if(usarboton[3]==0){
            if(turn%2==0){
            turn++;
            Boton4.setText("X");
            usarboton[3]=1;
            jugador1gano[3]=1;
            
            revisa();

        }else{
            turn++;
            Boton4.setText("O");
            usarboton[3]=1;
            jugador2gano[3]=1;
            
            revisa();

        }
       }else{
           JOptionPane.showMessageDialog(rootPane, "Boton Usado");
       }
    }//GEN-LAST:event_Boton4ActionPerformed

    private void Boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton5ActionPerformed
        
         if(usarboton[4]==0){
            if(turn%2==0){
            turn++;
            Boton5.setText("X");
            usarboton[4]=1;
            jugador1gano[4]=1;
            
            revisa();

        }else{
            turn++;
            Boton5.setText("O");
            usarboton[4]=1;
            jugador2gano[4]=1;
            
            revisa();

        }
       }else{
           JOptionPane.showMessageDialog(rootPane, "Boton Usado");
       }
    }//GEN-LAST:event_Boton5ActionPerformed

    private void Boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton6ActionPerformed
          if(usarboton[5]==0){
            if(turn%2==0){
            turn++;
            Boton6.setText("X");
            usarboton[5]=1;
            jugador1gano[5]=1;
            
            revisa();

        }else{
            turn++;
            Boton6.setText("O");
            usarboton[5]=1;
            jugador2gano[5]=1;
            
            revisa();

        }
       }else{
           JOptionPane.showMessageDialog(rootPane, "Boton Usado");
       }
    }//GEN-LAST:event_Boton6ActionPerformed

    private void Boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton7ActionPerformed
        
        if(usarboton[6]==0){
            if(turn%2==0){
            turn++;
            Boton7.setText("X");
            usarboton[6]=1;
            jugador1gano[6]=1;
            
            revisa();

        }else{
            turn++;
            Boton7.setText("O");
            usarboton[6]=1;
            jugador2gano[6]=1;
            
            revisa();

        }
       }else{
           JOptionPane.showMessageDialog(rootPane, "Boton Usado");
       }
    }//GEN-LAST:event_Boton7ActionPerformed

    private void Boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton8ActionPerformed
        
          if(usarboton[7]==0){
            if(turn%2==0){
            turn++;
            Boton8.setText("X");
            usarboton[7]=1;
            jugador1gano[7]=1;
            
            revisa();

        }else{
            turn++;
            Boton8.setText("O");
            usarboton[7]=1;
            jugador2gano[7]=1;
            
            revisa();

        }
       }else{
           JOptionPane.showMessageDialog(rootPane, "Boton Usado");
       }
    }//GEN-LAST:event_Boton8ActionPerformed

    private void Boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton9ActionPerformed
        
          if(usarboton[8]==0){
            if(turn%2==0){
            turn++;
            Boton9.setText("X");
            usarboton[8]=1;
            jugador1gano[8]=1;
            
            revisa();
   
        }else{
            turn++;
            Boton9.setText("O");
            usarboton[8]=1;
            jugador2gano[8]=1;
            
            revisa();

        }
       }else{
           JOptionPane.showMessageDialog(rootPane, "Boton Usado");
       }
    }//GEN-LAST:event_Boton9ActionPerformed

    private void resetearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetearActionPerformed
        
        Boton1.setText("");
        Boton2.setText("");
        Boton3.setText("");
        Boton4.setText("");
        Boton5.setText("");
        Boton6.setText("");
        Boton7.setText("");
        Boton8.setText("");
        Boton9.setText("");
       
        turn=2;
        for(int i=0;i<9;i++){
            usarboton[i]=0;
        }
        for(int i=0;i<9;i++){
            jugador1gano[i]=0;
        }
        for(int i=0;i<9;i++){
            jugador2gano[i]=0;
        }
        
    }//GEN-LAST:event_resetearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          guardar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        PartidasGuardadas pg = new PartidasGuardadas();
          pg.setVisible(true);
               
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    //Uusario 1
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        String nombre = jTextField1.getText();
        String edad = jTextField2.getText();

        jLabel22.setText(nombre);
        jLabel23.setText(edad);
        
        usuario = new Usuario(nombre,edad, puntaje1);
        
    }//GEN-LAST:event_jButton3ActionPerformed

     //Uusario 2
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        String nombre = jTextField1.getText();
        String edad = jTextField2.getText();

        jLabel24.setText(nombre);
        jLabel25.setText(edad);
        
        usuario2 = new Usuario(nombre,edad, puntaje2);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    //boton borrar
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        
        System.out.println("boton borrar");
       
        String archivo="src/ExamenGato2/isaac.txt";
        
        FileWriter escribir;
       
    try {

        escribir = new FileWriter(archivo, false);
        escribir.write("");
        escribir.write("\n");
        escribir.write("");
        escribir.write("\n");
        escribir.write("");
        escribir.write("\n");
        escribir.write("\n");
        escribir.write("");
        escribir.write("\n");
        escribir.write("");
        escribir.write("\n");
        escribir.write("");
        escribir.close();

    } catch (FileNotFoundException ex) {
        JOptionPane.showMessageDialog(null, "Error al guardar, ponga nombre al archivo");
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Error al guardar, en la salida");
    }
    
    }//GEN-LAST:event_jButton8ActionPerformed
    
   
    public void guardar(){
        System.out.println("boton guardar");
       
//        String archivo="C:\\isaac2\\isaac.txt";
        String archivo="src/ExamenGato2/isaac.txt";
        
        FileWriter escribir;
       
        usuario.setPuntaje(puntaje1);
        usuario2.setPuntaje(puntaje2);
       
    try {

        escribir = new FileWriter(archivo, false);
        escribir.write(usuario.getNombre());
        escribir.write("\n");
        escribir.write(usuario.getEdad());
        escribir.write("\n");
        escribir.write(usuario.getPuntaje());
        escribir.write("\n");
        escribir.write("\n");
        escribir.write(usuario2.getNombre());
        escribir.write("\n");
        escribir.write(usuario2.getEdad());
        escribir.write("\n");
        escribir.write(usuario2.getPuntaje());
        escribir.close();

    } catch (FileNotFoundException ex) {
        JOptionPane.showMessageDialog(null, "Error al guardar, ponga nombre al archivo");
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Error al guardar, en la salida");
    }
    }
    
          
     public void revisa(){
     
     int resultado1=jugador1gano();
            int resultado2=jugador2gano();
            
            if(resultado1==1){
             
                JOptionPane.showMessageDialog(rootPane, "*****Jugador 1 GANO!!. felicitaciones*****");
            
            puntosJugador1++;

            puntaje1 = Integer.toString(puntosJugador1);
            
            jLabel2.setText(Integer.toString(puntosJugador1));
            
            if(puntaje1.equals("5")){
                Boton1.setVisible(false);
                Boton2.setVisible(false);
                Boton3.setVisible(false);
                Boton4.setVisible(false);
                Boton5.setVisible(false);
                Boton6.setVisible(false);
                Boton7.setVisible(false);
                Boton8.setVisible(false);
                Boton9.setVisible(false);
                JOptionPane.showMessageDialog(rootPane, "*****Jugador 1 GANO!!. Fin de Juego*****");
            }
            
            
            }else if(resultado2==1){
                JOptionPane.showMessageDialog(rootPane, "*****Jugador 2 GANO!!. felicitaciones*****");
            puntosJugador2++;
            puntaje2 = Integer.toString(puntosJugador2);
            jLabel3.setText(Integer.toString(puntosJugador2));
            
            if(puntaje2.equals("5")){
                Boton1.setVisible(false);
                Boton2.setVisible(false);
                Boton3.setVisible(false);
                Boton4.setVisible(false);
                Boton5.setVisible(false);
                Boton6.setVisible(false);
                Boton7.setVisible(false);
                Boton8.setVisible(false);
                Boton9.setVisible(false);
                JOptionPane.showMessageDialog(rootPane, "*****Jugador 2 GANO!!. Fin de Juego*****");
            }
            
            }
     
     
     }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
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
            java.util.logging.Logger.getLogger(GatoApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GatoApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GatoApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GatoApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GatoApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton1;
    private javax.swing.JButton Boton2;
    private javax.swing.JButton Boton3;
    private javax.swing.JButton Boton4;
    private javax.swing.JButton Boton5;
    private javax.swing.JButton Boton6;
    private javax.swing.JButton Boton7;
    private javax.swing.JButton Boton8;
    private javax.swing.JButton Boton9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton resetear;
    // End of variables declaration//GEN-END:variables

    
    
   
}