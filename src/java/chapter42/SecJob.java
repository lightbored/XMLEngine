/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter42;

import java.text.SimpleDateFormat;

/**
 *
 * @author light
 */
public class SecJob implements Runnable {
    
    @Override
    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        System.out.println("[" + sdf.format(new java.util.Date()) + "] 15 Second job triggered by scheduler ");
    }
}