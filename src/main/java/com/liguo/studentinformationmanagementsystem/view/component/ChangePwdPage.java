
package com.liguo.studentinformationmanagementsystem.view.component;

import com.liguo.studentinformationmanagementsystem.entity.User;
import com.liguo.studentinformationmanagementsystem.pojo.UserVO;
import com.liguo.studentinformationmanagementsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ResourceBundle;

@Controller
public class ChangePwdPage extends JInternalFrame {

    @Autowired
    UserService userService;

    private boolean isReady = false;

    private User user;

    public void setUser(User user) {
        this.user = user;
    }

    public ChangePwdPage() {
        initComponents();
    }

    private void button1(ActionEvent e) {
        isReady = false;
        String s = String.valueOf(this.passwordField1.getPassword());
        UserVO userVO = new UserVO();
        userVO.setUsername(this.user.getUsername());
        userVO.setPassword(s);
        User user = userService.userLogin(userVO);
        if (user == null || "".equals(user)) {
            JOptionPane.showMessageDialog(null, "密码错误哦");
        }

        isReady = true;
        this.button1.setBackground(Color.green);
    }

    private void button2(ActionEvent e) {
        if (!isReady) {
            JOptionPane.showMessageDialog(null, "先验证密码哦");
            return;
        }
        String s1 = String.valueOf(this.passwordField2.getPassword());
        String s2 = String.valueOf(this.passwordField3.getPassword());
        System.out.println(s1 + "{************}" + s2);
        if ((!s1.equals(s2)) || s1 == null || s2 == null || "".equals(s1) || "".equals(s2)) {
            JOptionPane.showMessageDialog(null, "新密码设置有问题");
            return;
        }
        isReady = false;
        this.button1.setBackground(Color.red);

        User user1 = new User();
        user1.setUsername(this.user.getUsername());
        user1.setPassword(s1);
        int i = userService.updatePrivilege(user1);
        if (i != 0) {
            JOptionPane.showMessageDialog(null, "更改成功");
        } else {
            JOptionPane.showMessageDialog(null, "好像没有这个信息");
        }

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        ResourceBundle bundle = ResourceBundle.getBundle("form");
        label1 = new JLabel();
        button1 = new JButton();
        label2 = new JLabel();
        label3 = new JLabel();
        button2 = new JButton();
        passwordField1 = new JPasswordField();
        passwordField2 = new JPasswordField();
        passwordField3 = new JPasswordField();

        //======== this ========
        setVisible(true);
        setTitle(bundle.getString("this.title_7"));
        setIconifiable(true);
        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        var contentPane = getContentPane();

        //---- label1 ----
        label1.setText(bundle.getString("label1.text_6"));

        //---- button1 ----
        button1.setText(bundle.getString("button1.text_5"));
        button1.addActionListener(e -> button1(e));

        //---- label2 ----
        label2.setText(bundle.getString("label2.text_6"));

        //---- label3 ----
        label3.setText(bundle.getString("label3.text_6"));

        //---- button2 ----
        button2.setText(bundle.getString("button2.text_5"));
        button2.addActionListener(e -> button2(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(134, 134, 134)
                                                .addComponent(button1))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addComponent(label3)
                                                        .addGroup(contentPaneLayout.createParallelGroup()
                                                                .addComponent(label1)
                                                                .addComponent(label2)))
                                                .addGap(18, 18, 18)
                                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(passwordField1, GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                                        .addComponent(passwordField2, GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                                        .addComponent(passwordField3, GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(134, 134, 134)
                                                .addComponent(button2)))
                                .addContainerGap(108, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(label1)
                                        .addComponent(passwordField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(button1)
                                .addGap(18, 18, 18)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(label2)
                                        .addComponent(passwordField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(label3)
                                        .addComponent(passwordField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(button2)
                                .addContainerGap(17, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JLabel label1;
    private JButton button1;
    private JLabel label2;
    private JLabel label3;
    private JButton button2;
    private JPasswordField passwordField1;
    private JPasswordField passwordField2;
    private JPasswordField passwordField3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
