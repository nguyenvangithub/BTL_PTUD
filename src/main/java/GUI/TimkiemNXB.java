/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import dao.NhaXuatBanDAO;
import dao.impl.NhaXuatBanImpl;
import entity.NhaXuatBan;

/**
 *
 * @author LENOVO
 */
public class TimkiemNXB extends JFrame implements ActionListener{

    /**
     * Creates new form TimkiemNXB
     */
    public TimkiemNXB() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDiachi = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        X = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        
		

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Tra cứu thông tin nhà xuất bản");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("Mã nhà xuất bản");


        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 0));
        jLabel6.setText("Tên nhà xuất bản");


        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 0));
        jLabel5.setText("Địa chỉ");


        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nhà xuất bản", "Tên nhà xuất bản", "Địa chỉ"
            }
        ));
        jScrollPane1.setViewportView(table);

        btnRefresh.setBackground(new java.awt.Color(255, 102, 0));
        btnRefresh.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRefresh.setText("Làm Mới");

        btnTimKiem.setBackground(new java.awt.Color(255, 102, 0));
        btnTimKiem.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.setInheritsPopupMenu(true);


        X.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        X.setForeground(new java.awt.Color(255, 0, 0));
        X.setText("X");
        X.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(51, 51, 51)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(txtMa, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                    .addComponent(txtTen)
                                    .addComponent(txtDiachi))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 932, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(X))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(86, 86, 86)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(144, 144, 144))
            .addGroup(layout.createSequentialGroup()
                .addComponent(X)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
                .addGap(33, 33, 33))
        );
        pack();
        setLocationRelativeTo(null);
        
        btnRefresh.addActionListener(this);
        btnTimKiem.addActionListener(this);
        txtDiachi.addActionListener(this);
        txtMa.addActionListener(this);
        txtTen.addActionListener(this);
//        
        modelTable = (DefaultTableModel) table.getModel();
        
        addTable_sql(nhaXBDAO.getDsNhaXuatBan());

		table.setDefaultEditor(Object.class, null);  
		
		this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
    }// </editor-fold>//GEN-END:initComponents


    private void XActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XActionPerformed
        // TODO add your handling code here:
		new QL(QL.taiKhoan).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_XActionPerformed

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
            java.util.logging.Logger.getLogger(TimkiemNXB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TimkiemNXB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TimkiemNXB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TimkiemNXB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TimkiemNXB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable table;
    private javax.swing.JButton X;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtDiachi;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtTen;
    private DefaultTableModel modelTable;
    
    private NhaXuatBanDAO nhaXBDAO = new NhaXuatBanImpl();

	@Override
	public void actionPerformed(ActionEvent e) {
		List<NhaXuatBan> dsNhaXB = new ArrayList<NhaXuatBan>();
		int n = 1;
		
		Object o = e.getSource();
		
		if (o.equals(btnRefresh)) {
			XoaRongJText();
		}
		else if(o.equals(btnTimKiem) || o.equals(txtDiachi) || o.equals(txtMa) || o.equals(txtTen) ) {
			String ma = txtMa.getText().trim();
			String hoten  =txtTen.getText().trim();
			String diaChi= txtDiachi.getText().trim();
			
			if (ma.equals("") &&  hoten.equals("") && diaChi.equals("")) {
				n= -1;
				JOptionPane.showMessageDialog(this, "Hãy nhập dữ liệu cần tìm.");
				txtTen.requestFocus();
				addTable_sql(nhaXBDAO.getDsNhaXuatBan());
			}
			
			if (ma.length() > 0 && n == 1) {
				NhaXuatBan a = nhaXBDAO.getDsNhaXuatBan_Id(ma);
				if (a == null) {
					JOptionPane.showMessageDialog(this,
							"Mã " + ma + " không có trong danh sách.\nBạn hãy thử tìm kiếm theo nhưng thông tin khác.");
					txtMa.selectAll();
					txtMa.requestFocus();
				} else {
					DefaultTableModel dm = (DefaultTableModel) table.getModel();
					dm.getDataVector().removeAllElements();

					modelTable.addRow(new Object[] { a.getMaNXB(), a.getTenNXB(), a.getDiachi() });
				}

				n = -1;
			}
			
//			=======================================================
			if (hoten.length() > 0 && n == 1) {
				dsNhaXB = nhaXBDAO.getDsNhaXuatBan_Ten(dsNhaXB, hoten);

				if (dsNhaXB.size() != 0) {

					addTable_sql(dsNhaXB);

				} else {
					JOptionPane.showMessageDialog(this,
							"Không tìm thấy.\nHãy kiểm tra có thể bạn đã nhập sai dữ liệu.\nTrước mỗi từ hãy viết hoa và có dấu");

					txtTen.selectAll();
					txtTen.requestFocus();
					n = -1;

					addTable_sql(nhaXBDAO.getDsNhaXuatBan());
				}
			}
			
//			=======================================================
			if (diaChi.length() > 0 && n == 1) {
				dsNhaXB = nhaXBDAO.getDsNhaXuatBan_DiaChi(dsNhaXB, diaChi);

				if (dsNhaXB.size() != 0) {

					addTable_sql(dsNhaXB);

				} else {
					JOptionPane.showMessageDialog(this,
							"Không tìm thấy.\nHãy kiểm tra có thể bạn đã nhập sai dữ liệu.");
					txtDiachi.selectAll();
					txtDiachi.requestFocus();
					n = -1;

					addTable_sql(nhaXBDAO.getDsNhaXuatBan());
				}
			}
			
		}
		
	}

	private void XoaRongJText() {
		txtMa.setText("");
		txtTen.setText("");
		txtTen.requestFocus();
		txtDiachi.setText("");

//        
		addTable_sql(nhaXBDAO.getDsNhaXuatBan());
		//
		
	}

	private void addTable_sql(List<NhaXuatBan> dsNhaXuatBan) {
		
		DefaultTableModel dm = (DefaultTableModel) table.getModel();
		dm.getDataVector().removeAllElements();
		
		for (NhaXuatBan a : dsNhaXuatBan) {
			modelTable.addRow(new Object[] { a.getMaNXB(), a.getTenNXB(), a.getDiachi() });
		}
	}
    
    
    
    // End of variables declaration//GEN-END:variables
}
