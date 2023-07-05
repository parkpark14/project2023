package com.example.test3.service;

import com.example.test3.dto.TestDataDto;

import java.util.ArrayList;

public interface TestDataService {
    TestDataDto getTestData(int id);
    ArrayList<TestDataDto> getTestDataAll();
    void insertTestData(TestDataDto testDataDto);
    void updateTestData(TestDataDto testDataDto);
}
