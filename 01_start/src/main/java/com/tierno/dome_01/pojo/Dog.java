package com.tierno.dome_01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "Dog")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dog {

    @Autowired
    private String name;

    @Autowired
    private int age;


}
