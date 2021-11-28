/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import dao.KhachHangDAO;
import dao.impl.KhachHangImpl;
import entity.KhachHang;

public class QLKH_LapHD extends JFrame implements ActionListener, MouseListener {

	private DefaultTableModel modelTable;

	/**
	 * Creates new form QLKH
	 */
	public static String dataTen;
	public static String dataSoDT;
	public QLKH_LapHD() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        txtSoDT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnSua = new javax.swing.JButton();
        btnLapHD = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        X = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        btnRefresh = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cbbNgay = new javax.swing.JComboBox<>();
        cbbThang = new javax.swing.JComboBox<>();
        cbbNam = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel1.setText("Quản Lý Khách Hàng");

        

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("Họ Tên");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setText("Số Điện Thoại");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setText("Địa Chỉ");

        btnSua.setBackground(new java.awt.Color(255, 102, 0));
        btnSua.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSua.setText("Cập nhật Thông Tin ");

        btnLapHD.setBackground(new java.awt.Color(255, 102, 0));
        btnLapHD.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLapHD.setText("Lập Hóa Đơn ");

        btnThem.setBackground(new java.awt.Color(255, 102, 0));
        btnThem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnThem.setText("Thêm Khách Hàng");
        

        table.setAutoCreateRowSorter(true);
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Khách hàng", "Tên Khách hàng", "Ngày sinh", "Số điện thoại", "Địa chỉ", "Email"
            }
        ));
        jScrollPane1.setViewportView(table);

        X.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		X.setForeground(new java.awt.Color(255, 0, 0));
		X.setText("X");
		if (X.equals("LapHD")) {
			X.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					XActionPerformed2(evt);
					new LapHD().setVisible(true);
					new LapHD().setVisible(false);
				
				}
			});
		}else {
			X.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					XActionPerformed(evt);
					new LapHD().setVisible(true);
					new LapHD().setVisible(false);
				}
			});
		}

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 0));
        jLabel5.setText("Mã Khách Hàng");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 0));
        jLabel6.setText("Email");

        btnRefresh.setBackground(new java.awt.Color(255, 102, 0));
        btnRefresh.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRefresh.setText("Làm mới");
        
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 0));
        jLabel7.setText("Ngày sinh");

        cbbNgay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));

        cbbThang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        cbbNam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbbNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbbThang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(cbbNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtSoDT, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 9, Short.MAX_VALUE)
                                .addComponent(btnThem)
                                .addGap(159, 159, 159)
                                .addComponent(btnSua)
                                .addGap(109, 109, 109)
                                .addComponent(btnLapHD)
                                .addGap(181, 181, 181)
                                .addComponent(btnRefresh)
                                .addGap(38, 38, 38))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(341, 341, 341)
                                .addComponent(jLabel1)
                                .addGap(370, 370, 370)
                                .addComponent(X)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 984, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(X)
                    .addComponent(jLabel1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 78, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSoDT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbbNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbThang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLapHD)
                    .addComponent(btnRefresh)
                    .addComponent(btnSua)
                    .addComponent(btnThem))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);

	
		btnSua.addActionListener(this);
		btnThem.addActionListener(this);
		btnLapHD.addActionListener(this);
		btnRefresh.addActionListener(this);
		table.addMouseListener(this);

		txtMa.setEnabled(false);
		btnSua.setEnabled(false);
		btnLapHD.setEnabled(false);

		cbbNam.addActionListener(this);
		cbbThang.addActionListener(this);

//      
		modelTable = (DefaultTableModel) table.getModel();
		addTable_sql();
//	
		addComboBox();

	}// </editor-fold>//GEN-END:initComponents

	private void XActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_XActionPerformed
		// TODO add your handling code here:
		String tk = QL.taiKhoan;
        new QL(tk).setVisible(true);
		this.setVisible(false);
	}// GEN-LAST:event_XActionPerformed
	private void XActionPerformed2(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_XActionPerformed
		// TODO add your handling code here:
//		new LapHD().setVisible(true);
		this.setVisible(false);
	}// GEN-LAST:event_XActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(QLKH_LapHD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(QLKH_LapHD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(QLKH_LapHD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(QLKH_LapHD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new QLKH_LapHD().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton X;
	private javax.swing.JButton btnSua;
	private javax.swing.JButton btnRefresh;
	private javax.swing.JButton btnThem;
	private javax.swing.JButton btnLapHD;
	private javax.swing.JComboBox<String> cbbNam;
	private javax.swing.JComboBox<String> cbbNgay;
	private javax.swing.JComboBox<String> cbbThang;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable table;
	private javax.swing.JTextField txtDiaChi;
	private javax.swing.JTextField txtEmail;
	private javax.swing.JTextField txtMa;
	private javax.swing.JTextField txtSoDT;
	private javax.swing.JTextField txtHoTen;

	KhachHangDAO khachHangDAO = new KhachHangImpl();

	// End of variables declaration//GEN-END:variables
	@Override
	public void mouseClicked(MouseEvent arg0) {
		btnThem.setEnabled(false);
		btnSua.setEnabled(true);
		btnLapHD.setEnabled(true);
//
		int row = table.getSelectedRow();

		txtMa.setText(modelTable.getValueAt(row, 0).toString());
		txtHoTen.setText(modelTable.getValueAt(row, 1).toString());
		txtDiaChi.setText(modelTable.getValueAt(row, 4).toString());
		txtSoDT.setText(modelTable.getValueAt(row, 3).toString());
		txtEmail.setText(modelTable.getValueAt(row, 5).toString());
//		
		String ngaySinh = modelTable.getValueAt(row, 2).toString();
		
		cbbNam.setSelectedItem(ngaySinh.substring(0, 4));
		cbbThang.setSelectedItem(ngaySinh.substring(5, 7));
		cbbNgay.setSelectedItem(ngaySinh.substring(8, 10));
		

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Object o = arg0.getSource();
		if (o.equals(btnRefresh)) {
			XoaRongJText();
		} else if (o.equals(btnThem)) {

			if (check_data()) {
				getThemKhachHang();
			}

		} else if (o.equals(btnSua)) {

			if (check_data()) {
				getSuaKhachHang();
			}
		} else if (o.equals(btnLapHD)) {

			getLapHD();
		} else if (o.equals(cbbThang)) {
			getCBBThang();
		} else if (o.equals(cbbNam)) {
			getCBBNam();
		}

	}

	private void getCBBNam() {
		String dd = cbbNgay.getSelectedItem().toString();
		String mm = cbbThang.getSelectedItem().toString();
		int yy = Integer.parseInt(cbbNam.getSelectedItem().toString());

		if (((yy % 4 == 0) && (yy % 100 != 0)) || (yy % 400 == 0)) {
			if (mm.equals("02")) {
				cbbNgay.setModel(new DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07",
						"08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23",
						"24", "25", "26", "27", "28", "29" }));
			} else if (mm.equals("04") || mm.equals("06") || mm.equals("09") || mm.equals("11")) {
				cbbNgay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05",
						"06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21",
						"22", "23", "24", "25", "26", "27", "28", "29", "30" }));

			} else {
				cbbNgay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05",
						"06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21",
						"22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
			}

		} else {
			if (mm.equals("02")) {
				cbbNgay.setModel(new DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07",
						"08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23",
						"24", "25", "26", "27", "28" }));
			} else if (mm.equals("04") || mm.equals("06") || mm.equals("09") || mm.equals("11")) {
				cbbNgay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05",
						"06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21",
						"22", "23", "24", "25", "26", "27", "28", "29", "30" }));

			} else {
				cbbNgay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05",
						"06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21",
						"22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
			}

		}

		cbbNgay.setSelectedItem(dd);

	}

	private void getCBBThang() {
		String dd = cbbNgay.getSelectedItem().toString();
		String mm = cbbThang.getSelectedItem().toString();
		int yy = Integer.parseInt(cbbNam.getSelectedItem().toString());
		if (mm.equalsIgnoreCase("02")) {
			if (((yy % 4 == 0) && (yy % 100 != 0)) || (yy % 400 == 0)) {
				cbbNgay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05",
						"06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21",
						"22", "23", "24", "25", "26", "27", "28", "29" }));
			} else {
				cbbNgay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05",
						"06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21",
						"22", "23", "24", "25", "26", "27", "28" }));
			}

		} else if (mm.equals("04") || mm.equals("06") || mm.equals("09") || mm.equals("11")) {
			cbbNgay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06",
					"07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22",
					"23", "24", "25", "26", "27", "28", "29", "30" }));

		} else {
			cbbNgay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06",
					"07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22",
					"23", "24", "25", "26", "27", "28", "29", "30", "31" }));
		}
		cbbNgay.setSelectedItem(dd);

	}

//
	private void addComboBox() {
		GregorianCalendar gcalendar = new GregorianCalendar();

		String dd = "" + gcalendar.get(Calendar.DATE);
		String mm = "" + (gcalendar.get(Calendar.MONTH) + 1);
		String yy = "" + gcalendar.get(Calendar.YEAR);

		cbbNgay.setSelectedItem(dd);
		cbbThang.setSelectedItem(mm);
		cbbNam.setSelectedItem(yy);

	}

//	
	private void addTable_sql() {
		List<KhachHang> dsKhachHang = khachHangDAO.getDsKhachHang();

		for (KhachHang a : dsKhachHang) {
			modelTable.addRow(new Object[] { a.getMaKH(), a.getTenKH(), a.getNamSinh(), a.getSoDT(), a.getDiaChi(),
					a.getEmail() });
		}

		txtMa.setText(phatSinhMa());
	}

	private String phatSinhMa() {
		String ma_new = "";
		String ma_old = khachHangDAO.getMaCuoi();

		String ma0_2 = ma_old.substring(0, 2);
		String ma3_7 = ma_old.substring(2, 7);
		System.out.println(ma3_7);

		int n = Integer.parseInt(ma3_7) + 1;

		if (n < 10) {
			ma_new = ma0_2 + "0000" + n;
		} else if (n < 100) {
			ma_new = ma0_2 + "000" + n;
		} else if (n < 1000) {
			ma_new = ma0_2 + "00" + n;
		} else if (n < 10000) {
			ma_new = ma0_2 + "0" + n;
		} else if (n < 99999) {
			ma_new = ma0_2 + "" + n;
		} else
		{
			ma_new = "KH99999";
			System.err.println("Full ma");
			JOptionPane.showMessageDialog(this, "Bộ nhớ đã bị đầy");
			
		}

		return ma_new;
	}

	private void getLapHD() {
		String ma = txtMa.getText().trim();
		dataTen= txtHoTen.getText().trim();
		dataSoDT= txtSoDT.getText().trim();
		if (JOptionPane.showConfirmDialog(this, "Bạn có muốn lập hóa đơn mã: " + ma + " không?", "Cảnh Báo",
				JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
			//khachHangDAO.LapHD(ma);
			new LapHD().setVisible(true);
			this.setVisible(false);
			//XoaRongJText();
		}

	}

	private void getThemKhachHang() {
		String ma = phatSinhMa();
		String hoten = txtHoTen.getText().trim();
		String diaChi = txtDiaChi.getText().trim();
		String soDT = txtSoDT.getText().trim();
		String email = txtEmail.getText().trim();
		
		int dd = Integer.parseInt( cbbNgay.getSelectedItem().toString() );
		int mm = Integer.parseInt( cbbThang.getSelectedItem().toString() ) - 1 ;
		int yy = Integer.parseInt( cbbNam.getSelectedItem().toString() );

		KhachHang a = new KhachHang(ma, hoten, soDT, email, new Date(yy - 1900, mm, dd), diaChi);
		if (khachHangDAO.themKhachHang(a)) {
			JOptionPane.showMessageDialog(this, "Thêm thành công.");

			XoaRongJText();
		}

	}

	private void getSuaKhachHang() {

		String ma = txtMa.getText().trim();
		String hoten = txtHoTen.getText().trim(); 
		
		if (JOptionPane.showConfirmDialog(this, "Bạn có muốn sửa lại thông tin cho mã:' " + ma+" ' có tên là:' "+hoten+" '" + " không?", "Cảnh Báo",
				JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
			 
			String diaChi = txtDiaChi.getText().trim();
			String soDT = txtSoDT.getText().trim();
			String email = txtEmail.getText().trim();
			
			int dd = Integer.parseInt( cbbNgay.getSelectedItem().toString() );
			int mm = Integer.parseInt( cbbThang.getSelectedItem().toString() ) - 1 ;
			int yy = Integer.parseInt( cbbNam.getSelectedItem().toString() );

			KhachHang a = new KhachHang(ma, hoten, soDT, email, new Date(yy - 1900, mm, dd), diaChi);

			if (khachHangDAO.suaKhachHang(a)) {

				JOptionPane.showMessageDialog(this, "Cập nhật thành công.");

				XoaRongJText();
				
			}
		}

		

	}

	private void XoaRongJText() {
		txtMa.setText(phatSinhMa());
		;
		txtHoTen.setText("");
		txtDiaChi.setText("");
		txtSoDT.setText("");
		txtEmail.setText("");
		txtHoTen.requestFocus();
//		
		btnThem.setEnabled(true);
		btnSua.setEnabled(false);
		btnLapHD.setEnabled(false);
//        
		DefaultTableModel dm = (DefaultTableModel) table.getModel();
		dm.getDataVector().removeAllElements();
//		
		addTable_sql();
		
		addComboBox();
	}

	private boolean check_data() {
		// TODO Auto-generated method stub

		return true;
	}

}
