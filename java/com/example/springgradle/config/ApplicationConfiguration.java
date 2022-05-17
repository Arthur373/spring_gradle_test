package com.example.springgradle.config;

import com.example.springgradle.repositories.CrudRepository;
import org.springframework.context.annotation.*;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.stereotype.Component;

//@ImportResource("classpath:application.xml")//combine kenenq 3 beanDefination-i tesak
//@Import()//mijocov menq karoxenq ay papkeki mijic config classer mer mod ogtagorcenq
@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = "com.example.springgradle",
               useDefaultFilters = false,
               includeFilters = {
                    @Filter(type = FilterType.ANNOTATION,value = Component.class),
                    @Filter(type = FilterType.ASSIGNABLE_TYPE,value = CrudRepository.class),
                    @Filter(type = FilterType.REGEX,pattern = "com\\..+Repository")
               }
)
public class ApplicationConfiguration {
}
