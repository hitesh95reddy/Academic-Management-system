
import my.rdbms.*;
import java.sql.*;

public class UNIVERSITY extends javax.swing.JFrame {

    
    public UNIVERSITY() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("UNIVERSITY  DATABASE\n");
        setMaximumSize(new java.awt.Dimension(214, 214));
        setMinimumSize(new java.awt.Dimension(660, 189));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setBackground(new java.awt.Color(204, 204, 204));
        jComboBox1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 0, 51));
        jComboBox1.setMaximumRowCount(5);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INSERT STUDENT INFORMATION", "DELETE STUDENT INFORMATION", "UPDATE STUDENT INFORMATION", "INSERT TEACHER INFORMATION", "DELETE TEACHER INFORMATION", "UPDATE TEACHER INFORMATION", "LIST OF STUDENTS", "LIST OF TEACHERS", "SELECTION OF STUDENTS", "SELECTION OF TEACHERS", "EXIT" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 47, -1, -1));

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setFont(new java.awt.Font("Yu Mincho Demibold", 0, 18)); // NOI18N
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 122, 97, 33));

        jLabel1.setText("SELECT YOUR OPTION:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 11, 230, 18));

        jButton2.setBackground(new java.awt.Color(102, 102, 255));
        jButton2.setFont(new java.awt.Font("Yu Mincho Demibold", 0, 18)); // NOI18N
        jButton2.setText("EXIT");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 122, 87, 33));

        jLabel2.setFont(new java.awt.Font("Yu Mincho Demibold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 179, 530, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sparkly-fuzzy-lines-on-blue-background-facebook-covers.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        String o,i1,d1,u1,i2,d2,u2,e,l1,l2,ss,st,f[]={"1"};
       o=(String)jComboBox1.getSelectedItem();
       e="EXIT";i1="INSERT STUDENT INFORMATION";d1="DELETE STUDENT INFORMATION";u1="UPDATE STUDENT INFORMATION";
       i2="INSERT TEACHER INFORMATION";d2="DELETE TEACHER INFORMATION";u2="UPDATE TEACHER INFORMATION";
       l1="LIST OF STUDENTS";l2="LIST OF TEACHERS";ss="SELECTION OF STUDENTS";st="SELECTION OF TEACHERS";
       if(e.equals(o))
       {System.exit(0);}
       if(i1.equals(o))
       { jLabel2.setText("You Have Selected To "+i1);
       insertion_of_student_information.main(f);
       }
      if(d1.equals(o))
      { jLabel2.setText("You Have Selected To "+d1);
      deletion_of_student_information.main(f);
      }
      if(u1.equals(o))
      {jLabel2.setText("You have Selected To "+u1);
      update_student_information.main(f);
      }
      if(i2.equals(o))
      {  jLabel2.setText("You have Selected To "+i2);
          insertion_of_teacher_information.main(f);
      }
      if(d2.equals(o))
      {jLabel2.setText("You have Selected To "+d2);
       deletion_of_teacher_information.main(f);
      }
      if(u2.equals(o))
      { jLabel2.setText("You have Selected To "+u2);
      update_teacher_information.main(f);
      }
      if(l1.equals(o))
      { jLabel2.setText("You have Selected To "+l2);
      list_of_students.main(f);
      }
      if(l2.equals(o))
      { jLabel2.setText("You have Selected To "+l2);
      list_of_teachers.main(f);
      }
      if(ss.equals(o))
      { jLabel2.setText("You have Selected To "+ss);
      selection_of_students.main(f);
      }
      if(st.equals(o))
      { jLabel2.setText("You have Selected To "+st);
      selection_of_teachers.main(f);
      }
           
           
               // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception {
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
            java.util.logging.Logger.getLogger(UNIVERSITY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UNIVERSITY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UNIVERSITY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UNIVERSITY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new UNIVERSITY().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
