/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuForm;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Acer
 */
public class MenuGUI extends MenuKomponen {

    public MenuGUI(){
        
        
        JLbarbershop.setBounds(110,20,300,50);
        JLbarbershop.setFont(new Font("Arial",Font.BOLD,20));
        JLnama.setBounds(100,100,100,100);
        JLnama.setFont(new Font("Arial",Font.BOLD,14));
        JLgender.setBounds(100,150,100,100);
        JLgender.setFont(new Font("Arial",Font.BOLD,14));
        JLlayanan.setBounds(100,200,100,100);
        JLlayanan.setFont(new Font("Arial",Font.BOLD,14));
        
        JBcek.setBounds(100,300,237,25);
        JBtransaksi.setBounds(100,400,100,25);
        JBexit.setBounds(239,400,100,25);
        
        JTFnama.setBounds(160,140,170,25);
        JTFcek.setBounds(100,350,237,35);
        JTFcek.setFont(new Font("Arial",Font.BOLD,20));
        JTFcek.setEditable(false);
        
        JCBgenderpria.setBounds(160,175,50,50);
        JCBgenderwanita.setBounds(220,175,100,50);
        JCBlayanan.setBounds(160,237,175,25);
        
        //
        Object[]columns={"Nama","Layanan","Harga"};
        DefaultTableModel model = new DefaultTableModel();
        
        model.setColumnIdentifiers(columns);
        
        table.setModel(model);
        
        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(20,450,385,75);
        
        Object[]row = new Object[3];
        
        table.setBackground(Color.lightGray);
        table.setForeground(Color.black);

        //
//        ps.setBounds(20,450,385,75);


        
        JBcek.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(JCBgenderpria.isSelected()&&JCBlayanan.getSelectedIndex()==0){
                    JTFcek.setText("Rp.15000");
                }if(JCBgenderpria.isSelected()&&JCBlayanan.getSelectedIndex()==1){
                    JTFcek.setText("Rp.35000");
                }if(JCBgenderpria.isSelected()&&JCBlayanan.getSelectedIndex()==2){
                    JTFcek.setText("Rp.50000");
                }if(JCBgenderwanita.isSelected()&&JCBlayanan.getSelectedIndex()==0){
                    JTFcek.setText("Rp.20000");
                }if(JCBgenderwanita.isSelected()&&JCBlayanan.getSelectedIndex()==1){
                    JTFcek.setText("Rp.45000");
                }if(JCBgenderwanita.isSelected()&&JCBlayanan.getSelectedIndex()==2){
                    JTFcek.setText("Rp.75000");
                }if(JCBgenderpria.isSelected()&&JCBgenderwanita.isSelected()){
                    JOptionPane.showMessageDialog(rootPane,"harap pilih satu gender!");
                }
        }});
        
        JBtransaksi.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                if(JTFnama.getText().isEmpty()){
                    JOptionPane.showMessageDialog(ps,"Harap isi Nama!!!");
                }else{                
                             row[0] = JTFnama.getText();
                             row[1] = JCBlayanan.getSelectedItem();
                             row[2] = JTFcek.getText();
                            model.addRow(row);
                            
                }
            }
        });
        
        JBexit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                 int result = JOptionPane.showConfirmDialog(null,"Are you sure ?","Confirm Exit",JOptionPane.OK_CANCEL_OPTION );
                 if(result ==JOptionPane.OK_OPTION){
                     System.exit(0);
                 }
            }
        });

//        add(ps);
        add(pane);
        add(JBexit);
        add(JBtransaksi);
        add(JTFcek);
        add(JBcek);
        add(JLgender);
        add(JLlayanan);
        add(JCBgenderwanita);
        add(JCBgenderpria);
        add(JTFnama);
        add(JLnama);
        add(JCBlayanan);
        add(JLbarbershop);
        setTitle("Project_Barbershop");

        setSize(450,650);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
