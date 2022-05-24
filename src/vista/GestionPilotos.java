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
import pojos.Piloto;

public class GestionPilotos extends javax.swing.JFrame {

    public Connection cn;
    public Statement stmt;
    public ResultSet rs;
    
    Piloto objPiloto = new Piloto();
    public GestionPilotos() {
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

        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombreRegistro = new javax.swing.JTextField();
        txtEdadRegistro = new javax.swing.JTextField();
        txtSexoRegistro = new javax.swing.JTextField();
        txtNacimientoRegistro = new javax.swing.JTextField();
        txtNumeroRegistro = new javax.swing.JTextField();
        btnRegistrarPiloto = new javax.swing.JButton();
        btnLimpiarResgistro = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnBuscarPiloto = new javax.swing.JButton();
        btnActualizarPiloto = new javax.swing.JButton();
        txtNumeroEditar = new javax.swing.JTextField();
        txtNombreEditar = new javax.swing.JTextField();
        txtEdadEditar = new javax.swing.JTextField();
        txtSexoEditar = new javax.swing.JTextField();
        txtNacimientoEditar = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtVueltaRapidaEditar = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtNumeroEliminar = new javax.swing.JTextField();
        btnEliminarPiloto = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtConsultaPiloto = new javax.swing.JTable();
        btnActualizarInformacion = new javax.swing.JButton();
        txtVerPDF = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Sistema Pilotos");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar Piloto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel1.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Edad");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Sexo");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Fecha de Nacimiento");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Numero de piloto");

        btnRegistrarPiloto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRegistrarPiloto.setText("Registrar Piloto");
        btnRegistrarPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPilotoActionPerformed(evt);
            }
        });

        btnLimpiarResgistro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLimpiarResgistro.setText("Limpiar Registro");
        btnLimpiarResgistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarResgistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEdadRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtNumeroRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                        .addComponent(txtNacimientoRegistro)
                        .addComponent(txtSexoRegistro)
                        .addComponent(txtNombreRegistro)))
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLimpiarResgistro)
                .addGap(31, 31, 31)
                .addComponent(btnRegistrarPiloto)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtEdadRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtSexoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtNacimientoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNumeroRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiarResgistro)
                    .addComponent(btnRegistrarPiloto))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 350, 290));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Editar Informacion Piloto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel2.setOpaque(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Numero de piloto");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Nombre");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Edad");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Fecha de Nacimiento");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("sexo");

        btnBuscarPiloto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuscarPiloto.setText("Buscar por Numero");
        btnBuscarPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPilotoActionPerformed(evt);
            }
        });

        btnActualizarPiloto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnActualizarPiloto.setText("Actualizar");
        btnActualizarPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarPilotoActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Vuelta Rapida");

        txtVueltaRapidaEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVueltaRapidaEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombreEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(txtNumeroEditar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEdadEditar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSexoEditar)))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnBuscarPiloto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addComponent(btnActualizarPiloto)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13))
                .addGap(107, 107, 107)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNacimientoEditar)
                    .addComponent(txtVueltaRapidaEditar)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNumeroEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNombreEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtEdadEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtSexoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtNacimientoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtVueltaRapidaEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarPiloto)
                    .addComponent(btnActualizarPiloto))
                .addContainerGap())
        );

        jPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 20, 390, 290));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Eliminar Piloto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel3.setOpaque(false);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Ingrese el Numero de Piloto");

        btnEliminarPiloto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminarPiloto.setText("Eliminar");
        btnEliminarPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPilotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(btnEliminarPiloto))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtNumeroEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(txtNumeroEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnEliminarPiloto)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, 193));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consulta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel4.setOpaque(false);

        jtConsultaPiloto.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtConsultaPiloto);

        btnActualizarInformacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnActualizarInformacion.setText("Actualizar");
        btnActualizarInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarInformacionActionPerformed(evt);
            }
        });

        txtVerPDF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtVerPDF.setText("Ver en PDF");
        txtVerPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVerPDFActionPerformed(evt);
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
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnActualizarInformacion)
                        .addGap(113, 113, 113)
                        .addComponent(txtVerPDF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnImprimir)
                        .addGap(78, 78, 78))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizarInformacion)
                    .addComponent(txtVerPDF)
                    .addComponent(btnImprimir))
                .addGap(0, 27, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 560, 220));

        btnMenu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMenu.setText("Regresar al Menu");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        jPanel5.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/karts fondo.jpg"))); // NOI18N
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 630));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPilotoActionPerformed
        conectarBase();
        
        objPiloto.setNombre(txtNombreRegistro.getText());
        objPiloto.setEdad(Integer.parseInt(txtEdadRegistro.getText()));
        objPiloto.setSexo(txtSexoRegistro.getText());
        objPiloto.setFechaNacimiento(txtNacimientoRegistro.getText());
        objPiloto.setNumPiloto(txtNumeroRegistro.getText());
        
        String AltaPiloto = "insert into piloto (`Nombre`,`Edad`,`Sexo`,`Nacimiento`,`NPiloto`) "
                + "values ('"+objPiloto.getNombre()+"', '"+objPiloto.getEdad()+"', '"+objPiloto.getSexo()+"', '"
                +objPiloto.getFechaNacimiento()+"', '"+objPiloto.getNumPiloto()+"')";
        try {
            stmt.executeUpdate(AltaPiloto);
            JOptionPane.showMessageDialog(null, "Se inserto el registro del piloto con exito");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en BD 1. Alta Verificar"+e);
        }
    }//GEN-LAST:event_btnRegistrarPilotoActionPerformed

    private void btnLimpiarResgistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarResgistroActionPerformed
        this.txtNombreRegistro.setText(null);
        this.txtNumeroRegistro.setText(null);
        this.txtEdadRegistro.setText(null);
        this.txtSexoRegistro.setText(null);
        this.txtNacimientoRegistro.setText(null);
    }//GEN-LAST:event_btnLimpiarResgistroActionPerformed

    private void txtVueltaRapidaEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVueltaRapidaEditarActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_txtVueltaRapidaEditarActionPerformed

    private void btnEliminarPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPilotoActionPerformed
        int confirmarBaja;//Variable que guarda un 1 si elimina o un 0 si no lo encuentra
        try {
            conectarBase();
            String idCodigoBaja = txtNumeroEliminar.getText();
            confirmarBaja = stmt.executeUpdate("DELETE FROM piloto WHERE NPiloto ='"+idCodigoBaja+"'");
            if(confirmarBaja == 1){
                JOptionPane.showMessageDialog(null, "se dio de baja el numero de piloto: \n\n"+idCodigoBaja);
            }else{
                JOptionPane.showMessageDialog(null, "Error no existe el numero de piloto\nVerifica");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error 3 de modulo Bases de Datos\n"+ex);
        }
    }//GEN-LAST:event_btnEliminarPilotoActionPerformed

    private void btnBuscarPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPilotoActionPerformed
        try {
            conectarBase();
            objPiloto.setNumPiloto(txtNumeroEditar.getText());//guarda el valor caprurado el objeto
            //genero un cursor de busqueda por campo distintivo
            rs=stmt.executeQuery("SELECT * from piloto where NPiloto ='"+objPiloto.getNumPiloto()+"'");//esto es un encapsulado 
            JOptionPane.showMessageDialog(null, "buscado piloto ...");
            //si lo encuetra imprime la informacion en cajas de texto 
            if (rs.next()==true)
            {
                txtNombreEditar.setText(rs.getString("Nombre"));
                txtEdadEditar.setText(rs.getString("Edad"));
                txtSexoEditar.setText(rs.getString("Sexo"));
                txtNacimientoEditar.setText(rs.getString("Nacimiento"));
                txtVueltaRapidaEditar.setText(rs.getString("VueltaRapida"));
                //esto tiene que estar nombrado igual a la base de datos 
            }
            else 
            {
                JOptionPane.showMessageDialog(null, "Error no existe un piloto con ese numero \n");
            }
            
        } catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, " Error 4 de modulo de busqueda a DB "+ex);
        }
    }//GEN-LAST:event_btnBuscarPilotoActionPerformed

    private void btnActualizarPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarPilotoActionPerformed
        String editarPiloto="";
        try 
        {
            conectarBase();
            objPiloto.setNombre(txtNombreEditar.getText());
            objPiloto.setEdad(Integer.parseInt(txtEdadEditar.getText()));
            objPiloto.setSexo(txtSexoEditar.getText());
            objPiloto.setFechaNacimiento(txtNacimientoEditar.getText());
            objPiloto.setNumPiloto(txtNumeroEditar.getText());
            objPiloto.setVueltaRapida(txtVueltaRapidaEditar.getText());
            //intrucion sql dml lenguage de manipulacion de datos para acrulizar (update) 
            editarPiloto=" UPDATE piloto SET Nombre='"+objPiloto.getNombre()+"',Edad='"
                    +objPiloto.getEdad() +"',Sexo='"+objPiloto.getSexo()+
                    "',Nacimiento = '"+objPiloto.getFechaNacimiento()+
                    "', VueltaRapida = '"+objPiloto.getVueltaRapida()+"'where Npiloto='"+objPiloto.getNumPiloto()+"'";
            stmt.executeUpdate(editarPiloto);
            JOptionPane.showMessageDialog(null, " datos del piloto actualizados \n verifica \n consulta \n");
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Error de BD No.5 \n" + ex);
        }
    }//GEN-LAST:event_btnActualizarPilotoActionPerformed

    private void btnActualizarInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarInformacionActionPerformed
        try {
            conectarBase();
            //modelo de datos que almacena de forma logica de registros para consulta
            DefaultTableModel modeloDatos = new DefaultTableModel();
            jtConsultaPiloto.setModel(modeloDatos);
            rs = stmt.executeQuery("Select *from piloto");//Trae todos los campos y registros
            ResultSetMetaData ramd = rs.getMetaData();
            int cantidadColumnas = ramd.getColumnCount();
            modeloDatos.addColumn("Nombre");
            modeloDatos.addColumn("Edad");
            modeloDatos.addColumn("Sexo");
            modeloDatos.addColumn("Nacimiento");
            modeloDatos.addColumn("NPiloto");
            modeloDatos.addColumn("Vuelta Rapida");
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
    }//GEN-LAST:event_btnActualizarInformacionActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        MenuPrincipal ventana = new MenuPrincipal();
        ventana.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void txtVerPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVerPDFActionPerformed
        conectarBase();
        try {
            String rutaReporte="src/reportes/reportePilotosGoKart.jasper";
            JasperPrint rptlibrosPDF = JasperFillManager.fillReport(rutaReporte,null,cn);
            JasperViewer ventanaVisor = new JasperViewer(rptlibrosPDF,false);
            ventanaVisor.setTitle("Reporte de pilotos sistema Go Karts");
            ventanaVisor.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error de BD en informe Verifica\n\n"+e);}
    }//GEN-LAST:event_txtVerPDFActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        conectarBase();
        try{
            String rutainforme="src/reportes/reportePilotosGoKart.jasper";
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
            java.util.logging.Logger.getLogger(GestionPilotos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionPilotos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionPilotos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionPilotos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionPilotos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarInformacion;
    private javax.swing.JButton btnActualizarPiloto;
    private javax.swing.JButton btnBuscarPiloto;
    private javax.swing.JButton btnEliminarPiloto;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnLimpiarResgistro;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnRegistrarPiloto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JTable jtConsultaPiloto;
    private javax.swing.JTextField txtEdadEditar;
    private javax.swing.JTextField txtEdadRegistro;
    private javax.swing.JTextField txtNacimientoEditar;
    private javax.swing.JTextField txtNacimientoRegistro;
    private javax.swing.JTextField txtNombreEditar;
    private javax.swing.JTextField txtNombreRegistro;
    private javax.swing.JTextField txtNumeroEditar;
    private javax.swing.JTextField txtNumeroEliminar;
    private javax.swing.JTextField txtNumeroRegistro;
    private javax.swing.JTextField txtSexoEditar;
    private javax.swing.JTextField txtSexoRegistro;
    private javax.swing.JButton txtVerPDF;
    private javax.swing.JTextField txtVueltaRapidaEditar;
    // End of variables declaration//GEN-END:variables
}
