/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tictactoe;

import static java.awt.Color.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ADIA ICT CENTER
 */
public class gameDashboard extends javax.swing.JFrame {
    
    private int xCount;
    private int oCount;
    boolean checker;
    private String startGame = "X";

    /**
     * Creates new form gameDashboard
     */
    public gameDashboard() {
        initComponents();
       
    }
    
    private void gameScore(){
        lblXScores.setText(String.valueOf(xCount));
        lblOScores.setText(String.valueOf(oCount));
    }
    
    private void playerSwitch(){
        if(startGame.equalsIgnoreCase("X"))
        {
             startGame = "O";
        } else {
            startGame = "X";
        }
           
    }
    
    private void winGame(){
        String b1 = btn1.getText();
        String b2 = btn2.getText();
        String b3 = btn3.getText();
        String b4 = btn4.getText();
        String b5 = btn5.getText();
        String b6 = btn6.getText();
        String b7 = btn7.getText();
        String b8 = btn8.getText();
        String b9 = btn9.getText();
        
        if (b1=="X" && b2 == "X" && b3 == "X")
        {
            xCount++;
            btn1.setBackground(green);
            btn2.setBackground(green);
            btn3.setBackground(green);
            JOptionPane.showMessageDialog(null, "Player X wins");
            gameScore();
            Reset();
        }
        if (b4=="X" && b5 == "X" && b6 == "X")
        {
            xCount++;
            btn4.setBackground(green);
            btn5.setBackground(green);
            btn6.setBackground(green);
            JOptionPane.showMessageDialog(null, "Player X wins");
            gameScore();
            Reset();
        }
        if (b7=="X" && b8 == "X" && b9 == "X")
        {
            xCount++;
            btn7.setBackground(green);
            btn8.setBackground(green);
            btn9.setBackground(green);
            JOptionPane.showMessageDialog(null, "Player X wins");
            gameScore();
            Reset();
        
        }
        if (b1=="X" && b4 == "X" && b7 == "X")
        {
            xCount++;
            btn1.setBackground(green);
            btn4.setBackground(green);
            btn7.setBackground(green);
            JOptionPane.showMessageDialog(null, "Player X wins");
            gameScore();
            Reset();
        }
        if (b2=="X" && b5 == "X" && b8 == "X")
        {
            xCount++;
            btn2.setBackground(green);
            btn5.setBackground(green);
            btn8.setBackground(green);
            JOptionPane.showMessageDialog(null, "Player X wins");
            gameScore();
            Reset();
        }
        if (b3=="X" && b6 == "X" && b9 == "X")
        {
            xCount++;
            btn3.setBackground(green);
            btn9.setBackground(green);
            btn6.setBackground(green);
            JOptionPane.showMessageDialog(null, "Player X wins");
            gameScore();
            Reset();
        }
        if (b1=="X" && b5 == "X" && b9 == "X")
        {
            xCount++;
            btn1.setBackground(green);
            btn5.setBackground(green);
            btn9.setBackground(green);
            JOptionPane.showMessageDialog(null, "Player X wins");
            gameScore();
            Reset();
        }
        if (b3=="X" && b5 == "X" && b7 == "X")
        {
            xCount++;
            btn3.setBackground(green);
            btn5.setBackground(green);
            btn7.setBackground(green);
            JOptionPane.showMessageDialog(null, "Player X wins");
            gameScore();
            Reset();
        }
        
        //for O player
        
         if (b1=="O" && b2 == "O" && b3 == "O")
        {
            oCount++;
            btn1.setBackground(green);
            btn2.setBackground(green);
            btn3.setBackground(green);
            JOptionPane.showMessageDialog(null, "Player O wins");
            gameScore();
            Reset();
        }
        if (b4=="O" && b5 == "O" && b6 == "O")
        {
            oCount++;
            btn4.setBackground(green);
            btn5.setBackground(green);
            btn6.setBackground(green);
            JOptionPane.showMessageDialog(null, "Player O wins");
            gameScore();
            Reset();
        }
        if (b7=="O" && b8 == "O" && b9 == "O")
        {
            oCount++;
            btn7.setBackground(green);
            btn8.setBackground(green);
            btn9.setBackground(green);
            JOptionPane.showMessageDialog(null, "Player O wins");
            gameScore();
            Reset();
        
        }
        if (b1=="O" && b4 == "O" && b7 == "O")
        {
            oCount++;
            btn1.setBackground(green);
            btn4.setBackground(green);
            btn7.setBackground(green);
            JOptionPane.showMessageDialog(null, "Player O wins");
            gameScore();
            Reset();
        }
        if (b2=="O" && b5 == "O" && b8 == "O")
        {
            oCount++;
            btn2.setBackground(green);
            btn5.setBackground(green);
            btn8.setBackground(green);
            JOptionPane.showMessageDialog(null, "Player O wins");
            gameScore();
            Reset();
        }
        if (b3=="O" && b6 == "O" && b9 == "O")
        {
            oCount++;
            btn3.setBackground(green);
            btn9.setBackground(green);
            btn6.setBackground(green);
            JOptionPane.showMessageDialog(null, "Player O wins");
            gameScore();
            Reset();
        }
        if (b1=="O" && b5 == "O" && b9 == "O")
        {
            oCount++;
            btn1.setBackground(green);
            btn5.setBackground(green);
            btn9.setBackground(green);
            JOptionPane.showMessageDialog(null, "Player O wins");
            gameScore();
            Reset();
        }
        if (b3=="O" && b5 == "O" && b7 == "O")
        {
            oCount++;
            btn3.setBackground(green);
            btn5.setBackground(green);
            btn7.setBackground(green);
            JOptionPane.showMessageDialog(null, "Player O wins");
            gameScore();
            Reset();
        }
        
        
    }
    
    
    private void tieGame(){
        
        
        if((btn1.getText() == "X" || btn1.getText() == "O") && (btn2.getText() == "X" || btn2.getText() == "O")
                && (btn3.getText() == "X" || btn3.getText() == "O") && (btn4.getText() == "X" || btn4.getText() == "O")
                && (btn5.getText() == "X" || btn5.getText() == "O") && (btn6.getText() == "X" || btn6.getText() == "O")
                && (btn7.getText() == "X" || btn7.getText() == "O") && (btn8.getText() == "X" || btn8.getText() == "O")
                &&(btn9.getText() == "X" || btn9.getText() == "O")){
            JOptionPane.showMessageDialog(null, "Tie Game");
            Reset();
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

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btn6 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblOScores = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblXScores = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnNewGame = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        btnExit1 = new javax.swing.JButton();
        btnReset1 = new javax.swing.JButton();
        btnNewGame1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn6.setFont(new java.awt.Font("Segoe UI", 1, 70)); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel3.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 90, 90));

        btn5.setFont(new java.awt.Font("Segoe UI", 1, 70)); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel3.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 90, 90));

        btn4.setFont(new java.awt.Font("Segoe UI", 1, 70)); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel3.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 90, 90));

        btn9.setFont(new java.awt.Font("Segoe UI", 1, 70)); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel3.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 90, 90));

        btn8.setFont(new java.awt.Font("Segoe UI", 1, 70)); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel3.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 90, 90));

        btn7.setFont(new java.awt.Font("Segoe UI", 1, 70)); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel3.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 90, 90));

        btn3.setFont(new java.awt.Font("Segoe UI", 1, 70)); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel3.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 90, 90));

        btn2.setFont(new java.awt.Font("Segoe UI", 1, 70)); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel3.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 90, 90));

        btn1.setFont(new java.awt.Font("Segoe UI", 1, 70)); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel3.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 90, 90));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 310, 320));

        jPanel4.setBackground(new java.awt.Color(0, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(0, 51, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 260, 110));

        jPanel6.setBackground(new java.awt.Color(0, 51, 51));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(0, 51, 51));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 260, 110));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 260, 110));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setText("Player O");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        lblOScores.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblOScores.setForeground(new java.awt.Color(102, 0, 0));
        lblOScores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOScores.setText("0");
        lblOScores.setOpaque(true);
        jPanel4.add(lblOScores, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 90, 60));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("Player X");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 60));

        lblXScores.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblXScores.setForeground(new java.awt.Color(0, 0, 102));
        lblXScores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblXScores.setText("0");
        lblXScores.setOpaque(true);
        jPanel4.add(lblXScores, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 90, 60));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 310, 150));

        jPanel8.setBackground(new java.awt.Color(0, 51, 51));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel8.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 120, 60));

        btnReset.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel8.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 160, 60));

        btnNewGame.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnNewGame.setText("NEW GAME");
        btnNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewGameActionPerformed(evt);
            }
        });
        jPanel8.add(btnNewGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 70));

        jPanel9.setBackground(new java.awt.Color(0, 51, 51));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExit1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnExit1.setText("EXIT");
        btnExit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit1ActionPerformed(evt);
            }
        });
        jPanel9.add(btnExit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 120, 60));

        btnReset1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnReset1.setText("RESET");
        btnReset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset1ActionPerformed(evt);
            }
        });
        jPanel9.add(btnReset1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 160, 60));

        btnNewGame1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnNewGame1.setText("NEW GAME");
        btnNewGame1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewGame1ActionPerformed(evt);
            }
        });
        jPanel9.add(btnNewGame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 70));

        jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 310, 160));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 310, 160));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("JAVA TIC TAC TOE GAME");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 660, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
//        this.dispose();
System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    
    private void Reset(){
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
        
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        
        btn1.setBackground(white);
        btn2.setBackground(white);
        btn3.setBackground(white);
        btn4.setBackground(white);
        btn5.setBackground(white);
        btn6.setBackground(white);
        btn7.setBackground(white);
        btn8.setBackground(white);
        btn9.setBackground(white);
    }
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        
        Reset();
        
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewGameActionPerformed
        // TODO add your handling code here:
        
        Reset();
        
        lblXScores.setText("0");
        lblOScores.setText("0");
        xCount = 0;
        oCount = 0;
    }//GEN-LAST:event_btnNewGameActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        btn6.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            checker = true;
        }
        else {
            checker = false;
        }
//        if (btn6.getText() == "X"){
//            btn6.setForeground(red);
//        } else{
//            btn6.setForeground(yellow);
//        }
        btn6.setEnabled(false);
        
        
        playerSwitch();
        winGame();
        tieGame();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        btn5.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            checker = true;
        }
        else {
            checker = false;
        }
        
        btn5.setEnabled(false);
        
        playerSwitch();
        winGame();
        tieGame();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        btn4.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            checker = true;
        }
        else {
            checker = false;
        }
        btn4.setEnabled(false);
        playerSwitch();
        winGame();
        tieGame();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        btn9.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            checker = true;
        }
        else {
            checker = false;
        }
        btn9.setEnabled(false);
        playerSwitch();
        winGame();
        tieGame();
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        btn8.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            checker = true;
        }
        else {
            checker = false;
        }
        btn8.setEnabled(false);
        playerSwitch();
        winGame();
        tieGame();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        btn7.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            checker = true;
        }
        else {
            checker = false;
        }
        btn7.setEnabled(false);
        playerSwitch();
        winGame();
        tieGame();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        btn3.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            checker = true;
        }
        else {
            checker = false;
        }
        btn3.setEnabled(false);
        playerSwitch();
        winGame();
        tieGame();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        btn2.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            checker = true;
        }
        else {
            checker = false;
        }
        btn2.setEnabled(false);
        playerSwitch();
        winGame();
        tieGame();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        btn1.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            checker = true;
        }
        else {
            checker = false;
        }
        btn1.setEnabled(false);
        playerSwitch();
        winGame();
        tieGame();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btnExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExit1ActionPerformed

    private void btnReset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReset1ActionPerformed

    private void btnNewGame1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewGame1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNewGame1ActionPerformed

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
            java.util.logging.Logger.getLogger(gameDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gameDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gameDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gameDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gameDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnExit1;
    private javax.swing.JButton btnNewGame;
    private javax.swing.JButton btnNewGame1;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnReset1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblOScores;
    private javax.swing.JLabel lblXScores;
    // End of variables declaration//GEN-END:variables
}
