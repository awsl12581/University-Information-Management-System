/*
 * Created by JFormDesigner on Fri Dec 24 22:45:03 CST 2021
 */

package com.liguo.studentinformationmanagementsystem.view.mainview;

import com.liguo.studentinformationmanagementsystem.entity.User;
import com.liguo.studentinformationmanagementsystem.view.component.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;

import static java.lang.System.exit;

/**
 * @author unknown
 */
@Controller
public class MainPage extends JFrame {


    @Autowired
    StudentList studentList;
    @Autowired
    TeacherList teacherList;
    @Autowired
    UserPage userPage;
    @Autowired
    ChangePwdPage changePwdPage;

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

    private void menuItem6(ActionEvent e) {
        userPage.setVisible(true);
        userPage.setUser(user);
        userPage.setSize(640,640);
        userPage.setResizable(true);
        desktopPane1.add(userPage);
    }

    private void menuItem13(ActionEvent e) {
        this.user=null;
        exit(0);
    }

    private void menuItem12(ActionEvent e) {
        //修改密码需要现在的密码
        changePwdPage.setVisible(true);
        changePwdPage.setUser(user);
        changePwdPage.setSize(640,640);
        changePwdPage.setResizable(true);
        desktopPane1.add(changePwdPage);

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
        menu6 = new JMenu();
        menuItem6 = new JMenuItem();
        menu13 = new JMenu();
        menuItem11 = new JMenuItem();
        menuItem12 = new JMenuItem();
        menuItem13 = new JMenuItem();
        label1 = new JLabel();
        panel2 = new JPanel();
        desktopPane1 = new JDesktopPane();

        //======== this ========
        setTitle(bundle.getString("this.title_6"));
        setIconImage(new ImageIcon(getClass().getResource("/static/image/\u5185\u5bb9\u6392\u5217.png")).getImage());
        var contentPane = getContentPane();

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setBackground(new Color(204, 255, 204));
            dialogPane.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing. border .EmptyBorder
            ( 0, 0 ,0 , 0) ,  "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e" , javax. swing .border . TitledBorder. CENTER ,javax . swing. border
            .TitledBorder . BOTTOM, new java. awt .Font ( "D\u0069al\u006fg", java .awt . Font. BOLD ,12 ) ,java . awt
            . Color .red ) ,dialogPane. getBorder () ) ); dialogPane. addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override public void
            propertyChange (java . beans. PropertyChangeEvent e) { if( "\u0062or\u0064er" .equals ( e. getPropertyName () ) )throw new RuntimeException( )
            ;} } );

            //======== menuBar1 ========
            {
                menuBar1.setBackground(new Color(255, 255, 204));

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

                    //======== menu6 ========
                    {
                        menu6.setText(bundle.getString("menu6.text"));

                        //---- menuItem6 ----
                        menuItem6.setText(bundle.getString("menuItem6.text"));
                        menuItem6.addActionListener(e -> menuItem6(e));
                        menu6.add(menuItem6);
                    }
                    menu1.add(menu6);
                }
                menuBar1.add(menu1);

                //======== menu13 ========
                {
                    menu13.setText(bundle.getString("menu13.text"));

                    //---- menuItem11 ----
                    menuItem11.setText(bundle.getString("menuItem11.text"));
                    menuItem11.addActionListener(e -> menuItem11(e));
                    menu13.add(menuItem11);

                    //---- menuItem12 ----
                    menuItem12.setText(bundle.getString("menuItem12.text"));
                    menuItem12.addActionListener(e -> menuItem12(e));
                    menu13.add(menuItem12);

                    //---- menuItem13 ----
                    menuItem13.setText(bundle.getString("menuItem13.text"));
                    menuItem13.addActionListener(e -> menuItem13(e));
                    menu13.add(menuItem13);
                }
                menuBar1.add(menu13);
            }

            //---- label1 ----
            label1.setBackground(new Color(255, 153, 153));

            GroupLayout dialogPaneLayout = new GroupLayout(dialogPane);
            dialogPane.setLayout(dialogPaneLayout);
            dialogPaneLayout.setHorizontalGroup(
                dialogPaneLayout.createParallelGroup()
                    .addGroup(dialogPaneLayout.createSequentialGroup()
                        .addComponent(menuBar1, GroupLayout.PREFERRED_SIZE, 690, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE))
            );
            dialogPaneLayout.setVerticalGroup(
                dialogPaneLayout.createParallelGroup()
                    .addGroup(dialogPaneLayout.createSequentialGroup()
                        .addGroup(dialogPaneLayout.createParallelGroup()
                            .addGroup(dialogPaneLayout.createSequentialGroup()
                                .addComponent(menuBar1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(label1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
            );
        }

        //======== panel2 ========
        {

            //======== desktopPane1 ========
            {
                desktopPane1.setBackground(new Color(102, 255, 255));
            }

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(desktopPane1, GroupLayout.PREFERRED_SIZE, 919, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(desktopPane1, GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(dialogPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(dialogPane, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(panel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    private JMenu menu6;
    private JMenuItem menuItem6;
    private JMenu menu13;
    private JMenuItem menuItem11;
    private JMenuItem menuItem12;
    private JMenuItem menuItem13;
    private JLabel label1;
    private JPanel panel2;
    private JDesktopPane desktopPane1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
