/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter42;

import java.io.FileWriter;
import java.util.UUID;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author light
 */
public class JSON_Writer {
    public static void main(String args[]) {
        try
        {
            // Create a new JSONObject
            JSONObject jsonObject = new JSONObject();
            
            // Add the values to the jsonObject
            jsonObject.put("Name", "www.javainterviewpoint.com");
            jsonObject.put("Age", "999");
            
            // Create a new JSONArray object
            JSONArray jsonArray = new JSONArray();
            
            // Add values to the jsonArray
            jsonArray.add("India");
            jsonArray.add("England");
            jsonArray.add("Australia");
            
            // Add the jsonArray to jsonObject
            jsonObject.put("Countries", jsonArray);
            
            // Build a dynamic filename
            String file_uid = getUUID();
            
            String filename = (file_uid + ".json");
            
            // Create a new FileWriter object
            FileWriter fileWriter = new FileWriter(filename);
            
            // Writing the jsonObject into sample.json
            fileWriter.write(jsonObject.toJSONString());
            fileWriter.close();
            
            System.out.println("JSON Object Successfully written to the file!!");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public static String getUUID() {
        UUID uuid = UUID.randomUUID();
        String randomUUIDString = uuid.toString();
        
        System.out.println("Random UUID String = " + randomUUIDString);
        System.out.println("UUID version       = " + uuid.version());
        System.out.println("UUID variant       = " + uuid.variant());
        return randomUUIDString;
}
    
}