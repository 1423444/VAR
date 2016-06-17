/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unternehmensclient;

import java.util.List;

/**
 *
 * @author heart
 */
public class Test {
    public static void main(String[] args){
        List eins = UnternehmensClient.getDistance("HQ", "OM");
        System.out.println(eins.get(0));
                System.out.println(eins.get(1));

    }
    
}
