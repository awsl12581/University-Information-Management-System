/*
 * Created by JFormDesigner on Fri Dec 24 22:45:03 CST 2021
 */

package com.liguo.studentinformationmanagementsystem.view.mainview;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;

/**
 * @author unknown
 */
public class MainPage extends JFrame {
    public MainPage() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        ResourceBundle bundle = ResourceBundle.getBundle("form");
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        menuBar1 = new JMenuBar();
        menu1 = new JMenu();
        menu2 = new JMenu();
        menuItem3 = new JMenuItem();
        menu4 = new JMenu();
        menuItem4 = new JMenuItem();
        menu5 = new JMenu();
        menuItem5 = new JMenuItem();
        menu6 = new JMenu();
        menuItem6 = new JMenuItem();
        menu7 = new JMenu();
        menuItem7 = new JMenuItem();
        menu3 = new JMenu();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.
            swing.border.EmptyBorder(0,0,0,0), "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e",javax.swing.border
            .TitledBorder.CENTER,javax.swing.border.TitledBorder.BOTTOM,new java.awt.Font("Dialo\u0067"
            ,java.awt.Font.BOLD,12),java.awt.Color.red),dialogPane. getBorder
            ()));dialogPane. addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void propertyChange(java
            .beans.PropertyChangeEvent e){if("borde\u0072".equals(e.getPropertyName()))throw new RuntimeException
            ();}});
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {

                //======== menuBar1 ========
                {

                    //======== menu1 ========
                    {
                        menu1.setText(bundle.getString("menu1.text"));

                        //======== menu2 ========
                        {
                            menu2.setText(bundle.getString("menu2.text"));

                            //---- menuItem3 ----
                            menuItem3.setText(bundle.getString("menuItem3.text"));
                            menu2.add(menuItem3);
                        }
                        menu1.add(menu2);

                        //======== menu4 ========
                        {
                            menu4.setText(bundle.getString("menu4.text"));

                            //---- menuItem4 ----
                            menuItem4.setText(bundle.getString("menuItem4.text"));
                            menu4.add(menuItem4);
                        }
                        menu1.add(menu4);

                        //======== menu5 ========
                        {
                            menu5.setText(bundle.getString("menu5.text"));

                            //---- menuItem5 ----
                            menuItem5.setText(bundle.getString("menuItem5.text"));
                            menu5.add(menuItem5);
                        }
                        menu1.add(menu5);

                        //======== menu6 ========
                        {
                            menu6.setText(bundle.getString("menu6.text"));

                            //---- menuItem6 ----
                            menuItem6.setText(bundle.getString("menuItem6.text"));
                            menu6.add(menuItem6);
                        }
                        menu1.add(menu6);

                        //======== menu7 ========
                        {
                            menu7.setText(bundle.getString("menu7.text"));

                            //---- menuItem7 ----
                            menuItem7.setText(bundle.getString("menuItem7.text"));
                            menu7.add(menuItem7);
                        }
                        menu1.add(menu7);
                    }
                    menuBar1.add(menu1);

                    //======== menu3 ========
                    {
                        menu3.setText(bundle.getString("menu3.text"));
                    }
                    menuBar1.add(menu3);
                }

                GroupLayout contentPanelLayout = new GroupLayout(contentPanel);
                contentPanel.setLayout(contentPanelLayout);
                contentPanelLayout.setHorizontalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(menuBar1, GroupLayout.DEFAULT_SIZE, 902, Short.MAX_VALUE)
                            .addContainerGap())
                );
                contentPanelLayout.setVerticalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(menuBar1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(563, Short.MAX_VALUE))
                );
            }
            dialogPane.add(contentPanel, BorderLayout.NORTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JMenuBar menuBar1;
    private JMenu menu1;
    private JMenu menu2;
    private JMenuItem menuItem3;
    private JMenu menu4;
    private JMenuItem menuItem4;
    private JMenu menu5;
    private JMenuItem menuItem5;
    private JMenu menu6;
    private JMenuItem menuItem6;
    private JMenu menu7;
    private JMenuItem menuItem7;
    private JMenu menu3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
