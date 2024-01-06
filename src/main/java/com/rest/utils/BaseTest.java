package com.rest.utils;
import utils.JsonUtils;
import java.io.IOException;
import java.util.Map;

public class BaseTest {
    public static Map<String, Object> dataFromJsonFile;
   static {
        String env= System.getProperty("env")==null? "QA":System.getProperty("env");
            try {
                dataFromJsonFile= JsonUtils.getJsonDataAsMap("/"+env+"/EnvQA.json");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
}

