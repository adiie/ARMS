/*
 * InsertMarkDialog.java
 *
 * Created on April 4, 2007, 12:31 PM
 */

package ui.dialog;

import com.megginson.sax.DataWriter;
import java.awt.Point;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.HashMap;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.xml.sax.SAXException;
import ui.MainForm;
import util.MessageInfo;
import util.Util;
import util.WatermarkAnalyzer;
import util.WaveInfo;
import watermark.WatermarkingFactory;
import wavemark.*;

/**
 *
 * @author  ady
 */
public class ExtractMarkDialog extends javax.swing.JDialog {
    
    private WaveInfo waveInfo;
    private MainForm mainForm;
    private WatermarkAnalyzer wa;
    int current = 0;
    private File configfile =  new File(System.getProperty("user.dir") + "\\preset\\default.wp"); 

    /** Creates new form InsertMarkDialog */
    public ExtractMarkDialog(java.awt.Frame parent, boolean modal, MainForm mainForm, WaveInfo waveInfo) {
        super(parent, modal);
        this.waveInfo = waveInfo;
        this.mainForm = mainForm;
        this.wa = new WatermarkAnalyzer(this.waveInfo);
        
        initComponents();
        Point point = this.mainForm.getLocationOnScreen();
        this.setLocation(point.x,point.y+80);
        this.applyConfig();
        jButtonApp2Con.setEnabled(false); 
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanelMenuInsert = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jRBSavetoFile = new javax.swing.JRadioButton();
        jRBShowMessage = new javax.swing.JRadioButton();
        jTextFieldSavePath = new javax.swing.JTextField();
        jButtonLoadMessage = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPaneMessage = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonExtractExecute = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanelMethod = new javax.swing.JPanel();
        jButtonSave = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabelState = new javax.swing.JLabel();
        jLabelState1 = new javax.swing.JLabel();
        jLabelState3 = new javax.swing.JLabel();
        jLabelState4 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabelTextPass = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jTextFieldOWPath = new javax.swing.JTextField();
        jButtonOWPath = new javax.swing.JButton();
        jLabelOWText = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButtonAnalize = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabelWMMethod = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabelWMEncrypted = new javax.swing.JLabel();
        jLabelState6 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabelWMCompressed = new javax.swing.JLabel();
        jButtonApp2Con = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabelWMFound = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jPanelMenuInsert.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelMenuInsert.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        buttonGroup1.add(jRBSavetoFile);
        jRBSavetoFile.setText(" File");
        jRBSavetoFile.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRBSavetoFile.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRBSavetoFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBSavetoFileActionPerformed(evt);
            }
        });

        jPanel2.add(jRBSavetoFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        buttonGroup1.add(jRBShowMessage);
        jRBShowMessage.setSelected(true);
        jRBShowMessage.setText(" Text");
        jRBShowMessage.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRBShowMessage.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRBShowMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBShowMessageActionPerformed(evt);
            }
        });

        jPanel2.add(jRBShowMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jPanel2.add(jTextFieldSavePath, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 230, -1));

        jButtonLoadMessage.setText("...");
        jButtonLoadMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoadMessageActionPerformed(evt);
            }
        });

        jPanel2.add(jButtonLoadMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 30, 21));

        jScrollPane1.setViewportView(jTextPaneMessage);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 270, 150));

        jPanelMenuInsert.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 380, 210));

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 14));
        jLabel2.setText("Extract watermark");
        jPanelMenuInsert.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanelMenuInsert.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 720, 10));

        jButtonExtractExecute.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wavemark/images/misc.png")));
        jButtonExtractExecute.setMnemonic('E');
        jButtonExtractExecute.setText(" Execute");
        jButtonExtractExecute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExtractExecuteActionPerformed(evt);
            }
        });

        jPanelMenuInsert.add(jButtonExtractExecute, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, -1, -1));

        jLabel1.setText("To extract watermark from audio file, try to analize first its header if not detected use Synchronization mode to extract watermark");
        jPanelMenuInsert.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel10.setText("Extract Process Time");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel7.setText("   ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel11.setText(":");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 10, -1));

        jPanelMenuInsert.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 380, 30));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wavemark/images/corner.jpg")));
        jPanelMenuInsert.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 290, 110, 200));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wavemark/images/insertmark.jpg")));
        jPanelMenuInsert.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 50, 60));

        jPanelMethod.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelMethod.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonSave.setMnemonic('C');
        jButtonSave.setText("Change");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jPanelMethod.add(jButtonSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 100, -1));

        jPanelMethod.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 380, 10));

        jLabelState.setText("jLabel4");
        jPanelMethod.add(jLabelState, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jLabelState1.setText("jLabel4");
        jPanelMethod.add(jLabelState1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        jLabelState3.setText("jLabel4");
        jPanelMethod.add(jLabelState3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        jLabelState4.setText("jLabel4");
        jPanelMethod.add(jLabelState4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        jLabel4.setText("Mode");
        jPanelMethod.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel5.setText("Method");
        jPanelMethod.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel20.setText("Encryption");
        jPanelMethod.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel21.setText("Compression");
        jPanelMethod.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel24.setText(":");
        jPanelMethod.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 20, -1));

        jLabel25.setText(":");
        jPanelMethod.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 20, -1));

        jLabel27.setText(":");
        jPanelMethod.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 20, -1));

        jLabel28.setText(":");
        jPanelMethod.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 20, -1));

        jLabelTextPass.setText("Password to encrypt/decrypt");
        jPanelMethod.add(jLabelTextPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jPanelMethod.add(jPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 200, -1));

        jPanelMethod.add(jTextFieldOWPath, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 150, -1));

        jButtonOWPath.setText("...");
        jButtonOWPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOWPathActionPerformed(evt);
            }
        });

        jPanelMethod.add(jButtonOWPath, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 180, -1, 21));

        jLabelOWText.setText("Original Message File Location");
        jPanelMethod.add(jLabelOWText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jPanelMenuInsert.add(jPanelMethod, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 380, 210));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonAnalize.setMnemonic('A');
        jButtonAnalize.setText("Analyze");
        jButtonAnalize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnalizeActionPerformed(evt);
            }
        });

        jPanel3.add(jButtonAnalize, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));

        jLabel6.setText("Method");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel26.setText(":");
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 120, -1));

        jLabelWMMethod.setText(" ");
        jPanel3.add(jLabelWMMethod, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        jLabel22.setText("Encrypted");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabelWMEncrypted.setText(" ");
        jPanel3.add(jLabelWMEncrypted, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        jLabelState6.setText(" ");
        jPanel3.add(jLabelState6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        jLabel29.setText("Compressed");
        jPanel3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel30.setText(":");
        jPanel3.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 20, -1));

        jLabelWMCompressed.setText(" ");
        jPanel3.add(jLabelWMCompressed, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 150, -1));

        jButtonApp2Con.setMnemonic('A');
        jButtonApp2Con.setText("Apply to config");
        jButtonApp2Con.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApp2ConActionPerformed(evt);
            }
        });

        jPanel3.add(jButtonApp2Con, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        jLabel8.setText("STATUS");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel32.setText(":");
        jPanel3.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 10, -1));

        jLabelWMFound.setText(" ");
        jPanel3.add(jLabelWMFound, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jLabel31.setText(":");
        jPanel3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 10, -1));

        jPanelMenuInsert.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 380, 140));

        getContentPane().add(jPanelMenuInsert, java.awt.BorderLayout.CENTER);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-800)/2, (screenSize.height-520)/2, 800, 520);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonApp2ConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApp2ConActionPerformed
        try {
// TODO add your handling code here:
            savePreset();
        } catch (SAXException ex) {
            ex.printStackTrace();
        }
        this.applyConfig();
        
    }//GEN-LAST:event_jButtonApp2ConActionPerformed

    private void savePreset() throws SAXException{
        FileWriter fw = null;
        try {
            fw = new FileWriter(this.configfile);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        DataWriter w = new DataWriter(fw);
	w.setIndentStep(2);
	w.startDocument();
	w.startElement("config");
	
        w.dataElement("mode", "0");

        
        if (wa.getWatermarkingMethod() == 0){
            w.dataElement("method", "0");
            w.dataElement("lsb", wa.getValueMethod());
        }else{
            w.dataElement("method", "1");
            w.dataElement("amplitude", wa.getValueMethod());
        }
        
        w.dataElement("warning", "1");
        
        
        if (wa.isCompressed())
            w.dataElement("compress", "1");                        
        else
            w.dataElement("compress", "0");                                   
        
        
        if (wa.isEncrypted())
            w.dataElement("encrypt", "1");        
        else
            w.dataElement("encrypt", "0");
            
        
        w.dataElement("msgSize", Integer.toString(wa.getLengthMessage()));
            
        
        
        w.endElement("config");
	w.endDocument();


    }
    
    private void jButtonAnalizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnalizeActionPerformed
// TODO add your handling code here:
        if (wa.isContainWatermark()){
            jLabelWMFound.setText("WATERMARK FOUND!!");
            int method = wa.getWatermarkingMethod();
            if (method == WatermarkingFactory.LOW_BIT_CODING_METHOD)
                jLabelWMMethod.setText("Low Bit Coding with LSB ");
            else
                jLabelWMMethod.setText("Echo Hiding with amplitude ");
            
            jLabelWMMethod.setText(jLabelWMMethod.getText() + wa.getValueMethod());
                    
            if (wa.isEncrypted()) 
                jLabelWMEncrypted.setText("Encrypted");
            else
                jLabelWMEncrypted.setText("Not Encrypted");
            
            if (wa.isCompressed()) 
                jLabelWMCompressed.setText("Compressed");
            else 
                jLabelWMCompressed.setText("Not Compressed");
            
            jButtonApp2Con.setEnabled(true);
            
            //System.out.println("len:" + wa.getLengthMessage());
        }else
            jLabelWMFound.setText("WATERMARK NOT FOUND!!");
            
        
        
    }//GEN-LAST:event_jButtonAnalizeActionPerformed

    private void jButtonOWPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOWPathActionPerformed
    // TODO add your handling code here:
        try {
            File file = new File(System.getProperty("user.dir"));
            JFileChooser fc = new JFileChooser(file);
            if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                jTextFieldOWPath.setText(fc.getSelectedFile().getCanonicalPath());
            }
        } catch (SecurityException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }               
    }//GEN-LAST:event_jButtonOWPathActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
// TODO add your handling code here:
        OptionDialog3 od = new OptionDialog3(this.mainForm, false, this, this.mainForm.getLocationOnScreen());
        od.setVisible(true);
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonExtractExecuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExtractExecuteActionPerformed
        
       if (Util.getValue(this.configfile,"mode").equals("1") && jTextFieldOWPath.getText().equals("")){
            JOptionPane.showMessageDialog(this,"You choose Non Blind mode!! Please choose original watermark file location!!","Warning",JOptionPane.WARNING_MESSAGE);                      
        }else{
            HashMap map = Util.setToHashMap(this.configfile);
            
            if (Util.getValue(this.configfile,"mode").equals("1")){
                File orginalWM = new File(jTextFieldOWPath.getText());
                int size = (int) orginalWM.length();
                map.put("msgSize", Integer.toString(size));
                System.out.println(size);
                map.put("ext", Util.getExtensionFile(jTextFieldOWPath.getText()));
                System.out.println(Util.getExtensionFile(jTextFieldOWPath.getText()));
                
            }else{
                map.put("msgSize", Integer.toString(wa.getLengthMessage()));
                System.out.println(wa.getLengthMessage());
                map.put("ext", wa.getMessageExt());
                System.out.println(wa.getMessageExt());
            }
        
        
        
        
            Calendar cal1 = Calendar.getInstance();

            WatermarkingFactory wm = new WatermarkingFactory(this.waveInfo, map);
            wm.ExtractWatermark();


            MessageInfo mi = wm.getMessage();

            if (Util.getValue(this.configfile,"compress").equalsIgnoreCase("1")){
                try {
                    mi = Util.uncompressMessageInfo(mi, 9);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }

            if (Util.getValue(this.configfile,"encrypt").equalsIgnoreCase("1")){
                mi = Util.DecryptMessageInfo(mi, new String(jPasswordField.getPassword()));
            }
            Calendar cal2 = Calendar.getInstance();
            long timeElapse = cal2.getTimeInMillis() - cal1.getTimeInMillis();
            double seconds = timeElapse/1000.0;
            this.jLabel7.setText(seconds + " seconds");

            if (jRBSavetoFile.isSelected()){
                mi.streamToFile(jTextFieldSavePath.getText());
            }else{
                jTextPaneMessage.setText(mi.streamToText());
            }
        }
    }//GEN-LAST:event_jButtonExtractExecuteActionPerformed

    private void jButtonLoadMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoadMessageActionPerformed
        try {
            File file = new File(System.getProperty("user.dir"));
            JFileChooser fc = new JFileChooser(file);
            if (fc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                jTextFieldSavePath.setText(fc.getSelectedFile().getCanonicalPath());
            }
        } catch (SecurityException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButtonLoadMessageActionPerformed

    private void jRBShowMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBShowMessageActionPerformed
        jTextFieldSavePath.setEnabled(jRBSavetoFile.isSelected());
        jButtonLoadMessage.setEnabled(jRBSavetoFile.isSelected());
        jTextPaneMessage.setEnabled(!jRBSavetoFile.isSelected());
    }//GEN-LAST:event_jRBShowMessageActionPerformed

    private void jRBSavetoFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBSavetoFileActionPerformed
        jTextFieldSavePath.setEnabled(jRBSavetoFile.isSelected());
        jButtonLoadMessage.setEnabled(jRBSavetoFile.isSelected());
        jTextPaneMessage.setEnabled(!jRBSavetoFile.isSelected());
    }//GEN-LAST:event_jRBSavetoFileActionPerformed

    public void applyConfig(){
        String state1 ="";
        int mode =  Integer.parseInt(Util.getValue(this.configfile, "mode"));
        
        if (mode == 0){
           state1 ="Blind Watermarking";
           this.showTextFieldOriginalWM(false);
        }else{
           state1 ="Non Blind (Sync) Watermarking";
           this.showTextFieldOriginalWM(true);
        }
        
        String state2="";
        int method =  Integer.parseInt(Util.getValue(this.configfile, "method"));
        if (method == 0){
            int lsb = Integer.parseInt(Util.getValue(this.configfile,"lsb"));
            state2 = "Low Bit Coding with LSB: " + lsb;
        }else{
            state2 = "Echo Hiding with echo amplitude: " + Util.getValue(this.configfile,"amplitude");  
        }
        
        
        String state4="";
        int encrypt = Integer.parseInt(Util.getValue(this.configfile, "encrypt"));    
        if(encrypt==1){    
            state4 = "encrypted";
            this.showTextFieldPass(true);
        }else{
            state4 = "not encrypted";
            this.showTextFieldPass(false);
        }
        String state5="";
        int compress = Integer.parseInt(Util.getValue(this.configfile, "compress")); 
        if(compress==1){    
            state5 ="Compressed";
        }else
            state5 ="Not Compressed";
        
        jLabelState.setText(state1);
        jLabelState1.setText(state2);
        //jLabelState2.setText(state3);
        jLabelState3.setText(state4);
        jLabelState4.setText(state5);
    }
    
    private void showTextFieldPass(boolean state){
        jPasswordField.setVisible(state);
        jLabelTextPass.setVisible(state);
    }

    private void showTextFieldOriginalWM(boolean state){
        jLabelOWText.setVisible(state);
        jTextFieldOWPath.setVisible(state);
        jButtonOWPath.setVisible(state);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButtonAnalize;
    private javax.swing.JButton jButtonApp2Con;
    private javax.swing.JButton jButtonExtractExecute;
    private javax.swing.JButton jButtonLoadMessage;
    private javax.swing.JButton jButtonOWPath;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelOWText;
    private javax.swing.JLabel jLabelState;
    private javax.swing.JLabel jLabelState1;
    private javax.swing.JLabel jLabelState3;
    private javax.swing.JLabel jLabelState4;
    private javax.swing.JLabel jLabelState6;
    private javax.swing.JLabel jLabelTextPass;
    private javax.swing.JLabel jLabelWMCompressed;
    private javax.swing.JLabel jLabelWMEncrypted;
    private javax.swing.JLabel jLabelWMFound;
    private javax.swing.JLabel jLabelWMMethod;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelMenuInsert;
    private javax.swing.JPanel jPanelMethod;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JRadioButton jRBSavetoFile;
    private javax.swing.JRadioButton jRBShowMessage;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextFieldOWPath;
    private javax.swing.JTextField jTextFieldSavePath;
    private javax.swing.JTextPane jTextPaneMessage;
    // End of variables declaration//GEN-END:variables
    
}