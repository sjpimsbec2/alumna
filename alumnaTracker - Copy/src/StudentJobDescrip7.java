
import java.util.List;
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author hp
 */
public class StudentJobDescrip7 extends javax.swing.JFrame {

    /**
     * Creates new form StudentJobDescrip7
     */
     List<String> inputList;
    public StudentJobDescrip7(List<String> inputList) {
        this.inputList= inputList;
         Map<List<String>, String> skillsToJobs = new HashMap<>();

        // Add mappings for skills and corresponding job titles
        skillsToJobs.put(Arrays.asList("html", "css", "javascript",  "creativity skills",  "graphics",  "design"), "Web Developer");
        skillsToJobs.put(Arrays.asList("java", "python", "c++", "computer porogramming",  "communication"), "Software Developer");
        skillsToJobs.put(Arrays.asList("networking", "security"), "Network Administrator");
        skillsToJobs.put(Arrays.asList("math", "analysis"), "Engineer");
        skillsToJobs.put(Arrays.asList("problem-solving", "design"), "Process Engineer");
        skillsToJobs.put(Arrays.asList("autocad", "adobe creative"), "Graphic Designer");
        skillsToJobs.put(Arrays.asList("analytics", "critical", "creative",  "programming", "java",   "coding" ), "Computer Engineer");
        skillsToJobs.put(Arrays.asList("CAD", "communication", "design-principles" ), "Architect");
        skillsToJobs.put(Arrays.asList("design-process", "space-planning" ), "Interior Design");
        // Add more job titles and skills here...

        // Add mappings for job responsibilities
        Map<String, List<String>> jobToResponsibilities = new HashMap<>();
        jobToResponsibilities.put("Web Developer", Arrays.asList(
                "Designing and building responsive websites",
                "Writing clean and maintainable code",
                "Implementing user interfaces"));

        jobToResponsibilities.put("Software Developer", Arrays.asList(
                "Developing software applications",
                "Testing and debugging code",
                "Collaborating with cross-functional teams"));

        jobToResponsibilities.put("Network Administrator", Arrays.asList(
                "Setting up and maintaining network infrastructure",
                "Monitoring network performance",
                "Implementing security measures"));

        jobToResponsibilities.put("Accountant", Arrays.asList(
                "Preparing and analyzing financial statements",
                "Managing accounts payable and accounts receivable",
                "Ensuring compliance with tax regulations"));

        jobToResponsibilities.put("Process Engineer", Arrays.asList(
                "Designing and implementing engineering solutions",
                "Conducting experiments and analyzing data",
                "Collaborating with multidisciplinary teams"));
        
        jobToResponsibilities.put("Process Engineer", Arrays.asList(
                "Proficient in Graphic Design software",
                "excellent communication and job management skills"));
        
        jobToResponsibilities.put("Computer Engineer", Arrays.asList(
                "Design new computer hardware, creating schematics of computer equipment to be buiilt",
                "Analyze the test results and modify the design as needed"));
        
        jobToResponsibilities.put("Architect", Arrays.asList(
                "strong understanding of design principles, building, building codes and regulations, and construction materials and methods"));

        jobToResponsibilities.put("Interior Designer", Arrays.asList(
                "Strong undestanding of design principles, space planning, color theory, materials and finishes",
                "Analyze the test results and modify the design as needed"));
         String matchedJob = "";
        for (Map.Entry<List<String>, String> entry : skillsToJobs.entrySet()) {
            if (entry.getKey().containsAll(this.inputList)) {
                matchedJob = entry.getValue();
                break;
            }
        }
        String listOfResponsibility  = "";
        // Display the matched job and its responsibilities
        if (!matchedJob.isEmpty()) {
            listOfResponsibility = listOfResponsibility +  matchedJob+"\n";
           
            listOfResponsibility = listOfResponsibility + "Responsibilities:\n";
            List<String> responsibilities = jobToResponsibilities.get(matchedJob);
            for (String responsibility : responsibilities) {
                listOfResponsibility = listOfResponsibility+"- " + responsibility + "\n";
            }
        } else {
            listOfResponsibility = ("No matching job title found for the given skills.");
        }
//        descriptionText.setText("FDFF");
        initComponents();
        setTex(listOfResponsibility, matchedJob);
    }
    
    public void setTex(String list, String match){
        potentialText.setText(match);
        descriptionText.setText(list);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        exit7 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        potentialText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionText = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        home7 = new javax.swing.JButton();
        update7 = new javax.swing.JButton();
        logout7 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(246, 246, 232));
        jPanel2.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("JOB DESCRIPTION");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(50, 250, 390, 17);

        exit7.setBackground(new java.awt.Color(153, 153, 153));
        exit7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        exit7.setText("EXIT");
        exit7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit7ActionPerformed(evt);
            }
        });
        jPanel2.add(exit7);
        exit7.setBounds(1040, 530, 59, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Based on your SKILLS, you have the potential to be  ");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(50, 70, 390, 17);

        potentialText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potentialTextActionPerformed(evt);
            }
        });
        jPanel2.add(potentialText);
        potentialText.setBounds(80, 110, 620, 100);

        descriptionText.setEditable(false);
        descriptionText.setColumns(20);
        descriptionText.setLineWrap(true);
        descriptionText.setRows(5);
        jScrollPane1.setViewportView(descriptionText);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(80, 300, 620, 160);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 1170, 610));

        jPanel4.setBackground(new java.awt.Color(53, 61, 99));

        home7.setBackground(new java.awt.Color(53, 61, 99));
        home7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        home7.setForeground(new java.awt.Color(232, 235, 247));
        home7.setText("HOME");
        home7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home7ActionPerformed(evt);
            }
        });

        update7.setBackground(new java.awt.Color(53, 61, 99));
        update7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        update7.setForeground(new java.awt.Color(182, 188, 210));
        update7.setText("UPDATE");
        update7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update7ActionPerformed(evt);
            }
        });

        logout7.setBackground(new java.awt.Color(53, 61, 99));
        logout7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logout7.setForeground(new java.awt.Color(182, 188, 210));
        logout7.setText("LOG OUT");
        logout7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout7ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial Narrow", 0, 10)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(232, 235, 247));
        jLabel15.setText("Alumna Tracker");

        jLabel16.setFont(new java.awt.Font("Arial Narrow", 0, 10)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(232, 235, 247));
        jLabel16.setText("Batangas State University - Alangilan");

        jLabel17.setFont(new java.awt.Font("Arial Narrow", 0, 10)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(232, 235, 247));
        jLabel17.setText("est. 2023");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(home7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(update7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logout7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(69, 69, 69))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel16))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel17)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(home7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(update7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logout7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 310, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addContainerGap())
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 200, 610));

        jPanel3.setBackground(new java.awt.Color(182, 188, 210));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1370, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1370, 40));

        jPanel1.setBackground(new java.awt.Color(59, 52, 139));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("GRADCONNECT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(675, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(540, 540, 540))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 100));

        setSize(new java.awt.Dimension(1386, 708));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exit7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit7ActionPerformed
        StudentSearch6 form = new StudentSearch6();
        form.show();
        
        dispose();
    }//GEN-LAST:event_exit7ActionPerformed

    private void update7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update7ActionPerformed
       StudentUpdate8 form = new StudentUpdate8 ();
        form.show();
        
        dispose();
    }//GEN-LAST:event_update7ActionPerformed

    private void logout7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout7ActionPerformed
        login_3 form = new login_3 ();
        form.show();
        
        dispose();
    }//GEN-LAST:event_logout7ActionPerformed

    private void potentialTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potentialTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_potentialTextActionPerformed

    private void home7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home7ActionPerformed
        Welcome_1 form = new Welcome_1 ();
        form.show();
        
        dispose();
    }//GEN-LAST:event_home7ActionPerformed

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
            java.util.logging.Logger.getLogger(StudentJobDescrip7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentJobDescrip7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentJobDescrip7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentJobDescrip7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentJobDescrip7(Arrays.asList("")).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea descriptionText;
    private javax.swing.JButton exit7;
    private javax.swing.JButton home7;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout7;
    private javax.swing.JTextField potentialText;
    private javax.swing.JButton update7;
    // End of variables declaration//GEN-END:variables
}
