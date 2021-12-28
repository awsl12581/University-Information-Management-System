/*
 * Created by JFormDesigner on Fri Dec 24 22:45:03 CST 2021
 */

package com.liguo.studentinformationmanagementsystem.view.mainview;

import com.liguo.studentinformationmanagementsystem.entity.User;
import com.liguo.studentinformationmanagementsystem.view.component.MessagePage;
import com.liguo.studentinformationmanagementsystem.view.component.StudentList;
import com.liguo.studentinformationmanagementsystem.view.component.TeacherList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;

/**
 * @author unknown
 */
@Controller
public class MainPage extends JFrame {


    @Autowired
    StudentList studentList;
    @Autowired
    TeacherList teacherList;

    private User user;
    public void setUserMsg(User user){
        this.user = user;
        this.label1.setText("用户:"+this.user.getUsername()+",权限:"+this.user.getPrivilege());
    }

    public static void main(String[] args) {
        new MainPage().setVisible(true);
    }

    public MainPage() {
        initComponents();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    /**
     * 展示
     * @param e
     */
    private void menuItem3(ActionEvent e) {

        studentList.setVisible(true);
        studentList.setUser(user);
        studentList.setSize(640,640);
        studentList.setResizable(true);
        desktopPane1.add(studentList);
    }

    private void menuItem11(ActionEvent e) {
        MessagePage messagePage = new MessagePage();
        messagePage.setVisible(true);
        messagePage.setMessage(user);
        messagePage.setSize(640,640);
        messagePage.setResizable(true);
        desktopPane1.add(messagePage);
    }

    private void menuItem4(ActionEvent e) {
        teacherList.setVisible(true);
        teacherList.setUser(user);
        teacherList.setSize(640,640);
        teacherList.setResizable(true);
        desktopPane1.add(teacherList);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        ResourceBundle bundle = ResourceBundle.getBundle("form");
        dialogPane = new JPanel();
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
        menu3 = new JMenu();
        menu8 = new JMenu();
        menuItem1 = new JMenuItem();
        menu9 = new JMenu();
        menuItem2 = new JMenuItem();
        menu10 = new JMenu();
        menu11 = new JMenu();
        menuItem8 = new JMenuItem();
        menu12 = new JMenu();
        menuItem10 = new JMenuItem();
        menu13 = new JMenu();
        menuItem11 = new JMenuItem();
        menuItem12 = new JMenuItem();
        menuItem13 = new JMenuItem();
        label1 = new JLabel();
        panel1 = new JPanel();
        desktopPane1 = new JDesktopPane();

        //======== this ========
        var contentPane = getContentPane();

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing.
            border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JFor\u006dDesi\u0067ner \u0045valu\u0061tion" , javax. swing .border . TitledBorder. CENTER
            ,javax . swing. border .TitledBorder . BOTTOM, new java. awt .Font ( "Dia\u006cog", java .awt . Font
            . BOLD ,12 ) ,java . awt. Color .red ) ,dialogPane. getBorder () ) ); dialogPane. addPropertyChangeListener(
            new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e) { if( "bord\u0065r"
            .equals ( e. getPropertyName () ) )throw new RuntimeException( ) ;} } );

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
                        menuItem3.addActionListener(e -> menuItem3(e));
                        menu2.add(menuItem3);
                    }
                    menu1.add(menu2);

                    //======== menu4 ========
                    {
                        menu4.setText(bundle.getString("menu4.text"));

                        //---- menuItem4 ----
                        menuItem4.setText(bundle.getString("menuItem4.text"));
                        menuItem4.addActionListener(e -> menuItem4(e));
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
                }
                menuBar1.add(menu1);

                //======== menu3 ========
                {
                    menu3.setText(bundle.getString("menu3.text"));

                    //======== menu8 ========
                    {
                        menu8.setText(bundle.getString("menu8.text"));

                        //---- menuItem1 ----
                        menuItem1.setText(bundle.getString("menuItem1.text"));
                        menu8.add(menuItem1);
                    }
                    menu3.add(menu8);

                    //======== menu9 ========
                    {
                        menu9.setText(bundle.getString("menu9.text"));

                        //---- menuItem2 ----
                        menuItem2.setText(bundle.getString("menuItem2.text"));
                        menu9.add(menuItem2);
                    }
                    menu3.add(menu9);
                }
                menuBar1.add(menu3);

                //======== menu10 ========
                {
                    menu10.setText(bundle.getString("menu10.text"));

                    //======== menu11 ========
                    {
                        menu11.setText(bundle.getString("menu11.text"));

                        //---- menuItem8 ----
                        menuItem8.setText(bundle.getString("menuItem8.text"));
                        menu11.add(menuItem8);
                    }
                    menu10.add(menu11);

                    //======== menu12 ========
                    {
                        menu12.setText(bundle.getString("menu12.text"));

                        //---- menuItem10 ----
                        menuItem10.setText(bundle.getString("menuItem10.text"));
                        menu12.add(menuItem10);
                    }
                    menu10.add(menu12);
                }
                menuBar1.add(menu10);

                //======== menu13 ========
                {
                    menu13.setText(bundle.getString("menu13.text"));

                    //---- menuItem11 ----
                    menuItem11.setText(bundle.getString("menuItem11.text"));
                    menuItem11.addActionListener(e -> menuItem11(e));
                    menu13.add(menuItem11);

                    //---- menuItem12 ----
                    menuItem12.setText(bundle.getString("menuItem12.text"));
                    menu13.add(menuItem12);

                    //---- menuItem13 ----
                    menuItem13.setText(bundle.getString("menuItem13.text"));
                    menu13.add(menuItem13);
                }
                menuBar1.add(menu13);
            }

            GroupLayout dialogPaneLayout = new GroupLayout(dialogPane);
            dialogPane.setLayout(dialogPaneLayout);
            dialogPaneLayout.setHorizontalGroup(
                dialogPaneLayout.createParallelGroup()
                    .addGroup(dialogPaneLayout.createSequentialGroup()
                        .addComponent(menuBar1, GroupLayout.PREFERRED_SIZE, 690, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            dialogPaneLayout.setVerticalGroup(
                dialogPaneLayout.createParallelGroup()
                    .addGroup(dialogPaneLayout.createSequentialGroup()
                        .addGroup(dialogPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(menuBar1, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addComponent(label1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
        }

        //======== panel1 ========
        {

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addComponent(desktopPane1, GroupLayout.DEFAULT_SIZE, 926, Short.MAX_VALUE)
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addComponent(desktopPane1, GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(dialogPane, GroupLayout.DEFAULT_SIZE, 932, Short.MAX_VALUE)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(dialogPane, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel dialogPane;
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
    private JMenu menu3;
    private JMenu menu8;
    private JMenuItem menuItem1;
    private JMenu menu9;
    private JMenuItem menuItem2;
    private JMenu menu10;
    private JMenu menu11;
    private JMenuItem menuItem8;
    private JMenu menu12;
    private JMenuItem menuItem10;
    private JMenu menu13;
    private JMenuItem menuItem11;
    private JMenuItem menuItem12;
    private JMenuItem menuItem13;
    private JLabel label1;
    private JPanel panel1;
    private JDesktopPane desktopPane1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
