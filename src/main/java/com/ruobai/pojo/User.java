package com.ruobai.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * company: www.abc.com
 * Author: Administrator
 * Create Data: 2021/4/7 0007
 */
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable{
    private String name;
    private int age;
}
