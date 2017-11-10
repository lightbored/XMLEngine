/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter42;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author light
 */
public class GetData {
    public static void main(String args[]) throws MalformedURLException{
        String inline = "";
        URL url = new URL("https://us.api.battle.net/wow/character/malganis/Abeyspriest?fields=pets&locale=en_US&apikey=66semsq3ypygh4k9xpwyswz4sunphved");
        try {
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            int responsecode = conn.getResponseCode();
            
            if (responsecode != 200)
                throw new RuntimeException("HttpResponseCode: " + responsecode);
            else
            {
                System.out.println("Successful access");
                Scanner sc = new Scanner(url.openStream());
                while(sc.hasNext()){
                    inline+=sc.nextLine();
                }
                System.out.println("\nJSON data in string format");
                System.out.println(inline);
                sc.close();
            }
            
        } catch (IOException ex) {
            Logger.getLogger(GetData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
