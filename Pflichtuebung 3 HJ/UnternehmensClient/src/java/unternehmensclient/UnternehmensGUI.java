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
    
    private static String depLocation;
    private static String destLocation;
    private static boolean travelTime = false;
    
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setTitle("Business Travel Planner");
        frame.setSize(900, 900);
        
        JButton button = new JButton("Display Information!");
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                List resultList = UnternehmensClient.getDistance(depLocation, destLocation);
                String resultString = "Distance: " + (String)resultList.get(0);
                if(travelTime){
                    resultString = resultString + ", Traveltime: " + resultList.get(1);
                }
                JTextField answer = new JTextField();
                answer.setSize(200, 200);
                answer.setText(resultString);
                frame.add(answer);
            }
        });
        
        JPanel panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY);
        
        String depList[] = {"Mannheim Headquarters", "Office Munich", "Office Hamburg","Office Berlin"};
        JComboBox depBox = new JComboBox(depList);
        depBox.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JComboBox cb = (JComboBox)e.getSource();
                switch ((String)cb.getSelectedItem()){
                    case "Mannheim Headquarters":
                        depLocation = "HW";
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
                        destLocation = "HW";
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
