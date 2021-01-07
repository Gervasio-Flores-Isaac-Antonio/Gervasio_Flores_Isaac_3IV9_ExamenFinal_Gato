
package ExamenGato2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        jLabel9.setText("Edad:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Juego de Gato Clasico Isaac Gervasio 3IV9");

        Boton1.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        Boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton1ActionPerformed(evt);
            }
        });

        Boton3.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        Boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton3ActionPerformed(evt);
            }
        });

        Boton2.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        Boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton2ActionPerformed(evt);
            }
        });

        Boton4.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        Boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton4ActionPerformed(evt);
            }
        });

        Boton5.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        Boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton5ActionPerformed(evt);
            }
        });

        Boton7.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        Boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton7ActionPerformed(evt);
            }
        });

        Boton6.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        Boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton6ActionPerformed(evt);
            }
        });

        Boton8.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        Boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton8ActionPerformed(evt);
            }
        });

        Boton9.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        Boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton9ActionPerformed(evt);
            }
        });

        resetear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        resetear.setText("Reiniciar");
        resetear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetearActionPerformed(evt);
            }
        });

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Abrir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("score");

        jLabel2.setText("0");

        jLabel3.setText("0");

        jLabel4.setText("Usuario 1");

        jLabel5.setText("Edad");

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(0, 93, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField2)
                    .addComponent(jTextField1))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)))
        );

        jLabel11.setText("Usuario 2");

        jLabel12.setText("Edad");

        jLabel15.setText("score 2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(resetear, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(Boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(Boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(Boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(Boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGap(6, 6, 6)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(Boton9, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel2)
                            .addComponent(jLabel15)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(jLabel7)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(resetear, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel11)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(157, Short.MAX_VALUE))
        );

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
           JOptionPane.showMessageDialog(rootPane, "este boton ya esta usado");
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
           JOptionPane.showMessageDialog(rootPane, "este boton ya esta usado");
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
           JOptionPane.showMessageDialog(rootPane, "este boton ya esta usado");
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
           JOptionPane.showMessageDialog(rootPane, "este boton ya esta usado");
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
           JOptionPane.showMessageDialog(rootPane, "este boton ya esta usado");
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
           JOptionPane.showMessageDialog(rootPane, "este boton ya esta usado");
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
           JOptionPane.showMessageDialog(rootPane, "este boton ya esta usado");
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
           JOptionPane.showMessageDialog(rootPane, "este boton ya esta usado");
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
           JOptionPane.showMessageDialog(rootPane, "este boton ya esta usado");
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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        String nombre = jTextField1.getText();
        String edad = jTextField2.getText();

        jLabel6.setText(nombre);
        jLabel7.setText(edad);
        
        usuario = new Usuario(nombre,edad, puntaje1);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        String nombre = jTextField1.getText();
        String edad = jTextField2.getText();

        jLabel13.setText(nombre);
        jLabel14.setText(edad);
        
        usuario2 = new Usuario(nombre,edad, puntaje2);
        
    }//GEN-LAST:event_jButton4ActionPerformed
    
   
    public void guardar(){
        System.out.println("boton guardar");
       
        String archivo="C:\\isaac2\\isaac.txt";
        
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
             
                JOptionPane.showMessageDialog(rootPane, "*****tu has ganado. felicitaciones*****");
            
            puntosJugador1++;

            puntaje1 = Integer.toString(puntosJugador1);
            
            
            jLabel2.setText(Integer.toString(puntosJugador1));
            
            
            
            }else if(resultado2==1){
                JOptionPane.showMessageDialog(rootPane, "*****JAJAJAJAJAJAJAJA.....mala suerte. ha ganado la maquina*****");
            puntosJugador2++;
            
            puntaje2 = Integer.toString(puntosJugador2);
            
            
            jLabel3.setText(Integer.toString(puntosJugador2));
            
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton resetear;
    // End of variables declaration//GEN-END:variables

    
    
   
}