/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginForm;
import MenuForm.*;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Acer
 */
public class LoginGUI extends LoginKomponen {
    MenuGUI objMenuGUI = new MenuGUI();
    LoginPegawai objAdmin = new LoginPegawai();
    public LoginGUI(){
        objMenuGUI.setVisible(false);
        
        
        JLlogin.setBounds(110,0,200,40);
        JLlogin.setFont(new Font("Arial",Font.BOLD,20));
        JLnama.setBounds(30,30,100,40);
        JLnama.setFont(new Font("Arial",Font.BOLD,14));
        JLpassword.setBounds(30,60,100,40);
        JLpassword.setFont(new Font("Arial",Font.BOLD,14));
        
        JTFnama.setBounds(110,40,140,20);
        JTFpassword.setBounds(110,70,140,20);
        
        JTFpassword.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String LogName = JTFnama.getText();
                String LogPassword = JTFpassword.getText();
                
                
                if(LogName.equals(objAdmin.getNama())&& LogPassword.equals(objAdmin.getPassword())){
                    objMenuGUI.setVisible(rootPaneCheckingEnabled);
                    setVisible(false);
                    
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Nama / Password salah!");
                }
            }
        });        
        JTFnama.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String LogName = JTFnama.getText();
                String LogPassword = JTFpassword.getText();
                
                
                if(LogName.equals(objAdmin.getNama())&& LogPassword.equals(objAdmin.getPassword())){
                    objMenuGUI.setVisible(rootPaneCheckingEnabled);
                    setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Nama / Password salah!");
                }
            }
        });
        
        add(JTFpassword);
        add(JLpassword);
        add(JTFnama);
        add(JLnama);
        add(JLlogin);
        setTitle("Project");
        setSize(300,150);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
