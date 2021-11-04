package igu;

public class principal extends javax.swing.JFrame {

     int indice = 0;
    String dni[] = new String[10];
    String nombre[] = new String[10];
    String apellido[] = new String[10];
    String direccion[] = new String[10];
    String telefono[] = new String[10];
    String nacimiento[] = new String[10];
    
    public principal() {
        initComponents();
    }

   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnizq = new javax.swing.JButton();
        btnder = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        txtindice = new javax.swing.JTextField();
        txtnacimiento = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtdni = new javax.swing.JTextField();
        labelindice = new javax.swing.JLabel();
        labelnacimiento = new javax.swing.JLabel();
        labeltelefono = new javax.swing.JLabel();
        labeldireccion = new javax.swing.JLabel();
        labelapellido = new javax.swing.JLabel();
        labelnombre = new javax.swing.JLabel();
        labeldni = new javax.swing.JLabel();
        labeltitulo = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnizq.setBackground(new java.awt.Color(248, 190, 189));
        btnizq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/izquierda.png"))); // NOI18N
        btnizq.setBorder(null);
        btnizq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnizqActionPerformed(evt);
            }
        });
        jPanel2.add(btnizq, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 50, 30));

        btnder.setBackground(new java.awt.Color(248, 190, 189));
        btnder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/derecha.png"))); // NOI18N
        btnder.setBorder(null);
        btnder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnderActionPerformed(evt);
            }
        });
        jPanel2.add(btnder, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 50, 30));

        btnguardar.setBackground(new java.awt.Color(248, 190, 189));
        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar-el-archivo.png"))); // NOI18N
        btnguardar.setBorder(null);
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 70, 30));

        txtindice.setBackground(new java.awt.Color(248, 190, 189));
        txtindice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtindice.setText("0");
        txtindice.setBorder(null);
        jPanel2.add(txtindice, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 50, 20));

        txtnacimiento.setBackground(new java.awt.Color(248, 190, 189));
        txtnacimiento.setBorder(null);
        jPanel2.add(txtnacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 140, 20));

        txttelefono.setBackground(new java.awt.Color(248, 190, 189));
        txttelefono.setBorder(null);
        jPanel2.add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 140, 20));

        txtdireccion.setBackground(new java.awt.Color(248, 190, 189));
        txtdireccion.setBorder(null);
        jPanel2.add(txtdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 140, 20));

        txtapellido.setBackground(new java.awt.Color(248, 190, 189));
        txtapellido.setBorder(null);
        jPanel2.add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 140, 20));

        txtnombre.setBackground(new java.awt.Color(248, 190, 189));
        txtnombre.setBorder(null);
        jPanel2.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 140, 20));

        txtdni.setBackground(new java.awt.Color(248, 190, 189));
        txtdni.setBorder(null);
        jPanel2.add(txtdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 140, 20));

        labelindice.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        labelindice.setForeground(new java.awt.Color(51, 51, 51));
        labelindice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelindice.setText("ÍNDICE");
        jPanel2.add(labelindice, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 50, 20));

        labelnacimiento.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        labelnacimiento.setForeground(new java.awt.Color(51, 51, 51));
        labelnacimiento.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelnacimiento.setText("NACIMIENTO");
        jPanel2.add(labelnacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 90, 20));

        labeltelefono.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        labeltelefono.setForeground(new java.awt.Color(51, 51, 51));
        labeltelefono.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labeltelefono.setText("TELÉFONO");
        jPanel2.add(labeltelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 90, 20));

        labeldireccion.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        labeldireccion.setForeground(new java.awt.Color(51, 51, 51));
        labeldireccion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labeldireccion.setText("DIRECCIÓN");
        jPanel2.add(labeldireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 90, 20));

        labelapellido.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        labelapellido.setForeground(new java.awt.Color(51, 51, 51));
        labelapellido.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelapellido.setText("APELLIDO");
        jPanel2.add(labelapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 70, 20));

        labelnombre.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        labelnombre.setForeground(new java.awt.Color(51, 51, 51));
        labelnombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelnombre.setText("NOMBRE");
        jPanel2.add(labelnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 70, 20));

        labeldni.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        labeldni.setForeground(new java.awt.Color(51, 51, 51));
        labeldni.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labeldni.setText("DNI");
        jPanel2.add(labeldni, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 70, 20));

        labeltitulo.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        labeltitulo.setForeground(new java.awt.Color(51, 51, 51));
        labeltitulo.setText("AGENDA ELECTRÓNICA");
        jPanel2.add(labeltitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo.jpg"))); // NOI18N
        jPanel2.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    //Botón guardar
    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed

        //Asocio el índice a los vectores para que el valor del índice sea igual a la posición de cada vector
        if (indice == 0) {
            dni[0] = txtdni.getText();
            nombre[0] = txtnombre.getText();
            apellido[0] = txtapellido.getText();
            direccion[0] = txtdireccion.getText();
            telefono[0] = txttelefono.getText();
            nacimiento[0] = txtnacimiento.getText();
        } else {
            if (indice == 1) {
                dni[1] = txtdni.getText();
                nombre[1] = txtnombre.getText();
                apellido[1] = txtapellido.getText();
                direccion[1] = txtdireccion.getText();
                telefono[1] = txttelefono.getText();
                nacimiento[1] = txtnacimiento.getText();
            } else {
                if (indice == 2) {
                    dni[2] = txtdni.getText();
                    nombre[2] = txtnombre.getText();
                    apellido[2] = txtapellido.getText();
                    direccion[2] = txtdireccion.getText();
                    telefono[2] = txttelefono.getText();
                    nacimiento[2] = txtnacimiento.getText();
                } else {
                    if (indice == 3) {
                        dni[3] = txtdni.getText();
                        nombre[3] = txtnombre.getText();
                        apellido[3] = txtapellido.getText();
                        direccion[3] = txtdireccion.getText();
                        telefono[3] = txttelefono.getText();
                        nacimiento[3] = txtnacimiento.getText();
                    } else {
                        if (indice == 4) {
                            dni[4] = txtdni.getText();
                            nombre[4] = txtnombre.getText();
                            apellido[4] = txtapellido.getText();
                            direccion[4] = txtdireccion.getText();
                            telefono[4] = txttelefono.getText();
                            nacimiento[4] = txtnacimiento.getText();
                        } else {
                            if (indice == 5) {
                                dni[5] = txtdni.getText();
                                nombre[5] = txtnombre.getText();
                                apellido[5] = txtapellido.getText();
                                direccion[5] = txtdireccion.getText();
                                telefono[5] = txttelefono.getText();
                                nacimiento[5] = txtnacimiento.getText();
                            } else {
                                if (indice == 6) {
                                    dni[6] = txtdni.getText();
                                    nombre[6] = txtnombre.getText();
                                    apellido[6] = txtapellido.getText();
                                    direccion[6] = txtdireccion.getText();
                                    telefono[6] = txttelefono.getText();
                                    nacimiento[6] = txtnacimiento.getText();
                                } else {
                                    if (indice == 7) {
                                        dni[7] = txtdni.getText();
                                        nombre[7] = txtnombre.getText();
                                        apellido[7] = txtapellido.getText();
                                        direccion[7] = txtdireccion.getText();
                                        telefono[7] = txttelefono.getText();
                                        nacimiento[7] = txtnacimiento.getText();
                                    } else {
                                        if (indice == 8) {
                                            dni[8] = txtdni.getText();
                                            nombre[8] = txtnombre.getText();
                                            apellido[8] = txtapellido.getText();
                                            direccion[8] = txtdireccion.getText();
                                            telefono[8] = txttelefono.getText();
                                            nacimiento[8] = txtnacimiento.getText();
                                        } else {
                                            if (indice == 9) {
                                                dni[9] = txtdni.getText();
                                                nombre[9] = txtnombre.getText();
                                                apellido[9] = txtapellido.getText();
                                                direccion[9] = txtdireccion.getText();
                                                telefono[9] = txttelefono.getText();
                                                nacimiento[9] = txtnacimiento.getText();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btnguardarActionPerformed
    
    //Botón Izquierda
    private void btnizqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnizqActionPerformed
        
        //Reiniciar todos los campos de texto
        txtdni.setText("");
        txtnombre.setText("");
        txtapellido.setText("");
        txtdireccion.setText("");
        txttelefono.setText("");
        txtnacimiento.setText("");

        //Al apretar el botón, le resto 1 a mi índice siempre que este sea mayor que 0 y menor que 10
        if (indice > 0 && indice < 10) {
            indice = indice - 1;
            String txtind = indice + ""; //Convierto mi textfield indice en entero
            txtindice.setText(txtind);
        }
        if (indice == 0) {
            txtdni.setText(dni[0]);
            txtnombre.setText(nombre[0]);
            txtapellido.setText(apellido[0]);
            txtdireccion.setText(direccion[0]);
            txttelefono.setText(telefono[0]);
            txtnacimiento.setText(nacimiento[0]);
        } else {
            if (indice == 1) {
                txtdni.setText(dni[1]);
                txtnombre.setText(nombre[1]);
                txtapellido.setText(apellido[1]);
                txtdireccion.setText(direccion[1]);
                txttelefono.setText(telefono[1]);
                txtnacimiento.setText(nacimiento[1]);
            } else {
                if (indice == 2) {
                    txtdni.setText(dni[2]);
                    txtnombre.setText(nombre[2]);
                    txtapellido.setText(apellido[2]);
                    txtdireccion.setText(direccion[2]);
                    txttelefono.setText(telefono[2]);
                    txtnacimiento.setText(nacimiento[2]);
                } else {
                    if (indice == 3) {
                        txtdni.setText(dni[3]);
                        txtnombre.setText(nombre[3]);
                        txtapellido.setText(apellido[3]);
                        txtdireccion.setText(direccion[3]);
                        txttelefono.setText(telefono[3]);
                        txtnacimiento.setText(nacimiento[3]);
                    } else {
                        if (indice == 4) {
                            txtdni.setText(dni[4]);
                            txtnombre.setText(nombre[4]);
                            txtapellido.setText(apellido[4]);
                            txtdireccion.setText(direccion[4]);
                            txttelefono.setText(telefono[4]);
                            txtnacimiento.setText(nacimiento[4]);
                        } else {
                            if (indice == 5) {
                                txtdni.setText(dni[5]);
                                txtnombre.setText(nombre[5]);
                                txtapellido.setText(apellido[5]);
                                txtdireccion.setText(direccion[5]);
                                txttelefono.setText(telefono[5]);
                                txtnacimiento.setText(nacimiento[5]);
                            } else {
                                if (indice == 6) {
                                    txtdni.setText(dni[6]);
                                    txtnombre.setText(nombre[6]);
                                    txtapellido.setText(apellido[6]);
                                    txtdireccion.setText(direccion[6]);
                                    txttelefono.setText(telefono[6]);
                                    txtnacimiento.setText(nacimiento[6]);
                                } else {
                                    if (indice == 7) {
                                        txtdni.setText(dni[7]);
                                        txtnombre.setText(nombre[7]);
                                        txtapellido.setText(apellido[7]);
                                        txtdireccion.setText(direccion[7]);
                                        txttelefono.setText(telefono[7]);
                                        txtnacimiento.setText(nacimiento[7]);
                                    } else {
                                        if (indice == 8) {
                                            txtdni.setText(dni[8]);
                                            txtnombre.setText(nombre[8]);
                                            txtapellido.setText(apellido[8]);
                                            txtdireccion.setText(direccion[8]);
                                            txttelefono.setText(telefono[8]);
                                            txtnacimiento.setText(nacimiento[8]);
                                        } else {
                                            if (indice == 9) {
                                                txtdni.setText(dni[9]);
                                                txtnombre.setText(nombre[9]);
                                                txtapellido.setText(apellido[9]);
                                                txtdireccion.setText(direccion[9]);
                                                txttelefono.setText(telefono[9]);
                                                txtnacimiento.setText(nacimiento[9]);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btnizqActionPerformed

    //Botón derecha
    private void btnderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnderActionPerformed

        //Reiniciar todos los campos de texto
        txtdni.setText("");
        txtnombre.setText("");
        txtapellido.setText("");
        txtdireccion.setText("");
        txttelefono.setText("");
        txtnacimiento.setText("");

        //Al apretar el botón, le sumo 1 a mi índice siempre que este sea mayor o igual que 0 y menor que 9
        if (indice >= 0 && indice < 9) {
            indice = indice + 1;
            String txtind = indice + ""; //Convierto mi textfield indice en entero
            txtindice.setText(txtind);
        }
        if (indice == 0) {
            txtdni.setText(dni[0]);
            txtnombre.setText(nombre[0]);
            txtapellido.setText(apellido[0]);
            txtdireccion.setText(direccion[0]);
            txttelefono.setText(telefono[0]);
            txtnacimiento.setText(nacimiento[0]);
        } else {
            if (indice == 1) {
                txtdni.setText(dni[1]);
                txtnombre.setText(nombre[1]);
                txtapellido.setText(apellido[1]);
                txtdireccion.setText(direccion[1]);
                txttelefono.setText(telefono[1]);
                txtnacimiento.setText(nacimiento[1]);
            } else {
                if (indice == 2) {
                    txtdni.setText(dni[2]);
                    txtnombre.setText(nombre[2]);
                    txtapellido.setText(apellido[2]);
                    txtdireccion.setText(direccion[2]);
                    txttelefono.setText(telefono[2]);
                    txtnacimiento.setText(nacimiento[2]);
                } else {
                    if (indice == 3) {
                        txtdni.setText(dni[3]);
                        txtnombre.setText(nombre[3]);
                        txtapellido.setText(apellido[3]);
                        txtdireccion.setText(direccion[3]);
                        txttelefono.setText(telefono[3]);
                        txtnacimiento.setText(nacimiento[3]);
                    } else {
                        if (indice == 4) {
                            txtdni.setText(dni[4]);
                            txtnombre.setText(nombre[4]);
                            txtapellido.setText(apellido[4]);
                            txtdireccion.setText(direccion[4]);
                            txttelefono.setText(telefono[4]);
                            txtnacimiento.setText(nacimiento[4]);
                        } else {
                            if (indice == 5) {
                                txtdni.setText(dni[5]);
                                txtnombre.setText(nombre[5]);
                                txtapellido.setText(apellido[5]);
                                txtdireccion.setText(direccion[5]);
                                txttelefono.setText(telefono[5]);
                                txtnacimiento.setText(nacimiento[5]);
                            } else {
                                if (indice == 6) {
                                    txtdni.setText(dni[6]);
                                    txtnombre.setText(nombre[6]);
                                    txtapellido.setText(apellido[6]);
                                    txtdireccion.setText(direccion[6]);
                                    txttelefono.setText(telefono[6]);
                                    txtnacimiento.setText(nacimiento[6]);
                                } else {
                                    if (indice == 7) {
                                        txtdni.setText(dni[7]);
                                        txtnombre.setText(nombre[7]);
                                        txtapellido.setText(apellido[7]);
                                        txtdireccion.setText(direccion[7]);
                                        txttelefono.setText(telefono[7]);
                                        txtnacimiento.setText(nacimiento[7]);
                                    } else {
                                        if (indice == 8) {
                                            txtdni.setText(dni[8]);
                                            txtnombre.setText(nombre[8]);
                                            txtapellido.setText(apellido[8]);
                                            txtdireccion.setText(direccion[8]);
                                            txttelefono.setText(telefono[8]);
                                            txtnacimiento.setText(nacimiento[8]);
                                        } else {
                                            if (indice == 9) {
                                                txtdni.setText(dni[9]);
                                                txtnombre.setText(nombre[9]);
                                                txtapellido.setText(apellido[9]);
                                                txtdireccion.setText(direccion[9]);
                                                txttelefono.setText(telefono[9]);
                                                txtnacimiento.setText(nacimiento[9]);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btnderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnder;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnizq;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelapellido;
    private javax.swing.JLabel labeldireccion;
    private javax.swing.JLabel labeldni;
    private javax.swing.JLabel labelindice;
    private javax.swing.JLabel labelnacimiento;
    private javax.swing.JLabel labelnombre;
    private javax.swing.JLabel labeltelefono;
    private javax.swing.JLabel labeltitulo;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtindice;
    private javax.swing.JTextField txtnacimiento;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
