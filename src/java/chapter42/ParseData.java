/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter42;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author lightbored
 */
public class ParseData {
    public static void main(String[] args){    
        JSONParser parser = new JSONParser();

        try {     
            Object obj = parser.parse(new FileReader("/Users/lightbored/Downloads/file.json"));

            JSONObject jsonObject =  (JSONObject) obj;

//    "pets": {
//        "numCollected": 460,
//        "numNotCollected": 526,
//        "collected": 
            Long lastModified = (Long) jsonObject.get("lastModified");
            System.out.println(lastModified);
            String name = (String) jsonObject.get("name");
            System.out.println(name);
            String realm = (String) jsonObject.get("realm");
            System.out.println(realm);
            String battlegroup = (String) jsonObject.get("battlegroup");
            System.out.println(battlegroup);
            Long wclass = (Long) jsonObject.get("class");
            System.out.println(wclass);
            Long race = (Long) jsonObject.get("race");
            System.out.println(race);
            Long gender = (Long) jsonObject.get("gender");
            System.out.println(gender);
            Long level = (Long) jsonObject.get("level");
            System.out.println(level);
            Long achievementPoints = (Long) jsonObject.get("achievementPoints");
            System.out.println(achievementPoints);
            String thumbnail = (String) jsonObject.get("thumbnail");
            System.out.println(thumbnail);
            String calcClass = (String) jsonObject.get("calcClass");
            System.out.println(calcClass);
            Long faction = (Long) jsonObject.get("faction");
            System.out.println(faction);


            // loop array
            JSONArray PetCollectedArray = (JSONArray) jsonObject.get("collected");
            for (Object PetCollectedArray1 : PetCollectedArray) {
                String pname = (String) jsonObject.get("name");
                System.out.println(pname);
                Long spellId = (Long) jsonObject.get("spellId");
                System.out.println(spellId);
                Long creatureId = (Long) jsonObject.get("creatureId");
                System.out.println(creatureId);
                Long itemId = (Long) jsonObject.get("itemId");
                System.out.println(itemId);
                Long qualityId = (Long) jsonObject.get("qualityId");
                System.out.println(qualityId);
            }
//            "icon": "inv_qirajidol_strife",
//            "stats": {
//                "speciesId": 1155,
//                "breedId": 6,
//                "petQualityId": 3,
//                "level": 25,
//                "health": 1725,
//                "power": 276,
//                "speed": 244
            //JSONArray pets = (JSONArray) jsonObject.get("cars");
            //Iterator<String> iterator = pets.iterator();
            //while (iterator.hasNext()) {
            // System.out.println(iterator.next());
            //}
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
