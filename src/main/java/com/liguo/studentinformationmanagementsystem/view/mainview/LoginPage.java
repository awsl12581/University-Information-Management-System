/*
 * Created by JFormDesigner on Mon Dec 27 14:45:36 CST 2021
 */

package com.liguo.studentinformationmanagementsystem.view.mainview;

import com.liguo.studentinformationmanagementsystem.entity.User;
import com.liguo.studentinformationmanagementsystem.pojo.UserVO;
import com.liguo.studentinformationmanagementsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ResourceBundle;

@Controller
public class LoginPage extends JFrame {

    @Autowired
    UserService userService;

    @Autowired
    MainPage mainPage;

    public static void main(String[] args) {
        new LoginPage().setVisible(true);
    }

    public LoginPage() {
        initComponents();
        this.setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        //离开完全退出
    }

    private void button1(ActionEvent e) {
        UserVO userVO = new UserVO(this.textField1.getText(), String.valueOf(this.passwordField1.getPassword()));
        System.out.println(userVO.toString());
        User user = userService.userLogin(userVO);
        System.out.println(user.toString());
        if (user != null && !"".equals(user)) {
            //进入主框架
            mainPage.setVisible(true);
            //传入参数
            mainPage.setUserMsg(user);
            //销毁本框架
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "用户名或密码错误");
        }
    }

    private void button2(ActionEvent e) {
        this.textField1.setText("");
        this.passwordField1.setText("");
    }



















    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        ResourceBundle bundle = ResourceBundle.getBundle("form");
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        textField1 = new JTextField();
        label3 = new JLabel();
        passwordField1 = new JPasswordField();
        button1 = new JButton();
        button2 = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new
                    javax.swing.border.EmptyBorder(0, 0, 0, 0), "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e", javax
                    .swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java
                    .awt.Font("D\u0069al\u006fg", java.awt.Font.BOLD, 12), java.awt
                    .Color.red), dialogPane.getBorder()));
            dialogPane.addPropertyChangeListener(new java.beans.
                    PropertyChangeListener() {
                @Override
                public void propertyChange(java.beans.PropertyChangeEvent e) {
                    if ("\u0062or\u0064er".
                            equals(e.getPropertyName())) throw new RuntimeException();
                }
            });
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {

                //---- label1 ----
                label1.setText(bundle.getString("label1.text"));
                label1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));

                //---- label2 ----
                label2.setText(bundle.getString("label2.text"));

                //---- textField1 ----
                textField1.setText(bundle.getString("textField1.text"));

                //---- label3 ----
                label3.setText(bundle.getString("label3.text"));

                //---- button1 ----
                button1.setText(bundle.getString("button1.text"));
                button1.addActionListener(e -> button1(e));

                //---- button2 ----
                button2.setText(bundle.getString("button2.text"));
                button2.addActionListener(e -> button2(e));

                GroupLayout contentPanelLayout = new GroupLayout(contentPanel);
                contentPanel.setLayout(contentPanelLayout);
                contentPanelLayout.setHorizontalGroup(
                        contentPanelLayout.createParallelGroup()
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                        .addGroup(contentPanelLayout.createParallelGroup()
                                                .addGroup(contentPanelLayout.createSequentialGroup()
                                                        .addGap(98, 98, 98)
                                                        .addComponent(label1))
                                                .addGroup(contentPanelLayout.createSequentialGroup()
                                                        .addGap(45, 45, 45)
                                                        .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(label3, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                                                .addComponent(label2, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(textField1, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                                                .addComponent(passwordField1, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                                                .addGroup(contentPanelLayout.createSequentialGroup()
                                                        .addGap(90, 90, 90)
                                                        .addComponent(button1)
                                                        .addGap(52, 52, 52)
                                                        .addComponent(button2)))
                                        .addContainerGap(57, Short.MAX_VALUE))
                );
                contentPanelLayout.setVerticalGroup(
                        contentPanelLayout.createParallelGroup()
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(label2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(label3, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(passwordField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(button2)
                                                .addComponent(button1))
                                        .addContainerGap(45, Short.MAX_VALUE))
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
    private JLabel label1;
    private JLabel label2;
    private JTextField textField1;
    private JLabel label3;
    private JPasswordField passwordField1;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
