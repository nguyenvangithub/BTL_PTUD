/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import javax.swing.table.DefaultTableModel;

import dao.TacGiaDAO;
import dao.impl.TacGiaImpl;
import entity.KhachHang;
import entity.NhaXuatBan;
import entity.TacGia;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.swing.*;

/**
 *
 * @author LENOVO
 */
public class TimkiemTG extends JFrame implements ActionListener {

	/**
	 * Creates new form TimkiemTG
	 */
	public TimkiemTG() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		X = new javax.swing.JButton();
		jLabel2 = new javax.swing.JLabel();
		txtMa = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		txtTen = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		cbbNgay = new javax.swing.JComboBox<>();
		cbbThang = new javax.swing.JComboBox<>();
		cbbNam = new javax.swing.JComboBox<>();
		jLabel3 = new javax.swing.JLabel();
		txtDiaChi = new javax.swing.JTextField();
		btnRefresh = new javax.swing.JButton();
		btnTimKiem = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		table = new javax.swing.JTable();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setUndecorated(true);

		jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
		jLabel1.setText("Tra cứu tác giả");

		X.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		X.setForeground(new java.awt.Color(255, 0, 0));
		X.setText("X");
		X.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				XActionPerformed(evt);
			}
		});

		jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel2.setForeground(new java.awt.Color(255, 102, 0));
		jLabel2.setText("Mã tác giả");

		jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel4.setForeground(new java.awt.Color(255, 102, 0));
		jLabel4.setText("Tên tác giả");

		jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel5.setForeground(new java.awt.Color(255, 102, 0));
		jLabel5.setText("Ngày sinh");

		cbbNgay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06",
				"07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23",
				"24", "25", "26", "27", "28", "29", "30", "31", " " }));

		cbbThang.setModel(new javax.swing.DefaultComboBoxModel<>(
				new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

		cbbNam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0000", "2021", "2020", "2019", "2018",
				"2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005",
				"2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992",
				"1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979",
				"1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966",
				"1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953",
				"1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940",
				"1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927",
				"1926", "1925", "1924", "1923", "1922", "1921" }));

		jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel3.setForeground(new java.awt.Color(255, 102, 0));
		jLabel3.setText("Quê quán");

		btnRefresh.setBackground(new java.awt.Color(255, 102, 0));
		btnRefresh.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		btnRefresh.setText("Làm Mới");

		btnTimKiem.setBackground(new java.awt.Color(255, 102, 0));
		btnTimKiem.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		btnTimKiem.setText("Tìm kiếm");
		btnTimKiem.setInheritsPopupMenu(true);

		table.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Mã tác giả", "Tên tác giả", "Ngày sinh ", "Quê quản" }));
		jScrollPane1.setViewportView(table);

	      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
	        jPanel1.setLayout(jPanel1Layout);
	        jPanel1Layout.setHorizontalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addGap(23, 23, 23)
	                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(40, 40, 40)
	                        .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addGap(45, 45, 45)
	                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(jLabel2)
	                            .addComponent(jLabel3)
	                            .addComponent(jLabel5)
	                            .addComponent(jLabel4)
	                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
	                                .addComponent(txtTen, javax.swing.GroupLayout.Alignment.LEADING)
	                                .addComponent(txtMa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
	                            .addGroup(jPanel1Layout.createSequentialGroup()
	                                .addComponent(cbbNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addGap(27, 27, 27)
	                                .addComponent(cbbThang, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addGap(29, 29, 29)
	                                .addComponent(cbbNam, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
	                            .addComponent(jLabel1))))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
	                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(32, 32, 32))
	                    .addComponent(X, javax.swing.GroupLayout.Alignment.TRAILING)))
	        );
	        jPanel1Layout.setVerticalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addComponent(X)
	                        .addGap(17, 17, 17)
	                        .addComponent(jScrollPane1))
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addGap(20, 20, 20)
	                        .addComponent(jLabel1)
	                        .addGap(117, 117, 117)
	                        .addComponent(jLabel2)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(18, 18, 18)
	                        .addComponent(jLabel4)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(31, 31, 31)
	                        .addComponent(jLabel5)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(cbbThang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(cbbNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(cbbNam, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addGap(37, 37, 37)
	                        .addComponent(jLabel3)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                        .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
	                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
	                .addGap(37, 37, 37))
	        );

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(0, 0, Short.MAX_VALUE))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(0, 0, Short.MAX_VALUE))
	        );

		pack();
		setLocationRelativeTo(null);
//        
		btnRefresh.addActionListener(this);
		btnTimKiem.addActionListener(this);
		txtDiaChi.addActionListener(this);
		txtMa.addActionListener(this);
		txtTen.addActionListener(this);
		cbbNam.addActionListener(this);
		cbbNgay.addActionListener(this);
		cbbThang.addActionListener(this);
//        
//      
		modelTable = (DefaultTableModel) table.getModel();
		addTable_sql(tacGiaDAO.getDsTacGia());

		table.setDefaultEditor(Object.class, null);

	}// </editor-fold>//GEN-END:initComponents

	private void XActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_XActionPerformed
		// TODO add your handling code here:
		new QL(QL.taiKhoan).setVisible(true);
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
			java.util.logging.Logger.getLogger(TimkiemTG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(TimkiemTG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(TimkiemTG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(TimkiemTG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new TimkiemTG().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton X;
	private javax.swing.JButton btnRefresh;
	private javax.swing.JButton btnTimKiem;
	private javax.swing.JComboBox<String> cbbNam;
	private javax.swing.JComboBox<String> cbbNgay;
	private javax.swing.JComboBox<String> cbbThang;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable table;
	private javax.swing.JTextField txtMa;
	private javax.swing.JTextField txtDiaChi;
	private javax.swing.JTextField txtTen;
	private DefaultTableModel modelTable;

	private TacGiaDAO tacGiaDAO = new TacGiaImpl();

//    

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		Object o = arg0.getSource();

		if (o.equals(cbbThang)) {
			getCBBThang();
		} else if (o.equals(cbbNam)) {
			if (cbbNam.getSelectedIndex() == 0) {
				cbbNam.setSelectedIndex(0);
				cbbNgay.setSelectedIndex(0);
				cbbThang.setSelectedIndex(0);
			}
			getCBBNam();
		} else if (o.equals(btnRefresh)) {
			XoaRongJText();
		}
		else if (o.equals(btnTimKiem) ||  o.equals(txtMa) || o.equals(txtTen) || o.equals(txtDiaChi)) {
			
			List<TacGia> dsTacGia = new ArrayList<>();
			
			String ma = txtMa.getText().trim();
			String hoten = txtTen.getText().trim();
			String diaChi = txtDiaChi.getText().trim();
			int n = 1;

			if (ma.equals("") && hoten.equals("") && diaChi.equals("")  && !check_ngay()) {
				n = -1;
				JOptionPane.showMessageDialog(this, "Hãy nhập dữ liệu cần tìm kiếm");
				addTable_sql(tacGiaDAO.getDsTacGia());
				txtTen.requestFocus();
			}

			if (ma.length() > 0 && n == 1) {
				TacGia  a = tacGiaDAO.getTacGia_Id(ma);

				if (a == null) {
					JOptionPane.showMessageDialog(this,
							"Mã " + ma + " không có trong danh sách.\nBạn hãy thử tìm kiếm theo nhưng thông tin khác.");
					txtMa.selectAll();
					txtMa.requestFocus();
				} else {
					DefaultTableModel dm = (DefaultTableModel) table.getModel();
					dm.getDataVector().removeAllElements();

					modelTable.addRow(new Object[] { a.getMaTG(), a.getTenTG(), a.getNamsinh(), a.getDiachi() });
				}

				n = -1;
			}
			
//			=======================================================
			if (hoten.length() > 0 && n == 1) {
				dsTacGia = tacGiaDAO.getDsTacGia_Ten(dsTacGia, hoten);

				if (dsTacGia.size() != 0) {

					addTable_sql(dsTacGia);

				} else {
					JOptionPane.showMessageDialog(this,
							"Không tìm thấy.\nHãy kiểm tra có thể bạn đã nhập sai dữ liệu.\nTrước mỗi từ hãy viết hoa và có dấu");

					txtTen.selectAll();
					txtTen.requestFocus();
					n = -1;

					addTable_sql(tacGiaDAO.getDsTacGia());
				}
			}
			
//			=======================================================
			if ( check_ngay() && n == 1) {
				String dd = cbbNgay.getSelectedItem().toString() ;
				String mm = cbbThang.getSelectedItem().toString() ;
				String yy = cbbNam.getSelectedItem().toString() ;
				
				
				dsTacGia = tacGiaDAO.getDsTacGia_NgaySinh(dsTacGia, dd, mm, yy);

				if (dsTacGia.size() != 0) {

					addTable_sql(dsTacGia);

				} else {
					JOptionPane.showMessageDialog(this,
							"Không tìm thấy.\nHãy kiểm tra có thể bạn đã nhập sai ngày sinh.");

					n = -1;

					addTable_sql(tacGiaDAO.getDsTacGia());
				}
				
			}
			
//			=======================================================
			if (diaChi.length() > 0 && n == 1) {
				dsTacGia = tacGiaDAO.getDsTacGia_DiaChi(dsTacGia, diaChi);

				if (dsTacGia.size() != 0) {

					addTable_sql(dsTacGia);

				} else {
					JOptionPane.showMessageDialog(this,
							"Không tìm thấy.\nHãy kiểm tra có thể bạn đã nhập sai dữ liệu.");
					txtDiaChi.selectAll();
					txtDiaChi.requestFocus();
					n = -1;

					addTable_sql(tacGiaDAO.getDsTacGia());
				}
			}
			
			
		}
	}
//
	private boolean check_ngay() {
		System.out.println("check_ngay()");
		if (cbbNgay.getSelectedIndex() == 0 && cbbThang.getSelectedIndex() == 0 && cbbNam.getSelectedIndex() == 0) {
			return false;
		}
		return true;
	}
//
	private void XoaRongJText() {
		txtMa.setText("");
		txtTen.setText("");
		txtTen.requestFocus();
		txtDiaChi.setText("");
		
		cbbNgay.setSelectedIndex(0);
		cbbThang.setSelectedIndex(0);
		cbbNam.setSelectedIndex(0);
//		
		addTable_sql(tacGiaDAO.getDsTacGia());
		
}

	private void getCBBNam() {
		String dd = cbbNgay.getSelectedItem().toString();
		String mm = cbbThang.getSelectedItem().toString();
		int yy = Integer.parseInt(cbbNam.getSelectedItem().toString());

		if (((yy % 4 == 0) && (yy % 100 != 0)) || (yy % 400 == 0)) {
			if (mm.equals("02")) {
				cbbNgay.setModel(new DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06",
						"07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22",
						"23", "24", "25", "26", "27", "28", "29" }));
			} else if (mm.equals("04") || mm.equals("06") || mm.equals("09") || mm.equals("11")) {
				cbbNgay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04",
						"05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
						"21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));

			} else {
				cbbNgay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04",
						"05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
						"21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
			}

		} else {
			if (mm.equals("02")) {
				cbbNgay.setModel(new DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06",
						"07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22",
						"23", "24", "25", "26", "27", "28" }));
			} else if (mm.equals("04") || mm.equals("06") || mm.equals("09") || mm.equals("11")) {
				cbbNgay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04",
						"05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
						"21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));

			} else {
				cbbNgay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04",
						"05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
						"21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
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
				cbbNgay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04",
						"05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
						"21", "22", "23", "24", "25", "26", "27", "28", "29" }));
			} else {
				cbbNgay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04",
						"05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
						"21", "22", "23", "24", "25", "26", "27", "28" }));
			}

		} else if (mm.equals("04") || mm.equals("06") || mm.equals("09") || mm.equals("11")) {
			cbbNgay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05",
					"06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21",
					"22", "23", "24", "25", "26", "27", "28", "29", "30" }));

		} else {
			cbbNgay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05",
					"06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21",
					"22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
		}
		cbbNgay.setSelectedItem(dd);

	}

	private void addTable_sql(List<TacGia> dsTacGia) {
		DefaultTableModel dm = (DefaultTableModel) table.getModel();
		dm.getDataVector().removeAllElements();

		for (TacGia a : dsTacGia) {
//			 "Mã nhà xuất bản", "Tên nhà xuất bản", "Địa chỉ"
			modelTable.addRow(new Object[] { a.getMaTG(), a.getTenTG(), a.getNamsinh(), a.getDiachi() });
		}
	}


	// End of variables declaration//GEN-END:variables
}
