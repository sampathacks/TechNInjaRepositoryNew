package com.signupLogin;

import java.awt.*;
import javax.swing.*;
	import java.text.SimpleDateFormat;
	import java.util.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

	
	public class Home extends javax.swing.JFrame {

	    /**
	     * Creates new form Home
	     */
	    public Home() {
	    	setIconImage(Toolkit.getDefaultToolkit().getImage(Home.class.getResource("/images/talent.jpg")));
	    	setTitle("Talent Sculptors/Tech Ninjas");
	        initComponents();
	    }

	    /**
	     * This method is called from within the constructor to initialize the form.
	     * WARNING: Do NOT modify this code. The content of this method is always
	     * regenerated by the Form Editor.
	     */
	    @SuppressWarnings("unchecked")
	    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
	    private void initComponents() {

	        jLabel1 = new javax.swing.JLabel();
	        jButton1 = new javax.swing.JButton();
	        jButton2 = new javax.swing.JButton();
	        time = new javax.swing.JLabel();



	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	        setBackground(new java.awt.Color(255, 255, 255));

	        jButton1.setBackground(new java.awt.Color(255, 0, 51));
	        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
	        jButton1.setText("SignUp");
	        jButton1.setToolTipText("New User");
	        jButton1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton1ActionPerformed(evt);
	            }
	        });

	        jButton2.setBackground(new java.awt.Color(51, 51, 255));
	        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
	        jButton2.setText("LogIn");
	        jButton2.setToolTipText("Existing User");
	        jButton2.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton2ActionPerformed(evt);
	            }
	        });

	        time.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
	        time.setToolTipText("Time");
	        
	        lblNewLabel = new JLabel("");
	        lblNewLabel.setIcon(new ImageIcon(Home.class.getResource("/images/tech.jpg")));
	        
	        lblNewLabel_1 = new JLabel("");
	        lblNewLabel_1.setIcon(new ImageIcon(Home.class.getResource("/images/talent.jpg")));

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        layout.setHorizontalGroup(
	        	layout.createParallelGroup(Alignment.LEADING)
	        		.addGroup(layout.createSequentialGroup()
	        			.addContainerGap(500, Short.MAX_VALUE)
	        			.addComponent(time)
	        			.addGap(23))
	        		.addGroup(layout.createSequentialGroup()
	        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
	        				.addGroup(layout.createSequentialGroup()
	        					.addGap(168)
	        					.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
	        					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        				.addGroup(layout.createSequentialGroup()
	        					.addContainerGap()
	        					.addComponent(lblNewLabel_1)
	        					.addGap(18)))
	        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
	        				.addComponent(lblNewLabel)
	        				.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
	        			.addContainerGap(17, Short.MAX_VALUE))
	        );
	        layout.setVerticalGroup(
	        	layout.createParallelGroup(Alignment.LEADING)
	        		.addGroup(layout.createSequentialGroup()
	        			.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
	        				.addGroup(layout.createSequentialGroup()
	        					.addGap(96)
	        					.addComponent(lblNewLabel)
	        					.addPreferredGap(ComponentPlacement.RELATED))
	        				.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
	        					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        					.addComponent(lblNewLabel_1)
	        					.addGap(44)))
	        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
	        				.addGroup(layout.createSequentialGroup()
	        					.addGap(167)
	        					.addComponent(time))
	        				.addGroup(layout.createSequentialGroup()
	        					.addGap(72)
	        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
	        						.addComponent(jButton1)
	        						.addComponent(jButton2)))))
	        );
	        getContentPane().setLayout(layout);

	        pack();
	    }// </editor-fold>                        

	    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
	        this.dispose();
	        SignUp s=new SignUp();
	         s.signup();


	        // TODO add your handling code here:
	    }                                        

	    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
	        this.dispose();
	        Login l=new Login();
	        l.login();
	                
	            // TODO add your handling code here:
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
	            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	        //</editor-fold>

	        /* Create and display the form */
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new Home().setVisible(true);
	                 
	            }
	        });
	    }

	    // Variables declaration - do not modify                     
	    private javax.swing.JButton jButton1;
	    private javax.swing.JButton jButton2;
	    private javax.swing.JLabel jLabel1;
	    private javax.swing.JLabel time;
	    private JLabel lblNewLabel;
	    private JLabel lblNewLabel_1;
	}


