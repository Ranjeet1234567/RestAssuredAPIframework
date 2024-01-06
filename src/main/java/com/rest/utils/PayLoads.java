package com.rest.utils;

import java.util.HashMap;
import java.util.Map;

public class PayLoads {
    public static String createPayloadFromString(String name, String job, String id)
    {
        String payload="{\n" +
        "    \"name\": \""+name+"\",\n" +
                "    \"job\": \""+job+"\",\n" +
                "    \"id\": \""+id+"\",\n" +
                "    \"createdAt\": \"2024-01-05T09:25:16.036Z\"\n" +
                "}";
    return payload;
    }
    public static Map<String,Object>createPayloadFromMap(String name, String job, String id)
    {
        Map<String,Object> payload=new HashMap<>();
        payload.put("name",name);
        payload.put("job",job);
        payload.put("id",id);
        return payload;
    }
}
