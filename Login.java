package com.signupLogin;
import java.sql.*;
import java.awt.BorderLayout;
import javax.swing.*;

import java.sql.*;
import javax.swing.GroupLayout.Alignment;

	public class Login extends javax.swing.JFrame {

	    /**
	     * Creates new form Login
	     */
	    public Login() {
	        initComponents();
	    }

	    
	    // Variables declaration - do not modify                     
	    private javax.swing.JButton jButton1;
	    private javax.swing.JLabel jLabel1;
	    private javax.swing.JLabel jLabel2;
	    private javax.swing.JLabel jLabel3;
	    private javax.swing.JLabel jLabel4;
	    private javax.swing.JPasswordField txtpassword1;
	    private javax.swing.JTextField txtusername1;
	    // End of variables declaration 
	    
	    /**
	     * This method is called from within the constructor to initialize the form.
	     * WARNING: Do NOT modify this code. The content of this method is always
	     * regenerated by the Form Editor.
	     */
	    @SuppressWarnings("unchecked")
	    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
	    private void initComponents() {

	        jLabel1 = new javax.swing.JLabel();
	        jLabel2 = new javax.swing.JLabel();
	        jLabel3 = new javax.swing.JLabel();
	        txtusername1 = new javax.swing.JTextField();
	        txtpassword1 = new javax.swing.JPasswordField();
	        jButton1 = new javax.swing.JButton();
	        jLabel4 = new javax.swing.JLabel();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
	        jLabel1.setText("LogIn Form");

	        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
	        jLabel2.setText("UserName");

	        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
	        jLabel3.setText("Password");

	        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
	        jButton1.setText("LogIn");
	        jButton1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton1ActionPerformed(evt);
	            }
	        });

	        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        layout.setHorizontalGroup(
	        	layout.createParallelGroup(Alignment.LEADING)
	        		.addGroup(layout.createSequentialGroup()
	        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
	        				.addGroup(layout.createSequentialGroup()
	        					.addGap(153)
	        					.addComponent(jLabel1))
	        				.addGroup(layout.createSequentialGroup()
	        					.addGap(41)
	        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
	        						.addComponent(jLabel2)
	        						.addComponent(jLabel3))
	        					.addGap(43)
	        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
	        						.addComponent(jButton1)
	        						.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
	        							.addComponent(txtusername1, GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
	        							.addComponent(txtpassword1))
	        						.addComponent(jLabel4))))
	        			.addContainerGap(138, Short.MAX_VALUE))
	        );
	        layout.setVerticalGroup(
	        	layout.createParallelGroup(Alignment.LEADING)
	        		.addGroup(layout.createSequentialGroup()
	        			.addGap(26)
	        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
	        				.addGroup(layout.createSequentialGroup()
	        					.addComponent(jLabel1)
	        					.addGap(52)
	        					.addComponent(jLabel2))
	        				.addComponent(txtusername1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	        			.addGap(24)
	        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
	        				.addComponent(txtpassword1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	        				.addComponent(jLabel3))
	        			.addGap(27)
	        			.addComponent(jButton1)
	        			.addGap(18)
	        			.addComponent(jLabel4)
	        			.addContainerGap(77, Short.MAX_VALUE))
	        );
	        getContentPane().setLayout(layout);

	        pack();
	    }// </editor-fold>                        

	    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
	        try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "1234");
				java.sql.Statement st=con.createStatement();
				ResultSet rs=st.executeQuery("select username ,password from userdata");
	                        while(rs.next())
				{
	                        String name=txtusername1.getText();
	                        String password=txtpassword1.getText();
	                        String nameCheck=rs.getString("username");
	                        String passwordCheck=rs.getString("password");
	                        if(name.equals(nameCheck)&&password.equals(passwordCheck))
	                        {
	                            jLabel4.setText("Welcome to club.....");
	                        }
	                        else
	                            jLabel4.setText("Entered Worng Details");
	                        }
			}
			catch(Exception e)
			{
				jLabel4.setText(e.getMessage());
			}

	    }

	        // TODO add your handling code here:
	                                            

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
	            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	        //</editor-fold>

	        /* Create and display the form */
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new Login().setVisible(true);
	            }
	        });
	    }

	                  
	}
	
	


