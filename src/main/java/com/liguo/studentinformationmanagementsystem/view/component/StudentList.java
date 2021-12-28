/*
 * Created by JFormDesigner on Mon Dec 27 19:10:06 CST 2021
 */

package com.liguo.studentinformationmanagementsystem.view.component;

import ch.qos.logback.core.util.FileUtil;
import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.listener.PageReadListener;
import com.liguo.studentinformationmanagementsystem.entity.Student;
import com.liguo.studentinformationmanagementsystem.entity.User;
import com.liguo.studentinformationmanagementsystem.pojo.StudentVO;
import com.liguo.studentinformationmanagementsystem.service.StudentService;
import com.liguo.studentinformationmanagementsystem.util.PermissionCheck;
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

    private User user;
    public void setUser(User user) {
        this.user = user;
    }

    @Autowired
    StudentService studentService;

    public StudentList() {
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
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

        this.setTableData(studentOrListByStudent);

    }

    public void setTableData(ArrayList<Student> studentList){
        //列表
        DefaultTableModel defaultTableModel = (DefaultTableModel) this.table1.getModel();
        defaultTableModel.setRowCount(0);

        Vector<String> rowLine = null;
        Student student = null;
        for (int i = 0; i <studentList.size(); i++) {
            rowLine = new Vector<>();

            student = studentList.get(i);

            rowLine.add(student.getStudentId());
            rowLine.add(student.getStudentName());
            rowLine.add(student.getSex());
            rowLine.add(student.getStudentClass());
            rowLine.add(student.getStudentTel());
            rowLine.add(student.getStudentQq());

            defaultTableModel.addRow(rowLine);
        }
    }



    private void button2(ActionEvent e) {
        //验证
        if(!PermissionCheck.isSatisfyPermissions(user,PermissionCheck.ADVANCED_PERMISSION)){
            return;
        }

        Student student=new Student();
        student.setStudentId(this.textField2.getText());
        student.setStudentName(this.textField3.getText());
        student.setSex(this.textField4.getText());
        student.setStudentClass(this.textField5.getText());
        student.setStudentTel(this.textField6.getText());
        student.setStudentQq(this.textField7.getText());

        int i = studentService.updateStudentMsgByStudentId(student);
        if (i!=0){
            JOptionPane.showMessageDialog(null,"更新成功");
        }else{
            JOptionPane.showMessageDialog(null,"好像没有这个信息");
        }

    }

    /**
     * 修改数据设置函数
     * @param student
     */
    private void setFieldData(Student student){
        this.textField2.setText(student.getStudentId());
        this.textField3.setText(student.getStudentName());
        this.textField4.setText(student.getSex());
        this.textField5.setText(student.getStudentClass());
        this.textField6.setText(student.getStudentTel());
        this.textField7.setText(student.getStudentQq());
    }

    private void table1MouseClicked(MouseEvent e) {
        int row=this.table1.getSelectedRow();
        Student student = new Student();
        student.setStudentId((String) this.table1.getValueAt(row,0));
        student.setStudentName((String) this.table1.getValueAt(row,1));
        student.setSex((String) this.table1.getValueAt(row,2));
        student.setStudentClass((String) this.table1.getValueAt(row,3));
        student.setStudentTel((String) this.table1.getValueAt(row,4));
        student.setStudentQq((String) this.table1.getValueAt(row,5));
        //传入参数
        this.setFieldData(student);
    }

    private void button3(ActionEvent e) {
        if(!PermissionCheck.isSatisfyPermissions(user,PermissionCheck.ADMINISTER_PERMISSION)){
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
        EasyExcel.read(fileName, Student.class, new PageReadListener<Student>(dataList -> {
            List<Student> copyStudents=dataList;
            //列表数据列出
            this.setTableData((ArrayList<Student>) dataList);
            System.out.println(copyStudents.toString());
            //数据库写入
            this.studentService.insertDataByExcel(copyStudents);
        })).sheet().doRead();

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        ResourceBundle bundle = ResourceBundle.getBundle("form");
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        panel1 = new JPanel();
        textField2 = new JTextField();
        label2 = new JLabel();
        textField3 = new JTextField();
        label3 = new JLabel();
        textField5 = new JTextField();
        textField6 = new JTextField();
        label5 = new JLabel();
        label6 = new JLabel();
        button2 = new JButton();
        label4 = new JLabel();
        textField4 = new JTextField();
        textField7 = new JTextField();
        label7 = new JLabel();
        panel2 = new JPanel();
        label1 = new JLabel();
        comboBox1 = new JComboBox<>();
        textField1 = new JTextField();
        button1 = new JButton();
        button3 = new JButton();

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
            table1.setCellSelectionEnabled(true);
            table1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    table1MouseClicked(e);
                }
            });
            scrollPane1.setViewportView(table1);
        }

        //======== panel1 ========
        {
            panel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing.
            border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax. swing. border. TitledBorder. CENTER
            , javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font
            .BOLD ,12 ), java. awt. Color. red) ,panel1. getBorder( )) ); panel1. addPropertyChangeListener (
            new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062ord\u0065r"
            .equals (e .getPropertyName () )) throw new RuntimeException( ); }} );

            //---- textField2 ----
            textField2.setEditable(false);

            //---- label2 ----
            label2.setText(bundle.getString("label2.text_3"));

            //---- label3 ----
            label3.setText(bundle.getString("label3.text_3"));

            //---- label5 ----
            label5.setText(bundle.getString("label5.text"));

            //---- label6 ----
            label6.setText(bundle.getString("label6.text"));

            //---- button2 ----
            button2.setText(bundle.getString("button2.text_2"));
            button2.addActionListener(e -> button2(e));

            //---- label4 ----
            label4.setText(bundle.getString("label4.text"));

            //---- label7 ----
            label7.setText(bundle.getString("label7.text"));

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(label2)
                                    .addComponent(label3))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textField2, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                    .addComponent(textField3)))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(label4)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textField4, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(label7)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                .addComponent(textField7, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(label5)
                                    .addComponent(label6))
                                .addGap(18, 18, 18)
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textField5, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                    .addComponent(textField6))))
                        .addGap(33, 33, 33)
                        .addComponent(button2)
                        .addContainerGap(273, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2)
                            .addComponent(textField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5)
                            .addComponent(button2))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label3)
                            .addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label6)
                            .addComponent(textField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(textField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label4)))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(textField7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label7))))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
        }

        //======== panel2 ========
        {

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

            //---- button3 ----
            button3.setText(bundle.getString("button3.text"));
            button3.addActionListener(e -> button3(e));

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button1)
                        .addGap(69, 69, 69)
                        .addComponent(button3)
                        .addContainerGap(304, Short.MAX_VALUE))
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label1)
                            .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button1)
                            .addComponent(button3))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(panel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 848, Short.MAX_VALUE))
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JScrollPane scrollPane1;
    private JTable table1;
    private JPanel panel1;
    private JTextField textField2;
    private JLabel label2;
    private JTextField textField3;
    private JLabel label3;
    private JTextField textField5;
    private JTextField textField6;
    private JLabel label5;
    private JLabel label6;
    private JButton button2;
    private JLabel label4;
    private JTextField textField4;
    private JTextField textField7;
    private JLabel label7;
    private JPanel panel2;
    private JLabel label1;
    private JComboBox<String> comboBox1;
    private JTextField textField1;
    private JButton button1;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
