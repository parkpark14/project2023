package com.example.test3.controller;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.test3.dto.TestDataDto;
import com.example.test3.service.TestDataServiceImpl;

import java.util.ArrayList;

@Slf4j
@RestController
public class TestDataController {

     @Autowired
     private TestDataServiceImpl testDataService;

    @GetMapping("getTestData/{seq}")
    public String getTestData(
        @PathVariable int seq
    ) {
        log.info("seq = " + seq);
        TestDataDto testDataDto = testDataService.getTestData(seq);

        Gson gson = new Gson();
         return gson.toJson(testDataDto);
    }

    @GetMapping("getTestDataAll")
    public String getTestDataAll() {

        ArrayList<TestDataDto> resultList = testDataService.getTestDataAll();
        Gson gson = new Gson();
        return gson.toJson(resultList);
    }
}
