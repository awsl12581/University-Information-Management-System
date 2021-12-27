/*
 * Created by JFormDesigner on Mon Dec 27 19:10:06 CST 2021
 */

package com.liguo.studentinformationmanagementsystem.view.component;

import com.liguo.studentinformationmanagementsystem.entity.Student;
import com.liguo.studentinformationmanagementsystem.pojo.StudentVO;
import com.liguo.studentinformationmanagementsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.table.*;

/**
 * @author unknown
 */
@Controller
public class StudentList extends JInternalFrame {

    @Autowired
    StudentService studentService;

    public StudentList() {
        initComponents();
    }

    //所有，班级，学号
    private void button1(ActionEvent e) {
        String s = this.comboBox1.getSelectedItem().toString();
        System.out.println(s);
        StudentVO studentVO=new StudentVO();
        if("班级".equals(s)){
            studentVO.setClassId(this.textField1.getText());
        } else if("学号".equals(s)){
            studentVO.setStudentId(this.textField1.getText());
        }
        System.out.println(studentVO.toString());
        ArrayList<Student> studentOrListByStudent = studentService.findStudentOrListByStudentVO(studentVO);

        //列表
        DefaultTableModel defaultTableModel = (DefaultTableModel) this.table1.getModel();
        defaultTableModel.setRowCount(0);

        Vector<String> rowLine = null;
        Student student = null;
        //变量用在循环内
        while (!studentOrListByStudent.isEmpty()) {
            rowLine = new Vector<>();

            student = studentOrListByStudent.get(0);

            rowLine.add(student.getStudentId());
            rowLine.add(student.getStudentName());
            rowLine.add(student.getSex());
            rowLine.add(student.getStudentClass());
            rowLine.add(student.getStudentTel());
            rowLine.add(student.getStudentQq());

            defaultTableModel.addRow(rowLine);
            studentOrListByStudent.remove(0);
        }

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        ResourceBundle bundle = ResourceBundle.getBundle("form");
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        label1 = new JLabel();
        comboBox1 = new JComboBox<>();
        textField1 = new JTextField();
        button1 = new JButton();

        //======== this ========
        setVisible(true);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle(bundle.getString("this.title"));
        var contentPane = getContentPane();

        //======== scrollPane1 ========
        {

            //---- table1 ----
            table1.setModel(new DefaultTableModel(
                new Object[][] {
                    {null, null, null, null, null, null},
                },
                new String[] {
                    "\u5b66\u53f7", "\u59d3\u540d", "\u6027\u522b", "\u73ed\u7ea7", "\u7535\u8bdd", "QQ"
                }
            ));
            scrollPane1.setViewportView(table1);
        }

        //---- label1 ----
        label1.setText(bundle.getString("label1.text_2"));

        //---- comboBox1 ----
        comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
            "\u6240\u6709",
            "\u5b66\u53f7",
            "\u73ed\u7ea7"
        }));

        //---- button1 ----
        button1.setText(bundle.getString("button1.text_2"));
        button1.addActionListener(e -> button1(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 854, Short.MAX_VALUE)
                    .addContainerGap())
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(button1)
                    .addContainerGap(444, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label1)
                        .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button1))
                    .addGap(43, 43, 43)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(156, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JScrollPane scrollPane1;
    private JTable table1;
    private JLabel label1;
    private JComboBox<String> comboBox1;
    private JTextField textField1;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
