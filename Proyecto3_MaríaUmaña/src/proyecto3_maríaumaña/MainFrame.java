package proyecto3_maríaumaña;

public class MainFrame extends javax.swing.JFrame {

     //Se crea una instancia al arbol binario de movil para evitar que al crear nuevas se pierdan los datos
    ArbolBinario arbol = new ArbolBinario();

    public MainFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrupo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnInsert = new javax.swing.JToggleButton();
        btnRecorridos = new javax.swing.JToggleButton();
        btnEliminarBusqueda = new javax.swing.JToggleButton();
        btnListadoNodosAltura = new javax.swing.JToggleButton();
        contenedorOpc = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        btnInsert.setBackground(new java.awt.Color(153, 153, 153));
        btnGrupo.add(btnInsert);
        btnInsert.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        btnInsert.setText("Inserción");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnRecorridos.setBackground(new java.awt.Color(153, 153, 153));
        btnGrupo.add(btnRecorridos);
        btnRecorridos.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        btnRecorridos.setText("Recorridos");
        btnRecorridos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecorridosActionPerformed(evt);
            }
        });

        btnEliminarBusqueda.setBackground(new java.awt.Color(153, 153, 153));
        btnGrupo.add(btnEliminarBusqueda);
        btnEliminarBusqueda.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        btnEliminarBusqueda.setText("Eliminación/Busqueda");
        btnEliminarBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarBusquedaActionPerformed(evt);
            }
        });

        btnListadoNodosAltura.setBackground(new java.awt.Color(153, 153, 153));
        btnGrupo.add(btnListadoNodosAltura);
        btnListadoNodosAltura.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        btnListadoNodosAltura.setText("Listado/Nodos/Altura");
        btnListadoNodosAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListadoNodosAlturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRecorridos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnListadoNodosAltura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(btnEliminarBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btnRecorridos, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btnListadoNodosAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout contenedorOpcLayout = new javax.swing.GroupLayout(contenedorOpc);
        contenedorOpc.setLayout(contenedorOpcLayout);
        contenedorOpcLayout.setHorizontalGroup(
            contenedorOpcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 989, Short.MAX_VALUE)
        );
        contenedorOpcLayout.setVerticalGroup(
            contenedorOpcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedorOpc)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenedorOpc)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        //Se inicailiza y declara  la ventana de la inserción 
        InsercionFrame insert = new InsercionFrame(arbol);

        // Se agrega la ventana de inserción al contenedor y se maximiza
        contenedorOpc.getDesktopManager().maximizeFrame(insert);

        //Se agrega la ventana de insercion al contenedorOpc
        contenedorOpc.add(insert);

        //Se le da indica que la ventana de inserción sea visible
        insert.setVisible(true);
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnRecorridosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecorridosActionPerformed
        //Se inicailiza y declara  la ventana de la recorridos
        RecorridosFrame recorridos = new RecorridosFrame(arbol);

        // Se agrega la ventana de recorridos al contenedor y se maximiza
        contenedorOpc.getDesktopManager().maximizeFrame(recorridos);

        //Se agrega la ventana de recorridos al contenedorOpc
        contenedorOpc.add(recorridos);
        //Se le da indica que la ventana de recorridos sea visible
        recorridos.setVisible(true);
    }//GEN-LAST:event_btnRecorridosActionPerformed

    private void btnEliminarBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarBusquedaActionPerformed
        //Se inicailiza y declara  la ventana de la eliminación
        EliminacionBusquedaFrame eliminar = new EliminacionBusquedaFrame(arbol);

        // Se agrega la ventana de eliminación al contenedor y se maximiza
        contenedorOpc.getDesktopManager().maximizeFrame(eliminar);

        //Se agrega la ventana de eliminación al contenedorOpc
        contenedorOpc.add(eliminar);

         //Se le da indica que la ventana de eliminación  sea visible
        eliminar.setVisible(true);
    }//GEN-LAST:event_btnEliminarBusquedaActionPerformed

    private void btnListadoNodosAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListadoNodosAlturaActionPerformed
        //Se inicailiza y declara  la ventana para los nodos hojas y la altura
        ListadoNodosAlturaFrame listado = new ListadoNodosAlturaFrame(arbol);

        // Se agrega la ventana de los nodos hojas y la altura al contenedor y se maximiza
        contenedorOpc.getDesktopManager().maximizeFrame(listado);

        //Se agrega la ventana de nodos hojas y la altura al contenedor al contenedorOpc
        contenedorOpc.add(listado);

         //Se le da indica que la ventana de nodos hojas y altura sea visible
        listado.setVisible(true);
    }//GEN-LAST:event_btnListadoNodosAlturaActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnEliminarBusqueda;
    private javax.swing.ButtonGroup btnGrupo;
    private javax.swing.JToggleButton btnInsert;
    private javax.swing.JToggleButton btnListadoNodosAltura;
    private javax.swing.JToggleButton btnRecorridos;
    private javax.swing.JDesktopPane contenedorOpc;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
