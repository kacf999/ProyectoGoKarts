package vista;
import java.sql.*; //para cialquier SGBD o ADB oracle, myslq, posgresq1, Mongo DB, Sql server
import java.sql.Connection;//Esteblece conexion a BD
import java.sql.DriverManager;//Driver de conexion
import java.sql.Statement;//setencias slq, DML, DCL, DDL 
import java.sql.ResultSet;//Resultado final de datos
import java.sql.SQLException;//Tratamiento de errores de bases de datos
import java.io.*;//entrada y salida de datos
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;//Ventanas emergentes
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.view.JasperViewer;
import pojos.Kart;

public class GestionKarts extends javax.swing.JFrame {
    public Connection cn;
    public Statement stmt;
    public ResultSet rs;
    
    Kart objKart = new Kart();
    public GestionKarts() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public void conectarBase(){//inicia metodo conectar
    try{//inicia try
    //puente de conexion
    Class.forName("com.mysql.jdbc.Driver");//puente de conexion
       cn=DriverManager.getConnection("jdbc:mysql://localhost/bdproyectofinal","root","");
       JOptionPane.showMessageDialog(null,"CONEXIÓN BD ESTABLECIDA \nCuellar");
       stmt=cn.createStatement();//genera sentencias sql
    }catch(SQLException ex){//inicia exeption
        JOptionPane.showMessageDialog(null,"Error de base de datos 1: \n"+ ex);
    }catch(Exception e){//inica exception errores generales
         JOptionPane.showMessageDialog(null,"Error de base de datos 2:"+ e);
        }
    }//termina metodo conectar
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField6 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNumKartRegistro = new javax.swing.JTextField();
        txtDisponibilidadRegistro = new javax.swing.JTextField();
        txtKmRegistro = new javax.swing.JTextField();
        txtFechaRegistro = new javax.swing.JTextField();
        btnLimpiarRegistro = new javax.swing.JButton();
        btnRegistrarKart = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtCilindradaRegistro = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtNumKartEliminar = new javax.swing.JTextField();
        btnEliminarKart = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtListaKarts = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();
        btnVerEnPDF = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtNumKartEditar = new javax.swing.JTextField();
        txtDisponibilidadEditar = new javax.swing.JTextField();
        txtKmRecorridosEditar = new javax.swing.JTextField();
        txtCilindradaEditar = new javax.swing.JTextField();
        txtFechaEditar = new javax.swing.JTextField();
        btnBuscarNumKart = new javax.swing.JButton();
        btnActualizarKart = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnMenu = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        jTextField6.setText("jTextField6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar Kart", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel1.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Numero de Kart");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Disponiblidad");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("KM recorridos");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Fecha de Adquisición");

        btnLimpiarRegistro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLimpiarRegistro.setText("Limpiar Registro");
        btnLimpiarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarRegistroActionPerformed(evt);
            }
        });

        btnRegistrarKart.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRegistrarKart.setText("Registrar");
        btnRegistrarKart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarKartActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Cilindrada");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLimpiarRegistro)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRegistrarKart)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtFechaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCilindradaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtDisponibilidadRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtKmRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNumKartRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNumKartRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(txtDisponibilidadRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtKmRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(txtCilindradaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtFechaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiarRegistro)
                    .addComponent(btnRegistrarKart))
                .addGap(25, 25, 25))
        );

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 270));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Eliminar Kart", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel3.setOpaque(false);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Ingresa Numero de Kart");

        btnEliminarKart.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminarKart.setText("Eliminar Kart");
        btnEliminarKart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarKartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNumKartEliminar)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnEliminarKart)
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNumKartEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminarKart)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, 200));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista Karts", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel4.setOpaque(false);

        jtListaKarts.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtListaKarts);

        btnActualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnVerEnPDF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnVerEnPDF.setText("Ver en PDF");
        btnVerEnPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerEnPDFActionPerformed(evt);
            }
        });

        btnImprimir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnActualizar)
                        .addGap(54, 54, 54)
                        .addComponent(btnVerEnPDF)
                        .addGap(41, 41, 41)
                        .addComponent(btnImprimir))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnActualizar)
                        .addComponent(btnVerEnPDF))
                    .addComponent(btnImprimir))
                .addGap(0, 34, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 490, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Editar Informacion Karts", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel2.setOpaque(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Numero de Kart");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Disponibilidad");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("KM Recorridos");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Cilindrada");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Fecha de Adquisición");

        btnBuscarNumKart.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuscarNumKart.setText("Buscar por N. Kart");
        btnBuscarNumKart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarNumKartActionPerformed(evt);
            }
        });

        btnActualizarKart.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnActualizarKart.setText("Actualizar Datos");
        btnActualizarKart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarKartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNumKartEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDisponibilidadEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtKmRecorridosEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFechaEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(txtCilindradaEditar)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnBuscarNumKart)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizarKart)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNumKartEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDisponibilidadEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKmRecorridosEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtCilindradaEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFechaEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarNumKart)
                    .addComponent(btnActualizarKart))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, 270));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Sistema Gestion de Karts");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        btnMenu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMenu.setText("Regresar al Menu");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        jPanel5.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/karts fondo.jpg"))); // NOI18N
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarRegistroActionPerformed
        this.txtNumKartRegistro.setText(null);
        this.txtDisponibilidadRegistro.setText(null);
        this.txtFechaRegistro.setText(null);
        this.txtKmRegistro.setText(null);
        this.txtCilindradaRegistro.setText(null);
    }//GEN-LAST:event_btnLimpiarRegistroActionPerformed

    private void btnRegistrarKartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarKartActionPerformed
        conectarBase();
        objKart.setNumKart(Integer.parseInt(txtNumKartRegistro.getText()));
        objKart.setDisponibilidad(txtDisponibilidadRegistro.getText());
        objKart.setAdquisicion(txtFechaRegistro.getText());
        objKart.setKilometros(Integer.parseInt(txtKmRegistro.getText()));
        objKart.setCilindrada(Integer.parseInt(txtCilindradaRegistro.getText()));
        
        String AltaKart = "insert into kart (`NKart`,`Disponibilidad`,`KM`,`FechaAdquirido`,`Cilindrada`) "
                + "values ('"+objKart.getNumKart()+"', '"+objKart.getDisponibilidad()+"', '"+objKart.getKilometros()+"', '"
                +objKart.getAdquisicion()+"', '"+objKart.getCilindrada()+"')";
        try {
            stmt.executeUpdate(AltaKart);
            JOptionPane.showMessageDialog(null, "Se inserto el registro del kart con exito");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en BD 1. Alta Verificar"+e);
        }
    }//GEN-LAST:event_btnRegistrarKartActionPerformed

    private void btnEliminarKartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarKartActionPerformed
        int confirmarBaja;//Variable que guarda un 1 si elimina o un 0 si no lo encuentra
        try {
            conectarBase();
            int idCodigoBaja = Integer.parseInt(txtNumKartEliminar.getText());
            confirmarBaja = stmt.executeUpdate("DELETE FROM kart WHERE NKart ='"+idCodigoBaja+"'");
            if(confirmarBaja == 1){
                JOptionPane.showMessageDialog(null, "se dio de baja el kart: \n\n"+idCodigoBaja);
            }else{
                JOptionPane.showMessageDialog(null, "Error no existe el numero de kart\nVerifica");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error 3 de modulo Bases de Datos\n"+ex);
        }
    }//GEN-LAST:event_btnEliminarKartActionPerformed

    private void btnBuscarNumKartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarNumKartActionPerformed
        try {
            conectarBase();
            objKart.setNumKart(Integer.parseInt(txtNumKartEditar.getText()));
            //genero un cursor de busqueda por campo distintivo
            rs=stmt.executeQuery("SELECT * from kart where NKart ='"+objKart.getNumKart()+"'");//esto es un encapsulado 
            JOptionPane.showMessageDialog(null, "buscado kart ...");
            //si lo encuetra imprime la informacion en cajas de texto 
            if (rs.next()==true)
            {
                txtDisponibilidadEditar.setText(rs.getString("Disponibilidad"));
                txtKmRecorridosEditar.setText(rs.getString("KM"));
                txtFechaEditar.setText(rs.getString("FechaAdquirido"));
                txtCilindradaEditar.setText(rs.getString("Cilindrada"));
                //esto tiene que estar nombrado igual a la base de datos 
            }
            else 
            {
                JOptionPane.showMessageDialog(null, "Error no existe un kart con ese numero \n");
            }
            
        } catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, " Error 4 de modulo de busqueda a DB "+ex);
        }
    }//GEN-LAST:event_btnBuscarNumKartActionPerformed

    private void btnActualizarKartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarKartActionPerformed
        String editarkart="";
        try 
        {
            conectarBase();
            objKart.setNumKart(Integer.parseInt(txtNumKartEditar.getText()));
            objKart.setDisponibilidad(txtDisponibilidadEditar.getText());
            objKart.setAdquisicion(txtFechaEditar.getText());
            objKart.setKilometros(Integer.parseInt(txtKmRecorridosEditar.getText()));
            objKart.setCilindrada(Integer.parseInt(txtCilindradaEditar.getText()));
            //intrucion sql dml lenguage de manipulacion de datos para acrulizar (update) 
            editarkart=" UPDATE kart SET Disponibilidad='"+objKart.getDisponibilidad() +"',KM='"+objKart.getKilometros()+
                    "',FechaAdquirido = '"+objKart.getAdquisicion()+
                    "',Cilindrada = '"+objKart.getCilindrada()+"'where NKart='"+objKart.getNumKart()+"'";
            stmt.executeUpdate(editarkart);
            JOptionPane.showMessageDialog(null, " datos del kart actualizados \n verifica \n Lista de karts \n");
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Error de BD No.5 \n" + ex);
        }
    }//GEN-LAST:event_btnActualizarKartActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        try {
            conectarBase();
            //modelo de datos que almacena de forma logica de registros para consulta
            DefaultTableModel modeloDatos = new DefaultTableModel();
            jtListaKarts.setModel(modeloDatos);
            rs = stmt.executeQuery("Select *from kart");//Trae todos los campos y registros
            ResultSetMetaData ramd = rs.getMetaData();
            int cantidadColumnas = ramd.getColumnCount();
            modeloDatos.addColumn("N.Kart");
            modeloDatos.addColumn("Disponibilidad");
            modeloDatos.addColumn("KM recorridos");
            modeloDatos.addColumn("Fecha Aquisicion");
            modeloDatos.addColumn("Cilindrada");
            //Para imprimir resultado final de datos en arreglos de objetos
            while(rs.next()){
                Object fila[] = new Object[cantidadColumnas];
                for(int i = 0; i < cantidadColumnas; i++){
                    fila[i] = rs.getObject(i+1);
                }
                modeloDatos.addRow(fila);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error de consulta a base de datos\n"+ex);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        MenuPrincipal ventana = new MenuPrincipal();
        ventana.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnVerEnPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerEnPDFActionPerformed
        conectarBase();
        try {
            String rutaReporte="src/reportes/reporteKartsGoKarts.jasper";
            JasperPrint rptlibrosPDF = JasperFillManager.fillReport(rutaReporte,null,cn);
            JasperViewer ventanaVisor = new JasperViewer(rptlibrosPDF,false);
            ventanaVisor.setTitle("Reporte de karts sistema Go Karts");
            ventanaVisor.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error de BD en informe Verifica\n\n"+e);}
    }//GEN-LAST:event_btnVerEnPDFActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        conectarBase();
        try{
            String rutainforme="src/reportes/reporteKartsGoKarts.jasper";
            JasperPrint informe=JasperFillManager.fillReport(rutainforme,null,cn);
            JasperPrintManager.printReport(informe,true);
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(null,"Error al mostrar informe"+e);
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

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
            java.util.logging.Logger.getLogger(GestionKarts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionKarts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionKarts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionKarts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionKarts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnActualizarKart;
    private javax.swing.JButton btnBuscarNumKart;
    private javax.swing.JButton btnEliminarKart;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnLimpiarRegistro;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnRegistrarKart;
    private javax.swing.JButton btnVerEnPDF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTable jtListaKarts;
    private javax.swing.JTextField txtCilindradaEditar;
    private javax.swing.JTextField txtCilindradaRegistro;
    private javax.swing.JTextField txtDisponibilidadEditar;
    private javax.swing.JTextField txtDisponibilidadRegistro;
    private javax.swing.JTextField txtFechaEditar;
    private javax.swing.JTextField txtFechaRegistro;
    private javax.swing.JTextField txtKmRecorridosEditar;
    private javax.swing.JTextField txtKmRegistro;
    private javax.swing.JTextField txtNumKartEditar;
    private javax.swing.JTextField txtNumKartEliminar;
    private javax.swing.JTextField txtNumKartRegistro;
    // End of variables declaration//GEN-END:variables
}
