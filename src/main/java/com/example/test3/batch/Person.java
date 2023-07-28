package com.example.test3.batch;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder
@EqualsAndHashCode
@AllArgsConstructor @NoArgsConstructor
@Data
public class Person {

    private String lastName;
    private String firstName;

    @Override
    public String toString() {
        return "firstName: " + firstName + ", lastName: " + lastName;
    }
    
}
