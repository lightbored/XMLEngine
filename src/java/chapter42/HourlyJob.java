/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter42;

/**
 *
 * @author light
 */
public class HourlyJob implements Runnable {
    
    @Override
    public void run() {
        System.out.println("Hourly job triggered by scheduler");
    }
}
