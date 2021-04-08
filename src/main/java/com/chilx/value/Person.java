package com.chilx.value;

import lombok.Data;
import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;


/**
 * @author chilx
 * @date 2021/4/7
 **/
@Component
@Getter
@ToString
public class Person {

   // =========== String 开始==========

    @Value("${chilx.person.name}")
    private String name;

    @Value("${chilx.person.age}")
    private Integer age;
    /**
     * 默认值为空串
     */
    @Value("${chilx.person.gender:}")
    private String gender;

    /**
     * 默认值为null
     */
    @Value("${chilx.person.nikeName:null}")
    private String nikeName;
    /**
     * 默认值为 男
     */
    @Value("${chilx.person.password:'男'}")
    private String password;

    // =========== String 结束==========

    // =========== Array 开始==========

    @Value("${chilx.person.hobbies}")
    private String[] hobbies;

    @Value("${chilx.person.hobbies1:}")
    private String[] hobbies1;

    @Value("${chilx.person.hobbies1:null}")
    private String[] hobbies2;

    // =========== Array 结束==========


    // =========== 集合 开始==========

    @Value("${chilx.person.friend}")
    private List<String> friend;

    // 默认值 []
    @Value("${chilx.person.friend1:}")
    private List<String> friend1;

    // 默认值 [null]
    @Value("${chilx.person.friend1:null}")
    private List<String> friend2;
    // 默认值 [小明,小红]
    @Value("${chilx.person.friend1:小明,小红}")
    private List<String> friend3;
    // 默认值 []
    @Value("#{'${chilx.person.friend1:}'.split(',')}")
    private List<String> friend4;

    // 默认值 [null]
    @Value("#{'${chilx.person.friend1:null}'.split(',')}")
    private List<String> friend5;

    // 默认值 [小明,小红]
    @Value("#{'${chilx.person.friend1:小明,小红}'.split(',')}")
    private List<String> friend6;

    // 默认值 []
    @Value("#{'${chilx.person.friend1:,}'.split(',')}")
    private List<String> friend7;

    // =========== 集合 结束==========

    // =========== Map 开始==========

    @Value("#{${chilx.person.pet}}")
    private Map<String, String> pet;

    @Value("#{${chilx.person.courses}}")
    private Map<String, String> courses;
    // 默认值 null
    @Value("#{${chilx.person.courses1:{}}}")
    private Map<String, String> courses1;
    // 默认值 null
    @Value("#{${chilx.person.courses1:null}}")
    private Map<String, String> courses2;
    // 默认值 {k1:v1}
    @Value("#{${chilx.person.courses1:{k1:'v1'}}}")
    private Map<String, String> courses3;


//    @Value("#{${chilx.person.province}}")
//    private Map<String, String> province;

    // =========== Map 结束==========


}
