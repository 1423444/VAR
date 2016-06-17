/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unternehmensclient;

import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
import java.util.List;

/**
 *
 * @author heart
 */
public class UnternehmensGUI {
    
    private static String depLocation = "HQ";
    private static String destLocation = "HQ";
    private static boolean travelTime = false;
    
    
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setTitle("Business Travel Planner");
        frame.setSize(900, 300);
        JPanel panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY);
        
        JButton button = new JButton("Display Information!");
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                List resultList = UnternehmensClient.getDistance(depLocation, destLocation);
                String resultString = "Distance: " + (String)resultList.get(1);
                if(travelTime){
                    resultString = resultString + ", Traveltime: " + resultList.get(0);
                }
                JTextField answer = new JTextField();
                answer.setSize(200, 200);
                answer.setText(resultString);
                JOptionPane.showInternalMessageDialog(panel, answer);
            }
        });
        

        
        String depList[] = {"Mannheim Headquarters", "Office Munich", "Office Hamburg","Office Berlin"};
        JComboBox depBox = new JComboBox(depList);
        depBox.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JComboBox cb = (JComboBox)e.getSource();
                switch ((String)cb.getSelectedItem()){
                    case "Mannheim Headquarters":
                        depLocation = "HQ";
                        break;
                    case "Office Munich":
                        depLocation = "OM";
                        break;
                    case "Office Hamburg":
                        depLocation = "OH";
                        break;
                    case "Office Berlin":
                        depLocation = "OB";
                        break;
                    default:
                        depLocation = "HQ";
                }
            }
        });
        
        String destList[] = {"Mannheim Headquarters", "Office Munich", "Office Hamburg","Office Berlin"};
        JComboBox destBox = new JComboBox(destList);
        destBox.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JComboBox cb = (JComboBox)e.getSource();
                switch ((String)cb.getSelectedItem()){
                    case "Mannheim Headquarters":
                        destLocation = "HQ";
                        break;
                    case "Office Munich":
                        destLocation = "OM";
                        break;
                    case "Office Hamburg":
                        destLocation = "OH";
                        break;
                    case "Office Berlin":
                        destLocation = "OB";
                        break;
                    default:
                        depLocation ="HQ";
                }
            }
        });
        
        JCheckBoxMenuItem timeCheckBox = new JCheckBoxMenuItem("Show Traveltime");
        timeCheckBox.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JCheckBoxMenuItem cb = (JCheckBoxMenuItem)e.getSource();
                travelTime = cb.getModel().isSelected();
            }
        });
        
        panel.add(depBox);
        panel.add(destBox);
        panel.add(timeCheckBox);
        panel.add(button);
        frame.add(panel);
                
        frame.setVisible(true);
    }
}
