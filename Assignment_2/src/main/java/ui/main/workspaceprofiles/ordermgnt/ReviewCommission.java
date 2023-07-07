/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.main.workspaceprofiles.ordermgnt;

import java.awt.CardLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import model.business.Business;
import model.salesmgnt.SalesPersonDirectory;
import model.salesmgnt.SalesPersonProfile;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class ReviewCommission extends javax.swing.JPanel {

    JPanel CardSequencePanel;
    Business business;
    SalesPersonProfile salesperson;
    
    public ReviewCommission(JPanel CardSequencePanel, Business business, SalesPersonProfile salesperson) {
        initComponents();
        this.CardSequencePanel = CardSequencePanel;
        this.business = business;
        this.salesperson = salesperson;
        initialize();
        createCommissionGrowthChart();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblSalesTarget = new javax.swing.JLabel();
        txtSalesTarget = new javax.swing.JTextField();
        lblCurrentSales = new javax.swing.JLabel();
        txtCurrentSales = new javax.swing.JTextField();
        lblAccumulatedCommission = new javax.swing.JLabel();
        txtAccumulatedCommission = new javax.swing.JTextField();
        lblBonus = new javax.swing.JLabel();
        txtBonus = new javax.swing.JTextField();
        lblChart = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblSalesRank = new javax.swing.JLabel();
        txtSalesRank = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 153, 153));

        lblTitle.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblTitle.setText("Review Sales Performance & Commission");

        lblName.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblName.setText("Sales Person Name:");

        txtName.setEditable(false);

        lblSalesTarget.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblSalesTarget.setText("Sales Target:");

        txtSalesTarget.setEditable(false);

        lblCurrentSales.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblCurrentSales.setText("Current Sales:");

        txtCurrentSales.setEditable(false);

        lblAccumulatedCommission.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblAccumulatedCommission.setText("Accumulated Commission:");

        txtAccumulatedCommission.setEditable(false);

        lblBonus.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblBonus.setText("Bonus:");

        txtBonus.setEditable(false);

        jLabel2.setText("Average Sales Growth");

        lblSalesRank.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblSalesRank.setText("Sales Rank:");

        txtSalesRank.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblChart, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel2)
                                .addContainerGap(60, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitle)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblName)
                                    .addComponent(lblAccumulatedCommission)
                                    .addComponent(lblSalesTarget))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtAccumulatedCommission, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtSalesTarget, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblCurrentSales)
                                    .addComponent(lblBonus)
                                    .addComponent(lblSalesRank))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCurrentSales, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBonus, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSalesRank, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblTitle)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblName)
                                    .addComponent(lblSalesRank))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblSalesTarget)
                                    .addComponent(txtCurrentSales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCurrentSales))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(lblAccumulatedCommission))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtBonus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblBonus))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSalesRank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSalesTarget, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAccumulatedCommission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)
                        .addComponent(lblChart, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(41, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public void initialize(){
        txtName.setText(salesperson.getName());
        String salesTarget = String.valueOf(salesperson.getSalesTarget());
        txtSalesTarget.setText(salesTarget);
        String commission = String.valueOf(salesperson.getComission());
        txtAccumulatedCommission.setText(commission);
        String currentSales = String.valueOf(salesperson.getCurrentSales());
        txtCurrentSales.setText(currentSales);
        
//        SalesPersonDirectory spd = business.getSalesPersonDirectory();
//        ArrayList<SalesPersonProfile> spp = spd.rankSalesPerson();
//        spd.findSalesPerson(salesperson);
//        txtSalesRank.setText();

        
        
    }
    
    
    public void createCommissionGrowthChart() {
        
        //Create database
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        double commissionMay = 100.0; 
        double commissionJune = 200.0;
                
        dataset.addValue(commissionMay, "Sales", "May");
        dataset.addValue(commissionJune, "Sales", "June");
        
        //Create JFreeChart object
        JFreeChart chart = ChartFactory.createLineChart(
                "Sales Performance", //Title
                "Month", //橫坐標
                "Sales",
                dataset,
                PlotOrientation.VERTICAL,
                false, //是否顯示圖例標示
                true, //是否顯示tooltips
                false); //是否支持超連結
        
        
        //Display
        //ChartFrame chartFrame = new ChartFrame("Test", chart);
        //chartFrame.pack();
        //chartFrame.setVisible(true);
        
        BufferedImage chartImage = chart.createBufferedImage(500, 400);
        Image img = chartImage.getScaledInstance(500, 400, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(img);
        lblChart.setIcon(icon);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblAccumulatedCommission;
    private javax.swing.JLabel lblBonus;
    private javax.swing.JLabel lblChart;
    private javax.swing.JLabel lblCurrentSales;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSalesRank;
    private javax.swing.JLabel lblSalesTarget;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtAccumulatedCommission;
    private javax.swing.JTextField txtBonus;
    private javax.swing.JTextField txtCurrentSales;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSalesRank;
    private javax.swing.JTextField txtSalesTarget;
    // End of variables declaration//GEN-END:variables
}
