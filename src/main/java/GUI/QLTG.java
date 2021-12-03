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

import GUI.Dialog.FormTieuSu;
import dao.NhanvienDAO;
import dao.TacGiaDAO;
import dao.impl.TacGiaImpl;
import entity.NhanVien;
import entity.Sach;
import entity.TacGia;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class QLTG extends JFrame implements ActionListener, MouseListener {

	/**
	 * Creates new form QLTG
	 */
	public QLTG() {
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
		jScrollPane1 = new javax.swing.JScrollPane();
		table = new javax.swing.JTable();
		jLabel2 = new javax.swing.JLabel();
		txtTen = new javax.swing.JTextField();
		txtMa = new javax.swing.JTextField();
		txtDiaChi = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		btnThem = new javax.swing.JButton();
		btnSua = new javax.swing.JButton();
		btnXoa = new javax.swing.JButton();
		cbbNgay = new javax.swing.JComboBox<>();
		cbbThang = new javax.swing.JComboBox<>();
		cbbNam = new javax.swing.JComboBox<>();
		btnRefresh = new javax.swing.JButton();
		X = new javax.swing.JButton();
		jLabel6 = new javax.swing.JLabel();
		jScrollPane2 = new javax.swing.JScrollPane();
		txtTieuSu = new javax.swing.JTextArea();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setUndecorated(true);

		jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jLabel1.setText("Quản Lý Tác Giả");

		table.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Mã tác giả", "Tên tác giả", "Ngày sinh ", "Quê quản" }));
		jScrollPane1.setViewportView(table);

		jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel2.setForeground(new java.awt.Color(255, 102, 0));
		jLabel2.setText("Mã tác giả");

		jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel3.setForeground(new java.awt.Color(255, 102, 0));
		jLabel3.setText("Quê quán");

		jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel4.setForeground(new java.awt.Color(255, 102, 0));
		jLabel4.setText("Tên tác giả");

		jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel5.setForeground(new java.awt.Color(255, 102, 0));
		jLabel5.setText("Ngày sinh");

		btnThem.setBackground(new java.awt.Color(255, 102, 0));
		btnThem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		btnThem.setText("Thêm");

		btnSua.setBackground(new java.awt.Color(255, 102, 0));
		btnSua.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		btnSua.setText("Cập nhật");

		btnXoa.setBackground(new java.awt.Color(255, 102, 0));
		btnXoa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		btnXoa.setText("Xóa");

		cbbNgay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07",
				"08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24",
				"25", "26", "27", "28", "29", "30", "31", " " }));

		cbbThang.setModel(new javax.swing.DefaultComboBoxModel<>(
				new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

		cbbNam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2021", "2020", "2019", "2018", "2017",
				"2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004",
				"2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991",
				"1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978",
				"1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965",
				"1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952",
				"1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939",
				"1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926",
				"1925", "1924", "1923", "1922", "1921" }));

		btnRefresh.setBackground(new java.awt.Color(255, 102, 0));
		btnRefresh.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		btnRefresh.setText("Làm mới");

		X.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		X.setForeground(new java.awt.Color(255, 0, 0));
		X.setText("X");
		X.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				XActionPerformed(evt);
			}
		});

		jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel6.setForeground(new java.awt.Color(255, 102, 0));
		jLabel6.setText("Tiểu sử");

		txtTieuSu.setColumns(20);
		txtTieuSu.setRows(5);
		jScrollPane2.setViewportView(txtTieuSu);

	       javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
	        jPanel1.setLayout(jPanel1Layout);
	        jPanel1Layout.setHorizontalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
	                .addGap(23, 23, 23)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                    .addComponent(jLabel2)
	                    .addComponent(jLabel4)
	                    .addComponent(jLabel5)
	                    .addComponent(jLabel3)
	                    .addComponent(txtMa)
	                    .addComponent(txtTen)
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addComponent(cbbNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(18, 18, 18)
	                        .addComponent(cbbThang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(18, 18, 18)
	                        .addComponent(cbbNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addComponent(txtDiaChi)
	                    .addComponent(jLabel6)
	                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(29, 29, 29)
	                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1040, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addContainerGap(18, Short.MAX_VALUE))
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
	                        .addComponent(jLabel1)
	                        .addGap(424, 424, 424)
	                        .addComponent(X)
	                        .addContainerGap())
	                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
	                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(213, 213, 213)
	                        .addComponent(btnSua)
	                        .addGap(183, 183, 183)
	                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(210, 210, 210)
	                        .addComponent(btnRefresh)
	                        .addGap(77, 77, 77))))
	        );
	        jPanel1Layout.setVerticalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel1)
	                    .addComponent(X))
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addGap(18, 18, 18)
	                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addGap(56, 56, 56)
	                        .addComponent(jLabel2)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(35, 35, 35)
	                        .addComponent(jLabel4)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(28, 28, 28)
	                        .addComponent(jLabel5)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(cbbNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(cbbThang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(cbbNam, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addGap(34, 34, 34)
	                        .addComponent(jLabel3)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(28, 28, 28)
	                        .addComponent(jLabel6)
	                        .addGap(7, 7, 7)
	                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(50, 50, 50))
	        );

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addContainerGap())
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
		btnSua.addActionListener(this);
		btnThem.addActionListener(this);
		btnRefresh.addActionListener(this);
		btnXoa.addActionListener(this);
		txtDiaChi.addActionListener(this);
		table.addMouseListener(this);
		cbbNam.addActionListener(this);
		cbbNgay.addActionListener(this);
		cbbThang.addActionListener(this);
//      
		btnSua.setEnabled(false);
		btnXoa.setEnabled(false);
		txtMa.setEnabled(false);

//      
		modelTable = (DefaultTableModel) table.getModel();
		addTable_sql(tacGiaDAO.getDsTacGia());

		table.setDefaultEditor(Object.class, null);

		addComboBox();
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
			java.util.logging.Logger.getLogger(QLTG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(QLTG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(QLTG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(QLTG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new QLTG().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton X;
	private javax.swing.JButton btnSua;
	private javax.swing.JButton btnThem;
	private javax.swing.JButton btnXoa;
	private javax.swing.JButton btnRefresh;
	private javax.swing.JComboBox<String> cbbNam;
	private javax.swing.JComboBox<String> cbbNgay;
	private javax.swing.JComboBox<String> cbbThang;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JTable table;
	private javax.swing.JTextArea txtTieuSu;
	private javax.swing.JTextField txtMa;
	private javax.swing.JTextField txtDiaChi;
	private javax.swing.JTextField txtTen;

	private DefaultTableModel modelTable;

	TacGiaDAO tacGiaDAO = new TacGiaImpl();

	// End of variables declaration//GEN-END:variables
	@Override
	public void mouseClicked(MouseEvent arg0) {
		btnSua.setEnabled(true);
		btnXoa.setEnabled(true);
		btnThem.setEnabled(false);
		//
		int row = table.getSelectedRow();

		txtMa.setText(modelTable.getValueAt(row, 0).toString());
		txtTen.setText(modelTable.getValueAt(row, 1).toString());
		txtDiaChi.setText(modelTable.getValueAt(row, 3).toString());
		
		TacGia a = tacGiaDAO.getTacGia_Id(modelTable.getValueAt(row, 0).toString());
		if (a.getTieusu() != null) {
			txtTieuSu.setText("Double click vào tên tác giả để xem tiểu sử.");
		}else {
			txtTieuSu.setText("");
		}
//		
		String ngaySinh = modelTable.getValueAt(row, 2).toString();

		cbbNam.setSelectedItem(ngaySinh.substring(0, 4));
		cbbThang.setSelectedItem(ngaySinh.substring(5, 7));
		cbbNgay.setSelectedItem(ngaySinh.substring(8, 10));

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		if (e.getClickCount() == 2) {
			int row = table.getSelectedRow();

			String maNV = modelTable.getValueAt(row, 0).toString();
			System.out.println(maNV);
			TacGia a = tacGiaDAO.getTacGia_Id(maNV);
			System.out.println(a);
			if (a.getTieusu() == null) {
				JOptionPane.showMessageDialog(this,
						"Tác giả " + a.getTenTG() + " chưa có tiểu sử.\n Hãy cập nhật lại.");
			} else
				new FormTieuSu(a.getTieusu()).setVisible(true);
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Object o = arg0.getSource();
		if (o.equals(btnRefresh)) {
			XoaRongJText();
		} else if (o.equals(btnThem) || o.equals(txtDiaChi)) {

			if (check_data()) {
				getThemTacGia();
			}

		} else if (o.equals(btnSua)) {

			if (check_data()) {
				getSuaTacGia();
			}
		} else if (o.equals(btnXoa)) {
			getXoaTacGia();
		} else if (o.equals(cbbThang)) {
			getCBBThang();
		} else if (o.equals(cbbNam)) {
			getCBBNam();
		}
	}

	private void getXoaTacGia() {
		String maXoa = txtMa.getText().trim();

		String ten = txtTen.getText().trim();
		if (tacGiaDAO.getSoSachHienCoCuaTacGia(maXoa) == 0) {

			if (JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa mã: " + maXoa + " không?", "Cảnh Báo",
					JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
				tacGiaDAO.xoaTacGia(maXoa);

				XoaRongJText();
			}
		} else {
			JOptionPane.showMessageDialog(this,
					"Hãy xóa hết các quyển sách đến từ tác giả ' " + ten + " ' trong quản lý sách trước. thanks.");
		}
	}

	private void getSuaTacGia() {
		String ma = txtMa.getText().trim();
		String ten = txtTen.getText().trim();
		String diaChi = txtDiaChi.getText().trim();
		String tieuSu = txtTieuSu.getText();
		if (tieuSu.equals("Double click vào tên tác giả để xem tiểu sử.")) {
			tieuSu = null;
		}

		if (JOptionPane.showConfirmDialog(this,
				"Bạn có muốn sửa lại thông tin cho mã:' " + ma + " ' có tên là:' " + ten + " '" + " không?", "Cảnh Báo",
				JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {

			int dd = Integer.parseInt(cbbNgay.getSelectedItem().toString());
			int mm = Integer.parseInt(cbbThang.getSelectedItem().toString()) - 1;
			int yy = Integer.parseInt(cbbNam.getSelectedItem().toString());

			TacGia a = new TacGia(ma, ten, new Date(yy - 1900, mm, dd), diaChi, tieuSu);

			if (tacGiaDAO.suaTacGia(a)) {

				JOptionPane.showMessageDialog(this, "Cập nhật thành công.");

				XoaRongJText();

			}
		}
	}

	private void getThemTacGia() {
		String ma = phatSinhMa();
		String hoten = txtTen.getText().trim();
		String diaChi = txtDiaChi.getText().trim();
		String tieuSu = txtTieuSu.getText();

		int dd = Integer.parseInt(cbbNgay.getSelectedItem().toString());
		int mm = Integer.parseInt(cbbThang.getSelectedItem().toString()) - 1;
		int yy = Integer.parseInt(cbbNam.getSelectedItem().toString());

		TacGia a = new TacGia(ma, hoten, new Date(yy - 1900, mm, dd), diaChi, tieuSu);
		if (tacGiaDAO.themTacGia(a)) {
			JOptionPane.showMessageDialog(this, "Thêm thành công.");

			XoaRongJText();
		}
	}

	private void XoaRongJText() {
		txtMa.setText(phatSinhMa());
		txtTen.setText("");
		txtDiaChi.setText("");
		txtTieuSu.setText("");
//	
		btnSua.setEnabled(false);
		btnXoa.setEnabled(false);
		btnThem.setEnabled(true);
//    
		addTable_sql(tacGiaDAO.getDsTacGia());
		addComboBox();
		//
	}

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
	private void addTable_sql(List<TacGia> dsTacGia) {

		txtMa.setText(phatSinhMa());
//    	
		DefaultTableModel dm = (DefaultTableModel) table.getModel();
		dm.getDataVector().removeAllElements();

		for (TacGia a : dsTacGia) {
//			 "Mã tác giả", "Tên tác giả", "Ngày sinh ", "Quê quản"
			modelTable.addRow(new Object[] { a.getMaTG(), a.getTenTG(), a.getNamsinh(), a.getDiachi() });
		}
	}
//

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
	private String phatSinhMa() {
		String ma_new = "";
		String ma_old = tacGiaDAO.getMaCuoi();

		String ma0_2 = ma_old.substring(0, 2);
		String ma2_7 = ma_old.substring(2, 7);

		int n = Integer.parseInt(ma2_7) + 1;

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
		} else {
			ma_new = "KH99999";
			System.err.println("Full ma");
			JOptionPane.showMessageDialog(this, "Bộ nhớ đã bị đầy");

		}
		return ma_new;
	}
//

	private boolean check_data() {
		// TODO Auto-generated method stub
		return true;
	}

//

}
