package com.example.servicefeign.service.impl;

import com.example.servicefeign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @author 祁宏钢
 * @date 2018/6/20
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry,"+name;
    }
}
