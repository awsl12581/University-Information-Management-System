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
        menuItem2 = new JMenuItem();
        menuItem3 = new JMenuItem();
        checkBoxMenuItem1 = new JCheckBoxMenuItem();
        menu2 = new JMenu();
        menu3 = new JMenu();
        menu4 = new JMenu();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border.
            EmptyBorder( 0, 0, 0, 0) , "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e", javax. swing. border. TitledBorder. CENTER, javax. swing
            . border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069al\u006fg" ,java .awt .Font .BOLD ,12 ),
            java. awt. Color. red) ,dialogPane. getBorder( )) ); dialogPane. addPropertyChangeListener (new java. beans. PropertyChangeListener( )
            { @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062or\u0064er" .equals (e .getPropertyName () ))
            throw new RuntimeException( ); }} );
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {

                //======== menuBar1 ========
                {

                    //======== menu1 ========
                    {
                        menu1.setText(bundle.getString("menu1.text"));

                        //---- menuItem2 ----
                        menuItem2.setText(bundle.getString("menuItem2.text"));
                        menu1.add(menuItem2);

                        //---- menuItem3 ----
                        menuItem3.setText(bundle.getString("menuItem3.text"));
                        menu1.add(menuItem3);

                        //---- checkBoxMenuItem1 ----
                        checkBoxMenuItem1.setText(bundle.getString("checkBoxMenuItem1.text"));
                        menu1.add(checkBoxMenuItem1);
                    }
                    menuBar1.add(menu1);

                    //======== menu2 ========
                    {
                        menu2.setText(bundle.getString("menu2.text"));
                    }
                    menuBar1.add(menu2);

                    //======== menu3 ========
                    {
                        menu3.setText(bundle.getString("menu3.text"));
                    }
                    menuBar1.add(menu3);

                    //======== menu4 ========
                    {
                        menu4.setText(bundle.getString("menu4.text"));
                    }
                    menuBar1.add(menu4);
                }

                GroupLayout contentPanelLayout = new GroupLayout(contentPanel);
                contentPanel.setLayout(contentPanelLayout);
                contentPanelLayout.setHorizontalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(menuBar1, GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
                            .addContainerGap())
                );
                contentPanelLayout.setVerticalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(menuBar1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(495, Short.MAX_VALUE))
                );
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);
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
    private JMenuItem menuItem2;
    private JMenuItem menuItem3;
    private JCheckBoxMenuItem checkBoxMenuItem1;
    private JMenu menu2;
    private JMenu menu3;
    private JMenu menu4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
