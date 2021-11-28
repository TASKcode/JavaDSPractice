package com.code.sample.json;

import java.io.FileReader;

public class JsonMapping {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        try {

            // Put above JSON content to crunchify.txt file and change path location
            Object obj = parser.parse(new FileReader("/Users/appshah/Documents/crunchify.txt"));
            JSONObject jsonObject = (JSONObject) obj;

            // JsonFlattener: A Java utility used to FLATTEN nested JSON objects
            String flattenedJson = JsonFlattener.flatten(jsonObject.toString());
            log("\n=====Simple Flatten===== \n" + flattenedJson);

            Map<String, Object> flattenedJsonMap = JsonFlattener.flattenAsMap(jsonObject.toString());

            log("\n=====Flatten As Map=====\n" + flattenedJson);
            // We are using Java8 forEach loop. More info: http://crunchify.me/1VIwm0l
            flattenedJsonMap.forEach((k, v) -> log(k + " : " + v));

            // Unflatten it back to original JSON
            String nestedJson = JsonUnflattener.unflatten(flattenedJson);
            System.out.println("\n=====Unflatten it back to original JSON===== \n" + nestedJson);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void log(String flattenedJson) {
        System.out.println(flattenedJson);

    }
}
