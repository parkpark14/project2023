package com.example.test3.repository;

import com.example.test3.entity.TestDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestDataRepository 
    extends JpaRepository<TestDataEntity, Integer> 
{

}
