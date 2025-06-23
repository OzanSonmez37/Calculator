
package gui;

import java.awt.Color;

public class MenuEkrani extends javax.swing.JFrame {

    private int sayi1=0;
    private int sayi2=0;
    private int islem=-1;   
    private String cikti="";
    
    public MenuEkrani() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        button1 = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        buttonEksi = new javax.swing.JButton();
        buttonCarpi = new javax.swing.JButton();
        button6 = new javax.swing.JButton();
        button5 = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        buttonEsittir = new javax.swing.JButton();
        button0 = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        buttonArti = new javax.swing.JButton();
        button7 = new javax.swing.JButton();
        button8 = new javax.swing.JButton();
        button9 = new javax.swing.JButton();
        buttonBolme = new javax.swing.JButton();
        textFieldIslem = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(0, 0, 0));

        button1.setBackground(new java.awt.Color(102, 102, 102));
        button1.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        button1.setText("1");
        button1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button1MouseExited(evt);
            }
        });
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setBackground(new java.awt.Color(102, 102, 102));
        button2.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        button2.setText("2");
        button2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button2MouseExited(evt);
            }
        });
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        button3.setBackground(new java.awt.Color(102, 102, 102));
        button3.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        button3.setText("3");
        button3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button3MouseExited(evt);
            }
        });
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        buttonEksi.setBackground(new java.awt.Color(102, 102, 102));
        buttonEksi.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        buttonEksi.setText("-");
        buttonEksi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonEksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonEksiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonEksiMouseExited(evt);
            }
        });
        buttonEksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEksiActionPerformed(evt);
            }
        });

        buttonCarpi.setBackground(new java.awt.Color(102, 102, 102));
        buttonCarpi.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        buttonCarpi.setText("x");
        buttonCarpi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonCarpi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonCarpiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonCarpiMouseExited(evt);
            }
        });
        buttonCarpi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCarpiActionPerformed(evt);
            }
        });

        button6.setBackground(new java.awt.Color(102, 102, 102));
        button6.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        button6.setText("6");
        button6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button6MouseExited(evt);
            }
        });
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });

        button5.setBackground(new java.awt.Color(102, 102, 102));
        button5.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        button5.setText("5");
        button5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button5MouseExited(evt);
            }
        });
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        button4.setBackground(new java.awt.Color(102, 102, 102));
        button4.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        button4.setText("4");
        button4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button4MouseExited(evt);
            }
        });
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        buttonEsittir.setBackground(new java.awt.Color(102, 102, 102));
        buttonEsittir.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        buttonEsittir.setText("=");
        buttonEsittir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonEsittir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonEsittirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonEsittirMouseExited(evt);
            }
        });
        buttonEsittir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEsittirActionPerformed(evt);
            }
        });

        button0.setBackground(new java.awt.Color(102, 102, 102));
        button0.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        button0.setText("0");
        button0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button0MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button0MouseExited(evt);
            }
        });
        button0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button0ActionPerformed(evt);
            }
        });

        buttonDelete.setBackground(new java.awt.Color(102, 102, 102));
        buttonDelete.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        buttonDelete.setText("CE");
        buttonDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonDeleteMouseExited(evt);
            }
        });
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        buttonArti.setBackground(new java.awt.Color(102, 102, 102));
        buttonArti.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        buttonArti.setText("+");
        buttonArti.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonArti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonArtiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonArtiMouseExited(evt);
            }
        });
        buttonArti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonArtiActionPerformed(evt);
            }
        });

        button7.setBackground(new java.awt.Color(102, 102, 102));
        button7.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        button7.setText("7");
        button7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button7MouseExited(evt);
            }
        });
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });

        button8.setBackground(new java.awt.Color(102, 102, 102));
        button8.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        button8.setText("8");
        button8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button8MouseExited(evt);
            }
        });
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });

        button9.setBackground(new java.awt.Color(102, 102, 102));
        button9.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        button9.setText("9");
        button9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button9MouseExited(evt);
            }
        });
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });

        buttonBolme.setBackground(new java.awt.Color(102, 102, 102));
        buttonBolme.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        buttonBolme.setText("/");
        buttonBolme.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonBolme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonBolmeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonBolmeMouseExited(evt);
            }
        });
        buttonBolme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBolmeActionPerformed(evt);
            }
        });

        textFieldIslem.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        textFieldIslem.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(buttonEksi, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(buttonCarpi, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(button0, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(buttonEsittir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(buttonArti, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(buttonBolme, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textFieldIslem))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(textFieldIslem, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonBolme, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCarpi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEksi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button0, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEsittir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonArti, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void ciktiGuncelle() {
        cikti="";
        if(islem==-1) {
            cikti+=sayi1+"";
        } else {
            cikti+=sayi1+"";
            if(islem==1) {  
                cikti+=" + ";
            }
            else if(islem==2) {
                cikti+=" - ";
            }
            else if(islem==3) {
                cikti+=" x ";
            }
            else if(islem==4) {
                cikti+=" / ";
            }
            cikti+=sayi2+"";
        }
        textFieldIslem.setText(cikti);  
    }
    
    
    /*
    RENK ISLEMLERI
    */
    private void button1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseEntered
        button1.setBackground(Color.red);
    }//GEN-LAST:event_button1MouseEntered

    private void button1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseExited
        button1.setBackground(Color.GRAY);
    }//GEN-LAST:event_button1MouseExited

    private void button0MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button0MouseEntered
        button0.setBackground(Color.red);
    }//GEN-LAST:event_button0MouseEntered

    private void button0MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button0MouseExited
        button0.setBackground(Color.GRAY);
    }//GEN-LAST:event_button0MouseExited

    private void button2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2MouseEntered
        button2.setBackground(Color.red);
    }//GEN-LAST:event_button2MouseEntered

    private void button2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2MouseExited
        button2.setBackground(Color.GRAY);
    }//GEN-LAST:event_button2MouseExited

    private void button3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button3MouseEntered
        button3.setBackground(Color.red);
    }//GEN-LAST:event_button3MouseEntered

    private void button3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button3MouseExited
        button3.setBackground(Color.GRAY);
    }//GEN-LAST:event_button3MouseExited

    private void button4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button4MouseEntered
        button4.setBackground(Color.red);
    }//GEN-LAST:event_button4MouseEntered

    private void button4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button4MouseExited
        button4.setBackground(Color.GRAY);
    }//GEN-LAST:event_button4MouseExited

    private void button5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button5MouseEntered
        button5.setBackground(Color.red);
    }//GEN-LAST:event_button5MouseEntered

    private void button5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button5MouseExited
        button5.setBackground(Color.GRAY);
    }//GEN-LAST:event_button5MouseExited

    private void button6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button6MouseEntered
        button6.setBackground(Color.red);
    }//GEN-LAST:event_button6MouseEntered

    private void button6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button6MouseExited
        button6.setBackground(Color.GRAY);
    }//GEN-LAST:event_button6MouseExited

    private void button7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button7MouseEntered
        button7.setBackground(Color.red);
    }//GEN-LAST:event_button7MouseEntered

    private void button7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button7MouseExited
        button7.setBackground(Color.GRAY);
    }//GEN-LAST:event_button7MouseExited

    private void button8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button8MouseEntered
        button8.setBackground(Color.red);
    }//GEN-LAST:event_button8MouseEntered

    private void button8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button8MouseExited
        button8.setBackground(Color.GRAY);
    }//GEN-LAST:event_button8MouseExited

    private void button9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button9MouseEntered
        button9.setBackground(Color.red);
    }//GEN-LAST:event_button9MouseEntered

    private void button9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button9MouseExited
        button9.setBackground(Color.GRAY);
    }//GEN-LAST:event_button9MouseExited

    private void buttonBolmeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonBolmeMouseEntered
        buttonBolme.setBackground(Color.WHITE);
    }//GEN-LAST:event_buttonBolmeMouseEntered

    private void buttonBolmeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonBolmeMouseExited
        buttonBolme.setBackground(Color.GRAY);
    }//GEN-LAST:event_buttonBolmeMouseExited

    private void buttonCarpiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCarpiMouseEntered
        buttonCarpi.setBackground(Color.WHITE);
    }//GEN-LAST:event_buttonCarpiMouseEntered

    private void buttonCarpiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCarpiMouseExited
        buttonCarpi.setBackground(Color.GRAY);
    }//GEN-LAST:event_buttonCarpiMouseExited

    private void buttonEksiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEksiMouseEntered
        buttonEksi.setBackground(Color.WHITE);
    }//GEN-LAST:event_buttonEksiMouseEntered

    private void buttonEksiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEksiMouseExited
        buttonEksi.setBackground(Color.GRAY);
    }//GEN-LAST:event_buttonEksiMouseExited

    private void buttonArtiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonArtiMouseEntered
        buttonArti.setBackground(Color.WHITE);
    }//GEN-LAST:event_buttonArtiMouseEntered

    private void buttonArtiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonArtiMouseExited
        buttonArti.setBackground(Color.GRAY);
    }//GEN-LAST:event_buttonArtiMouseExited

    private void buttonEsittirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEsittirMouseEntered
        buttonEsittir.setBackground(Color.WHITE);
    }//GEN-LAST:event_buttonEsittirMouseEntered

    private void buttonEsittirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEsittirMouseExited
        buttonEsittir.setBackground(Color.GRAY);
    }//GEN-LAST:event_buttonEsittirMouseExited

    private void buttonDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDeleteMouseEntered
        buttonDelete.setBackground(Color.WHITE);
    }//GEN-LAST:event_buttonDeleteMouseEntered

    private void buttonDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDeleteMouseExited
        buttonDelete.setBackground(Color.GRAY);
    }//GEN-LAST:event_buttonDeleteMouseExited

    
    /*
    ACTION PERFORMED
    */
    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
        if(islem==-1){
            sayi1*=10;
            sayi1+=7;
        } else {
            sayi2*=10;
            sayi2+=7;
        }
        System.out.println(sayi1 + " - " + sayi2);
        ciktiGuncelle();
    }//GEN-LAST:event_button7ActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
        if(islem==-1){
            sayi1*=10;
            sayi1+=8;
        } else {
            sayi2*=10;
            sayi2+=8;
        }
        System.out.println(sayi1 + " - " + sayi2);
        ciktiGuncelle();
    }//GEN-LAST:event_button8ActionPerformed

    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
        if(islem==-1){
            sayi1*=10;
            sayi1+=9;
        } else {
            sayi2*=10;
            sayi2+=9;
        }
        System.out.println(sayi1 + " - " + sayi2);
        ciktiGuncelle();
    }//GEN-LAST:event_button9ActionPerformed

    private void buttonBolmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBolmeActionPerformed
        islem=4;
        ciktiGuncelle();
    }//GEN-LAST:event_buttonBolmeActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        if(islem==-1){
            sayi1*=10;
            sayi1+=4;
        } else {
            sayi2*=10;
            sayi2+=4;
        }
        System.out.println(sayi1 + " - " + sayi2);
        ciktiGuncelle();
    }//GEN-LAST:event_button4ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        if(islem==-1){
            sayi1*=10;
            sayi1+=5;
        } else {
            sayi2*=10;
            sayi2+=5;
        }
        System.out.println(sayi1 + " - " + sayi2);
        ciktiGuncelle();
    }//GEN-LAST:event_button5ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        if(islem==-1){
            sayi1*=10;
            sayi1+=6;
        } else {
            sayi2*=10;
            sayi2+=6;
        }
        System.out.println(sayi1 + " - " + sayi2);
        ciktiGuncelle();
    }//GEN-LAST:event_button6ActionPerformed

    private void buttonCarpiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCarpiActionPerformed
        islem=3;
        ciktiGuncelle();
    }//GEN-LAST:event_buttonCarpiActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        if(islem==-1){
            sayi1*=10;
            sayi1+=1;
        } else {
            sayi2*=10;
            sayi2+=1;
        }
        System.out.println(sayi1 + " - " + sayi2);
        ciktiGuncelle();
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        if(islem==-1){
            sayi1*=10;
            sayi1+=2;
        } else {
            sayi2*=10;
            sayi2+=2;
        }
        System.out.println(sayi1 + " - " + sayi2);
        ciktiGuncelle();
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        if(islem==-1){
            sayi1*=10;
            sayi1+=3;
        } else {
            sayi2*=10;
            sayi2+=3;
        }
        System.out.println(sayi1 + " - " + sayi2);
        ciktiGuncelle();
    }//GEN-LAST:event_button3ActionPerformed

    private void buttonEksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEksiActionPerformed
        islem=2;
        ciktiGuncelle();
    }//GEN-LAST:event_buttonEksiActionPerformed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        textFieldIslem.setText("");
        islem=-1;
        sayi1=0;
        sayi2=0;
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void button0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button0ActionPerformed
        if(islem==-1){
            sayi1*=10;
            sayi1+=0;
        } else {
            sayi2*=10;
            sayi2+=0;
        }
        System.out.println(sayi1 + " - " + sayi2);
        ciktiGuncelle();
    }//GEN-LAST:event_button0ActionPerformed

    private void buttonEsittirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEsittirActionPerformed
        int sonuc=0;
        float bolmeSonuc=0;
        
        if(islem==1) {  
                sonuc=sayi1+sayi2;
            }
            else if(islem==2) {
                sonuc=sayi1-sayi2;
            }
            else if(islem==3) {
                sonuc=sayi1*sayi2;
            }
            else if(islem==4) {
                bolmeSonuc=sayi1/sayi2;
            }
            if(islem==4) {
                cikti=bolmeSonuc+"";
            } else {
                cikti = sonuc+"";
            }
            textFieldIslem.setText(cikti);
            islem=-1;
            sayi1=0;
            sayi2=0;
        
    }//GEN-LAST:event_buttonEsittirActionPerformed

    private void buttonArtiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonArtiActionPerformed
        islem=1;
        ciktiGuncelle();
    }//GEN-LAST:event_buttonArtiActionPerformed

    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button0;
    private javax.swing.JButton button1;
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JButton button4;
    private javax.swing.JButton button5;
    private javax.swing.JButton button6;
    private javax.swing.JButton button7;
    private javax.swing.JButton button8;
    private javax.swing.JButton button9;
    private javax.swing.JButton buttonArti;
    private javax.swing.JButton buttonBolme;
    private javax.swing.JButton buttonCarpi;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonEksi;
    private javax.swing.JButton buttonEsittir;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField textFieldIslem;
    // End of variables declaration//GEN-END:variables
}
