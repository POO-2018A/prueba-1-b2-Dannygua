
package tiendadefrutas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;


public class Ventana extends javax.swing.JFrame {
    
    String frutasT [][];
    DefaultTableModel tablaFrutas;

        ArrayList <Frutas> listFrutas = new ArrayList <Frutas> ();
        ArrayList <Clientes> listClientes = new ArrayList <Clientes> ();
        
        List<Clientes> listaClientes = new ArrayList<Clientes>();
    DefaultComboBoxModel listaClientesModel = 
            new DefaultComboBoxModel(listaClientes.toArray());

    public Ventana() {
        initComponents();
        
        
        Frutas f1 = new Frutas (2,"Manzana", "1724");
        Frutas f2 = new Frutas (3,"Pera", "1725");
        Frutas f3 = new Frutas (4,"Mandarina", "1895");
        Frutas f4 = new Frutas (5,"Melon", "1845");
        Frutas f5 = new Frutas (6,"Platano", "1268");
        
        listFrutas.add(f1);
        listFrutas.add(f2);
        listFrutas.add(f3);
        listFrutas.add(f4);
        listFrutas.add(f5);
        boxCedulas.setModel(listaClientesModel);
        
        String TituloFrutas []= new String []{"Fruta","Precio"};
        
        tablaFrutas= new DefaultTableModel (frutasT,TituloFrutas);
        tblFrutas.setModel(tablaFrutas);
        
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtNombreFruta = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        boxCedulas = new javax.swing.JComboBox<>();
        boxFrutas = new javax.swing.JComboBox<>();
        btnMostrar = new javax.swing.JButton();
        lblnombre = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        btnMFruta = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblFrutas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Tienda de frutas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setText("Cliente");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        jLabel3.setText("Frutas");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, -1, -1));

        jLabel4.setText("Pedidos Registrados");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 269, -1, -1));

        jLabel6.setText("Nombre");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLabel7.setText("Cedula");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabel8.setText("Lista de frutas");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        jLabel9.setText("Codigo");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, -1, -1));

        jLabel10.setText("Nombre");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, -1, -1));

        jLabel11.setText("Precio");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, -1, -1));

        jLabel12.setText("Lista de cedula");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 299, -1, -1));

        jLabel13.setText("Informacion del cliente");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 456, -1, -1));

        jLabel14.setText("NOMBRE");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 511, -1, -1));

        jLabel15.setText("CEDULA");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, -1, -1));

        jLabel16.setText("Pedidos del cliente");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, -1, -1));

        jLabel17.setText("Total");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 555, -1, -1));
        getContentPane().add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 550, 80, 20));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 163, -1));
        getContentPane().add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 163, -1));
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 163, -1));

        txtNombreFruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreFrutaActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombreFruta, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, 163, -1));
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 163, -1));

        btnAgregar.setText("Añadir fruta al pedido");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, -1, -1));

        btnRegistrar.setText("Registar Pedidos");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, -1, -1));

        boxCedulas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(boxCedulas, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 296, -1, -1));

        boxFrutas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manzana", "Pera", "Mandarina", "Melon", "Platano" }));
        getContentPane().add(boxFrutas, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, -1));

        btnMostrar.setText("Mostrar Pedido");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, -1, -1));
        getContentPane().add(lblnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, -1, -1));
        getContentPane().add(lblCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 550, -1, -1));

        btnMFruta.setText("Mostrar Informacion de la fruta");
        btnMFruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMFrutaActionPerformed(evt);
            }
        });
        getContentPane().add(btnMFruta, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, -1, -1));

        tblFrutas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane2.setViewportView(tblFrutas);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 360, 210));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreFrutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreFrutaActionPerformed
        
    }//GEN-LAST:event_txtNombreFrutaActionPerformed

    private void btnMFrutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMFrutaActionPerformed
        
        int op = boxFrutas.getSelectedIndex();
        
        switch (op){
            
            case 0:
                txtPrecio.setText(""+listFrutas.get(0).getPrecio());
                txtNombreFruta.setText(""+listFrutas.get(0).getNombre());
                txtCodigo.setText(""+listFrutas.get(0).getCodigo());
                break;
            case 1:
                txtPrecio.setText(""+listFrutas.get(1).getPrecio());
                txtNombreFruta.setText(""+listFrutas.get(1).getNombre());
                txtCodigo.setText(""+listFrutas.get(1).getCodigo());
                break;
            case 2:
                txtPrecio.setText(""+listFrutas.get(2).getPrecio());
                txtNombreFruta.setText(""+listFrutas.get(2).getNombre());
                txtCodigo.setText(""+listFrutas.get(2).getCodigo());
                break;
            case 3:
                txtPrecio.setText(""+listFrutas.get(3).getPrecio());
                txtNombreFruta.setText(""+listFrutas.get(3).getNombre());
                txtCodigo.setText(""+listFrutas.get(3).getCodigo());
                break;
            case 4:
                txtPrecio.setText(""+listFrutas.get(4).getPrecio());
                txtNombreFruta.setText(""+listFrutas.get(4).getNombre());
                txtCodigo.setText(""+listFrutas.get(4).getCodigo());
                break;
            
        }
            
        
    }//GEN-LAST:event_btnMFrutaActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        
        String nombreC = txtNombre.getText();
        String cedulaC = txtCedula.getText();
        String FrutaC = ""+boxFrutas.getSelectedItem();  
        int Precio = Integer.parseInt(txtPrecio.getText());

        Clientes newCliente = new Clientes (nombreC,cedulaC,FrutaC,Precio);
        
        listClientes.add(newCliente);
        
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        
           listaClientesModel.addElement(txtCedula.getText());  
           txtNombre.setText("");
           txtCedula.setText("");
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        
        int size =tblFrutas.getRowCount();
        for (int i = size-1; i>=0; i--) {
            tablaFrutas.removeRow(i);
        }
        
        String cedu = ""+boxCedulas.getSelectedItem();
        int total = 0;
        
        for (int i = 0; i < listClientes.size(); i++) {
             if(listClientes.get(i).getCedula().equals(cedu)){
                 
                 lblnombre.setText(listClientes.get(i).getNombre());
                 lblCedula.setText(listClientes.get(i).getCedula());
                 
                 break;
             }
            
            
        }
        
        
        for (int i = 0; i < listClientes.size(); i++) {
            
            if(listClientes.get(i).getCedula().equals(cedu)){
                
               tablaFrutas.addRow(new String []{listClientes.get(i).getFrutaC(),""+listClientes.get(i).getPrecioC()});
               int precioproducto = listClientes.get(i).getPrecioC();
               total +=precioproducto;
               
                
            }
            
        }
        
        lblTotal.setText(""+total);
        
        
    }//GEN-LAST:event_btnMostrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxCedulas;
    private javax.swing.JComboBox<String> boxFrutas;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnMFruta;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JTable tblFrutas;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreFruta;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
