package com.rest.utils;

import io.restassured.response.Response;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class API {
    public static Response createAPIWithString(String createPayload) throws IOException {
        String endPoint= (String) BaseTest.dataFromJsonFile.get("endPoint");
       return RestUtils.performPost(endPoint, createPayload, new HashMap<>());

    }
    public static Response createAPIWithMap(Map<String,Object>createPayload) throws IOException {
        String endPoint= (String) BaseTest.dataFromJsonFile.get("endPoint");
        return RestUtils.performPost(endPoint, createPayload, new HashMap<>());

    }
}
