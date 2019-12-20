/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuForm;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Acer
 */
public class MenuKomponen extends JFrame{
    
    JLabel JLbarbershop = new JLabel ("===BARBERSHOP===");
    JLabel JLnama = new JLabel ("Nama");
    JLabel JLgender = new JLabel ("Gender");
    JLabel JLlayanan = new JLabel("Layanan");
    
    JButton JBcek = new JButton("cek");
    JButton JBtransaksi = new JButton("Transaksi");
    JButton JBexit = new JButton ("exit");

    JTextField JTFnama = new JTextField();
    JTextField JTFcek = new JTextField();
    
    
    JCheckBox JCBgenderpria = new JCheckBox("Pria");
    JCheckBox JCBgenderwanita = new JCheckBox("Wanita");
    
    String[]box = {"Potong Rambut","Semir","Keramas"};
    JComboBox JCBlayanan = new JComboBox(box);
    
    String []data = {"Nama","Layanan","Harga"};
    String [][]columnNames ={};
    JTable table = new JTable();
//    JTable table = new JTable(columnNames,data);
    DefaultTableModel model = new DefaultTableModel();
    
    
    
    JScrollPane ps = new JScrollPane(table);
    

}
