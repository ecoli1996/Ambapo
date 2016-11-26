/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cirdles.ambapo.userInterface;

import com.apple.eawt.Application;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.cirdles.ambapo.ConversionFileHandler;
import org.cirdles.ambapo.Coordinate;
import org.cirdles.ambapo.LatLongToUTM;
import org.cirdles.ambapo.UTM;
import org.cirdles.ambapo.UTMToLatLong;

/**
 *
 * @author evc1996
 */
public class AmbapoUI extends javax.swing.JPanel implements java.beans.Customizer {

    private static void setDefaultLookAndFeelDecorated(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private Object bean;
    
    public int zonenumber_val;
    public char zoneletter_val;
    public char hemisphere_val;
    public BigDecimal easting_val;
    public BigDecimal northing_val;
    public BigDecimal longitude_val;
    public BigDecimal latitude_val;
    
    public ConversionFileHandler conversionFileHandler;
    
    public boolean toLatLong;
    public boolean toUTM;
    public boolean fromLatLong;
    public boolean fromUTM;
    
    public String toDatum;
    public String fromDatum;
    

    /**
     * Creates new customizer AmbapoUI
     * @param conversionFileHandler
     */
    public AmbapoUI(ConversionFileHandler conversionFileHandler) {
        this.conversionFileHandler = conversionFileHandler;
        initComponents();
        initUI();
    }
    
    private void initUI() {

        this.setPreferredSize(new Dimension(700, 475));
        //AmbapoUI.setDefaultLookAndFeelDecorated(true);
        //UIManager.getLookAndFeelDefaults().put("defaultFont", new Font("SansSerif", Font.PLAIN, 12));

        // check for MacOS
        String lcOSName = System.getProperty("os.name").toLowerCase();
        boolean MAC_OS_X = lcOSName.startsWith("mac os x");
        if (MAC_OS_X) {
            Application myAboutHandler = new MacOSAboutHandler();
        }

        // center me
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        int w = this.getSize().width;
        int h = this.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;

        this.setLocation(x, y);
    }
    
    @Override
    public void setObject(Object bean) {
        this.bean = bean;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the FormEditor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        easting = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        northing = new javax.swing.JTextField();
        hemisphere = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        zoneLetter = new javax.swing.JTextField();
        zoneNumber = new javax.swing.JTextField();
        datumSoloConvert = new javax.swing.JComboBox();
        soloConvertToUTMButton = new javax.swing.JButton();
        latitude = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        longitude = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        browseButton = new javax.swing.JButton();
        fromUTMRadioButton = new javax.swing.JRadioButton();
        fromLatLongRadioButton = new javax.swing.JRadioButton();
        inputfile = new javax.swing.JTextField();
        bulkConvertButton = new javax.swing.JButton();
        datumBulkConvert = new javax.swing.JComboBox();
        exportFileButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        outputfile = new javax.swing.JTextField();
        toUTMRadioButton = new javax.swing.JRadioButton();
        toLatLongRadioButton = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        soloConvertToLatLongButton = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("AppleGothic", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(130, 15, 15));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ambapo");
        jLayeredPane1.add(jLabel1);
        jLabel1.setBounds(200, 0, 160, 60);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Easting");
        jLayeredPane1.add(jLabel2);
        jLabel2.setBounds(30, 70, 60, 16);
        jLayeredPane1.add(easting);
        easting.setBounds(90, 70, 110, 20);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Northing");
        jLayeredPane1.add(jLabel3);
        jLabel3.setBounds(30, 100, 60, 16);
        jLayeredPane1.add(northing);
        northing.setBounds(90, 100, 110, 20);

        hemisphere.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "N/A", "N", "S" }));
        hemisphere.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLayeredPane1.add(hemisphere);
        hemisphere.setBounds(240, 80, 80, 20);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Hemisphere");
        jLayeredPane1.add(jLabel4);
        jLabel4.setBounds(240, 60, 80, 16);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Zone Letter");
        jLayeredPane1.add(jLabel5);
        jLabel5.setBounds(360, 70, 80, 16);
        jLayeredPane1.add(zoneLetter);
        zoneLetter.setBounds(450, 70, 110, 20);
        jLayeredPane1.add(zoneNumber);
        zoneNumber.setBounds(450, 100, 110, 20);

        datumSoloConvert.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Datum" }));
        jLayeredPane1.add(datumSoloConvert);
        datumSoloConvert.setBounds(240, 140, 96, 27);

        soloConvertToUTMButton.setText("Convert To UTM");
        soloConvertToUTMButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soloConvertToUTMButtonActionPerformed(evt);
            }
        });
        jLayeredPane1.add(soloConvertToUTMButton);
        soloConvertToUTMButton.setBounds(30, 140, 160, 29);
        jLayeredPane1.add(latitude);
        latitude.setBounds(110, 180, 130, 20);

        jLabel10.setText("Latitude");
        jLayeredPane1.add(jLabel10);
        jLabel10.setBounds(40, 180, 51, 16);

        jLabel11.setText("Longitude");
        jLayeredPane1.add(jLabel11);
        jLabel11.setBounds(330, 180, 70, 16);
        jLayeredPane1.add(longitude);
        longitude.setBounds(410, 180, 130, 20);

        jLabel7.setFont(new java.awt.Font("AppleGothic", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("OR...");
        jLayeredPane1.add(jLabel7);
        jLabel7.setBounds(260, 220, 45, 16);

        jLabel8.setText("Input File");
        jLayeredPane1.add(jLabel8);
        jLabel8.setBounds(20, 250, 70, 16);

        browseButton.setText("Browse...");
        browseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseButtonActionPerformed(evt);
            }
        });
        jLayeredPane1.add(browseButton);
        browseButton.setBounds(10, 270, 90, 29);

        fromUTMRadioButton.setText("UTM");
        jLayeredPane1.add(fromUTMRadioButton);
        fromUTMRadioButton.setBounds(20, 300, 70, 23);

        fromLatLongRadioButton.setText("LatLong");
        jLayeredPane1.add(fromLatLongRadioButton);
        fromLatLongRadioButton.setBounds(90, 300, 90, 23);
        jLayeredPane1.add(inputfile);
        inputfile.setBounds(100, 270, 110, 28);

        bulkConvertButton.setText("Convert");
        bulkConvertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bulkConvertButtonActionPerformed(evt);
            }
        });
        jLayeredPane1.add(bulkConvertButton);
        bulkConvertButton.setBounds(240, 260, 93, 30);

        datumBulkConvert.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Datum" }));
        jLayeredPane1.add(datumBulkConvert);
        datumBulkConvert.setBounds(240, 300, 100, 20);

        exportFileButton.setText("Export...");
        exportFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportFileButtonActionPerformed(evt);
            }
        });
        jLayeredPane1.add(exportFileButton);
        exportFileButton.setBounds(370, 270, 97, 29);

        jLabel9.setText("Output File");
        jLayeredPane1.add(jLabel9);
        jLabel9.setBounds(380, 250, 80, 16);
        jLayeredPane1.add(outputfile);
        outputfile.setBounds(470, 270, 120, 28);

        toUTMRadioButton.setText("UTM");
        jLayeredPane1.add(toUTMRadioButton);
        toUTMRadioButton.setBounds(400, 300, 70, 20);

        toLatLongRadioButton.setText("LatLong");
        jLayeredPane1.add(toLatLongRadioButton);
        toLatLongRadioButton.setBounds(480, 300, 90, 20);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Zone Number");
        jLayeredPane1.add(jLabel6);
        jLabel6.setBounds(350, 100, 90, 16);

        soloConvertToLatLongButton.setText("Convert to LatLong");
        soloConvertToLatLongButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soloConvertToLatLongButtonActionPerformed(evt);
            }
        });
        jLayeredPane1.add(soloConvertToLatLongButton);
        soloConvertToLatLongButton.setBounds(410, 140, 160, 29);

        add(jLayeredPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void browseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_browseButtonActionPerformed

    private void soloConvertToUTMButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soloConvertToUTMButtonActionPerformed
        //Set latitude
        if(latitude.getText().length() <= 0){
            latitude_val = BigDecimal.ZERO;
        }
        else if(Double.parseDouble(latitude.getText()) < -90){
            latitude_val = new BigDecimal(-90);
        }
        else if(Double.parseDouble(latitude.getText()) > 90){
            latitude_val = new BigDecimal(90);
        }
        else{
            latitude_val = new BigDecimal(latitude.getText());
        }
        
        //-Set longitude
        if(longitude.getText().length() <= 0){
            longitude_val = BigDecimal.ZERO;
        }
        else if(Double.parseDouble(longitude.getText()) < -180){
            longitude_val = new BigDecimal(-180);
        }
        else if(Double.parseDouble(longitude.getText()) > 180){
            longitude_val = new BigDecimal(180);
        }
        else{
            longitude_val = new BigDecimal(longitude.getText());
        }
        
        //Set Datum
        if(datumSoloConvert.getSelectedItem().toString().equals("Datum")){
            fromDatum = "WGS84";
        }else{
            fromDatum = datumSoloConvert.getSelectedItem().toString();
        }
        
        //do conversion
        UTM utm = null;
        try {
            utm = LatLongToUTM.convert(latitude_val, longitude_val, fromDatum);
        } catch (Exception ex) {
            Logger.getLogger(AmbapoUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        easting.setText(utm.getEasting().toString());
        northing.setText(utm.getNorthing().toString());
        hemisphere.setSelectedItem(String.valueOf(utm.getHemisphere()));
        zoneLetter.setText(String.valueOf(utm.getZoneLetter()));
        zoneNumber.setText(String.valueOf(utm.getZoneNumber()));
        
    }//GEN-LAST:event_soloConvertToUTMButtonActionPerformed

    private void bulkConvertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bulkConvertButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bulkConvertButtonActionPerformed

    private void exportFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportFileButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exportFileButtonActionPerformed

    private void soloConvertToLatLongButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soloConvertToLatLongButtonActionPerformed
        // TODO add your handling code here:
        
        //Set easting value
        //System.out.println("EASTING: " + easting.getText() + "\n");
        if(easting.getText().length() <= 0){            
            easting_val = BigDecimal.ZERO;
        }else{
            easting_val = new BigDecimal(easting.getText());
        }
        
        //Set northing value
         //System.out.println("NORTHING: " + northing.getText() + "\n");
        if(northing.getText().length() <= 0){
            northing_val = BigDecimal.ZERO;
        }else{
            northing_val = new BigDecimal(northing.getText());
        }
        
        //Set hemisphere value
        //System.out.println("HEMISPHERE: " + hemisphere.getSelectedItem().toString() + "\n");
        switch (hemisphere.getSelectedItem().toString()) {
            case "N":
                hemisphere_val = 'N';
                break;
            case "S":
                hemisphere_val = 'S';
                break;
            default:
                hemisphere_val = '*';
                break;
        }
        
        //Set zone letter value
        //System.out.println("ZONE LETTER: " + zoneLetter.getText() + "\n");
        if(zoneLetter.getText().length() <= 0){
            zoneletter_val = '*';
        }else{
            zoneletter_val = zoneLetter.getText().charAt(0);
        }
        
        //Set zone number value
        //System.out.println("ZONE Number: " + zoneNumber.getText() + "\n");
        if(zoneNumber.getText().length() <= 0 || Integer.parseInt(zoneNumber.getText()) < 1){
            zonenumber_val = 1;
        }
        else if(Integer.parseInt(zoneNumber.getText()) > 60){
            zonenumber_val = 60;
        }
        else{
            zonenumber_val = Integer.parseInt(zoneNumber.getText());
        }
        
        //Set Datum to Convert To
        //System.out.println("DATUM: " + datumSoloConvert.getSelectedItem().toString() + "\n");
        if(datumSoloConvert.getSelectedItem().toString().equals("Datum")){
            toDatum = "WGS84";
        }else{
            toDatum = datumSoloConvert.getSelectedItem().toString();
        }
        
        //create UTM object
        UTM utm = null;
        try {
            utm = new UTM(easting_val, northing_val, hemisphere_val, zonenumber_val, zoneletter_val);
        } catch (Exception ex) {
            Logger.getLogger(AmbapoUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Do the conversion
        Coordinate latlong = null;
        try {
            latlong = UTMToLatLong.convert(utm, toDatum);
        } catch (Exception ex) {
            Logger.getLogger(AmbapoUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        latitude.setText(latlong.getLatitude().toString());
        longitude.setText(latlong.getLongitude().toString());
        
        
        
    }//GEN-LAST:event_soloConvertToLatLongButtonActionPerformed

    private void updateCurrentFileToConvertLocation() {
        inputfile.setText(conversionFileHandler.getCurrentFileLocationToConvert());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseButton;
    private javax.swing.JButton bulkConvertButton;
    private javax.swing.JComboBox datumBulkConvert;
    private javax.swing.JComboBox datumSoloConvert;
    private javax.swing.JTextField easting;
    private javax.swing.JButton exportFileButton;
    private javax.swing.JRadioButton fromLatLongRadioButton;
    private javax.swing.JRadioButton fromUTMRadioButton;
    private javax.swing.JComboBox hemisphere;
    private javax.swing.JTextField inputfile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JTextField latitude;
    private javax.swing.JTextField longitude;
    private javax.swing.JTextField northing;
    private javax.swing.JTextField outputfile;
    private javax.swing.JButton soloConvertToLatLongButton;
    private javax.swing.JButton soloConvertToUTMButton;
    private javax.swing.JRadioButton toLatLongRadioButton;
    private javax.swing.JRadioButton toUTMRadioButton;
    private javax.swing.JTextField zoneLetter;
    private javax.swing.JTextField zoneNumber;
    // End of variables declaration//GEN-END:variables
}
