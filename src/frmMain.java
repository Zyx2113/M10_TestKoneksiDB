
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arthur Muntu Untu
 */
public class frmMain extends javax.swing.JFrame {

    /**
     * Creates new form frmMain
     */
    public frmMain() {
        initComponents();
    }
    public void setTanggal()
    {
        java.util.Date skrng = new java.util.Date();
        java.text.SimpleDateFormat kal = new
        java.text.SimpleDateFormat ("dd/MM/yyyy");
        nol_detik.setText(kal.format(skrng));
    }
    public void SetJam()
    {
        ActionListener taskPerformer = new ActionListener()
                {
                public void actionPerformed(ActionEvent evt)
                    {
                        Date dt = new Date();
                        int nilai_jam = dt.getHours();
                        int nilai_menit = dt.getMinutes();
                        int nilai_deitk = dt.getSeconds();
                        if (nilai_jam <= 9)
                            {
                                nol_detik = "0";
                            }
                        if (nilai_menit <= 9)
                            {
                                nol_detik = "0";
                            }
                        if (nilai_detik <= 9)
                            {
                                nol_detik = "0";
                            }
                        String jam = nol_jam + Integer.toString(nilai_jam);
                        String menit = nol_menit + Integer.toString(nilai_menit);
                        String detik = nol_detik + Integer.toString(nilai_detik);
                        labeltanggal.setText("Jam "+jam+":"+menit+":"+detik);
                    }
                };
        new Timer(100, taskPerformer).start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JK = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nol_detik = new javax.swing.JLabel();
        waktu = new javax.swing.JLabel();
        labeltanggal = new javax.swing.JLabel();
        nol_jam = new javax.swing.JLabel();
        nol_menit = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtNIS = new javax.swing.JTextField();
        txtTempatLahir = new javax.swing.JTextField();
        txtKelas = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextArea();
        rbLaki = new javax.swing.JRadioButton();
        rbPerempuan = new javax.swing.JRadioButton();
        Tanggal = new com.toedter.calendar.JDateChooser();
        txtNama = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnPrint = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnEdit1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb1Data = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("The Real Informatic Schools");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 80, 200, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FORM BIODATA SISWA SMK TELKOM");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 30, 450, 40);

        nol_detik.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(nol_detik);
        nol_detik.setBounds(690, 90, 60, 20);

        waktu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        waktu.setText("Waktu");
        jPanel1.add(waktu);
        waktu.setBounds(530, 50, 60, 20);

        labeltanggal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(labeltanggal);
        labeltanggal.setBounds(590, 50, 60, 20);

        nol_jam.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(nol_jam);
        nol_jam.setBounds(550, 90, 60, 20);

        nol_menit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(nol_menit);
        nol_menit.setBounds(620, 90, 60, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 870, 110);

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));
        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Alamat");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 430, 100, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("NIS");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 10, 100, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Tempat Lahir");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(20, 130, 100, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Jenis Kelamin");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(20, 250, 100, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Kelas");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(80, 300, 100, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Email");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(20, 370, 100, 20);
        jPanel2.add(txtEmail);
        txtEmail.setBounds(20, 390, 180, 30);
        jPanel2.add(txtNIS);
        txtNIS.setBounds(20, 30, 180, 30);
        jPanel2.add(txtTempatLahir);
        txtTempatLahir.setBounds(20, 160, 180, 30);
        jPanel2.add(txtKelas);
        txtKelas.setBounds(20, 320, 180, 30);

        txtAlamat.setColumns(20);
        txtAlamat.setRows(5);
        jScrollPane1.setViewportView(txtAlamat);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(20, 460, 200, 110);

        rbLaki.setBackground(new java.awt.Color(255, 153, 0));
        JK.add(rbLaki);
        rbLaki.setText("Laki-Laki");
        rbLaki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbLakiActionPerformed(evt);
            }
        });
        jPanel2.add(rbLaki);
        rbLaki.setBounds(20, 270, 90, 23);

        rbPerempuan.setBackground(new java.awt.Color(255, 153, 0));
        JK.add(rbPerempuan);
        rbPerempuan.setText("Perempuan");
        jPanel2.add(rbPerempuan);
        rbPerempuan.setBounds(120, 270, 120, 23);
        jPanel2.add(Tanggal);
        Tanggal.setBounds(20, 210, 180, 30);
        jPanel2.add(txtNama);
        txtNama.setBounds(20, 100, 180, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Tanggal Lahir");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(20, 190, 100, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Nama");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(20, 70, 100, 20);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 170, 280, 580);

        jPanel4.setBackground(new java.awt.Color(255, 153, 0));
        jPanel4.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Isian Data Siswa");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(20, 10, 130, 20);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(10, 120, 280, 40);

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));
        jPanel3.setLayout(null);

        btnPrint.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        jPanel3.add(btnPrint);
        btnPrint.setBounds(470, 30, 73, 23);

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdd.setText("Save");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel3.add(btnAdd);
        btnAdd.setBounds(20, 30, 65, 25);

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel3.add(btnDelete);
        btnDelete.setBounds(90, 30, 90, 23);

        Reset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Reset.setText("Clear");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        jPanel3.add(Reset);
        Reset.setBounds(190, 30, 73, 23);

        btnRefresh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        jPanel3.add(btnRefresh);
        btnRefresh.setBounds(280, 30, 85, 23);

        btnEdit1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEdit1.setText("Edit");
        btnEdit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdit1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnEdit1);
        btnEdit1.setBounds(380, 30, 73, 23);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(300, 120, 570, 80);

        jPanel6.setBackground(new java.awt.Color(255, 153, 0));
        jPanel6.setLayout(null);

        tb1Data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NIS", "NamaSiswa", "JenisKelamin", "Kelas", "Email", "Alamat"
            }
        ));
        tb1Data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb1DataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tb1Data);

        jPanel6.add(jScrollPane2);
        jScrollPane2.setBounds(20, 0, 550, 490);

        getContentPane().add(jPanel6);
        jPanel6.setBounds(300, 210, 570, 540);

        setBounds(0, 0, 890, 794);
    }// </editor-fold>//GEN-END:initComponents

    private void rbLakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbLakiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbLakiActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String tanggal = dateFormat.format(Tanggal.getDate());
        String JK = "";
        if (rbLaki.isSelected())
        {
        }
        else
        {
            JK = "L";
        }
        if(rbPerempuan.isSelected())
        {
            JK = "P";
        }
        
        if(txtNIS.getText().equals("") || txtTempatLahir.getText().equals("") || txtKelas.getText().equals("")
                ||txtEmail.getText().equals("") ||txtTempatLahir.getText().equals("") ||txtAlamat.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error",
            JOptionPane.INFORMATION_MESSAGE);
            selectData();
        }
        else
        {
            String SQL = "INSERT INTO `t_siswa`(`NIS`, `NamaSiswa`, `JenisKelamin`, `Kelas`, `Email`, `Alamat`)"
                    + " VALUES ("+txtNIS.getText()+","+txtNama.getText()+","+JK+","+txtKelas.getText()+","+txtEmail.getText()+","+txtAlamat.getText()+")";
            String xd = "INSERT INTO `t_siswa` VALUES ('"+txtNIS.getText()+"', '"+txtNama.getText()
                    +"', '"+tanggal+"', '"+JK+"', '"+txtKelas.getText()+"', '"+txtEmail.getText()
                    +"', '"+txtTempatLahir.getText()+"', '"+txtAlamat.getText()+"')";
            int status = KoneksiDB.execute(SQL);
            if(status == 1)
            {
                JOptionPane.showMessageDialog(this, "Data Berhasil Ditambahkan", "SUKSES",
                        JOptionPane.INFORMATION_MESSAGE);
                selectData();
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Data Gagal Ditambahkan", "GAGAL",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
          
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int baris = tb1Data.getSelectedRow();
        if (baris != 1)
        {
            String NIS = tb1Data.getValueAt(baris, 0).toString();
            String SQL = "DELETE FROM t_siswa WHERE NIS'"+NIS+"'";
            int status = KoneksiDB.execute(SQL);
            if (status == 1)
             {
            JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan", "Success!", JOptionPane.INFORMATION_MESSAGE);
            selectData();
              }
             else
             {
                   JOptionPane.showMessageDialog(this, "Data gagal untuk dihapus", "Failed!", JOptionPane.WARNING_MESSAGE);
             }
        }
        else
             {
                   JOptionPane.showMessageDialog(this, "Pilih Baris data terlebih dahulu", "Error!", JOptionPane.WARNING_MESSAGE);
             }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
        txtNama.setText("");
        txtTempatLahir.setText("");
        txtNIS.setText("");
        txtKelas.setText("");
        JK.clearSelection();
        txtEmail.setText("");
        txtAlamat.setText("");
        
    }//GEN-LAST:event_ResetActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        selectData();
        
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:\
         MessageFormat header = new MessageFormat("Biodata Siswa SMK Telkom Malang");
         MessageFormat footer = new MessageFormat("Page (0,number,integer)      ");
         try
         {
             tb1Data.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, null, true, null);
         }
         catch (java.awt.print.PrinterException e)
         {
             System.err.format("Cannot Print %s%n", e.getMessage());
         }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void tb1DataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb1DataMouseClicked
        // TODO add your handling code here:
        int baris = tb1Data.getSelectedRow();
        if (baris != -1)
        {
            txtNIS.setText(tb1Data.getValueAt(baris, 0).toString());
            txtNama.setText(tb1Data.getValueAt(baris, 1).toString());
            txtTempatLahir.setText(tb1Data.getValueAt(baris, 2).toString());
            SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
            Date dateFormat = null;
            try
            {
                dateFormat = date.parse(tb1Data.getValueAt(baris, 3).toString());
            }
            catch (ParseException ex)
            {
                Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
            }
            Tanggal.setDate(dateFormat);
            String JK = tb1Data.getValueAt(baris, 4).toString();
            if(JK.equals("Laki-Laki"))
            {
                rbLaki.setSelected(true);
            }
            else
            {
                rbPerempuan.setSelected(true);
            txtKelas.setText(tb1Data.getValueAt(baris, 5).toString());
            txtEmail.setText(tb1Data.getValueAt(baris, 6).toString());
            txtAlamat.setText(tb1Data.getValueAt(baris, 7).toString());
            }
        }
        
    }//GEN-LAST:event_tb1DataMouseClicked

    private void btnEdit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdit1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEdit1ActionPerformed

    public void selectData()
    {
        String kolom[] = {"NIS","NamaSiswa","JenisKelamin","Kelas","Email","Alamat"};
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        String SQL = "SELECT * FROM t_siswa";
        ResultSet rs = KoneksiDB.executeQuery(SQL);
        try
        {
            while(rs.next())
            {
                String NIS = rs.getString(1);
                String NamaSiswa = rs.getString(2);
                String JenisKelamin = "";
                if ("L".equals(rs.getString(3)))
                {
                    JenisKelamin = "Laki-Laki";
                }
                else
                {
                    JenisKelamin = "Perempuan";
                }
                String Kelas = rs.getString(4);
                String Email = rs.getString(5);
                String Alamat = rs.getString(4);
                String data[] ={NIS,NamaSiswa,JenisKelamin,Kelas,Email,Alamat};
                dtm.addRow(data);
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        tb1Data.setModel(dtm);
    }
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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup JK;
    private javax.swing.JButton Reset;
    private com.toedter.calendar.JDateChooser Tanggal;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit1;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labeltanggal;
    private javax.swing.JLabel nol_detik;
    private javax.swing.JLabel nol_jam;
    private javax.swing.JLabel nol_menit;
    private javax.swing.JRadioButton rbLaki;
    private javax.swing.JRadioButton rbPerempuan;
    private javax.swing.JTable tb1Data;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtKelas;
    private javax.swing.JTextField txtNIS;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTempatLahir;
    private javax.swing.JLabel waktu;
    // End of variables declaration//GEN-END:variables
}
