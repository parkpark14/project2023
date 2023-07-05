package com.example.test3.service;

import com.example.test3.dto.TestDataDto;
import com.example.test3.entity.TestDataEntity;
import com.example.test3.repository.TestDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class TestDataServiceImpl implements TestDataService{

    @Autowired
    private TestDataRepository testDataRepository;

    @Override
    public TestDataDto getTestData(int seq) {

        Optional<TestDataEntity> testDataEntity
            = testDataRepository.findById(seq);

        TestDataDto testDataDto = new TestDataDto();

        if(testDataEntity.isPresent()) {
            testDataDto.setSeq(testDataEntity.get().getSeq());
            testDataDto.setId(testDataEntity.get().getId());
            testDataDto.setTData(testDataEntity.get().getTData());
        }

        return testDataDto;
    }

    @Override
    public ArrayList<TestDataDto> getTestDataAll() {
        return null;
    }

    @Override
    public void insertTestData(TestDataDto testDataDto) {

    }

    @Override
    public void updateTestData(TestDataDto testDataDto) {

    }
}
