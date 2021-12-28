/*
 * Created by JFormDesigner on Tue Dec 28 10:58:22 CST 2021
 */

package com.liguo.studentinformationmanagementsystem.view.component;

import java.awt.event.*;
import javax.swing.table.*;

import com.liguo.studentinformationmanagementsystem.entity.Student;
import com.liguo.studentinformationmanagementsystem.entity.Teacher;
import com.liguo.studentinformationmanagementsystem.entity.User;
import com.liguo.studentinformationmanagementsystem.pojo.TeacherVO;
import com.liguo.studentinformationmanagementsystem.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author unknown
 */
@Controller
public class TeacherList extends JInternalFrame {
    private User user;
    @Autowired
    TeacherService teacherService;

    public TeacherList() {
        initComponents();
    }

    private void button1(ActionEvent e) {
        String s=this.comboBox1.getSelectedItem().toString();
        TeacherVO teacherVO=new TeacherVO();
        if ("teacherId".equals(s)){
            teacherVO.setTeacherId(this.textField1.getText());
        }else if("teacherName".equals(s)){
            teacherVO.setTeacherName(this.textField1.getText());
        }else if ("faculty".equals(s)){
            teacherVO.setTeacherName(this.textField1.getText());
        }
        System.out.println(teacherVO.toString());

        ArrayList<Teacher> teacherArrayList=teacherService.findStudentOrListByStudentVO(teacherVO);

        this.setTableData(teacherArrayList);
    }

    public void setTableData(ArrayList<Teacher> teacherList){
        //列表
        DefaultTableModel defaultTableModel = (DefaultTableModel) this.table1.getModel();
        defaultTableModel.setRowCount(0);
        //职工，姓名，性别，电话，部门
        Vector<String> rowLine = null;
        Teacher teacher = null;
        for (int i = 0; i <teacherList.size(); i++) {
            rowLine = new Vector<>();

            teacher = teacherList.get(i);

            rowLine.add(teacher.getTeacherId());
            rowLine.add(teacher.getTeacherName());
            rowLine.add(teacher.getSex());
            rowLine.add(teacher.getTeacherTel());
            rowLine.add(teacher.getFaculty());

            defaultTableModel.addRow(rowLine);
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        ResourceBundle bundle = ResourceBundle.getBundle("form");
        panel1 = new JPanel();
        label1 = new JLabel();
        comboBox1 = new JComboBox<>();
        textField1 = new JTextField();
        button1 = new JButton();
        button3 = new JButton();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        panel2 = new JPanel();
        label2 = new JLabel();
        textField2 = new JTextField();
        label3 = new JLabel();
        textField3 = new JTextField();
        label4 = new JLabel();
        textField4 = new JTextField();
        label5 = new JLabel();
        textField5 = new JTextField();
        label6 = new JLabel();
        textField6 = new JTextField();
        button2 = new JButton();

        //======== this ========
        setVisible(true);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle(bundle.getString("this.title_3"));
        var contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.
            border.EmptyBorder(0,0,0,0), "JFor\u006dDesi\u0067ner \u0045valu\u0061tion",javax.swing.border.TitledBorder.CENTER
            ,javax.swing.border.TitledBorder.BOTTOM,new java.awt.Font("Dia\u006cog",java.awt.Font
            .BOLD,12),java.awt.Color.red),panel1. getBorder()));panel1. addPropertyChangeListener(
            new java.beans.PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e){if("bord\u0065r"
            .equals(e.getPropertyName()))throw new RuntimeException();}});

            //---- label1 ----
            label1.setText(bundle.getString("label1.text_4"));

            //---- comboBox1 ----
            comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
                "all",
                "teacherId",
                "teacherName",
                "faculty"
            }));

            //---- button1 ----
            button1.setText(bundle.getString("button1.text_3"));
            button1.addActionListener(e -> button1(e));

            //---- button3 ----
            button3.setText(bundle.getString("button3.text_2"));

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(label1)
                        .addGap(18, 18, 18)
                        .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(button1)
                        .addGap(32, 32, 32)
                        .addComponent(button3)
                        .addContainerGap(171, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label1)
                            .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button1)
                            .addComponent(button3))
                        .addContainerGap(11, Short.MAX_VALUE))
            );
        }

        //======== scrollPane1 ========
        {

            //---- table1 ----
            table1.setModel(new DefaultTableModel(
                new Object[][] {
                },
                new String[] {
                    "\u804c\u5de5\u53f7", "\u59d3\u540d", "\u6027\u522b", "\u7535\u8bdd", "\u5b66\u9662"
                }
            ));
            scrollPane1.setViewportView(table1);
        }

        //======== panel2 ========
        {

            //---- label2 ----
            label2.setText(bundle.getString("label2.text_4"));

            //---- textField2 ----
            textField2.setEnabled(false);

            //---- label3 ----
            label3.setText(bundle.getString("label3.text_4"));

            //---- label4 ----
            label4.setText(bundle.getString("label4.text_2"));

            //---- label5 ----
            label5.setText(bundle.getString("label5.text_2"));

            //---- label6 ----
            label6.setText(bundle.getString("label6.text_2"));

            //---- button2 ----
            button2.setText(bundle.getString("button2.text_3"));

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(panel2Layout.createParallelGroup()
                            .addComponent(label2)
                            .addComponent(label3)
                            .addComponent(label4))
                        .addGap(18, 18, 18)
                        .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(textField2, GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(textField3, GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(textField4, GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(panel2Layout.createParallelGroup()
                            .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addComponent(label5)
                                    .addGap(18, 18, 18)
                                    .addComponent(textField5, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addComponent(label6)
                                    .addGap(18, 18, 18)
                                    .addComponent(textField6)))
                            .addComponent(button2))
                        .addContainerGap(279, Short.MAX_VALUE))
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label2)
                            .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5)
                            .addComponent(textField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label3)
                            .addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label6)
                            .addComponent(textField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label4)
                            .addComponent(textField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button2))
                        .addContainerGap(38, Short.MAX_VALUE))
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
                        .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
                        .addComponent(panel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(panel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    public void setUser(User user) {
        this.user = user;
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel panel1;
    private JLabel label1;
    private JComboBox<String> comboBox1;
    private JTextField textField1;
    private JButton button1;
    private JButton button3;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JPanel panel2;
    private JLabel label2;
    private JTextField textField2;
    private JLabel label3;
    private JTextField textField3;
    private JLabel label4;
    private JTextField textField4;
    private JLabel label5;
    private JTextField textField5;
    private JLabel label6;
    private JTextField textField6;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
