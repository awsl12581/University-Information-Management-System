/*
 * Created by JFormDesigner on Tue Dec 28 15:01:59 CST 2021
 */

package com.liguo.studentinformationmanagementsystem.view.component;

import java.awt.event.*;
import javax.swing.table.*;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.listener.PageReadListener;
import com.liguo.studentinformationmanagementsystem.entity.Student;
import com.liguo.studentinformationmanagementsystem.entity.User;
import com.liguo.studentinformationmanagementsystem.service.UserService;
import com.liguo.studentinformationmanagementsystem.util.PermissionCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.beans.PropertyVetoException;
import java.util.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author unknown
 */
@Controller
public class UserPage extends JInternalFrame {

    @Autowired
    UserService userService;

    private User user;
    public void setUser(User user){
        this.user = user;
    }

    public UserPage() {
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private void button1(ActionEvent e) {
        String s=this.textField1.getText();
        List<User> users = userService.selectByUsername(s);
        this.setTableData(users);
    }


    /**
     * table更改
     * @param users
     */
    public void setTableData(List<User> users){
        //列表
        DefaultTableModel defaultTableModel = (DefaultTableModel) this.table1.getModel();
        defaultTableModel.setRowCount(0);

        Vector<String> rowLine = null;
        User user = null;
        for (int i = 0; i <users.size(); i++) {
            rowLine = new Vector<>();

            user = users.get(i);

            rowLine.add(user.getUsername());
            rowLine.add(user.getPrivilege());

            defaultTableModel.addRow(rowLine);
        }
    }

    private void table1MouseClicked(MouseEvent e) {
        //加载数据
        int row=this.table1.getSelectedRow();
        this.textField2.setText((String) this.table1.getValueAt(row,0));
        this.textField3.setText((String) this.table1.getValueAt(row,1));
        
    }

    private void button3(ActionEvent e) {
        //验证
        if(!PermissionCheck.isSatisfyPermissions(user,PermissionCheck.ADMINISTER_PERMISSION)){
            JOptionPane.showMessageDialog(null,"权限不足！");

            return;
        }
        User user=new User();
        user.setUsername(this.textField2.getText());
        String text = this.textField3.getText();
        if (Integer.valueOf(text)<=0){
            text="1";
        }else if (Integer.valueOf(text)>=3){
            text="3";
        }
        user.setPrivilege(text);
        userService.updatePrivilege(user);
    }

    private void button4(ActionEvent e) {
        if(!PermissionCheck.isSatisfyPermissions(user,PermissionCheck.ADMINISTER_PERMISSION)){
            JOptionPane.showMessageDialog(null,"权限不足！");

            return;
        }
        int i1 = JOptionPane.showConfirmDialog(null, "你确定要删除吗", "警告", JOptionPane.YES_NO_OPTION);
        if(i1!=0){
            return;
        }
        int i = userService.deleteUserByUsername(this.textField2.getText());
        if (i!=0){
            JOptionPane.showMessageDialog(null,"删除成功");
        }else{
            JOptionPane.showMessageDialog(null,"好像没有这个信息");
        }
    }

    private void button2(ActionEvent e) {
        //验证
        if(!PermissionCheck.isSatisfyPermissions(user,PermissionCheck.ADMINISTER_PERMISSION)){
            JOptionPane.showMessageDialog(null,"权限不足！");

            return;
        }
        //选择excel导入
        String fileName=null;

        JFileChooser fileChooser = new JFileChooser("F:");
        //只能选择文件
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        int returnVal = fileChooser.showOpenDialog(fileChooser);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            fileName = fileChooser.getSelectedFile().getAbsolutePath();
        }

        //读取excel
        EasyExcel.read(fileName, User.class, new PageReadListener<User>(dataList -> {
            //列表数据列出
            this.setTableData((ArrayList<User>) dataList);
            System.out.println(dataList.toString());
            //数据库写入
            this.userService.insertDataByExcel(dataList);
        })).sheet().doRead();
        
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        ResourceBundle bundle = ResourceBundle.getBundle("form");
        panel1 = new JPanel();
        label1 = new JLabel();
        textField1 = new JTextField();
        button1 = new JButton();
        button2 = new JButton();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        panel2 = new JPanel();
        label2 = new JLabel();
        textField2 = new JTextField();
        label3 = new JLabel();
        textField3 = new JTextField();
        button3 = new JButton();
        button4 = new JButton();

        //======== this ========
        setVisible(true);
        setTitle(bundle.getString("this.title_4"));
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setClosable(true);
        setFrameIcon(new ImageIcon(getClass().getResource("/static/image/\u5185\u5bb9\u6392\u5217.png")));
        var contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax
            . swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax. swing
            . border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .
            Font ("D\u0069alog" ,java .awt .Font .BOLD ,12 ), java. awt. Color. red
            ) ,panel1. getBorder( )) ); panel1. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override
            public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062order" .equals (e .getPropertyName (
            ) )) throw new RuntimeException( ); }} );

            //---- label1 ----
            label1.setText(bundle.getString("label1.text_5"));

            //---- button1 ----
            button1.setText(bundle.getString("button1.text_4"));
            button1.addActionListener(e -> button1(e));

            //---- button2 ----
            button2.setText(bundle.getString("button2.text_4"));
            button2.addActionListener(e -> button2(e));

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label1)
                        .addGap(18, 18, 18)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button1)
                        .addGap(18, 18, 18)
                        .addComponent(button2)
                        .addContainerGap(86, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label1)
                            .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(button1)
                            .addComponent(button2))
                        .addContainerGap())
            );
        }

        //======== scrollPane1 ========
        {

            //---- table1 ----
            table1.setModel(new DefaultTableModel(
                new Object[][] {
                    {null, null},
                    {null, null},
                },
                new String[] {
                    "\u7528\u6237", "\u6743\u9650"
                }
            ));
            table1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    table1MouseClicked(e);
                }
            });
            scrollPane1.setViewportView(table1);
        }

        //======== panel2 ========
        {

            //---- label2 ----
            label2.setText(bundle.getString("label2.text_5"));

            //---- textField2 ----
            textField2.setEnabled(false);

            //---- label3 ----
            label3.setText(bundle.getString("label3.text_5"));

            //---- button3 ----
            button3.setText(bundle.getString("button3.text_3"));
            button3.addActionListener(e -> button3(e));

            //---- button4 ----
            button4.setText(bundle.getString("button4.text_2"));
            button4.addActionListener(e -> button4(e));

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addComponent(label2)
                                .addGap(18, 18, 18)
                                .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addComponent(label3)
                                .addGap(18, 18, 18)
                                .addComponent(textField3)))
                        .addGap(18, 18, 18)
                        .addGroup(panel2Layout.createParallelGroup()
                            .addComponent(button3)
                            .addComponent(button4))
                        .addContainerGap(213, Short.MAX_VALUE))
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label2)
                            .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button3))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label3)
                            .addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button4))
                        .addContainerGap(101, Short.MAX_VALUE))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                        .addComponent(panel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(panel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel panel1;
    private JLabel label1;
    private JTextField textField1;
    private JButton button1;
    private JButton button2;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JPanel panel2;
    private JLabel label2;
    private JTextField textField2;
    private JLabel label3;
    private JTextField textField3;
    private JButton button3;
    private JButton button4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
