package proyecto3_maríaumaña;

public class RecorridosFrame extends javax.swing.JInternalFrame {

    ArbolBinario arbol;

    public RecorridosFrame(ArbolBinario arbol) {
        initComponents();

        this.arbol = arbol;
    }

    private void preOrden() {
        //Se crea un objeto stringBuilder para poder mostrar todos los id separados por un -
        StringBuilder ids = new StringBuilder();

        //Se llama al metodo para mostrar el recorrido preOrden 
        arbol.mostrarPreOrden(ids);

        //Se elimina el guion del sobrante
        if (ids.length() > 0) {
            ids.delete(ids.length() - 3, ids.length());
        }

        //Se establece el texto y se muestra en la interfaz
        txtPre.setText(ids.toString());

    }

    //Metodo para mostrar el recorrido in orden
    private void inOrden() {
        StringBuilder ids = new StringBuilder();
        arbol.mostrarInOrden(ids);

        //Se elimina el guion del sobrante
        if (ids.length() > 0) {
            ids.delete(ids.length() - 3, ids.length());
        }

        txtIn.setText(ids.toString());
    }

    //Metodo para mostrar el recorrido post orden
    private void postOrden() {
        StringBuilder ids = new StringBuilder();
        arbol.mostrarPostOrden(ids);

        //Se elimina el guion del sobrante
        if (ids.length() > 0) {
            ids.delete(ids.length() - 3, ids.length());
        }
        txtPost.setText(ids.toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPre = new javax.swing.JTextField();
        btnVerPre = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtIn = new javax.swing.JTextField();
        btnVerIn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtPost = new javax.swing.JTextField();
        btnVerPost = new javax.swing.JButton();
        btnTodos = new javax.swing.JButton();

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Recorridos");
        setAutoscrolls(true);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PRE -ORDEN :");

        btnVerPre.setBackground(new java.awt.Color(153, 153, 153));
        btnVerPre.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btnVerPre.setText("Ver");
        btnVerPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(62, 62, 62)
                .addComponent(txtPre)
                .addGap(103, 103, 103)
                .addComponent(btnVerPre)
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPre, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnVerPre, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("IN -ORDEN :");

        btnVerIn.setBackground(new java.awt.Color(153, 153, 153));
        btnVerIn.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btnVerIn.setText("Ver");
        btnVerIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addGap(74, 74, 74)
                .addComponent(txtIn)
                .addGap(103, 103, 103)
                .addComponent(btnVerIn)
                .addGap(46, 46, 46))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnVerIn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("POST -ORDEN :");

        btnVerPost.setBackground(new java.awt.Color(153, 153, 153));
        btnVerPost.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btnVerPost.setText("Ver");
        btnVerPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPostActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel3)
                .addGap(56, 56, 56)
                .addComponent(txtPost)
                .addGap(97, 97, 97)
                .addComponent(btnVerPost)
                .addGap(46, 46, 46))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPost, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btnVerPost, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        btnTodos.setBackground(new java.awt.Color(102, 102, 102));
        btnTodos.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        btnTodos.setForeground(new java.awt.Color(255, 255, 255));
        btnTodos.setText("Realizar todos los recorridos");
        btnTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(408, 408, 408)
                .addComponent(btnTodos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(346, 346, 346))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(btnTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosActionPerformed
        //Se llaman todos los metodos para poder observar todos los recorridos de una vez
        preOrden();
        inOrden();
        postOrden();
    }//GEN-LAST:event_btnTodosActionPerformed

    private void btnVerPreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPreActionPerformed
        preOrden();
    }//GEN-LAST:event_btnVerPreActionPerformed

    private void btnVerInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerInActionPerformed
        inOrden();
    }//GEN-LAST:event_btnVerInActionPerformed

    private void btnVerPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPostActionPerformed
        postOrden();
    }//GEN-LAST:event_btnVerPostActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTodos;
    private javax.swing.JButton btnVerIn;
    private javax.swing.JButton btnVerPost;
    private javax.swing.JButton btnVerPre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtIn;
    private javax.swing.JTextField txtPost;
    private javax.swing.JTextField txtPre;
    // End of variables declaration//GEN-END:variables
}
