package proyecto3_maríaumaña;

import javax.swing.table.DefaultTableModel;

public class ListadoNodosAlturaFrame extends javax.swing.JInternalFrame {
    
    DefaultTableModel tablaListado = new DefaultTableModel();
    DefaultTableModel tablaNodos = new DefaultTableModel();
    
    ArbolBinario arbol;
    
    public ListadoNodosAlturaFrame(ArbolBinario arbol) {
        initComponents();
        
        this.arbol = arbol;
        
        //Metodos llamados para agregar columnas a las tablas
        CargarTablaListado();
        CargarTablaNodos();
    }
    
    private void CargarTablaListado() {
         //Se agregan las columnas a la tabla listado
        tablaListado.addColumn("ID");
        tablaListado.addColumn("Marca");
        tablaListado.addColumn("Año de creación");
        tablaListado.addColumn("Sistema Operativo");
        
        //Se llama al metodo que va a mostrar todos los nodos en la tabla listado
        arbol.mostrarTablaListado(tablaListado);
    }
    
    private void CargarTablaNodos() {
         //Se agregan las columnas a la tabla nodos
        tablaNodos.addColumn("ID");
        tablaNodos.addColumn("Marca");
        tablaNodos.addColumn("Año de creación");
        tablaNodos.addColumn("Sistema Operativo");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtAltura = new javax.swing.JTextField();
        btnAlturaCalcular = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnNodosHojas = new javax.swing.JButton();

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jTable1.setModel(tablaListado);
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mostrar los nodos hojas del árbol ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(388, 388, 388)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("La altura del árbol es : ");

        txtAltura.setEditable(false);
        txtAltura.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnAlturaCalcular.setBackground(new java.awt.Color(153, 153, 153));
        btnAlturaCalcular.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btnAlturaCalcular.setText("Calcular");
        btnAlturaCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlturaCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addComponent(txtAltura)
                .addGap(58, 58, 58)
                .addComponent(btnAlturaCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnAlturaCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        jTable2.setModel(tablaNodos);
        jScrollPane2.setViewportView(jTable2);

        btnNodosHojas.setBackground(new java.awt.Color(153, 153, 153));
        btnNodosHojas.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btnNodosHojas.setText("Buscar");
        btnNodosHojas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNodosHojasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(422, 422, 422)
                .addComponent(btnNodosHojas, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addGap(387, 387, 387))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNodosHojas, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlturaCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlturaCalcularActionPerformed
        //Se obtine la altura al llamar al metodo encargado del calculo
        int alt = arbol.mostrarAlturaArbol();
        
        //Se conveierte a string para poder mostrarlo en la interfaz
        String mostrarAlt = String.valueOf(alt);
        txtAltura.setText(mostrarAlt);
    }//GEN-LAST:event_btnAlturaCalcularActionPerformed

    private void btnNodosHojasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNodosHojasActionPerformed
       //Se llama al metodo con el cual se mostraran los nodos hojas del arbol binario
        arbol.mostrarTablaNodosHojas(tablaNodos);
    }//GEN-LAST:event_btnNodosHojasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlturaCalcular;
    private javax.swing.JButton btnNodosHojas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtAltura;
    // End of variables declaration//GEN-END:variables
}
