/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1extraguia2;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sabrina
 */
public class ConsultaTareas extends javax.swing.JInternalFrame {
private DefaultTableModel modelo=new DefaultTableModel();
   public boolean isCellEditable(int f, int c){
       return false;
   }
   
    public ConsultaTareas() {
        initComponents();
        armarCabecera();
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTareas = new javax.swing.JTable();
        jcCompletadas = new javax.swing.JCheckBox();
        jcIncompletas = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(153, 153, 255));
        setClosable(true);
        setTitle("Consulta de Tareas");

        jPanel1.setBackground(new java.awt.Color(255, 153, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel1.setText("Consulta de Tareas");

        jtTareas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtTareas);

        jcCompletadas.setText("Tareas Completadas");
        jcCompletadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcCompletadasActionPerformed(evt);
            }
        });

        jcIncompletas.setText("Tareas Incompletas");
        jcIncompletas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcIncompletasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcIncompletas)
                            .addComponent(jcCompletadas))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(jcCompletadas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcIncompletas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcCompletadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcCompletadasActionPerformed
       borrarFilas();
        for(Tarea prod:ListaTareas.listaTareas){
           if(prod.isCompleto()==true){
               modelo.addRow(new Object[]{prod.getCodigo(),prod.getDescripcion(),prod.isCompleto()});
           }
    }//GEN-LAST:event_jcCompletadasActionPerformed
    }
    private void jcIncompletasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcIncompletasActionPerformed
         borrarFilas();
        for(Tarea prod:ListaTareas.listaTareas){
           if(prod.isCompleto()==false){
               modelo.addRow(new Object[]{prod.getCodigo(),prod.getDescripcion(),prod.isCompleto()});
           }
    }
    }//GEN-LAST:event_jcIncompletasActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox jcCompletadas;
    private javax.swing.JCheckBox jcIncompletas;
    private javax.swing.JTable jtTareas;
    // End of variables declaration//GEN-END:variables

private void armarCabecera(){
    modelo.addColumn("Codigo");
    modelo.addColumn("Descripcion");
    modelo.addColumn("¿Completada?");
   
    jtTareas.setModel(modelo);
}
private void borrarFilas(){
    int f=jtTareas.getRowCount()-1;
    //for(int filas =f;filas>=0;filas--)
    for(;f>=0;f--){
        modelo.removeRow(f);
    }
}


}