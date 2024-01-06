package com.tests;

import com.rest.utils.API;
import com.rest.utils.PayLoads;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Map;

public class APITestCases extends API {
    @Test
    public void createAPIWithString() throws IOException {
        String payload = PayLoads.createPayloadFromString("ranjeet","engineer","1234");
        Response response = createAPIWithString(payload);
        Assert.assertEquals(response.statusCode(), 201);
    }
    @Test
    public void createAPIWithMap() throws IOException {
        Map<String,Object> payload = PayLoads.createPayloadFromMap("ranjeet","engineer","1234");
        Response response = createAPIWithMap(payload);
        Assert.assertEquals(response.statusCode(), 201);
    }

}
